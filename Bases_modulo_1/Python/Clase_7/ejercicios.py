# EJERCICIOS:

# ======= PANADERIA =======
"1. Una panadería vende barras de pan a 3.49€ cada una. El pan que no es el día tiene un"

"descuento del 60%. Escribe un programa que comience leyendo el número de barras vendidas"
"que no son del día. Después tu programa debe mostrar el precio habitual de una barra de"
"pan, el descuento que se le hace por no ser fresca y el coste final total."


def panaderia():
    pan_no_dia: int = int(input("¿Cuantos panes vendiste que no eran de hoy?: "))
    PRECIO: float = 3.49
    DESCUENTO: float = 0.6
    ganancias = pan_no_dia * (PRECIO * (1 - DESCUENTO))
    print(
        f"Normalmente se vende los panes a {PRECIO:.2f}€"
        f"\npero los que no fueron hechos hoy se vende a {(PRECIO*(1-DESCUENTO)):.2f}€"
        f"\nlas ganancias de hoy de esos panes no frescos es {ganancias:.2f}€"
    )


# ======= REPETIR PALABRAS =======
"2. Escribir un programa que pida al usuario una palabra y la muestre por pantalla 10 veces."


def repetir10():
    msg: str = input("Ingresa una palabra: ")
    for i in range(10):
        print(f"{i+1}. {msg}")


# ======= EDADES TRANSUCURRIDAS =======
"3. Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los"
"años que ha cumplido (desde 1 hasta su edad)."


def años_edad():
    edad: int = int(input("¿Cuantos años tenes?: "))
    print("Entonces has pasado por todas estas edades: ")
    for año in range(1, edad + 1):
        print(año, end=" ")


# ======= PIRAMIDE =======
"4. Escribir un programa que pida al usuario un número entero y muestre por pantalla un"
"triángulo rectángulo como el de más abajo, de altura el número introducido."
"*"
"**"
"***"
"****"
"*****"


def piramide():
    num: int = int(input("Ingresa el tamaño de la base de la piramide :"))
    for i in range(1, num + 1):
        print("*" * i)


# ======= CONTADOR DE PARES HASTA 100 =======
"5. Mostrar los números hasta el 100 pero contando de 2."


def contador100():
    for n in range(2, 101, 2):
        print(n)


# ======= CONTRASEÑA =======
"6. Escribir un programa que almacene la cadena de caracteres `contraseña` en una variable,"
"pregunte al usuario por la contraseña hasta que introduzca la contraseña correcta."


def contraseña():
    COTRASENA: str = "contraseña"
    contraseña: str = input("Ingresa contraseña: ")
    while contraseña != COTRASENA:
        print("[ERROR]: Contraseña incorrecta \nVolver a intentar \n")
        contraseña: str = input("Ingresa contraseña: ")
    print("\nContraseña Correcta \nAcceso Permitido")


# ======= POLARIDAD =======
"7. Ejercicio: leer un numero e indicar si es positivo o negativo. el proceso se repetirá hasta"
"que se introduzca un 0."


def naturales():
    print(
        "Dime números y te dire si es positivo o negativo (Ingresa '0' para finalizar)"
    )
    while True:
        num: float = float(input("Ingresa un número: "))
        if num == 0:
            print("Fin del algoritmo")
            break
        print(num, end=(" "))
        if num < 0:
            print("es negativo")
        else:
            print("es positivo")


# ======= PALABRAS LARGAS =======
"8. Avisar si una palabra es corta o larga."


def longitud():
    msg: str = input("Ingresa una palabra: ")
    if len(msg) > 7:
        print(f"Es muy largo {msg}")
    elif len(msg) < 4:
        print(f"Es muy corto {msg}")
    else:
        print(f"Tiene buena longitud {msg}")


# ======= CUENTA REGRESIVA =======
"9. Cuenta regresiva para un despegue."


def cuenta_regresiva():
    print("INICIANDO SECUENCIA DE DESPEGUE \n(presiona enter para avanzar)")
    for i in range(10, -1, -1):
        input()
        print(i, end=(" "))
    print("\n\nDESPEGANDO")


# ======= COFRE TESORO =======
"10. Buscar el 'Tesoro' en un cofre y decir el numero de intentos."
"cofre = ['piedra', 'arena', 'moneda', 'tesoro', 'cangrejo']"


def cofre_tesoro():
    print(
        "Tengo un cofre del tesoro con 5 objetos, donde crees que esta el tesoro? \n(elige entre el 1-5)"
    )
    cofre = ["piedra", "arena", "moneda", "tesoro", "cangrejo"]
    intentos: int = 0
    while True:
        intento: int = int(input("Posible Poscision del Tesoro: ")) - 1
        intentos += 1
        if intento < 0 or intento > 4:
            print("Eso no esta en el cofre")
            continue
        if intento == 3:
            print(
                f"Respuesta Acertada Te Llevaste El Tesoro \nsolo te tomo {intentos} intentos"
            )
            break
        else:
            print(f"Incorrecto, ese era la {cofre[intento]}")


# ======= INVERTIR PALABRA =======
"11. Invertir una palabra letra por letra"
"palabra = 'PYTHON'"


def invertir_palabra(palabra: str):
    invertido: str = ""
    for i in range(len(palabra) - 1, -1, -1):
        invertido += palabra[i]
    print(invertido)


# ======= MULTIPLICAR GRITOS =======
"12. El multiplicador de 'gritos', Para jugar con la repetición de strings usando el índice del bucle."
"Ejemplo el grito crece: Imprimirá: A, AA, AAA..."


def gritos():
    tope: int = int(input("Cuanto queras gritar?: \n(ingresa un número entero): "))
    for i in range(1, tope + 1):
        print("A" * i, end=(", "))


while True:
    print(
        "Elige el ejemplo que quieres ver sus pruebas \n1. panaderia, \n2. repetir10, \n3. años_edad, \n4. piramide, \n5. contador100, \n6. contraseña, \n7. naturales, \n8. longitud, \n9. cuenta_regresiva, \n10. cofre_tesoro, \n11. invertir_palabra, \n12. gritos"
    )

    op = int(input("Elección: "))

    match op:
        case 1:
            panaderia()
        case 2:
            repetir10()
        case 3:
            años_edad()
        case 4:
            piramide()
        case 5:
            contador100()
        case 6:
            contraseña()
        case 7:
            naturales()
        case 8:
            longitud()
        case 9:
            cuenta_regresiva()
        case 10:
            cofre_tesoro()
        case 11:
            msg: str = input("Ingresa una palabra para invertir")
            invertir_palabra(msg)
        case 12:
            gritos()
        case _:
            print("Esa opción no es válida")

    print("Algoritmo finalizado \n")
