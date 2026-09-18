# Python — Clase 4

## Tema central

`input()`, anotación de tipos (`variable: tipo`), operaciones matemáticas básicas y primeras funciones con `return`.

## Qué se vio

- **`input()`** para pedir datos al usuario, siempre devuelve texto (`str`) así que se debe convertir con `float()` o `int()` si se necesita un número.
- **Anotación de tipos**: forma de indicar el tipo esperado de una variable (`gil: float = ...`), es solo una guía visual, Python no la obliga.
- **`while` como validador de datos**: repetir la pregunta mientras el valor ingresado no sea válido (ej. una nota fuera de rango).
- **Funciones con parámetros y `return`**: crear pequeños algoritmos reutilizables que reciben datos y devuelven un resultado (ej. calcular la paga de un vendedor según autos vendidos).
- **`.split()`**: separar un texto ingresado por espacios para convertirlo en una lista de valores.
- **Condicionales (`if`/`elif`)** aplicados a resultados calculados (ej. decidir si una nota final es sobresaliente, mínima o de repetición).

## Ejercicios trabajados

- Reparto de dinero entre tres personas con fórmulas matemáticas.
- Cálculo de nota definitiva ponderando participación, parciales y examen final, con validación de rango.
- Cálculo de paga semanal de un empleado según horas y salario por hora.
- Promedio de calificaciones ingresadas como texto separado por espacios.
- Cálculo de paga mensual de un vendedor de carros según cantidad y valor vendido (con parámetro por defecto).

## Ideas clave

- ⌨️ `input()` siempre da texto: hay que convertirlo explícitamente al tipo que necesitas.
- 🔁 Un `while` con la condición "no válido" es la forma más simple de validar datos del usuario.
- 🧩 Una función con `return` te permite calcular algo y reutilizarlo, en vez de repetir código.
