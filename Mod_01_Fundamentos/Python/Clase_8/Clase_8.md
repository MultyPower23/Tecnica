# Python — Clase 8

## Tema central

Funciones a fondo (parámetros, `return`, valores por defecto con `None`) y manejo de ficheros (`open`, modos `x`/`w`/`a`/`r`).

## Qué se vio

- **Funciones**: sintaxis de declaración (`def nombre(parametros):`), por qué se recomienda declararlas al inicio del archivo, y para qué sirve reutilizar bloques de código.
- **`return`**: cómo devuelve un valor y corta la ejecución de la función; también sirve para salir anticipadamente de una función dentro de un `if`/`for`/`while`.
- **Parámetros con valor por defecto (`=None`)**: patrón para evitar que el programa se caiga si no se pasan todos los argumentos.
- **Ficheros**: apertura con `open(ruta, mode=..., encoding="utf-8")`.
  - Modo `"x"`: crear archivo nuevo (falla si ya existe).
  - Modo `"w"`: sobrescribe el archivo.
  - Modo `"a"`: añade contenido al final sin borrar lo existente.
  - Modo `"r"`: lectura.
  - `encoding="utf-8"` para que tildes, ñ y demás caracteres especiales no se rompan.
- **Recorrer un archivo línea por línea** con `for linea in fichero:` para buscar patrones (ej. extraer títulos o autores de poemas).
- **Funciones recursivas** (Fibonacci recursivo) vs. **iterativas** (Fibonacci con bucle), y por qué la recursividad puede ser más lenta/pesada en memoria para números grandes.
- **Factorial iterativo** como ejemplo de acumulación con `for`.

## Ejercicios trabajados

- Biblioteca de poemas guardada en un `.txt`: añadir poema, listar títulos, buscar obras por autor, contar versos del poema más largo.
- Guardar notas de estudiantes en un archivo, acumulando registros con modo `"a"`.

## Ideas clave

- 🗂️ `open()` con `mode="a"` es la forma segura de ir agregando datos sin perder lo anterior.
- 🔁 Fibonacci recursivo vs. iterativo: la recursividad es elegante pero más costosa en memoria.
- 🛡️ Parámetros con `None` por defecto evitan que la función truene si falta un dato.
