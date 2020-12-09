# Generated from Pytov.g4 by ANTLR 4.9
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PytovParser import PytovParser
else:
    from PytovParser import PytovParser

# This class defines a complete listener for a parse tree produced by PytovParser.
class PytovListener(ParseTreeListener):

    # Enter a parse tree produced by PytovParser#parse.
    def enterParse(self, ctx:PytovParser.ParseContext):
        pass

    # Exit a parse tree produced by PytovParser#parse.
    def exitParse(self, ctx:PytovParser.ParseContext):
        pass


    # Enter a parse tree produced by PytovParser#allCode.
    def enterAllCode(self, ctx:PytovParser.AllCodeContext):
        pass

    # Exit a parse tree produced by PytovParser#allCode.
    def exitAllCode(self, ctx:PytovParser.AllCodeContext):
        pass


    # Enter a parse tree produced by PytovParser#seperators.
    def enterSeperators(self, ctx:PytovParser.SeperatorsContext):
        pass

    # Exit a parse tree produced by PytovParser#seperators.
    def exitSeperators(self, ctx:PytovParser.SeperatorsContext):
        pass


    # Enter a parse tree produced by PytovParser#atomExpression.
    def enterAtomExpression(self, ctx:PytovParser.AtomExpressionContext):
        pass

    # Exit a parse tree produced by PytovParser#atomExpression.
    def exitAtomExpression(self, ctx:PytovParser.AtomExpressionContext):
        pass


    # Enter a parse tree produced by PytovParser#opCpBnExpression.
    def enterOpCpBnExpression(self, ctx:PytovParser.OpCpBnExpressionContext):
        pass

    # Exit a parse tree produced by PytovParser#opCpBnExpression.
    def exitOpCpBnExpression(self, ctx:PytovParser.OpCpBnExpressionContext):
        pass


    # Enter a parse tree produced by PytovParser#notExpression.
    def enterNotExpression(self, ctx:PytovParser.NotExpressionContext):
        pass

    # Exit a parse tree produced by PytovParser#notExpression.
    def exitNotExpression(self, ctx:PytovParser.NotExpressionContext):
        pass


    # Enter a parse tree produced by PytovParser#parenExpression.
    def enterParenExpression(self, ctx:PytovParser.ParenExpressionContext):
        pass

    # Exit a parse tree produced by PytovParser#parenExpression.
    def exitParenExpression(self, ctx:PytovParser.ParenExpressionContext):
        pass


    # Enter a parse tree produced by PytovParser#funcCallExpression.
    def enterFuncCallExpression(self, ctx:PytovParser.FuncCallExpressionContext):
        pass

    # Exit a parse tree produced by PytovParser#funcCallExpression.
    def exitFuncCallExpression(self, ctx:PytovParser.FuncCallExpressionContext):
        pass


    # Enter a parse tree produced by PytovParser#atom.
    def enterAtom(self, ctx:PytovParser.AtomContext):
        pass

    # Exit a parse tree produced by PytovParser#atom.
    def exitAtom(self, ctx:PytovParser.AtomContext):
        pass


    # Enter a parse tree produced by PytovParser#listr.
    def enterListr(self, ctx:PytovParser.ListrContext):
        pass

    # Exit a parse tree produced by PytovParser#listr.
    def exitListr(self, ctx:PytovParser.ListrContext):
        pass


    # Enter a parse tree produced by PytovParser#opCpBn.
    def enterOpCpBn(self, ctx:PytovParser.OpCpBnContext):
        pass

    # Exit a parse tree produced by PytovParser#opCpBn.
    def exitOpCpBn(self, ctx:PytovParser.OpCpBnContext):
        pass


    # Enter a parse tree produced by PytovParser#notl.
    def enterNotl(self, ctx:PytovParser.NotlContext):
        pass

    # Exit a parse tree produced by PytovParser#notl.
    def exitNotl(self, ctx:PytovParser.NotlContext):
        pass


    # Enter a parse tree produced by PytovParser#identifier.
    def enterIdentifier(self, ctx:PytovParser.IdentifierContext):
        pass

    # Exit a parse tree produced by PytovParser#identifier.
    def exitIdentifier(self, ctx:PytovParser.IdentifierContext):
        pass


    # Enter a parse tree produced by PytovParser#decimal.
    def enterDecimal(self, ctx:PytovParser.DecimalContext):
        pass

    # Exit a parse tree produced by PytovParser#decimal.
    def exitDecimal(self, ctx:PytovParser.DecimalContext):
        pass


    # Enter a parse tree produced by PytovParser#string.
    def enterString(self, ctx:PytovParser.StringContext):
        pass

    # Exit a parse tree produced by PytovParser#string.
    def exitString(self, ctx:PytovParser.StringContext):
        pass


    # Enter a parse tree produced by PytovParser#comparator.
    def enterComparator(self, ctx:PytovParser.ComparatorContext):
        pass

    # Exit a parse tree produced by PytovParser#comparator.
    def exitComparator(self, ctx:PytovParser.ComparatorContext):
        pass


    # Enter a parse tree produced by PytovParser#binary.
    def enterBinary(self, ctx:PytovParser.BinaryContext):
        pass

    # Exit a parse tree produced by PytovParser#binary.
    def exitBinary(self, ctx:PytovParser.BinaryContext):
        pass


    # Enter a parse tree produced by PytovParser#operator.
    def enterOperator(self, ctx:PytovParser.OperatorContext):
        pass

    # Exit a parse tree produced by PytovParser#operator.
    def exitOperator(self, ctx:PytovParser.OperatorContext):
        pass


    # Enter a parse tree produced by PytovParser#boolTF.
    def enterBoolTF(self, ctx:PytovParser.BoolTFContext):
        pass

    # Exit a parse tree produced by PytovParser#boolTF.
    def exitBoolTF(self, ctx:PytovParser.BoolTFContext):
        pass


    # Enter a parse tree produced by PytovParser#ifStatement.
    def enterIfStatement(self, ctx:PytovParser.IfStatementContext):
        pass

    # Exit a parse tree produced by PytovParser#ifStatement.
    def exitIfStatement(self, ctx:PytovParser.IfStatementContext):
        pass


    # Enter a parse tree produced by PytovParser#identifierList.
    def enterIdentifierList(self, ctx:PytovParser.IdentifierListContext):
        pass

    # Exit a parse tree produced by PytovParser#identifierList.
    def exitIdentifierList(self, ctx:PytovParser.IdentifierListContext):
        pass


    # Enter a parse tree produced by PytovParser#declaration.
    def enterDeclaration(self, ctx:PytovParser.DeclarationContext):
        pass

    # Exit a parse tree produced by PytovParser#declaration.
    def exitDeclaration(self, ctx:PytovParser.DeclarationContext):
        pass


    # Enter a parse tree produced by PytovParser#declarationList.
    def enterDeclarationList(self, ctx:PytovParser.DeclarationListContext):
        pass

    # Exit a parse tree produced by PytovParser#declarationList.
    def exitDeclarationList(self, ctx:PytovParser.DeclarationListContext):
        pass


    # Enter a parse tree produced by PytovParser#variableDeclaration.
    def enterVariableDeclaration(self, ctx:PytovParser.VariableDeclarationContext):
        pass

    # Exit a parse tree produced by PytovParser#variableDeclaration.
    def exitVariableDeclaration(self, ctx:PytovParser.VariableDeclarationContext):
        pass


    # Enter a parse tree produced by PytovParser#expList.
    def enterExpList(self, ctx:PytovParser.ExpListContext):
        pass

    # Exit a parse tree produced by PytovParser#expList.
    def exitExpList(self, ctx:PytovParser.ExpListContext):
        pass


    # Enter a parse tree produced by PytovParser#parameterList.
    def enterParameterList(self, ctx:PytovParser.ParameterListContext):
        pass

    # Exit a parse tree produced by PytovParser#parameterList.
    def exitParameterList(self, ctx:PytovParser.ParameterListContext):
        pass


    # Enter a parse tree produced by PytovParser#parameterInputList.
    def enterParameterInputList(self, ctx:PytovParser.ParameterInputListContext):
        pass

    # Exit a parse tree produced by PytovParser#parameterInputList.
    def exitParameterInputList(self, ctx:PytovParser.ParameterInputListContext):
        pass


    # Enter a parse tree produced by PytovParser#whileStatement.
    def enterWhileStatement(self, ctx:PytovParser.WhileStatementContext):
        pass

    # Exit a parse tree produced by PytovParser#whileStatement.
    def exitWhileStatement(self, ctx:PytovParser.WhileStatementContext):
        pass


    # Enter a parse tree produced by PytovParser#forStatement.
    def enterForStatement(self, ctx:PytovParser.ForStatementContext):
        pass

    # Exit a parse tree produced by PytovParser#forStatement.
    def exitForStatement(self, ctx:PytovParser.ForStatementContext):
        pass


    # Enter a parse tree produced by PytovParser#funcDeclaration.
    def enterFuncDeclaration(self, ctx:PytovParser.FuncDeclarationContext):
        pass

    # Exit a parse tree produced by PytovParser#funcDeclaration.
    def exitFuncDeclaration(self, ctx:PytovParser.FuncDeclarationContext):
        pass


    # Enter a parse tree produced by PytovParser#funcCall.
    def enterFuncCall(self, ctx:PytovParser.FuncCallContext):
        pass

    # Exit a parse tree produced by PytovParser#funcCall.
    def exitFuncCall(self, ctx:PytovParser.FuncCallContext):
        pass


    # Enter a parse tree produced by PytovParser#returnp.
    def enterReturnp(self, ctx:PytovParser.ReturnpContext):
        pass

    # Exit a parse tree produced by PytovParser#returnp.
    def exitReturnp(self, ctx:PytovParser.ReturnpContext):
        pass


    # Enter a parse tree produced by PytovParser#statement.
    def enterStatement(self, ctx:PytovParser.StatementContext):
        pass

    # Exit a parse tree produced by PytovParser#statement.
    def exitStatement(self, ctx:PytovParser.StatementContext):
        pass


    # Enter a parse tree produced by PytovParser#block.
    def enterBlock(self, ctx:PytovParser.BlockContext):
        pass

    # Exit a parse tree produced by PytovParser#block.
    def exitBlock(self, ctx:PytovParser.BlockContext):
        pass


    # Enter a parse tree produced by PytovParser#openCurly.
    def enterOpenCurly(self, ctx:PytovParser.OpenCurlyContext):
        pass

    # Exit a parse tree produced by PytovParser#openCurly.
    def exitOpenCurly(self, ctx:PytovParser.OpenCurlyContext):
        pass


    # Enter a parse tree produced by PytovParser#closeCurly.
    def enterCloseCurly(self, ctx:PytovParser.CloseCurlyContext):
        pass

    # Exit a parse tree produced by PytovParser#closeCurly.
    def exitCloseCurly(self, ctx:PytovParser.CloseCurlyContext):
        pass



del PytovParser