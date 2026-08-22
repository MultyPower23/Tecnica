# =====================
# ===    FICHEROS   ===                                                    # si al fin, tema nuevo yupiiii
# =====================

# existen diversos tipos de ficheros, son como un tipo de bloc de notas
# hay: .json, .txt

# algunos comandos utiles son:
# el '.read()' permite leer el archivo, el '.write()' permite escribir el archivo, y el 'append x:existencia' //no se si asi se escribe\\ permite añadir al archivo

# es la ruta en la cual se ubica el archivo en el almacenamieto
ruta = r"D:\Codigos USB\Tecnica\Python\Clase_8\ficheros_ejemplos"

# aca estoy definiendo el nombre y direccion del archivo
prueba = ruta + "\\prueba.txt"

# === Crear el fichero ===
def x():
    with open(prueba, mode="x", encoding="utf-8") as fichero:
        # el open() es una funcion que se encarga de abir el archivo
        # devuelve un objeto archivo (file object) que permite leer o escribir
        # si el archivo no existe o hay problemas, lanza errores.

        # el modo= define como o que se va a hacer al archivo
        # "x" es "Modo de Apertura", crea un archivo nuevo pero buguea si ya estaba creado
        # util para evitar sobreescribir archivos

        # el encoding= define como se codifica los caracteres
        # "utf-8" son los caracteres al español: acentos, ñ, emojis

        fichero.write("Hola Mundo")     # esta escribiendo en el archivo lo que esta entre parentesis


# === Sobrescritura del archivo ===
def w():
    with open(prueba, mode="w", encoding="utf-8") as fichero:
        # el modo="w" significa escibir, osea que va a sobreescribir el archivo 
        fichero.write("Hola Ciro")


# === Append - Añadir al arhivo ===
def a():
    with open(prueba, "a", encoding="utf-8") as fichero:
        # el modo="a" significa añadir, osea que añadira el valor al pie dela archivo
        # el 'modo=' es opcional
        fichero.write(", veo que funciona")


# === Ejemplos ===

notas = ruta + "\\notas.txt"
def guardar_notas(nombre, nota):
    with open(notas, "a", encoding="utf-8") as fichero:
        fichero.write(f"{nombre} {nota}\n")
    print(f"Se ha guardado la nota de {nombre}")

while True:
    nombre: str = input("Nombre Estudiante: ")
    if nombre.lower() == "fin":
        break
    nota: float = float(input(f"Nota de {nombre}: "))
    guardar_notas(nombre,nota)