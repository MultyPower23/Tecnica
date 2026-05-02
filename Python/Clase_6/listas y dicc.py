# ===================================
# ========= EJEMPLOS ARRAYS =========
# ===================================


# ============ Ejemplo 1 ============
# -- Comidas y Peliculas Favoritas --
def comidas_fav():
    comida = []
    
    # print("Ingresa tus comidas favoritas \nIngresa '0' para finalizar")
    print("\nIngresa tus 5 comidas favoritas")

    while len(comida) != 5:
        op: str = input("Comida favorita: ")
        # if op == "0":
        #     print("Fin de Comidas favoritas")
        #     break

        comida.append(op)

    return comida

def peli_fav():
    peli = []

    print("\nIngresa tus 5 peliculas favoritas")

    while len(peli) != 5:
        op: str = input("Pelicula favorita: ")
        peli.append(op)

    return peli


def ejemplo1():
    comidas = comidas_fav()
    peliculas = peli_fav()

    print(f"Tus peliculas favoritas son {peliculas}")
    print(f"Tus comidas favoritas son {comidas}")


# ===================================
# ====== EJEMPLOS DICCIONARIO =======
# ===================================


# ============ Ejemplo 1 ============
# ---------- notas alumnos ----------
def dicc_alumnos():
    alumnos = [
        {'nombre':'pedro','edad':20,'calificacion':3.5},
        {'nombre':'maria','edad':30,'calificacion':4.5},
        {'nombre':'pedro','edad':28,'calificacion':3.7},
    ]
    
    print(alumnos[1]["calificacion"])
    total = sum(alumno["calificacion"] for alumno in alumnos)
    promedio = total / len(alumnos)
    print(f"\nEl promedio de las notas de los alumnos es {promedio:2f}")




# ============ Ejemplo 2 ============
# ------------- escuela -------------

def dicc_escuela():
    alumnos = [
        {'nombre':'pedro','edad':20,'calificacion':3.5},
        {'nombre':'maria','edad':30,'calificacion':4.5},
        {'nombre':'pedro','edad':28,'calificacion':3.7},
    ]

    escuela = {'alumnos': alumnos,
               'maestros': [
                   {'nombre':'martin','grado':'licenciado'},
                   {'nombre':'fernando','grado':'maestria'},
                   {'nombre':'pedro','grado':'doctorado'}
               ]
    }

    print("\nALUMNOS")
    for alumno in escuela["alumnos"]:
        print(f"Nombre: {alumno['nombre']}. Edad: {alumno['edad']}. Calificaciones: {alumno['calificacion']}.")

    print("\nMAESTROS")
    for maestro in escuela["maestros"]:
        print(f"Nombre: {maestro['nombre']}. Grado: {maestro['grado']}.")



# ==========================
# == SELECCION DE EJEMPLO ==
# ==========================
op: int = 0

while True:
    print("Elige el ejemplo que quieres ver sus pruebas \n1.Array, \n2.Diccionario de Alumnos \n3.Diccionario de Escuela")

    op = int(input("Elección: "))

    match op:
        case 1:
            ejemplo1()
        case 2:
            dicc_alumnos()
        case 3:
            dicc_escuela()
        case _:
            print("Esa opción no es válida")

    print("Algoritmo finalizado \n")