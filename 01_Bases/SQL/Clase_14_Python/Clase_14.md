# SQL — Clase 14 (SQL desde Python)

## Tema central
Conectar y manejar una base de datos SQLite directamente desde Python con el módulo `sqlite3`.

## Qué se vio
- **`sqlite3.connect(ruta)`**: crea/abre el archivo de base de datos.
- **`conexion.cursor()`**: el "intermediario" que ejecuta las consultas SQL desde Python.
- **`cursor.execute("""...""")`**: ejecutar sentencias SQL como `CREATE TABLE IF NOT EXISTS` para no fallar si la tabla ya existe.
- **`cursor.executemany(query, datos)`**: insertar muchos registros a la vez, usando `?` como marcador de posición que se reemplaza por cada tupla de `datos`.
- **`INSERT OR IGNORE`**: inserta solo si el valor (ej. `id_producto`) no existe, evitando errores por duplicados.
- **`UPDATE` y `DELETE`** ejecutados igual que en SQL puro, pero desde `cursor.execute(...)`.
- **`cursor.fetchall()`**: trae todos los resultados de un `SELECT` como una lista de tuplas, recorribles con `for`.
- **Consultas de agregación** (`MAX`, `MIN`, `COUNT` con `CASE WHEN`) para generar un mini reporte (precio más alto, más bajo, cantidad de precios pares).
- **`conexion.commit()`**: aplicar los cambios de forma obligatoria.
- **`conexion.close()`**: cerrar la conexión al terminar.

## Archivo de referencia
`conexionDB.py`

## Ideas clave
- 🔌 `sqlite3.connect()` + `cursor()` son el puente entre Python y una base de datos SQLite.
- 📥 `executemany()` con `?` es la forma limpia de insertar muchos datos sin escribir un `INSERT` por cada uno.
- 💾 Sin `commit()` los cambios no se guardan de verdad en el archivo `.db`.
