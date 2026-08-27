# Python — Clase 7

## Tema central

Profundización en `for`, `range()` y `len()`, más una batería grande de ejercicios prácticos con `import random`.

## Qué se vio

- **`range(inicio, fin, paso)`** explicado a fondo: siempre excluye el valor final, por defecto empieza en 0 y avanza de 1 en 1.
- **`len()`**: obtiene la longitud de listas o strings, útil combinado con `range(len(lista))` para recorrer por índice.
- **`end=" "`** en `print()` para controlar qué se imprime al final en lugar de saltar de línea.
- **`import random`**: cómo y por qué importar librerías al inicio del archivo, fuera de las funciones.
- Recorrido de listas mixtas (con distintos tipos de dato dentro).
- Patrón de menú con `match/case` para probar múltiples ejercicios desde un mismo archivo.

## Ejercicios trabajados

- Contar apariciones de una letra en una palabra.
- Sumar una lista de números ingresados por el usuario.
- Tabla de multiplicar del 5.
- Panadería con descuento por pan no fresco.
- Repetir una palabra 10 veces.
- Mostrar los años cumplidos desde el 1 hasta la edad actual.
- Dibujar una pirámide de asteriscos.
- Contar pares hasta 100.
- Validar contraseña hasta que sea correcta.
- Detectar si un número es positivo o negativo (hasta ingresar 0).
- Clasificar una palabra como corta, larga o de buena longitud.
- Cuenta regresiva para "despegue".
- Juego de adivinar la posición del tesoro en un cofre.
- Invertir una palabra letra por letra.
- "Multiplicador de gritos" (repetición creciente de un carácter).

## Ideas clave

- 📏 `range(a, b, paso)` nunca incluye `b`.
- 📐 `len()` + `range()` es la combinación clásica para recorrer por índice.
- 📦 `import` va arriba del archivo para no repetir la carga de la librería.
