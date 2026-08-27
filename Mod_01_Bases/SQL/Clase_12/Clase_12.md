# SQL — Clase 12

## Tema central

Fundamentos de SQL: creación de tablas, llaves primarias/foráneas, `INSERT`, `SELECT`, `UPDATE`, `DELETE` y primer uso de `INNER JOIN`.

## Qué se vio

- **`CREATE TABLE`**: definición de columnas y tipos (`INTEGER`, `TEXT`, `NUMERIC`).
- **`PRIMARY KEY AUTOINCREMENT`**: llave principal que se autogenera.
- **`FOREIGN KEY ... REFERENCES tabla(columna)`**: relación entre tablas (ej. `producto` referencia a `marca`).
- **`INSERT INTO tabla (...) VALUES (...)`**: insertar uno o varios registros a la vez.
- **`SELECT * FROM tabla`**: consulta simple de todos los datos.
- **`INNER JOIN ... ON ...`** (con alias `AS`): combinar filas de dos tablas relacionadas por su llave (ej. `alumnos` con `examenes`, `producto` con `marca`).
- **`UPDATE tabla SET columna = valor WHERE condicion`**: modificar registros existentes, incluyendo concatenar texto (`columna || ' *'`).
- **`DELETE FROM tabla`**: eliminar registros (con nota de que necesita `WHERE`, sin él borra todo).

## Archivos de referencia

`alumnos.sql`, `producto.sql`

## Ideas clave

- 🔑 `PRIMARY KEY AUTOINCREMENT` genera el ID automáticamente, no hay que asignarlo a mano.
- 🔗 `FOREIGN KEY` conecta una tabla con otra, y `INNER JOIN` es lo que junta esa información en una sola consulta.
- ⚠️ `DELETE` y `UPDATE` sin `WHERE` afectan a toda la tabla, hay que tener cuidado.
