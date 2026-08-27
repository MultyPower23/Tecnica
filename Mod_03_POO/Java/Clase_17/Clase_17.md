# Java — Clase 17

## Tema central

Primeros pasos en Java: estructura de un programa, tipos primitivos, entrada de datos por consola y por ventanas, e interpolación de strings.

## Qué se vio

- **Estructura básica de un archivo Java**: `package` (ubicación del archivo), `class` (contenedor obligatorio de todo el código) y el método `main` (punto de arranque del programa).
- **`System.out.println()`** para imprimir en consola.
- **Tipos primitivos** y su tamaño en memoria:
  - `byte` (1 byte, -128 a 127)
  - `short` (2 bytes)
  - `char` (2 bytes, va entre comillas simples `'J'`)
  - `int` (4 bytes)
  - `long` (8 bytes, requiere sufijo `L` para números grandes)
  - `float` (4 bytes, requiere sufijo `f`)
  - `double` (8 bytes, tipo decimal por defecto, más preciso que `float`)
  - `boolean` (`true`/`false`, por defecto `false`)
- **Constantes con `final`**.
- **Entrada de datos con `Scanner`**: diferencia entre `.next()` (solo hasta el primer espacio) y `.nextLine()` (línea completa); también `.nextByte()` y otros métodos según el tipo.
- **Entrada/salida con `JOptionPane`** (ventanas emergentes): `showInputDialog()` siempre devuelve texto, así que hay que convertirlo con `Integer.parseInt()` o `Double.parseDouble()`; `showMessageDialog()` para mostrar resultados.
- **Interpolación de strings**: `System.out.printf()` para imprimir directo con formato, y `String.format()` para guardar el resultado en una variable. Comodines `%s`, `%d`, `%f` (con `.2f` para decimales), `%b`. También se vio cómo especificar el orden de los valores con `%posición$tipo`.

## Archivos de referencia

`hello_world.java`, `variables.java`, `inputs.java`, `JOption.java`, `interpolacion_strings.java`

## Ideas clave

- 🏗️ Todo en Java vive dentro de una clase, y el `main` es el punto de arranque obligatorio.
- 📏 Cada tipo primitivo tiene un tamaño y rango fijo — hay que elegir el que le quepa al dato.
- 💬 `JOptionPane` siempre entrega texto: toca convertirlo manualmente al tipo que se necesite.
