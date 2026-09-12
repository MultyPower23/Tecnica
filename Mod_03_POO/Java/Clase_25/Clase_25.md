# Java — Clase 25

## 📚 Tema central

Cierre y sustentación oral del proyecto final de POO: el **Sistema de Gestión Aeroportuaria**, hecho en pareja con Sebastian Hernandez, aplicando herencia, clases abstractas y polimorfismo sobre un programa de consola.

## 🧠 Qué se vio

Esta clase fue la entrega y exposición, no teoría nueva — pero vale repasar qué pedía el proyecto y por qué está armado como está:

**El encargo:** una compañía necesita consultar sus aeropuertos, las aerolíneas que operan en cada uno, los vuelos que ofrecen y los pasajeros con asiento reservado. Aplicación de consola, sin base de datos — todo vive en memoria y se precarga al iniciar con `cargarDatos()` (3 aeropuertos, 3 compañías, 6 vuelos, 5 pasajeros).

**La estructura, en cadena:** `Aeropuerto` tiene varias `Compania`, cada `Compania` tiene varios `Vuelo`, cada `Vuelo` tiene varios `Pasajero`. Esa cadena es la que se recorre con ciclos anidados en las opciones 4 y 5 del menú.

**La herencia — el corazón del proyecto:** `Aeropuerto` es abstracta (nunca existe un aeropuerto "genérico", siempre es público o privado). `AeropuertoPublico` guarda la subvención del gobierno; `AeropuertoPrivado` guarda la lista de empresas patrocinadoras. Ambas sobreescriben el método abstracto `informacionDeFinanciacion()`, cada una a su manera.

**Por qué la opción 2 del menú era la clave de todo:** la guía marcaba muy claro el contraste entre resolverlo con `instanceof` (funciona, pero es justo lo que la herencia viene a evitar, y si aparece un tercer tipo de aeropuerto tocaría volver a tocar el menú) contra resolverlo con el método abstracto (el menú simplemente le pregunta al aeropuerto, sin importarle de qué tipo es — eso vale puntos de polimorfismo aparte). El proyecto quedó resuelto con la segunda opción.

**Reglas de negocio que el programa debía respetar:** un aeropuerto es público o privado, nunca los dos; un vuelo no acepta más pasajeros que su cupo máximo; el número real de pasajeros nunca se guarda como atributo aparte (se calcula con `pasajeros.size()`, para no desincronizarse); una compañía puede operar en varios aeropuertos (por eso en la opción 5 hay que evitar mostrar el mismo vuelo repetido); y todos los atributos son `private`, accesibles solo por getters.

**Cómo se calificaba (sobre 100 puntos):** diseño de clases y herencia (30), funcionamiento del menú (25), uso de polimorfismo (15), evidencias y diagrama (15), sustentación oral (15). El mensaje central de la guía era que un proyecto con las cinco opciones funcionando pero sin herencia real no pasa de 3,0, mientras que uno con las clases bien construidas aunque el menú quede incompleto sí aprueba — el diseño pesa más que el código que "solo funciona".

## 💻 Ejercicios trabajados

No fueron ejercicios sueltos sino la entrega completa del proyecto final, en 4 partes:

- **Código fuente (.zip):** las 7 clases terminadas — `Pasajero`, `Vuelo`, `Compania`, `Aeropuerto` (abstracta), `AeropuertoPublico`, `AeropuertoPrivado`, `Principal` — más la clase de apoyo `Utilidades` (encabezado, limpiar consola, `cargarDatos()`).
- **Evidencias (PDF):** el código de cada clase junto con una captura de cada una de las cinco opciones del menú funcionando.
- **Diagrama de clases:** las 7 clases con atributos, métodos y flechas de herencia.
- **Sustentación oral:** exposición de 5 minutos por estudiante, explicando su propio código.

## ⚠️ Errores comunes / cosas a las que prestar atención

Estos son los cuatro errores que la guía advertía explícitamente que se cometen siempre — y que tocó revisar antes de entregar:

- **Guardar el número de pasajeros como atributo aparte:** tarde o temprano se desincroniza de la lista real. Solución: usar `pasajeros.size()`.
- **Resolver la opción 2 con `instanceof`:** funciona, pero es justo lo que la herencia viene a evitar. Solución: método abstracto con `@Override` en cada hija.
- **Vuelos repetidos en la opción 5:** si una compañía opera en dos aeropuertos, el mismo vuelo puede salir duplicado en la búsqueda por ruta. Hay que decidir cómo evitar el duplicado (en la versión final se controla con una lista de "ya mostrados").
- **Comparar texto con `==` en vez de `.equalsIgnoreCase()`:** casi siempre da falso aunque el texto se vea igual en pantalla.

## ✅ Ideas clave

- 🏁 Esta clase fue la entrega y sustentación, no contenido nuevo — el cierre real del Módulo 3 de POO.
- 🧩 El truco de todo el proyecto: el menú nunca pregunta de qué tipo es un aeropuerto, simplemente le pide que responda — eso es polimorfismo aplicado, no solo teoría.
- ⚖️ El diseño de clases y la herencia pesan más (30 pts) que el menú funcionando (25 pts) — un programa que "solo funciona" sin buena arquitectura no basta.
- 🔢 El conteo real de pasajeros nunca se guarda aparte — siempre se calcula con `.size()` para que no se desincronice.
- 🔁 Una compañía puede repetirse en varios aeropuertos, así que hay que controlar duplicados al buscar por ruta.
- 🔤 Comparar `String` siempre con `.equalsIgnoreCase()`, nunca con `==`.
