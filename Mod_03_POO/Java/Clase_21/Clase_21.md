# Java — Clase 21

## Tema central
POO aplicada dentro de un mismo archivo (clases anidadas `static`), métodos de instancia vs. métodos estáticos, repaso de funciones, y estructuras lineales (pilas y colas).

## Qué se vio
- **Clases anidadas (`public static class X`)**: se puede definir una clase "molde" dentro de otra clase, y luego instanciarla con `new` para crear objetos reales con sus propios datos (ej. `Carro`, `ParejaIntegers`).
- **Atributos vs. instancias**: cada objeto creado con `new` guarda sus propios valores, aunque comparta el mismo molde (dos carros con distinto color/marca/km).
- **Métodos de instancia**: métodos que trabajan directamente con los atributos guardados dentro del objeto (no reciben esos datos por parámetro, ya los tienen adentro), llamados en cadena paso a paso sobre un mismo objeto (`leerNumero()` → `sumar()` → `mostrar()`...).
- **Métodos `static`**: pertenecen a la clase en sí, no a un objeto — se llaman con `Clase.metodo(...)` sin necesidad de crear una instancia con `new`. Reciben todos sus datos por parámetro.
- **Repaso de funciones**: parámetros, `return` vs. `void`, uso de `var` para que Java infiera el tipo, y funciones que devuelven `boolean` para usarlas directo en una condición o concatenarlas en un `println`.
- **Colas (`Queue`, con `LinkedList`) — FIFO** (*First In, First Out*): el primero que entra es el primero que sale. Métodos: `offer()` (insertar al final), `poll()` (sacar al que está al frente), `peek()` (consultar sin sacar). Comparado con una fila de atención o una cola de impresión.
- **Pilas (`Stack`) — LIFO** (*Last In, First Out*): el último que entra es el primero que sale. Métodos: `push()` (insertar), `pop()` (sacar el de la cima), `peek()` (consultar sin sacar). Comparado con apilar platos o el botón "atrás" del navegador.

## Ejercicios trabajados
- Simulación de una moto con estado (prendida/apagada, velocidad actual/máxima) controlada por métodos que validan reglas antes de actuar (ej. no acelerar si el motor está apagado).
- Simulación de un mouse y de un fármaco con lógica similar de creación, estado y acciones (comprar/vender).
- Calculadora con objeto (`ParejaIntegers`) usando métodos de instancia que leen datos por `JOptionPane` y calculan suma/resta/multiplicación/división.
- La misma calculadora pero con métodos `static` que reciben los números por parámetro en vez de guardarlos como atributos.
- Fila de atención (FIFO) y cola de impresión.
- Pila de platos e historial de navegador (LIFO).

## Ideas clave
- 🏭 Una clase anidada `static` es un molde local: cada `new` crea un objeto independiente con sus propios datos.
- 🔧 Método de instancia = usa los datos que ya tiene guardados el objeto; método `static` = recibe todo por parámetro y no necesita `new`.
- 🚶 Cola (FIFO): el primero que llega es el primero que se va — justo como una fila real.
- 🍽️ Pila (LIFO): el último que entra es el primero que sale — como una torre de platos, sacas siempre el de arriba.
