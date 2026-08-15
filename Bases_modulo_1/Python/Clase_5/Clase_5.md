# Python — Clase 5

## Tema central
Condicionales (`if`, `elif`, `else`) y bucles `while`, incluyendo `while True` con `break`.

## Qué se vio
- **`if` / `else` / `elif`**: estructura y orden de evaluación (de arriba hacia abajo).
- **Interpolación de strings con `f""`**: insertar variables directamente en un texto con `{}`.
- **`while`**: se ejecuta mientras la condición inicial sea verdadera; se revisa la condición antes de entrar.
- **`while True` + `break`**: patrón de "bucle infinito controlado" muy usado para menús o validaciones que se repiten hasta cumplir algo.
- **`match / case`**: alternativa a múltiples `if/elif` para elegir entre varias opciones (usado para menús de selección de ejemplos).
- **Operadores de módulo (`%`) y división entera (`//`)** para separar horas en semanas/días/horas.
- **Listas (`append`)** usadas para ordenar y acumular resultados.

## Ejercicios trabajados
- Par o impar de un número.
- Verificar si un estudiante aprobó un examen.
- Cajero automático simple con verificación de PIN y saldo.
- Ordenar tres números distintos de mayor a menor.
- Convertir horas totales en semanas/días/horas.
- Aplicar descuento a una compra según el monto.
- Calcular paga semanal con tarifa diferente para horas extra (>40h).
- Determinar la cantidad de cifras de un número.

## Ideas clave
- 🚦 `if/elif/else` evalúa en orden y se detiene en la primera condición verdadera.
- 🔄 `while True` + `break` es el patrón clásico para "repetir hasta que algo pase".
- 🎯 `match/case` ordena mejor un menú de opciones que una cadena larga de `elif`.
