# ========================================
# === DICCIONARIOS EN PYTHON ===
# ========================================

# Un diccionario (dict) es una estructura de datos que almacena información en pares de "clave → valor".
# Es como un armario con cajones etiquetados: en vez de buscar por posición (como en una lista),
# buscas directamente por la etiqueta (la clave). Esto lo hace extremadamente rápido para buscar,
# añadir o modificar datos.

# Se diferencia de las listas:
#   - Lista:     datos[0], datos[1], datos[2]  → accedes por índice (número)
#   - Diccionario: datos["nombre"], datos["edad"] → accedes por clave (puede ser texto, número, tupla...)

# Ventajas principales:
#   - Búsqueda muy rápida (casi instantánea, O(1) en promedio)
#   - Las claves deben ser únicas y de tipo inmutable (str, int, float, tuplas, etc.)
#   - Los valores pueden ser de CUALQUIER tipo: números, strings, listas, otros diccionarios, objetos...
#   - Desde Python 3.7 los diccionarios mantienen el orden en que se insertaron los elementos
#   - Muy útil para datos reales: perfiles de usuario, configuraciones, JSON, bases de datos simples, etc.

# Desventajas:
#   - No se puede repetir una clave (si lo intentas, sobrescribe el valor anterior)
#   - Consume un poco más de memoria que una lista

# Analogía práctica:
# Imagina que quieres guardar información de varios alumnos.
# Con listas tendrías que recordar que el índice 0 es nombre, 1 es edad, etc. → fácil de equivocar.
# Con diccionarios cada alumno es un "cajón" etiquetado claramente: "nombre", "edad", "nota", etc.
# Y además puedes tener cientos de alumnos sin repetir código.

# ======================================
# === EJEMPLO BÁSICO: CREACIÓN Y USO ===
# ======================================

# Crear un diccionario vacío
alumno = {}

# Crear un diccionario con datos iniciales (la forma más común)
alumno = {
    "nombre": "Carlos",  # clave: "nombre"  → valor: "Carlos"
    "edad": 17,
    "ciudad": "Madrid",
    "activo": True,
    "calificaciones": [8.5, 9.0, 7.5],  # valor puede ser una lista
}

# ===========================
# === OPERACIONES BÁSICAS ===
# ===========================

# 1. Acceder a un valor (dos formas seguras)
print(alumno["nombre"])  # Carlos
print(alumno.get("edad"))  # 17          ← más seguro, no da error si no existe
print(
    alumno.get("telefono", "No tiene")
)  # No tiene   ← valor por defecto si la clave no existe

# 2. Modificar un valor existente
alumno["edad"] = 18
alumno["calificaciones"][
    0
] = 9.0  # también puedo modificar dentro de una lista que está como valor

# 3. Añadir una nueva clave-valor
alumno["promedio"] = 8.3
alumno["direccion"] = {
    "calle": "Av. Principal",
    "numero": 45,
}  # valor puede ser OTRO diccionario

# 4. Eliminar una clave
del alumno["ciudad"]  # forma 1
# alumno.pop("activo")                     # forma 2 (más segura, devuelve el valor eliminado)

# 5. Saber cuántos elementos tiene
print(len(alumno))  # cantidad de pares clave-valor

# ===============================
# === MÉTODOS MÁS IMPORTANTES ===
# ===============================

# .keys()     → devuelve todas las claves
# .values()   → devuelve todos los valores
# .items()    → devuelve pares (clave, valor) → ideal para bucles
# .update()   → une otro diccionario
# .clear()    → borra todo
# .copy()     → crea una copia independiente

claves = alumno.keys()
valores = alumno.values()
pares = alumno.items()

print(
    list(claves)
)  # ['nombre', 'edad', 'activo', 'calificaciones', 'promedio', 'direccion']
print(list(valores))

# ========================================
# === RECORRER (ITERAR) UN DICCIONARIO ===
# ========================================

# Forma recomendada: clave y valor al mismo tiempo
for clave, valor in alumno.items():
    print(f"La clave '{clave}' tiene el valor: {valor}")

# Solo claves
for clave in alumno:
    print(clave)

# Solo valores
for valor in alumno.values():
    print(valor)

# ==========================================================
# === DICCIONARIOS ANIDADOS (diccionario dentro de otro) ===
# ==========================================================

# Muy útil para datos complejos (ej: JSON, API, configuraciones)
escuela = {
    "alumno1": {
        "nombre": "Ana",
        "edad": 16,
        "notas": {"matematicas": 9.5, "lengua": 8.0},
    },
    "alumno2": {
        "nombre": "Luis",
        "edad": 17,
        "notas": {"matematicas": 7.0, "lengua": 9.5},
    },
}

# Acceder a datos anidados
print(escuela["alumno1"]["notas"]["matematicas"])  # 9.5

# ===================================
# === DICCIONARIO POR COMPRENSIÓN ===
# ===================================

# Crear un diccionario rápidamente a partir de una lista
numeros = [1, 2, 3, 4, 5]
cuadrados = {n: n**2 for n in numeros}
print(cuadrados)  # {1: 1, 2: 4, 3: 9, 4: 16, 5: 25}

# Con condición
pares_con_cuadrado = {n: n**2 for n in numeros if n % 2 == 0}
print(pares_con_cuadrado)  # {2: 4, 4: 16}

# ===============
# === EJEMPLO ===
# ===============

texto = "hola mundo hola python hola diccionarios"
contador = {}

for palabra in texto.split():
    if palabra in contador:
        contador[palabra] += 1  # ya existe → sumar 1
    else:
        contador[palabra] = 1  # primera vez → crear con 1

print(contador)
# {'hola': 3, 'mundo': 1, 'python': 1, 'diccionarios': 1}

# Versión más profesional con .get()
contador2 = {}
for palabra in texto.split():
    contador2[palabra] = contador2.get(palabra, 0) + 1

# ===================================
# === TRUCO AVANZADO: defaultdict ===
# ===================================

from collections import defaultdict

# Evita tener que comprobar si la clave existe
contador3 = defaultdict(int)  # int() devuelve 0 por defecto
for palabra in texto.split():
    contador3[palabra] += 1

print(dict(contador3))  # igual que antes pero más limpio
