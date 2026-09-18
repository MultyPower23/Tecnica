import sqlite3

# ===== CREACION =====
miConexion = sqlite3.connect(
    "SQL\\Clase_14 (python)\\PrimerBase.db"
)  # la direccion en la cual se crea y gurada la base de datos
miCursor = (
    miConexion.cursor()
)  # el intermediario python-sql que ejecuta todo lo que programamos

miCursor.execute("""
    CREATE TABLE IF NOT EXISTS tb_producto (
        id_producto INTEGER PRIMARY KEY,
        nombreProducto TEXT,
        precio INTEGER,
        seccion TEXT)
    """)  # crea la lista en caso de no existir, y si existe ingnora y sigue ejecutando


# ===== AÑADIR DATOS =====
datos = [
    (1, "Camisa", 15, "Ropa"),
    (2, "Pantalon", 20, "Ropa"),
    (3, "Zapatos", 50, "Calzado"),
    (4, "Gorra", 10, "Accesorios"),
    (5, "Reloj", 100, "Accesorios"),
    (6, "Bolso", 30, "Accesorios"),
    (7, "Cinturon", 25, "Accesorios"),
    (8, "Vestido", 40, "Ropa"),
    (9, "Falda", 35, "Ropa"),
    (10, "Sandalias", 45, "Calzado"),
    (11, "Bufanda", 20, "Accesorios"),
    (12, "Guantes", 25, "Ropa"),
    (13, "Botas", 60, "Calzado"),
]

# --- INSERTAR ---
miCursor.executemany("INSERT OR IGNORE INTO tb_producto VALUES (?, ?, ?, ?)", datos)
# ejecuta multiples veces el comando cambiando las variables '?' por los valores asignados por 'datos'
# 'INSERT OR IGNORE' inserta solo si el 'id_producto' no existe, si EXISTE lo ignora y continua

""" miCursor.execute("INSERT INTO tb_producto VALUES (1, 'Camisa', 15, 'Ropa')") """  # forma indiviual


# ===== MODIFICAR DATOS =====
# --- ACTUALIZAR ---
miCursor.execute("UPDATE tb_producto SET precio = 30 WHERE id_producto = 2")

# --- ELIMINAR ---
miCursor.execute("DELETE FROM tb_producto WHERE id_producto = 13")


# ===== CONSULTAS =====
miCursor.execute("SELECT * FROM tb_producto")
mercancia = miCursor.fetchall()  # trae TODAS las filas como lista de tuplas

for producto in mercancia:
    print("ID:", producto[0])
    print("Nombre:", producto[1])
    print(f"Precio: ${producto[2]}")
    print("Sección:", producto[3])
    print("--/--" * 5)


# --- CONSULTA DE CALCULO DE PRECIO ---
consulta = """
    SELECT
        MAX(precio) AS precio_maximo,
        MIN(precio) AS precio_minimo,
        COUNT(CASE WHEN precio % 2 = 0 THEN 1 END) AS cantidad_pares
    FROM tb_producto
"""

miCursor.execute(consulta)
resultado = miCursor.fetchall()[0]

print(f"""---------- REPORTE SQL ----------
El precio más alto es: {resultado[0]}
El precio más bajo es: {resultado[1]}
Los números pares en los precios son: {resultado[2]}
""")


# ===== FINALIZACION =====
miConexion.commit()  # aplico los cambios OBLIGATORIO
miConexion.close()  # finalizo
