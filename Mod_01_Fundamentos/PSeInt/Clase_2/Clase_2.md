# PSeInt — Clase 2

> ⚠️ Reconstrucción aproximada: estos archivos no estaban organizados por clase cuando se crearon, y además hubo un cambio de sala que hizo perder parte del material antes de empezar a respaldarlo. La separación entre Clase 1 y Clase 2 es una estimación por nivel de dificultad, no un registro exacto de qué se vio cada día.

## Tema central

Arreglos (arrays), funciones y subprocesos — un paso más allá de la Clase 1.

## Qué se vio (probablemente)

- **`Dimensionar` / `Dimension`**: crear arreglos de tamaño fijo o definido por el usuario.
- **Recorrido de arreglos con `Para`**: llenar y leer posiciones una por una.
- **`Aleatorio(min, max)`**: generar números aleatorios para llenar arreglos o simular datos.
- **`Función` vs `SubProceso`**: una función devuelve un valor (`Función resultado <- nombre(parametros)`), un subproceso solo ejecuta acciones sin devolver nada — ambos para reutilizar lógica.
- **Longitud y validación de texto**: `Longitud()`, `Subcadena()`, y comparación carácter por carácter, usados para validar una contraseña con varias reglas a la vez (mínimo de caracteres, mayúscula, minúscula, número, carácter especial).
- **Combinación de arreglos paralelos**: dos arreglos relacionados por posición (ej. nombres de materias y sus notas correspondientes).

## Ejercicios trabajados

- Llenar y mostrar un arreglo ingresado por el usuario.
- Generar y mostrar una cantidad de números aleatorios definida por el usuario.
- Subproceso de saludo reutilizable con distintos nombres.
- Duplicar los valores de una lista usando una función (`duplicador_numeros_.psc` y `duplicador_numeros_listas_.psc` son el mismo ejercicio, aparentemente guardado dos veces).
- Calculadora con cuatro funciones matemáticas (suma, resta, multiplicación, división) seleccionables por menú.
- Diagnóstico: calcular el área de varios triángulos guardando resultados en un arreglo.
- Evaluar si se ganó o perdió una materia según la nota, usando un subproceso y arreglos paralelos (nombre + nota).
- Promedio de seis notas usando un arreglo y una función de promedio.
- Verificación de contraseña con múltiples reglas simultáneas (longitud, mayúscula, minúscula, número, carácter especial).

## Ideas clave

- 📦 Un arreglo (`Dimensionar`) guarda varios valores relacionados bajo un solo nombre, accesibles por posición.
- 🧩 `Función` devuelve un valor que puedes usar después; `SubProceso` solo ejecuta una acción.
- 🔐 Validar una contraseña combina varias condiciones lógicas (`Y`, `O`, `NO`) revisando carácter por carácter.
