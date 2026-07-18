def ejemplo1_if():
    # if (condicional inicial) ------ (Ejecuta las lineas dentro suyo en caso que la condicion que exige sea TRUE)
    print("\033[32mPRUEBAS IF\033[0m")

    numero: int = int(input("Escriba un número positivo: "))
    if numero < 0:
        print("¡Te dije que fuera positivo!")
    print(f"Ha escrito el número {numero}") # ------- la "f" antes del String indica que se efectuara una interpolacion en el texto
    # ----------------------------------------------- eso significa que se ingresara variables o operaciones y se convertira automaticamente en tipo String
    # ----------------------------------------------- con "{}" menciono en que parte exacta se ejecutara la interpolacion



def ejemplo2_else():
    # else (ultima opcion) ------ (Es la ultima opcion que queda sobrando, se ejecuta solamente si ninguna de las otras condiones se efectuo)
    print("\033[32mPRUEBAS ELSE\033[0m")

    edad: int = int(input("¿Cuantos años tienes?: "))
    if edad < 18:
        print("Usted es menor de edad")
    else:
        print("Usted es mayor de edad \nDebe seguir aprendiendo")


    # =====
    print("")
    # =====


    print("Este programa mezcla dos colores \nElige el primer color que deseas mezclar (ingresa la letra que esta entre parentesis):")
    primer: str = input("Rojo (r), Azul (a): ")
    if primer == "r":
        print("Elige el segundo color")
        segundo: str = input("Azul (a), Verde (v): ")

        if segundo == "a":
            print("La mezcla de rojo y azul produce el ritual del vac..., digo, color morado")
        else:
            print("La mezcla de rojo y verde produce café")
    else:
        print("Elige el segundo color")
        segundo: str = input("Rojo (r), Verde (v): ")

        if segundo == "r":
            print("La mezcla de rojo y azul produce el ritual del vac..., digo, color morado")
        else:
            print("La mezcla de azul y verde produce cian")




def ejemplo3_elif():
    # elif (otras opciones) ------ (Son otras opciones que requieren que sus condiciones sean TRUE para efectuar y siguen un orden de arriba hacia abajo)

    print("\033[32mPRUEBAS ELIF\033[0m")

    edad = int(input("¿Cuantos años tienes?: "))
    if edad <= 18:
        print("Usted es mayor de edad")
    elif edad > 0:
        print("No has nacido o que?")
    else:
        print("Usted es menor de edad")


op: int = 0

while True:
    print("Elige el tipo de condionales que quieres ver sus pruebas \n 1.If, 2.Else, 3.Elif")

    op = int(input("Elección: "))

    if (op < 1) or (op > 3):
        print("Esa opción no es válida")

    else:
        if op == 1:
            ejemplo1_if()
        elif op == 2:
            ejemplo2_else()
        elif op == 3:
            ejemplo3_elif()


    print("Algoritmo finalizado \n")
