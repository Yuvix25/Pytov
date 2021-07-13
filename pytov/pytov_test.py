from antlr4 import FileStream, CommonTokenStream
from pytov.PytovLexer import PytovLexer
from pytov.PytovParser import PytovParser
from pytov.PytovVisitor import PytovVisitor
from antlr4.tree.Tree import TerminalNodeImpl
from antlr4.error.ErrorListener import ErrorListener

def traverse(tree, rule_names, indent = 0):
    if tree.getText() == "<EOF>":
        return ["<EOF>"]
    elif isinstance(tree, TerminalNodeImpl):
        return tree.getText()
        print("{0}TOKEN='{1}'".format("  " * indent, tree.getText()))
    else:
        traversed = dict()
        traversed[rule_names[tree.getRuleIndex()]] = []
        print("{0}{1}".format("  " * indent, rule_names[tree.getRuleIndex()]))
        for child in tree.children:
            traversed[rule_names[tree.getRuleIndex()]].append(traverse(child, rule_names, indent + 1))
        return traversed


def main(fileName):
    input = FileStream(fileName)
    lexer = PytovLexer(input)
    stream = CommonTokenStream(lexer)
    parser = PytovParser(stream)
    tree = parser.parse()
    from pytov.PytovInterpreter import PytovInterpreter
    visitor = PytovInterpreter(fileName)
    visitor.visit(tree)
    #traverse(tree, parser.ruleNames)

if __name__ == '__main__':
    main("./Examples/test.py")