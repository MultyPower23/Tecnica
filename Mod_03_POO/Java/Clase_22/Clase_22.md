# Java — Clase 22

## Tema central
Arranque formal de POO en Java con clases en archivos separados: método constructor, encapsulamiento (Set/Get) y modificadores de acceso (`default`, `public`, `private`).

## Qué se vio
- **Método constructor**: método especial que se ejecuta automáticamente al crear un objeto con `new`. Reglas: se declara `public`, no tiene tipo de retorno (ni `void`), y su nombre debe ser idéntico al de la clase. Se usa `this.atributo = atributo` para diferenciar el atributo del objeto del parámetro que llega con el mismo nombre.
- **Sobrecarga de constructores**: una clase puede tener varios constructores, siempre que se diferencien en cantidad, tipo u orden de los parámetros. No pueden existir dos con exactamente la misma firma.
- **Encapsulamiento**: limitar el acceso directo a los atributos de una clase para tener más control sobre ellos, en vez de dejarlos expuestos "en crudo".
- **Métodos accesores (Setters/Getters)**: `Set` (establecer un valor) y `Get` (obtener un valor) son la puerta de entrada/salida a un atributo que se dejó `private`. Permiten seguir usando el dato desde afuera sin exponerlo directamente.
- **Modificadores de acceso**:
  - *(sin modificador / default)*: visible solo dentro del mismo paquete.
  - `public`: visible desde cualquier clase, de cualquier paquete (importando).
  - `private`: visible solo dentro de la misma clase.
  - `protected` *(mencionado en la presentación, no trabajado en código de esta clase — se retoma cuando entre herencia)*: como `private`, pero además accesible desde subclases.
- **Miembros estáticos de una clase** *(⚠️ tema de la presentación sin apuntes/código propios de esta clase — ver nota abajo)*: atributos o métodos marcados `static` que pertenecen a la clase en sí, no a cada objeto por separado. Hay una sola copia compartida por todas las instancias; si una la cambia, todas la ven cambiada.

## Ideas clave
- 🏗️ El constructor es el "`__init__` de Java", pero con nombre fijo (igual al de la clase) y sin tipo de retorno.
- 🔒 Encapsular = esconder el atributo real (`private`) y solo dejar entrar/salir por los métodos que la clase decide (`Set`/`Get`).
- 🚪 Modificador de acceso = quién puede tocar la puerta: `private` (solo yo), *default* (mi paquete), `public` (cualquiera), `protected` (yo y mis herederos).
- 🧮 Miembro estático = dato o acción de la CLASE, no de cada objeto — una sola copia compartida por todos.
