from antlr4 import *
from pytov.PytovLexer import PytovLexer
from pytov.PytovParser import PytovParser
from pytov.PytovVisitor import PytovVisitor
from antlr4.tree.Tree import TerminalNodeImpl
import argparse


def main(fileName, name='main'):
    input = FileStream(fileName)
    lexer = PytovLexer(input)
    stream = CommonTokenStream(lexer)
    parser = PytovParser(stream)
    tree = parser.parse()
    from pytov.PytovInterpreter import PytovInterpreter
    visitor = PytovInterpreter(fileName, name)
    visitor.visit(tree)
    return visitor

def run():
    parser = argparse.ArgumentParser()
    parser.add_argument('file', help="File to run.")
    args = parser.parse_args()
    main(args.file)

if __name__ == '__main__':
    run()