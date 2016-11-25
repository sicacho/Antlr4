grammar Rule;
@header{package antlr4.generate.rule;}
rules
	: '{' id ',' rev ',' name ',' ruleEx '}';
id
	: '"_id"'':' STRING ;
rev
	: '"_rev"'':' STRING ;
name
	: '"_name"'':' STRING ;
ruleEx
	: '"rule"'':' expression ;
expression
	: field |
	  and |
	  or |
	  not |;
field
	: '{' STRING ':' '[' match (',' match)* ']' '}';
match
	: '{' operator ':' value '}';
and
	: '{''"$and"'':' '[' expression (',' expression)* ']' '}';
or
	: '{''"$or"'':' '[' expression (',' expression)* ']' '}';
not
	: '{''"$not"'':' expression '}';
operator
	: '"$eq"' | '"$containsString"' | '"$containsWord"';
value
    : STRING
    ;

STRING
   : '"' (ESC | ~ ["\\])* '"'
   ;
fragment ESC
   : '\\' (["\\/bfnrt] | UNICODE)
   ;
fragment UNICODE
   : 'u' HEX HEX HEX HEX
   ;
fragment HEX
   : [0-9a-fA-F]
   ;
WS
   : [ \t\n\r] + -> skip
   ;