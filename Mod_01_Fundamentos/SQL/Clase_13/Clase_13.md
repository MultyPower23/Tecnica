# SQL — Clase 13

## 📚 Tema central

Práctica y evaluación: modelado de varias tablas relacionadas y `INNER JOIN` con múltiples tablas.

## 🧠 Qué se vio

- **Modelado de un mini sistema de alquiler de películas** (`tb_peliculas`, `tb_copias`, `tb_clientes`, `tb_prestamos`), con relaciones encadenadas (una tabla referencia a otra, que a su vez es referenciada por una tercera).
- **`INNER JOIN` con más de dos tablas** para traer información combinada (ej. relacionar estudiantes, cursos e inscripciones).
- Práctica con datos de ejemplo: estudiantes/cursos/inscripciones, departamentos/municipios.
- Consultas con **alias de tabla (`AS`)** para acortar el código en joins.
- Ejercicios de evaluación tipo examen, aplicando lo visto en la Clase 12 en un caso más completo.

## 💻 Ejercicios trabajados

- `pruebas/estudiantes.sql` → tablas `estudiantes`, `cursos` e `inscripciones`, para practicar `INNER JOIN` con tres tablas.
- `pruebas/municipios.sql` → tablas `departamentos` y `municipios` relacionadas por llave foránea.
- `evaluacion/evaluacion_correccion.sql` → evaluación tipo examen: modelado completo del sistema de alquiler de películas (`tb_peliculas`, `tb_copias`, `tb_clientes`, `tb_prestamos`).

## ✅ Ideas clave

- 🎬 Un sistema con varias tablas relacionadas necesita pensar bien qué tabla referencia a cuál antes de crearlas.
- 🔗 Se puede encadenar más de un `INNER JOIN` para traer datos de tres o más tablas a la vez.
- 🏷️ Los alias (`AS`) hacen más legibles las consultas cuando hay varias tablas involucradas.
