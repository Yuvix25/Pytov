grammar Pytov;

/*
 * Parser Rules
 */


parse
 : 
 allCode+
 EOF
 ;

allCode
 : seperators | statement | declaration | exp
 ;

seperators
 : NEW_LINE
 | SEMI_COLON
 ;


exp
 : LPAREN exp RPAREN              #parenExpression
 | left=exp op=opCpBn right=exp   #opCpBnExpression
 | notl exp                       #notExpression
 | atom                           #atomExpression
 | funcCall                       #funcCallExpression
 ;

atom
 : boolTF
 | string
 | decimal
 | identifier
 | listr
 ;

listr
 : '[' parameterInputList? ']'
 ;

opCpBn
 : operator
 | comparator
 | binary
 ;

notl
 : NOT
 ;

identifier
 : IDENTIFIER
 ;

decimal
 : DECIMAL
 ;

string
 : STRING
 ;

comparator
 : GT | GE | LT | LE | EQ | NOT_EQ
 ;

binary
 : AND | OR
 ;

operator
 : ADD
 | SUBTRACT
 | MULT
 | DIVIDE
 | FLOOR_DIVISION
 | MODULO
 ;


boolTF
 : TRUE | FALSE
 ;

ifStatement
 : 
 ('if' exp block)
 (seperators? 'elif' exp block)*
 (seperators? 'else' block)?
 ;

identifierList
 : identifier
 (',' identifier)*
 ','?
 ;

declaration
 : variableDeclaration
 | funcDeclaration
 ;

declarationList
 : variableDeclaration
 (',' variableDeclaration)*
 ','?
 ;

variableDeclaration 
 : identifier '=' (exp | funcCall)
 ;

expList
 : exp 
 (',' exp)*
 ','?
 ;

parameterList
 : parameterList ',' parameterList
 | identifierList
 | declarationList
 ;

parameterInputList
 : parameterInputList ',' parameterInputList
 | expList
 | declarationList
 ;

whileStatement
 : 'while'
 exp
 block
 ;

forStatement
 : 'for' exp 'in' exp block
 ;

funcDeclaration
 : ('func' | 'function' | 'def')
 identifier
 '(' parameterList? ')'
 block
 ;

funcCall
 : identifier '(' parameterInputList? ')'
 ;

returnp
 : 'return' exp
 ;

statement
 : ifStatement
 | whileStatement
 | forStatement
 | funcCall
 | returnp
 ;


block
 : 
 openCurly allCode* closeCurly
 ;

openCurly
 : OPEN_CURLY
 ;

closeCurly
 : CLOSE_CURLY
 ;


/*
 * Lexer Rules
 */
 

STRING : '"' ( '\\"' | . )*? '"' ;

COMMENT
    : '/*' .*? '*/' -> skip
;

LINE_COMMENT_C
    : '//' ~[\r\n]* -> skip
;

LINE_COMMENT_P
    : '#' ~[\r\n]* -> skip
;

AND        : '&&' ;
OR         : '||';
NOT        : '!';
TRUE       : 'true' | 'True';
FALSE      : 'false' | 'False';
ADD        : '+';
SUBTRACT   : '-';
MULT       : '*';
DIVIDE     : '/';
FLOOR_DIVISION: '/_';
MODULO     : '%';
GT         : '>' ;
GE         : '>=' ;
LT         : '<' ;
LE         : '<=' ;
EQ         : '==' ;
NOT_EQ     : '!=' ;
LPAREN     : '(' ;
RPAREN     : ')' ;
RETURN     : 'return';
DECIMAL    : [0-9]+ ( '.' [0-9]+ )? ;
IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]* ;

OPEN_CURLY : '{' ;
CLOSE_CURLY: '}' ;


WS         : [ \r\t\u000C]+ -> skip ;
SEMI_COLON : ';' ;
NEW_LINE   : '\n' ;