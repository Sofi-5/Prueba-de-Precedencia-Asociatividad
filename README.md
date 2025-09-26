# Prueba-de-Precedencia-Asociatividad


##  Descripción 
Este repositorio contiene dos gramáticas en ANTLR (Expr.g4 y ExprChanged.g4) y códigos respectivos que demuestran cómo la precedencia y asociatividad afectan la interpretación y resultados de 

# Comparador de Precedencia y Asociatividad en Gramáticas Matemáticas con ANTLR
 
> ¿Qué pasa si `+` es más fuerte que `*`? ¿Y si la potencia se evalúa de izquierda a derecha?  
> Este proyecto explora cómo la estructura de una gramática define el comportamiento de un lenguaje.

---

## Objetivo del Proyecto

Este repositorio contiene **dos implementaciones en ANTLR4** de un pequeño lenguaje de expresiones aritméticas:

1. **`Expr.g4`**: Gramática **original**, con reglas de precedencia y asociatividad *convencionales* (como en la mayoría de lenguajes de programación).
2. **`ExprChanged.g4`**: Gramática **modificada**, con reglas *intencionalmente alteradas* para demostrar cómo los cambios en la gramática afectan la evaluación.

Ambas incluyen un **visitor en Java** que evalúa expresiones y muestra resultados numéricos.

El propósito es **comparar visual y numéricamente** cómo una misma cadena (como `"2+3*4"`) produce resultados **diferentes** según la gramática subyacente.

---

## ¿Qué cambió en la gramática modificada?

| Operación        | Gramática Original                     | Gramática Modificada                  |
|------------------|----------------------------------------|----------------------------------------|
| **Precedencia**  | `^` > unario > `* /` > `+ -`           | **`+ -` > `* /`** > `^` > unario      |
| **Asociatividad de `^`** | Derecha: `2^3^2 = 2^(3^2) = 512` | **Izquierda**: `2^3^2 = (2^3)^2 = 64` |
| **Operadores unarios (`+`, `-`)** | Fuertes: `-2^2 = -(2^2) = -4` | **Débiles**: aplican al **resultado completo** de la expresión |

> Esto significa que en la versión modificada:  
> `2 + 3 * 4` se interpreta como `(2 + 3) * 4 = 20`  
> ¡en lugar del habitual `2 + (3 * 4) = 14`!

---


---

## Requisitos

- **Java 8 o superior**
- **ANTLR 4.13+** (puedes usar el JAR completo)
- Sistema operativo: Windows, macOS o Linux

> Descarga el JAR de ANTLR desde: https://www.antlr.org/download.html  
> (Ej: `antlr-4.13.1-complete.jar`)

---

## Cómo Ejecutar

### Paso 1: Generar los analizadores (parsers)

```bash
# Generar clases para la gramática original
java -jar antlr-4.13.1-complete.jar Expr.g4

# Generar clases para la gramática modificada
java -jar antlr-4.13.1-complete.jar ExprChanged.g4
```

### Paso 2: Compilar todo

# En Windows
javac -cp ".;antlr-4.13.1-complete.jar" *.java

# En macOS / Linux
javac -cp ".:antlr-4.13.1-complete.jar" *.java

### Paso 3: Ejecutar las pruebas
### Con la gramática original:

# Windows
java -cp ".;antlr-4.13.1-complete.jar" CalcOriginal "2+3*4"

# macOS / Linux
java -cp ".:antlr-4.13.1-complete.jar" CalcOriginal "2+3*4"
# Salida esperada: 14

### Con la gramática modificada:
# Windows
java -cp ".;antlr-4.13.1-complete.jar" CalcChanged "2+3*4"

# macOS / Linux
java -cp ".:antlr-4.13.1-complete.jar" CalcChanged "2+3*4"
# Salida esperada: 20

¿Por qué es esto importante?
La gramática NO es solo sintaxis: define semántica operacional.
Un lenguaje mal diseñado puede llevar a errores sutiles (ej. a + b * c mal interpretado).
En compiladores, la precedencia se codifica en la estructura de la gramática, no en reglas externas.
Este ejercicio muestra cómo ANTLR permite modelar comportamientos arbitrarios mediante diseño gramatical.




## 📁 Estructura del Proyecto
