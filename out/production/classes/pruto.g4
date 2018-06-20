grammar pruto;
program   : 'begin' statement+ 'end';

statement : assign | read | assignWithoutValue | add | print | sub | multiply | devide | pow;

assign    : ('let' ID '=' (NUMBER | ID ));
read      : 'read(' ID ')';
assignWithoutValue : 'let' ID;
print     : 'print' (NUMBER | ID | STRING) ;
add       : 'add' (NUMBER | ID ) 'to' ID;
sub       : 'sub' (NUMBER | ID) 'from' ID;
multiply  : 'multiply' ID 'by' (NUMBER | ID);
devide    : 'devide' ID 'by' (NUMBER | ID);
pow       : 'pow' ID 'to' (NUMBER | ID);

COMMENT
    :   ( '//' ~[\r\n]* '\r'? '\n'
        | '/*' .*? '*/'
        ) -> skip
    ;
ID     : [a-z]+ ;
NUMBER : (INTEGER | DOUBLE) ;
INTEGER: [0-9]+ ;
DOUBLE : ('-'|'+')?('0'..'9')+('.'('0'..'9')+)?;
STRING : ('"')(.*?)('"');
WS     : [ \n\t\r]+ -> skip;