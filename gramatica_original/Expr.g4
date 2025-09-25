
grammar Expr;

// Programa de prueba simple que evalúa una sola expresión
prog : expr EOF ;

// --- Gramática ORIGINAL ---
// Precedencia y asociatividad (convencional):
//   1) Potencia ^  (asociativa a la DERECHA)
//   2) Unarios +/- (más fuerte que * / y + -)
//   3) Multiplicación/División * / (izq)
//   4) Suma/Resta + - (izq)

expr : add ;

add
  : a=mul (op=('+'|'-') b+=mul)*
  ;

mul
  : a=unary (op=('*'|'/') b+=unary)*
  ;

// Unario (aplica al resultado de 'pow'), por lo tanto '^' es más fuerte que el signo
unary
  : s=('+'|'-')? p=pow
  ;

// Potencia con asociatividad a la DERECHA: 2^3^2 = 2^(3^2)
pow
  : base=primary ( '^' exp=pow )?
  ;

primary
  : NUMBER
  | '(' expr ')'
  ;

NUMBER : DIGIT+ ('.' DIGIT+)? ;
fragment DIGIT : [0-9] ;
WS : [ \t\r\n]+ -> skip ;

