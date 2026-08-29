# Java — Clase 23

## 📚 Tema central

No fue una clase de teoría nueva sino un **taller práctico** (Taller 1, en pareja) de 30 ejercicios que repasa y consolida todo lo visto en las Clases 17 a 22: tipos primitivos, operadores, condicionales, bucles, arreglos y matrices. Parte de los ejercicios ya se habían resuelto en clases anteriores y solo se recopilaron; otros se hicieron de cero para el taller.

## 🧠 Qué se vio

Nada conceptualmente nuevo — la idea del taller es aplicar en problemas "de la vida real" (sueldos, notas, tiendas, calculadoras, fechas, juegos) lo que ya se había tocado por separado en clase. Viéndolo en bloques:

- **Operadores y cálculos (e1-e8):** sumas, salarios, ecuaciones — la parte interesante acá es la elección de tipo (`byte`, `short`, `float`, `double`) según el rango del dato, algo que en Python ni te planteas porque `int` siempre es el mismo tipo sin importar el tamaño del número.
- **Condicionales (e9-e15):** `if/else` y `switch/case`. En Java el `switch` sobre `String` (e15) necesita comparar el valor exacto ("S", "s", etc., cada uno como `case` separado) — no existe el `match` con patrones de Python, es más una tabla de comparaciones literales.
- **Bucles con condición de parada / centinela (e16-e21):** todos usan `do-while`, que es la herramienta natural cuando necesitas pedir el dato *antes* de poder evaluar si debes parar (equivalente a un `while True: ... if condicion: break` en Python, pero con la condición de salida ya integrada en la sintaxis).
- **Bucles `for` (e22-e24):** conteos descendentes, con paso, y el clásico factorial acumulando en una variable.
- **Arreglos (e25-e28):** promedio, máximo, recorrido "de afuera hacia adentro", mezcla de dos arreglos en uno. Acá se nota fuerte la diferencia con Python: un arreglo en Java (`new float[10]`) tiene tamaño fijo desde que lo creas, no es una lista que crece con `.append()`.
- **Matrices (e29):** una matriz 2D es literalmente un arreglo de arreglos (`int[nFilas][nColumnas]`), y se recorre con un `for` anidado. Se verifica si es cuadrada comparando `nFilas == nColumnas`.
- **e30:** cierre con otro `for` de paso negativo, similar a e22 pero saltando de 7 en 7.

## 💻 Ejercicios trabajados

**Operadores / cálculos básicos:**

- e1: suma de 3 calificaciones
- e2: salario semanal (horas × pago por hora)
- e3: reparto de dinero entre tres personas
- e4: salario de vendedor con comisión + porcentaje de venta
- e5: nota final ponderada (4 componentes)
- e6: cuadrado de una suma `(a+b)²`
- e7: conversión de horas totales a semanas/días/horas
- e8: raíces de ecuación de segundo grado

**Condicionales:**

- e9 y e11: comparar dos números (mayor, menor o iguales) — dos versiones del mismo ejercicio
- e10: detectar si un carácter es mayúscula, minúscula o no es letra
- e12: descuento del 20% si la compra supera $300
- e13: salario semanal con recargo por horas extra
- e14: validar fecha (día/mes/año) con función auxiliar para días del mes
- e15: calculadora con las 4 operaciones básicas usando `switch`

**Bucles con centinela (`do-while`):**

- e16: clasificar números como positivos/negativos hasta ingresar 0
- e17: clasificar pares/impares hasta ingresar 0
- e18: contar cuántos números positivos se ingresaron hasta un negativo
- e19: juego de adivinar un número random (con `JOptionPane`, interfaz gráfica)
- e20: sumar números hasta ingresar 0
- e21: calcular el promedio de números hasta ingresar uno negativo

**Bucles `for`:**

- e22: contar de 10 a 0
- e23: sumar 10 números pedidos por teclado
- e24: factorial de un número

**Arreglos:**

- e25: promedio de 10 notas guardadas en un arreglo
- e26: valor máximo de un arreglo de tamaño variable
- e27: mostrar un arreglo intercalando extremos hacia el centro
- e28: mezclar dos arreglos de 10 números en uno de 20 (alternado)

**Matrices:**

- e29: verificar si una matriz ingresada por el usuario es cuadrada

**Cierre:**

- e30: contar de 100 a 0 de 7 en 7

## ⚠️ Errores comunes / cosas a las que prestar atención

- **División entera trunca:** en e21, `sum / i` con ambos `int` pierde los decimales del promedio. En Python 3, `/` siempre da `float` sin que lo pidas; en Java hay que castear (`(float) sum / i`) si quieres precisión. Vale la pena revisar ese ejercicio.
- **El casteo implícito de `*=` puede esconder pérdida de datos:** en e12, `valor *= 0.8` compila aunque `valor` sea `int` y `0.8` sea `double` — porque los operadores compuestos (`+=`, `*=`, etc.) *castean automáticamente* de vuelta al tipo original. Si escribieras `valor = valor * 0.8` en cambio, Java te marcaría error de tipos. Es una trampa clásica: el resultado se trunca sin previo aviso.
- **`&` en vez de `&&`:** en e17, la condición usa `num % 2 == 0 & num != 0` con un solo `&` (AND bit a bit) en vez de `&&` (AND lógico con cortocircuito). Acá funciona igual porque son booleanos, pero es un error fácil de cometer viniendo de otros lenguajes y puede traer sorpresas si alguna de las dos partes tiene efectos secundarios.
- **Tipos con rango limitado:** usar `byte` (como en e4, e22, e23, e25, e30) está bien para contadores pequeños, pero a diferencia del `int` de Python (que no tiene límite práctico), un `byte` se desborda silenciosamente si el valor supera 127.

## ✅ Ideas clave

- 📌 El taller no enseña nada nuevo — es repaso aplicado de las Clases 17 a 22 en un solo bloque de ejercicios.
- 🔢 Elegir el tipo primitivo correcto (`byte`/`short`/`int`/`float`/`double`) es una decisión real en Java, no automática como en Python.
- ➗ La división entre `int` trunca — si necesitas decimales, hay que castear explícitamente.
- 🔁 `do-while` es la forma natural de resolver "pedir datos hasta que pase algo", porque evalúa la condición *después* de ejecutar el cuerpo.
- 🧮 Los arreglos en Java tienen tamaño fijo desde su creación — no crecen como las listas de Python.
- 🔲 Una matriz es un arreglo de arreglos (`int[][]`), y se recorre con `for` anidado.
- ⚠️ Los operadores compuestos (`+=`, `*=`) castean de vuelta al tipo original sin avisar — cuidado con la pérdida de precisión.
