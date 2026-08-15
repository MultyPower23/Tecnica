# Java — Clase 16

## Tema central
Matrices (arreglos bidimensionales), matriz transpuesta/simétrica, y repaso visual paso a paso de los algoritmos de ordenamiento.

## Qué se vio
- **Matrices (`int[][]`)**: un arreglo de arreglos, representando filas y columnas. Declaración con `new int[filas][columnas]` y recorrido con doble `for` anidado.
- **Llenado dinámico de una matriz** pidiendo filas/columnas al usuario y capturando cada valor.
- **Matriz cuadrada**: verificar si el número de filas es igual al de columnas.
- **Matriz traspuesta**: invertir filas por columnas (`matrizB[j][i] = matrizA[i][j]`).
- **Matriz simétrica**: una matriz cuadrada es simétrica si es igual a su propia traspuesta; se compara elemento por elemento.
- **Repaso visual de ordenamientos (burbuja, inserción, selección)**: la misma lógica de la Clase 15 pero mostrando el estado del arreglo en cada paso, resaltando con colores ANSI (códigos de escape) qué posiciones se están comparando o intercambiando, y pausando con Enter para simular un "debugger paso a paso".
- **Códigos de color ANSI en consola** (`\u001B[33m`, etc.) y la importancia de resetear el color después de usarlo (`RESET`) para no dejar el resto del texto pintado.
- **Sobrecarga de métodos**: dos versiones de `imprimirEstado()`, una con color por defecto y otra donde se puede especificar el color.

## Archivos de referencia
`matrices.java`, `matriz_simetrica.java`, `OrdenarVisual.java`, `repaso_ordenamientos.java`

## Ideas clave
- 🔲 Una matriz es un arreglo de arreglos: `matriz[fila][columna]`.
- 🔄 La traspuesta intercambia filas por columnas; si una matriz cuadrada es igual a su traspuesta, es simétrica.
- 🎨 Los códigos ANSI pintan la consola de colores, pero siempre hay que resetear (`RESET`) después de usarlos.
- 👣 Visualizar paso a paso (con pausas y colores) ayuda a entender qué hace realmente cada algoritmo de ordenamiento por dentro.
