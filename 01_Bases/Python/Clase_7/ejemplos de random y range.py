import random
# Una libreria se llama con el 'import' y trae al algoritmo un monton de funciones o clases ya creadas por defecto
# se deben importar mejor desde el inicio del algortimo y fuera de toda funciom
# asi es lo primero que se llama y carga y evita tener qe llamarla cada vez dentro de una funcion o algo


def ejercicio1():
    pass

def ejercicio2():
    tabla_desde = 1
    tabla_hasta = 12
    desde = 1
    hasta = 10

    for factor1 in range(tabla_desde,tabla_hasta+1):
        print(f"Tabla de multiplicar del {factor1}:")
        for factor2 in range(desde,hasta+1):
            print(f"{factor1} x {factor2} = {factor1 * factor2}")
