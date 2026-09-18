# Bucles (while) -------- (Es un proceso que ejecutara las lineas dentro suyo indefinidamente mientras la condicion inicial sea TRUE)
# Arreglos (array, []) ------ (Es una lista dentro de "[]" con valores separados por ",", sirve para contenter multiples valores en un solo lugar entre otras funciones)

def ejemplo1():
    # ========= Ejemplo 1 ===========
    i: int = 1
    while i <= 3:
        print(i)
        i += 1
    print("Fin del algoritmo")


def ejemplo2():
    # ========= Ejemplo 2 ===========
    # Con arrays
    dia: int = 0
    semana = ["Lunes", "Martes", "Miercoles", "Jueves", "Viernes"]
    while dia <= 4:
        print(semana[dia])
        dia += 1


def ejemplo3():
    # ========= Ejemplo 3 ===========
    num: int = int(input("Escriba un número positivo: "))
    while num > 0:
        print("Ha escrito un número negativo, intentalo de nuevo")
        num = int(input("Escriba un número positivo: "))
    print("Gracias por su colaboración de números positivos", num)


def ejemplo4_do():
    # ========= Ejemplo 4 ===========
    # While Do es un tipo de bucle que siempre se estara ejecutando, al menos que se cancele

    PALABRA_SECRETA: str = "python" # -------------- Es una constante, se define en mayusculas y no puede ser mutado su valor
    contador: int = 0

    while True: # ------------ El True afirma que esa condicion siempre sera verdadera y no se puede contradecir
        palabra = input("Ingrese la palabra secreta: ").lower() # ----------- el .lower() es una funcion (de otro tipo pero no recuerdo nombre que no recuerdo) que vuelve a minusculas
        contador += 1
        if palabra == PALABRA_SECRETA:
            print("Palabra Secreta Correcta")
            break # ------------ esto le da FIN al bucle, ignorando todo lo demas y sacandonos del bucle
        if (palabra != PALABRA_SECRETA) and (contador > 7):
            print("Limite de Intentos Alcanzado \nLo siento, de malas")
            break


# ==========================
# == SELECCION DE EJEMPLO ==
# ==========================
op: int = 0

while True:
    print("Elige el ejemplo que quieres ver sus pruebas \n 1.Sumar i, \n2.Array de la Semana, \n3.Número Positivo, \n4.Palabra Secreta")

    op = int(input("Elección: "))

    match op:
        case 1:
            ejemplo1()
        case 2:
            ejemplo2()
        case 3:
            ejemplo3()
        case 4:
            ejemplo4_do()
        case _:
            print("Esa opción no es válida")

    print("Algoritmo finalizado \n")