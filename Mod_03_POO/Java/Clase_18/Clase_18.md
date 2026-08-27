# Java — Clase 18

## Tema central

Clase `Math`, operadores lógicos/relacionales, condicionales, operador ternario y operadores matemáticos/incrementales.

## Qué se vio

- **Clase `Math`**: `Math.sqrt()` (raíz cuadrada), `Math.pow(base, exponente)` (potencia), `Math.round()` (redondeo), `Math.random()` (número entre 0 y 1). Nota: casi todas trabajan con `double`.
- **Caracteres de formato en strings**: `\t` (tabulación), `\n` (salto de línea), `\b` (retroceso), y cómo escapar comillas y barras invertidas.
- **`switch/case`** para elegir entre operaciones según una letra ingresada (suma, resta, multiplicación, división), incluyendo mayúscula y minúscula como casos válidos.
- **Operadores lógicos y relacionales** (`>`, `<`, `<=`, `==`) aplicados a números.
- **Comparación de Strings**: por qué `==` no sirve para comparar el contenido de dos strings en Java (compara referencia en memoria, no el texto).
- **Operador ternario** (`condicion ? valorSiTrue : valorSiFalse`) como forma corta de un `if/else`.
- **Operadores de incremento/decremento** (`++`, `--`) y la diferencia entre pre-incremento (`++x`) y post-incremento (`x++`): en post-incremento la variable toma el valor *antes* de sumar/restar, luego se actualiza.
- **`switch` anidado** para menús con submenús (elegir tipo de operación y luego cuál específica).

## Archivos de referencia

`clase_math.java`, `el_primo_de_match.java`, `formatos_strings.java`, `operadores_logicos.java`, `operadores_matematicos.java`

## Ideas clave

- 🧮 `Math.pow()`, `Math.sqrt()` y `Math.round()` casi siempre trabajan con `double`.
- ⚖️ Nunca compares texto con `==` en Java — compara si están en la misma dirección de memoria, no si dicen lo mismo (para eso se usa `.equals()`).
- ➕➖ `x++` primero usa el valor de `x` y luego lo incrementa; `++x` lo incrementa primero y luego lo usa.
