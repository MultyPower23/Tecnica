# Python — Clase 10

## Tema central
Introducción a la Programación Orientada a Objetos (POO): clases, atributos, métodos, constructor, encapsulamiento y herencia. También diccionarios a fondo.

## Qué se vio
- **Clases y objetos**: una clase es un "molde" para crear múltiples objetos (instancias) sin repetir código; se comparó con fabricar coches en serie en vez de programar cada uno a mano.
- **Atributos, métodos y estado**: propiedades (variables), comportamientos (funciones) y el estado actual del objeto.
- **`self`**: referencia al propio objeto/instancia, necesaria para leer o modificar sus datos internos.
- **Constructor `__init__`**: método especial que recibe los datos iniciales al crear el objeto, como los parámetros de una función.
- **Encapsulamiento (`__atributo`)**: los atributos con doble guion bajo se vuelven "privados", solo modificables desde dentro de la clase (por métodos).
- **Herencia (`class Hija(Padre)`)**: una clase hija hereda atributos y métodos de la clase padre, y puede sobrescribirlos (ej. `Moto` hereda de `Vehiculos`).
- **`super()`**: llamar a un método de la clase padre desde la clase hija (útil para no reescribir todo).
- **Diccionarios (`dict`)**: pares clave → valor, diferencias con listas, acceso con `[]` o `.get()` (más seguro), métodos `.keys()`, `.values()`, `.items()`, `.update()`, diccionarios anidados y por comprensión.
- **`defaultdict`**: variante de diccionario que evita comprobar si una clave existe antes de sumar/agregar.

## Ejercicios trabajados
- Clase `Coche` con atributos públicos y comportamiento (arrancar/estado).
- Clase `Coche2` con constructor y atributos privados.
- Herencia: `Vehiculos` → `Moto`, sobrescribiendo el método `estado()` y usando `super()`.
- Herencia: `Padre` → `Hija`, con atributo adicional (`talento`) manejado desde el constructor.
- Diccionario de un alumno con datos anidados y operaciones CRUD básicas.
- Contador de palabras en un texto usando diccionarios (`.get()` y `defaultdict`).

## Ideas clave
- 🏭 Una clase es un molde: cada objeto creado con ella es independiente y editable sin afectar a los demás.
- 🔒 El doble guion bajo (`__atributo`) hace privado un dato, solo tocable desde dentro de la clase.
- 🧬 La herencia evita repetir código: la clase hija reutiliza todo lo del padre y solo agrega o cambia lo que necesita.
- 🗄️ Un diccionario es como un armario con cajones etiquetados: buscas por nombre (clave), no por posición.
