# Clase 24 — Herencia, Polimorfismo y Clases Abstractas

> Hubo un taller de 50 preguntas de opción abierta basándose en el taller de la clase pasada.

## 📚 Temas vistos

- **Herencia**: una clase (subclase o clase hija) puede reutilizar los atributos y métodos de otra (superclase o clase padre) usando `extends`.
- **Polimorfismo**: un objeto puede tratarse como si fuera de su clase base, aunque en realidad sea de una clase derivada. Se apoya en herencia + sobreescritura.
- **Sobreescritura de métodos**: una clase hija redefine (le da su propia versión) a un método que ya existía en la clase padre.
- **`@Override`**: anotación que le avisa a Java "esto es una sobreescritura a propósito". Si el nombre del método no coincide con ninguno de la clase padre, Java marca error en vez de crear un método nuevo por accidente.
- **Clases abstractas** ⚠️ *(mencionado en clase, sin código propio — ver nota abajo)*: clases que no se pueden instanciar directamente (`new Figura()` no compila), pero que sirven de molde común para que sus clases hijas implementen sus propios métodos obligatorios (`abstract`).

## 🧠 Ideas clave

- La herencia responde a "¿qué tienen en común?" (Perro y Gato son ambos un Animal).
- El polimorfismo responde a "¿cómo trato a varios objetos distintos con el mismo código?" (un solo método que recibe `Animal` sirve para Perro y Gato).
- Las clases abstractas responden a "quiero obligar a mis clases hijas a implementar esto, pero no sé/no me importa cómo lo hace cada una".
- `static` (visto en `Personas.java`) no tiene que ver con herencia, pero convive en el mismo archivo: es una variable compartida entre TODOS los objetos de la clase, no una por objeto.

## 💻 Archivos de esta clase

- `Animal.java` → herencia + polimorfismo + sobreescritura, con `Perro` y `Gato` extendiendo `Animal`.
- `Personas.java` → constructor, atributo `static` (contador compartido), encapsulamiento (`private` + getters/setters), y sobreescritura de `toString()` (heredado de `Object`).
- `ClasesAbstractas_Demo.java` ⚠️ → **no viene de la clase**, es un ejemplo que armé para cubrir el hueco de "clases abstractas" que quedó solo mencionado en las notas sin código.

## ⚠️ Advertencia

Este resumen incluye un archivo de refuerzo (`ClasesAbstractas_Demo.java`) que no salió de la clase real — lo hice para que tengas algo con qué estudiar el tema, pero conviene que lo contrastes con lo que explique el profe cuando retomen o repasen esto, por si usa una sintaxis o ejemplo distinto.

## ✅ Resumen rápido

- 🐾 **Animal → Perro/Gato**: la herencia comparte código, el polimorfismo permite tratarlos de forma uniforme
- 🎭 **@Override**: red de seguridad para que Java confirme que sí estás sobreescribiendo algo real
- 👥 **Personas**: `static` = compartido entre todos los objetos; `private` + getters/setters = encapsulamiento
- 🔷 **Clases abstractas**: molde que no se puede instanciar solo, obliga a sus hijas a implementar ciertos métodos
