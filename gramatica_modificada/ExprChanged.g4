
grammar ExprChanged;

// Programa de prueba simple que evalúa una sola expresión
prog : expr EOF ;

// --- Gramática REDISEÑADA ---
// Cambios propuestos para mostrar efectos:
//   * '+' y '-' AHORA tienen mayor precedencia que '*' y '/'
//   * '^' AHORA es asociativa a la IZQUIERDA
//   * Los unarios +/- son los MÁS DÉBILES (aplican al resultado completo)

expr : unary ;                    // los signos unarios viven "arriba" (más débiles)

unary
  : s=('+'|'-')? m=mulWeak       // el signo aplica al resultado de todo lo que sigue
  ;

// '*' y '/' son lo MÁS DÉBIL aquí
mulWeak
  : a=addStrong (op=('*'|'/') b+=addStrong)*
  ;

// '+' y '-' más fuertes y (para demostrar diferencia) asociativos a la DERECHA
addStrong
  : a=powLeft (op=('+'|'-') b=addStrong)?
  ;

// '^' asociativa a la IZQUIERDA
powLeft
  : a=primary ('^' b+=primary)*
  ;

primary
  : NUMBER
  | '(' expr ')'
  ;

NUMBER : DIGIT+ ('.' DIGIT+)? ;
fragment DIGIT : [0-9] ;
WS : [ \t\r\n]+ -> skip ;
