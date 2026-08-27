# PSeInt — Clase 1

> ⚠️ Reconstrucción aproximada: estos archivos no estaban organizados por clase cuando se crearon, y además hubo un cambio de sala que hizo perder parte del material antes de empezar a respaldarlo. La separación entre Clase 1 y Clase 2 es una estimación por nivel de dificultad, no un registro exacto de qué se vio cada día.

## Tema central

Primeros pasos con pseudocódigo: bucles simples y condicionales, sin arrays ni funciones todavía.

## Qué se vio (probablemente)

- **`Para ... Hasta ... Con Paso ... Hacer`**: bucle contador, incluyendo pasos negativos (contar hacia atrás).
- **`Mientras ... Hacer`**: bucle de validación, repitiendo mientras una condición se cumpla (incluyendo `Mientras Verdadero` como bucle "infinito" controlado desde dentro).
- **`Según ... Hacer`**: selección entre varias opciones (equivalente a un `switch/case`), usado para casos como identificar vocales o aplicar un descuento según categoría.
- **`Repetir ... Hasta Que`**: variante que ejecuta el bloque al menos una vez antes de revisar la condición.
- **`Mayusculas()`**: función de librería para normalizar texto antes de comparar.

## Ejercicios trabajados

- Contador decreciente con paso negativo (100 a 0).
- Aplicar descuento a un artículo según su categoría (A/B/C), validando que la categoría ingresada sea válida.
- Identificar si una letra ingresada es vocal, usando `Según`.
- Tabla de multiplicar de un número elegido por el usuario, repetida indefinidamente.
- Suma de los números pares del 1 al 100.

## Ideas clave

- 🔁 `Para` sirve para contar (subiendo o bajando), `Mientras` para repetir hasta que algo deje de cumplirse.
- 🚦 `Según` ordena mejor una selección de varias opciones que una cadena larga de `Si/SiNo`.
- ✅ Validar la entrada del usuario (categoría, letra) antes de continuar es un patrón que se repite mucho.
