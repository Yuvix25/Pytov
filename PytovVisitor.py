# Generated from Pytov.g4 by ANTLR 4.9.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PytovParser import PytovParser
else:
    from PytovParser import PytovParser

# This class defines a complete generic visitor for a parse tree produced by PytovParser.

class PytovVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by PytovParser#parse.
    def visitParse(self, ctx:PytovParser.ParseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#allCode.
    def visitAllCode(self, ctx:PytovParser.AllCodeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#seperators.
    def visitSeperators(self, ctx:PytovParser.SeperatorsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#beforeIncDecExpression.
    def visitBeforeIncDecExpression(self, ctx:PytovParser.BeforeIncDecExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#atomExpression.
    def visitAtomExpression(self, ctx:PytovParser.AtomExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#opCpBnExpression.
    def visitOpCpBnExpression(self, ctx:PytovParser.OpCpBnExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#notExpression.
    def visitNotExpression(self, ctx:PytovParser.NotExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#parenExpression.
    def visitParenExpression(self, ctx:PytovParser.ParenExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#funcCallExpression.
    def visitFuncCallExpression(self, ctx:PytovParser.FuncCallExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#incDecExpression.
    def visitIncDecExpression(self, ctx:PytovParser.IncDecExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#atom.
    def visitAtom(self, ctx:PytovParser.AtomContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#importp.
    def visitImportp(self, ctx:PytovParser.ImportpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#listr.
    def visitListr(self, ctx:PytovParser.ListrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#incDec.
    def visitIncDec(self, ctx:PytovParser.IncDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#beforeIncDec.
    def visitBeforeIncDec(self, ctx:PytovParser.BeforeIncDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#inc.
    def visitInc(self, ctx:PytovParser.IncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#dec.
    def visitDec(self, ctx:PytovParser.DecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#opCpBn.
    def visitOpCpBn(self, ctx:PytovParser.OpCpBnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#notl.
    def visitNotl(self, ctx:PytovParser.NotlContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#identifier.
    def visitIdentifier(self, ctx:PytovParser.IdentifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#decimal.
    def visitDecimal(self, ctx:PytovParser.DecimalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#string.
    def visitString(self, ctx:PytovParser.StringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#comparator.
    def visitComparator(self, ctx:PytovParser.ComparatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#binary.
    def visitBinary(self, ctx:PytovParser.BinaryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#operator.
    def visitOperator(self, ctx:PytovParser.OperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#boolTF.
    def visitBoolTF(self, ctx:PytovParser.BoolTFContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#ifStatement.
    def visitIfStatement(self, ctx:PytovParser.IfStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#breakp.
    def visitBreakp(self, ctx:PytovParser.BreakpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#switchCase.
    def visitSwitchCase(self, ctx:PytovParser.SwitchCaseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#switchDefault.
    def visitSwitchDefault(self, ctx:PytovParser.SwitchDefaultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#switchStatement.
    def visitSwitchStatement(self, ctx:PytovParser.SwitchStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#identifierList.
    def visitIdentifierList(self, ctx:PytovParser.IdentifierListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#declaration.
    def visitDeclaration(self, ctx:PytovParser.DeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#declarationList.
    def visitDeclarationList(self, ctx:PytovParser.DeclarationListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#variableDeclaration.
    def visitVariableDeclaration(self, ctx:PytovParser.VariableDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#expList.
    def visitExpList(self, ctx:PytovParser.ExpListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#parameterList.
    def visitParameterList(self, ctx:PytovParser.ParameterListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#parameterInputList.
    def visitParameterInputList(self, ctx:PytovParser.ParameterInputListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#whileStatement.
    def visitWhileStatement(self, ctx:PytovParser.WhileStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#forStatement.
    def visitForStatement(self, ctx:PytovParser.ForStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#nonPythonForStatement.
    def visitNonPythonForStatement(self, ctx:PytovParser.NonPythonForStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#funcDeclaration.
    def visitFuncDeclaration(self, ctx:PytovParser.FuncDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#funcCall.
    def visitFuncCall(self, ctx:PytovParser.FuncCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#returnp.
    def visitReturnp(self, ctx:PytovParser.ReturnpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#statement.
    def visitStatement(self, ctx:PytovParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#block.
    def visitBlock(self, ctx:PytovParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#openCurly.
    def visitOpenCurly(self, ctx:PytovParser.OpenCurlyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PytovParser#closeCurly.
    def visitCloseCurly(self, ctx:PytovParser.CloseCurlyContext):
        return self.visitChildren(ctx)



del PytovParser