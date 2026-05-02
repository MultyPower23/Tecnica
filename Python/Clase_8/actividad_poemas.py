ruta = r"D:\Codigos USB\Tecnica\Python\Clase_8\ficheros_actividad\biblioteca.txt"
#    fichero.write(f"\033[1m{nombre}/ --- °°{autor}/")
separador: str = "\n-------------------------------\n"

def añadir_poema():
    nombre: str = input("NOMBRE DEL POEMA: ")
    # if poema.lower() == "fin":
    #     return
    autor: str = input("NOMBRE DEL AUTOR: ")
    with open(ruta, mode="a", encoding="utf-8") as fichero:
        fichero.write(f"**NOMBRE DEL POEMA: {nombre}/ \n °°NOMBRE DEL AUTOR: {autor}/\n")
        print("Escribe las lineas del poema por versos y sus estrofas (si es que tiene), y finaliza colocando 'FIN'")
        while True:
            frase: str = input("")
            if frase.upper() == "FIN":
                fichero.write(f"\n{frase.upper()}")
                fichero.write(separador)
                print(f"Se ha guardado el poema '{nombre}' de {autor} correctamente")
                break
            fichero.write(f"\n{frase}")

def titulos():
    print("POEMAS DISPONIBLES:")
    with open(ruta, mode="r", encoding="utf-8") as fichero:
        for linea in fichero:
            if linea.startswith("**NOMBRE DEL POEMA: "):
                nombre: str = linea.replace("**NOMBRE DEL POEMA: ", "- ")
                nombre = nombre.replace("\n/", "")
                print(nombre)
                
def autores():
    autor: str = input("Autor que desea conocer las obras: ")
    linea_anterior: str = ""
    with open(ruta, mode="r", encoding="utf-8") as fichero:
        for linea in fichero:
            print(f"OBRAS DE {autor}")
            if linea.startswith(f" °°NOMBRE DEL AUTOR: {autor}"):
                obra: str = linea_anterior.replace("**NOMBRE DEL POEMA: ", "- ")
                obra = obra.replace("\n/", "")
                print(obra)
            linea_anterior = linea

def contar_versos():
    with open(ruta, "r", encoding="utf-8") as archivo:
        texto = archivo.read()
    poemas = texto.split("-------------------------------")
    max_versos = 0
    poema_mas_largo = ""
    for poema in poemas:
        lineas = poema.strip().split("\n")        
        nombre = ""
        contando = False
        versos = 0
        for linea in lineas:
            linea = linea.strip()
            if linea.startswith("**NOMBRE DEL POEMA:"):
                nombre = linea.replace("**NOMBRE DEL POEMA:", "").strip()
            elif linea == "":
                contando = True
            elif linea == "FIN":
                break
            elif contando:
                versos += 1
        if nombre and versos > max_versos:
            max_versos = versos
            poema_mas_largo = nombre
    if poema_mas_largo:
        print(f"El poema más largo es '{poema_mas_largo}' con {max_versos} versos.")