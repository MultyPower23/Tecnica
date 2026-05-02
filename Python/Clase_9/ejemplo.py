try:
    with open("mis_notas.txt", "r") as archivo:
        contenido = archivo.read()
        print(contenido)
except FileNotFoundError:
    print("El archivo no existe. Asegúrate de crearlo primero.")
