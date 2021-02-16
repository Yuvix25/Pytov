from antlr4 import *
from PytovLexer import PytovLexer
from PytovParser import PytovParser
from PytovVisitor import PytovVisitor
from antlr4.tree.Tree import TerminalNodeImpl


def main(fileName, name='main'):
    input = FileStream(fileName)
    lexer = PytovLexer(input)
    stream = CommonTokenStream(lexer)
    parser = PytovParser(stream)
    tree = parser.parse()
    from PytovInterpreter import PytovInterpreter
    visitor = PytovInterpreter(fileName, name)
    visitor.visit(tree)
    return visitor

if __name__ == '__main__':
    import argparse
    parser = argparse.ArgumentParser()
    parser.add_argument('file')
    args = parser.parse_args()
    main(args.file)