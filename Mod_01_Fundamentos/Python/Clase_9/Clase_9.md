# Python — Clase 9

## Tema central

Generadores (`yield`) y manejo de excepciones (`try` / `except` / `finally`).

## Qué se vio

- **Generadores con `yield`**: a diferencia de `return`, un generador no entrega todos los valores de golpe, sino uno por uno bajo demanda ("lazy evaluation"). Cada `yield` pausa la función y guarda su estado.
- **`next()`**: pedir el siguiente valor de un generador manualmente.
- **`yield from`**: delegar en otro generador para encadenar varios (ej. combinar un generador de números bajos y otro de altos en uno solo).
- **Generadores infinitos**: un generador puede no terminar nunca si el `while True` que lo contiene no tiene condición de salida (ej. "saltos de 10 en 10").
- **Comparación memoria vs. generador**: construir una lista completa en memoria vs. producir valores uno a uno (más eficiente para conjuntos grandes).
- **Excepciones (`try`/`except`)**: capturar errores esperables sin que el programa se caiga.
  - `ZeroDivisionError` para divisiones entre cero.
  - `ValueError` para conversiones de tipo inválidas.
  - `FileNotFoundError` para archivos que no existen.
  - `finally`: bloque que se ejecuta siempre, haya habido error o no.

## Ejercicios trabajados

- Generador que entrega los números del 0 al 100 uno por uno.
- Generador de cuadrados del 1 al 5.
- Semáforo como generador de ciclo finito (`Verde`, `Amarillo`, `Rojo`).
- Generador infinito de saltos de 10 en 10.
- Combinar dos generadores con `yield from` y mostrar los primeros 3 valores con `next()` y el resto con `for`.
- Generador de 7 números aleatorios.
- Calculadora con manejo de excepción para división entre cero.

## Ideas clave

- 💧 `yield` entrega valores de a poco (uno a la vez) en lugar de construir todo de una vez, como abrir el grifo en vez de llenar un balde entero.
- ⏭️ `next()` avanza manualmente un generador un paso a la vez.
- 🧯 `try/except/finally` es la red de seguridad para errores esperables (división por cero, datos inválidos, archivos faltantes).
