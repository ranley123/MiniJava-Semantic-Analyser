grammar MiniJavaGrammar ;

program : mainclass classdecl* ;

mainclass : CLASS ID LBRACE PUBLIC STATIC VOID MAIN LPAREN STRING LSQUARE RSQUARE ID RPAREN LBRACE statement RBRACE RBRACE
          ;

classdecl : CLASS ID LBRACE vardecl* methoddecl* RBRACE
          | CLASS ID EXTENDS ID LBRACE vardecl* methoddecl* RBRACE
        ;

vardecl  : type ID SEMICOLON ;

methoddecl : PUBLIC type ID LPAREN formallist? RPAREN LBRACE vardecl* statement* RETURN expr SEMICOLON RBRACE ;

formallist : type ID formalrest* ;

formalrest : COMMA type ID ;

type : INT LSQUARE RSQUARE
     | BOOLEAN
     | INT
     | ID
     ;

statement : LBRACE statement* RBRACE
          | IF LPAREN expr RPAREN statement ELSE statement
          | WHILE LPAREN expr RPAREN statement
          | SYSTEMOUT LPAREN expr RPAREN SEMICOLON
          | ID EQUALS expr SEMICOLON
          | ID LSQUARE expr RSQUARE EQUALS expr SEMICOLON
            ;

expr : expr op expr
     | expr LSQUARE expr RSQUARE
     | expr DOT LENGTH
     | expr DOT ID LPAREN exprlist? RPAREN
     | INTEGER
     | TRUE
     | FALSE
     | ID
     | THIS
     | NEW INT LSQUARE exprlist RSQUARE
     | NEW ID LPAREN RPAREN
     | NOT expr
     | LPAREN expr RPAREN
    ;

op : AND | LT | PLUS | MINUS | MUL ;

exprlist : expr exprrest* ;

exprrest : COMMA expr;

WS : (' ' | '\t' | '\r'? '\n')+ -> skip;

//INTEGER : [0-9]+ ;

COMMENT : '/*' .*? '*/'  -> skip;

LINE_COMMENT : '//' .*? '\n' -> skip;

// STRING : '"' (ESC | .)*? '"' ;

ESC : '\\' [btnr"\\] ;

AND : '&&' ;
LT : '<' ;
PLUS : '+' ;
MINUS : '-' ;
MUL : '*' ;

CLASS : 'class';
PUBLIC : 'public' ;
STATIC : 'static' ;
VOID : 'void' ;
MAIN : 'main' ;
STRING : 'String' ;
EXTENDS : 'extends';
RETURN : 'return' ;
WHILE : 'while';
IF : 'if' ;
ELSE : 'else' ;
BOOLEAN : 'boolean' ;
INT : 'int' ;
SYSTEMOUT : 'System.out.println' ;
LENGTH : 'length' ;
NEW : 'new';
THIS : 'this';


TRUE : 'true';
FALSE : 'false';

NOT : '!';
DOT : '.';
COMMA : ',' ;
SEMICOLON : ';' ;
LBRACE : '{';
RBRACE : '}';
LPAREN : '(' ;
RPAREN : ')' ;
LSQUARE : '[' ;
RSQUARE : ']' ;
EQUALS : '=';

ID  :   LETTER (LETTER | [0-9])* ;

LETTER : [a-zA-Z] | '_' ;

INTEGER : [0-9]+ ;