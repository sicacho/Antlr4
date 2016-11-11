grammar LabeledExpr;
@header{package antlr4.generate.labeledExpr;}
prog: stat+ ;
stat: expr NEWLINE
    | ID '=' expr NEWLINE
    | NEWLINE
    ;
expr: expr op=('*'|'/') expr
    | expr op=('+'|'-') expr
    | INT
    | ID
    | '(' expr ')';
ID : [a-zA-Z]+ ;
INT : [0-9]+ ;
NEWLINE : '\r' ? '\n';
WS : [\t]+ -> skip;
MUL : '*' ; // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;