# Java — Clase 19

## Tema central

Arreglos (arrays), bucles `while`/`do-while`, y los tres algoritmos clásicos de ordenamiento (burbuja, inserción, selección).

## Qué se vio

- **Arreglos (`int[]`, `String[]`)**: declaración con tamaño fijo (`new int[5]`), asignación por índice, recorrido con `for` clásico y con `for-each` (`for (String i : nombre)`).
- **`.length`**: propiedad (no método) para saber el tamaño de un arreglo.
- **`while` vs `do-while`**: el `while` revisa la condición antes de entrar (puede no ejecutarse nunca), el `do-while` ejecuta el bloque al menos una vez y revisa la condición al final.
- **Comparación de Strings con `.equals()`** en vez de `==` (retomado y aplicado en un caso real de login).
- **Alcance de variables (scope)**: por qué una variable declarada dentro de un `do {}` no es visible en el `while` de abajo, y debe declararse afuera.
- **Algoritmo burbuja**: comparar elementos vecinos e intercambiarlos si están desordenados, haciendo que el mayor "burbujee" hacia el final en cada vuelta (comparado con burbujas subiendo en el agua).
- **Algoritmo de inserción**: tomar cada elemento y ubicarlo en su posición correcta entre los ya ordenados (comparado con ordenar cartas en la mano).
- **Algoritmo de selección**: buscar el menor elemento restante en cada vuelta y mandarlo al inicio del tramo desordenado.

## Archivos de referencia

`arreglos.java`, `bucles.java`, `ordenar.java`, `rof.java`

## Ideas clave

- 🔁 `do-while` ejecuta primero y pregunta después; `while` pregunta primero y puede no ejecutar nunca.
- 🫧 Burbuja: los elementos grandes "suben" (se van al final) comparando vecinos.
- 🃏 Inserción: como ordenar cartas en la mano, insertas cada una en su lugar correcto.
- 🎯 Selección: en cada vuelta buscas el más chico restante y lo mandas al frente.
