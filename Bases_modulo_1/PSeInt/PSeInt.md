# PSeInt — Recopilatorio general

> Esta carpeta no está dividida por clase, así que aquí va todo lo trabajado en PSeInt como bloque de práctica (probablemente en paralelo a las primeras clases de Python, ya que cubre temas similares de lógica básica).

## Temas cubiertos
- **`Definir` / `Como`**: declaración de variables con tipo (`Entero`, `Real`, `Cadena`, `Lógico`).
- **`Leer` / `Escribir`**: entrada y salida de datos.
- **Estructuras repetitivas**:
  - `Para ... Hasta ... Con Paso ... Hacer` (equivalente a `range()` en Python), incluyendo pasos negativos (`decreciente_.psc`).
  - `Mientras ... Hacer` (equivalente a `while`).
  - `Repetir ... Hasta Que` (equivalente a `do-while`, se ejecuta al menos una vez).
- **Condicionales**: `Si / SiNo / FinSi`, y `Según ... Hacer` (equivalente a `switch/case`), usado por ejemplo para identificar vocales.
- **Arreglos**: `Dimensionar`/`Dimension` para crear listas de tamaño fijo, y recorrerlas con `Para`.
- **Funciones (`Función`) y Subprocesos (`SubProceso`)**: diferencia entre ambos — una función devuelve un valor (`Función resultado <- nombre(parametros)`), un subproceso solo ejecuta acciones sin devolver nada.
- **Funciones de librería**: `Aleatorio(min,max)` para números aleatorios, `Longitud()` para el tamaño de un texto, `Mayusculas()` para convertir texto.
- **Validación de contraseñas**: combinar `Lógico` (booleanos), longitud mínima y verificación de mayúsculas/minúsculas/números/caracteres especiales.

## Ejercicios trabajados
- Contador decreciente con paso negativo.
- Aplicar descuento según categoría (A/B/C).
- Duplicar los números de una lista.
- Llenar y mostrar un arreglo ingresado por el usuario.
- Identificar si una letra es vocal (con `Según`).
- Diagnóstico: calcular el área de varios triángulos guardando resultados en una lista.
- Evaluar si se ganó o perdió una materia según la nota.
- Funciones matemáticas básicas (suma, resta, multiplicación) como funciones separadas.
- Promedio de seis notas usando un arreglo.
- Generar números aleatorios y guardarlos en una lista.
- Subproceso de saludo reutilizable con distintos nombres.
- Suma de números pares del 1 al 100.
- Tabla de multiplicar de un número elegido por el usuario.
- Verificación de contraseña con múltiples reglas (longitud, mayúscula, número, carácter especial).

## Ideas clave
- 🧩 PSeInt usa las mismas ideas de lógica que Python (variables, bucles, condicionales) pero con palabras en español y una sintaxis distinta — es buena base antes de programar en un lenguaje real.
- 🔁 `Para` es como `range()`, `Mientras` es como `while`, `Repetir...Hasta Que` es como `do-while`.
- 📦 `Función` devuelve un valor; `SubProceso` solo ejecuta acciones.
