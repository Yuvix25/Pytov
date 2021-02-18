#from antlr4 import *
from antlr4.tree.Tree import TerminalNodeImpl
from PytovVisitor import PytovVisitor
from PytovParser import PytovParser
from exceptions import *
from pytov import main
from Objects import *

class PytovInterpreter(PytovVisitor):
    def __init__(self, file_name, name = 'main'):
        self._name = name
        self.file_name = file_name.replace('\\', '/')

        self.variables = {}
        self.global_variables = {}
        self.errorThrower = LineException(file_name)
        self.builtin_funcs = ['print', 'range', 'len']

        self.block_balance = 0
        self.block_is_true = True
        self.last_block_is_true = True
        self.in_switch = False
        self.in_loop = False
        self.is_in_func = False
        self.active_funcs = []
        self.func_out = None

    def visitTerminal(self, ctx:TerminalNodeImpl):
        if self.is_in_func:
            value = ctx.getText()
            if value in list(self.active_funcs[-1].localVariables.keys()) + list(self.global_variables.keys()):
                return self.active_funcs[-1].localVariables[value]
            return value
        else:
            value = ctx.getText()
            if value in list(self.variables.keys()):
                return self.variables[value]
            elif value in list(self.global_variables.keys()):
                return self.global_variables[value]
            return value

    def visitIndex(self, ctx:PytovParser.IndexContext):
        return self.visit(ctx.children[0])[self.visit(ctx.children[2])]

    def visitIndexOverwrite(self, ctx:PytovParser.IndexOverwriteContext):
        lst = self.visit(ctx.children[0].children[0])
        index = self.visit(ctx.children[0].children[2])
        lst[index] = self.visit(ctx.children[2])

    def visitImportp(self, ctx:PytovParser.ImportpContext):
        if type(ctx.children[1]) == PytovParser.string:
            im_name = ctx.children[1].getText() + ".pv"
        else:
            im_name = self.visit(ctx.children[1]).replace('\\', '/')
        im_name = '/'.join(self.file_name.split('/')[:-1]) + '/' + im_name
        
        imported = main(im_name, 'imported')
        self.variables.update(imported.variables)
        self.global_variables.update(imported.global_variables)

    def visitDeclarationList(self, ctx:PytovParser.DeclarationListContext):
        dec_list = {}
        for dec in ctx.children:
            if type(dec) != TerminalNodeImpl:
                dec_list[dec.children[0].getText()] = self.visit(dec.children[2])
        return dec_list

    def visitIdentifierList(self, ctx:PytovParser.IdentifierListContext):
        id_list = []
        for id in ctx.children:
            if id.getText() != ',':
                id_list.append(id.getText())
        return id_list

    def visitExpList(self, ctx:PytovParser.ExpListContext):
        exp_list = []
        for exp in ctx.children:
            if exp.getText() != ',':
                exp_list.append(self.visit(exp))
        return exp_list

    def visitParameterInputList(self, ctx:PytovParser.ParameterInputListContext):
        params = []
        named = {}
        for i in ctx.children:
            if type(i) != TerminalNodeImpl:
                list_or_dict = self.visit(i)
                if type(i) != PytovParser.ParameterInputListContext:
                    if type(list_or_dict) == list:
                        params.append(list_or_dict)
                    elif type(list_or_dict) == dict:
                        named.update(list_or_dict)
                else:
                    params += list_or_dict[0]
                    named.update(list_or_dict[1])
        if len(params) == 1 and type(params[0]) == list:
            params = params[0]
        return params, named

    def visitParameterList(self, ctx:PytovParser.ParameterListContext):
        params = {}
        for i in ctx.children:
            if type(i) != TerminalNodeImpl:
                list_or_dict = self.visit(i)
                if type(list_or_dict) == list:
                    params.update({i:None for i in list_or_dict})
                elif type(list_or_dict) == dict:
                    params.update(list_or_dict)
        return params

    def getParameterList(self, ctx:PytovParser.ParameterListContext):
        params = []
        named = {}
        for i in ctx.children:
            if type(i) != TerminalNodeImpl:
                if type(i) == PytovParser.ParameterListContext:
                    list_or_dict = self.getParameterList(i)
                    params += list_or_dict[0]
                    named.update(list_or_dict[1])
                else:
                    list_or_dict = self.visit(i)
                    if type(list_or_dict) == list:
                        params += list_or_dict
                    elif type(list_or_dict) == dict:
                        named.update(list_or_dict)
        return params, named

    def visitReturnp(self, ctx:PytovParser.ReturnpContext):
        if self.is_in_func:
            if len(ctx.children) > 1:
                self.func_out = self.visit(ctx.children[1])
            else:
                self.func_out = None
            raise ReturnIndicator("return found.")
        else:
            self.errorThrower._raise([ctx.start.line, ctx.getText()], "SyntaxError", f"You cannot use return outside function.")

    def visitBreakp(self, ctx:PytovParser.BreakpContext):
        if self.in_switch or self.in_loop:
            raise BreakIndicator("break found.")
        else:
            self.errorThrower._raise([ctx.start.line, ctx.getText()], "SyntaxError", f"You cannot use break outside loop or switch.")

    def visitFuncDeclaration(self, ctx:PytovParser.FuncDeclarationContext):
        if len(ctx.children) == 5:
            self.variables[ctx.children[1].getText()] = Func(ctx.children[1].getText(), ctx.children[4], [[],{}], {}) #{'name':ctx.children[1].getText(), 'body':ctx.children[4], 'localVariables':{}, 'args':[[],{}]}
        elif len(ctx.children) == 6:
            self.variables[ctx.children[1].getText()] = Func(ctx.children[1].getText(), ctx.children[5], self.getParameterList(ctx.children[3]), self.visit(ctx.children[3])) #{'name':ctx.children[1].getText(), 'body':ctx.children[5], 'localVariables':self.visit(ctx.children[3]), 'args':self.getParameterList(ctx.children[3])}

    def visitFuncCall(self, ctx:PytovParser.FuncCallContext):
        if ctx.children[0].getText() in list(self.variables.keys()):
            # State outside func
            block_balance = self.block_balance
            block_is_true = self.block_is_true
            last_block_is_true = self.last_block_is_true
            self.block_balance = 0
            self.block_is_true = True
            self.last_block_is_true = True

            func = self.variables[ctx.children[0].getText()]


            func_original_vars = func.localVariables.copy()

            if len(ctx.children) == 4:
                input_args = self.visit(ctx.children[2])
            else:
                input_args = [[], {}]
            
            if len(input_args[0]) != len(func.args[0]):
                print(input_args[0])
                self.errorThrower._raise([ctx.start.line, ctx.getText()], "TypeError", f"'{func.name}' requires {len(func.args[0])} arguments, but {len(input_args[0])} were given.")

            if len(ctx.children) == 4:
                for index, var in enumerate(input_args[0]):
                    func.localVariables[list(func.localVariables.keys())[index]] = var
                func.localVariables.update(input_args[1])


            last_is_in_func = self.is_in_func
            self.is_in_func = True
            self.active_funcs.append(func)
            try:
                self.visit(func.body)
            except ReturnIndicator:
                pass
            self.is_in_func = last_is_in_func
            self.active_funcs.pop(self.active_funcs.index(func))
            func.localVariables = func_original_vars

            # Recreate state
            self.block_balance = block_balance
            self.block_is_true = block_is_true
            self.last_block_is_true = last_block_is_true

            return self.func_out
        elif ctx.children[0].getText() in self.builtin_funcs:
            input_args = self.visit(ctx.children[2])
            
            return eval(ctx.children[0].getText())(*input_args[0], **input_args[1])
        else:
            self.errorThrower._raise([ctx.start.line, ctx.getText()], "NameError", f"Name '{ctx.children[0].getText()}' is not defiend.")

    def visitIfStatement(self, ctx:PytovParser.IfStatementContext):
        ctx.children = [child for child in ctx.children if type(child) != PytovParser.SeperatorsContext]
        if self.visit(ctx.children[1]):
            self.block_is_true = True
            self.visit(ctx.children[2])
            return
        if len(ctx.children) > 3:
            if len(ctx.children) % 3 != 0: # else in if statement
                for i in range(1, (len(ctx.children) - 2) // 3):
                    if self.visit(ctx.children[3*i+1]):
                        self.block_is_true = True
                        self.visit(ctx.children[3*i+2])
                        return
                self.block_is_true = True
                self.visit(ctx.children[-1])
            else:
                for i in range(1, len(ctx.children) // 3):
                    if self.visit(ctx.children[3*i+1]):
                        self.block_is_true = True
                        self.visit(ctx.children[3*i+2])
                        return
    
    def visitSwitchStatement(self, ctx:PytovParser.SwitchStatementContext):
        self.in_switch = True
        ctx.children = [child for child in ctx.children if type(child) != PytovParser.SeperatorsContext]
        switch_on = self.visit(ctx.children[1])
        case_index = 0
        for line in ctx.children:
            if type(line) == PytovParser.SwitchCaseContext:
                if switch_on == self.visit(line.children[1]):
                    try:
                        for run_line in ctx.children[case_index:]:
                            self.visit(run_line)
                    except BreakIndicator:
                        break
            
            elif type(line) == PytovParser.SwitchDefaultContext:
                try:
                    for run_line in ctx.children[case_index:]:
                        self.visit(run_line)
                except BreakIndicator:
                    break
            case_index += 1
        self.in_switch = False

    def visitWhileStatement(self, ctx:PytovParser.WhileStatementContext):
        self.in_loop = True
        try:
            while self.visit(ctx.children[1]):
                self.visit(ctx.children[2])
        except BreakIndicator:
            pass
        self.in_loop = False

    def visitForStatement(self, ctx:PytovParser.ForStatementContext):
        container = self.visit(ctx.children[3])
        self.in_loop = True
        try:
            for i in range(len(container)):
                if self.is_in_func:
                    self.active_funcs[-1].localVariables[ctx.children[1].getText()] = container[i]
                else:
                    self.variables[ctx.children[1].getText()] = container[i]
                self.visit(ctx.children[4])
        except BreakIndicator:
            pass
        self.in_loop = False

    def visitNonPythonForStatement(self, ctx:PytovParser.nonPythonForStatement):
        if len(ctx.children) == 9:
            ctx.children = ctx.children[2:]
            ctx.children.pop(-2)

        self.visit(ctx.children[0])
        while_cond = ctx.children[2]
        self.in_loop = True
        try:
            while self.visit(while_cond):
                self.visit(ctx.children[-1]) # Block
                self.visit(ctx.children[-2]) # Execute at end of every iteration
        except BreakIndicator:
            pass
        self.in_loop = False


    # def visitOperator(self, ctx:PytovParser.OperatorContext):
    #     return ctx.getText()

    # def visitComparator(self, ctx:PytovParser.ComparatorContext):
    #     return ctx.getText()

    # def visitBinary(self, ctx:PytovParser.BinaryContext):
    #     return ctx.getText()

    def visitNotExpression(self, ctx:PytovParser.NotExpressionContext):
        return not self.visit(ctx.children[1])

    def visitParenExpression(self, ctx:PytovParser.ParenExpressionContext):
        return self.visit(ctx.exp())

    def visitAtom(self, ctx:PytovParser.AtomContext):
        return self.visit(ctx.children[0])

    def visitIncDec(self, ctx:PytovParser.IncDecContext):
        if type(ctx.children[1]) == PytovParser.IncContext:
            add = 1
        else:
            add = -1

        value = ctx.children[0].getText()
        if self.is_in_func:
            if value in list(self.active_funcs[-1].localVariables.keys()):
                self.active_funcs[-1].localVariables[value] += add
        elif value in list(self.variables.keys()):
            self.variables[value] += add
        elif value in list(self.global_variables.keys()):
            self.global_variables[value] += add
        elif value not in self.builtin_funcs:
            self.errorThrower._raise([ctx.start.line, ctx.getText()], "NameError", f"Name '{value}' is not defiend.")
        
        return self.visit(ctx.children[0]) - add

    def visitBeforeIncDec(self, ctx:PytovParser.BeforeIncDecContext):
        if type(ctx.children[0]) == PytovParser.IncContext:
            add = 1
        else:
            add = -1

        value = ctx.children[1].getText()
        if self.is_in_func:
            if value in list(self.active_funcs[-1].localVariables.keys()):
                self.active_funcs[-1].localVariables[value] += add
        elif value in list(self.variables.keys()):
            self.variables[value] += add
        elif value in list(self.global_variables.keys()):
            self.global_variables[value] += add
        elif value not in self.builtin_funcs:
            self.errorThrower._raise([ctx.start.line, ctx.getText()], "NameError", f"Name '{value}' is not defiend.")
        
        return self.visit(ctx.children[1])


    def visitOpCpBnExpression(self, ctx:PytovParser.OpCpBnExpressionContext):
        r = self.visit(ctx.right)
        l = self.visit(ctx.left)
        o = ctx.op.getText()

        if type(r) == str:
            r = '"' + r + '"'
        if type(l) == str:
            l = '"' + l + '"'

        if o == "+":
            return l + r
        elif o == "-":
            return l - r
        elif o == "*":
            return l * r
        elif o == "/":
            return l / r
        elif o == "/_":
            return l // r
        elif o == "%":
            return l % r
        elif o == ">":
            return l > r
        elif o == "<":
            return l < r
        elif o == ">=":
            return l >= r
        elif o == "<=":
            return l <= r
        elif o == "==":
            return l == r
        elif o == "!=":
            return l != r
        elif o == "&&":
            return l and r
        elif o == "||":
            return l or r
        else:
            return eval(' '.join([l, o, r]))

    def visitBoolTF(self, ctx:PytovParser.BoolTFContext):
        return ctx.getText().lower()[0] == "t"

    def visitIdentifier(self, ctx:PytovParser.IdentifierContext):
        value = ctx.getText()
        if self.is_in_func:
            if value in list(self.active_funcs[-1].localVariables.keys()):
                return self.active_funcs[-1].localVariables[value]
        elif value in list(self.variables.keys()):
            return self.variables[value]
        elif value in list(self.global_variables.keys()):
            return self.global_variables[value]
        elif value == "__name__":
            return self._name
        elif value not in self.builtin_funcs:
            self.errorThrower._raise([ctx.start.line, ctx.getText()], "NameError", f"Name '{value}' is not defiend.")
        
        self.errorThrower._raise([ctx.start.line, ctx.getText()], "NameError", f"Name '{value}' is not defiend.")

    def visitDecimal(self, ctx:PytovParser.DecimalContext):
        value = ctx.getText()
        if "." in value:
            return float(value)
        return int(value)

    def visitString(self, ctx:PytovParser.StringContext):
        return ctx.getText()[1:-1]

    def visitListr(self, ctx:PytovParser.ListrContext):
        return [self.visit(exp) for exp in ctx.children[1].children if type(exp) != TerminalNodeImpl]

    def visitDictr(self, ctx:PytovParser.DictrContext):
        return {self.visit(kv.children[0]):self.visit(kv.children[2]) for kv in ctx.children[1].children if type(kv) != TerminalNodeImpl}

    def visitVariableDeclaration(self, ctx:PytovParser.VariableDeclarationContext):
        if len(ctx.children) == 5:
            try:
                self.global_variables[ctx.children[1].getText()] = self.visit(ctx.children[3])
            except KeyError:
                self.errorThrower._raise([ctx.start.line, ctx.getText()], "NameError", f"(Global) Name '{ctx.children[1].getText()}' is not defiend.")

        if len(ctx.children) == 4:
            if type(ctx.children[0]) == PytovParser.IdentifierContext:
                op = ctx.children[1].getText()
                try:
                    # evaluate is unsafe, not too bad here because parser identified this as an operator, yet need to change in the future.
                    if ctx.children[0].getText() in self.global_variables:
                        self.global_variables[ctx.children[0].getText()] = eval(f"{self.global_variables[ctx.children[0].getText()]} {op} {self.visit(ctx.children[3])}")
                    elif self.is_in_func:
                        self.active_funcs[-1].localVariables[ctx.children[0].getText()] = eval(f"{self.active_funcs[-1].localVariables[ctx.children[0].getText()]} {op} {self.visit(ctx.children[3])}")
                    else:
                        self.variables[ctx.children[0].getText()] = eval(f"{self.variables[ctx.children[0].getText()]} {op} {self.visit(ctx.children[3])}")
                except KeyError:
                    self.errorThrower._raise([ctx.start.line, ctx.getText()], "NameError", f"Name '{ctx.children[0].getText()}' is not defiend.")
            else:
                self.global_variables[ctx.children[1].getText()] = self.visit(ctx.children[3])

        elif self.block_balance == 0 or self.block_is_true:
            if ctx.children[0].getText() in self.global_variables:
                self.global_variables[ctx.children[0].getText()] = self.visit(ctx.children[2])
            elif self.is_in_func:
                self.active_funcs[-1].localVariables[ctx.children[0].getText()] = self.visit(ctx.children[2])
            else:
                self.variables[ctx.children[0].getText()] = self.visit(ctx.children[2])

    def visitBlock(self, ctx:PytovParser.BlockContext):
        if (self.block_balance == 0) or (self.block_is_true):
            for blockItemList in ctx.children[1:-2]:
                self.visit(blockItemList)

    def visitOpenCurly(self, ctx):
        self.block_balance += 1
        self.last_block_is_true = self.block_is_true

    def visitCloseCurly(self, ctx):
        self.block_balance -= 1
        self.block_is_true = self.last_block_is_true