from math import sqrt as raizCuadrada

# === Ejercio 1: Multiplos de 5 ===
def multi_cinco():
    nums = []

    print("Ingresa 10 números")
    for i in range(10):
        num = float(input("Ingresa un número: "))
        if num % 5 == 0:
            nums.append(num)

    if len(nums) != 0:
        print(f"Los siguietes números son multiplos de 5: {nums}")
    else:
        print("No ingresaste ningun número multiplo de 5")


# === Ejercio 2: Suma de Pares ===
def suma_impares():
    top: int = int(input("Ingresa un número y sumare todos los impares hasta llegar a el: "))
    suma: int = 0
    for num in range(1, top+1, 2):
        print(num)
        suma += num

    print(f"La suma total de impares hasta {top} es {suma}")


# === Ejercio 3: Cajero Automatico Simple ===
def cajero():
    SALDO_INICIAL: float = 1000
    saldo: float = SALDO_INICIAL

    while True:
        print("MENU: \n1.Consultar Saldo. \n2.Retirar Dinero. \n3.Depositar Dinero. \n4.Salir")
        op: int = int(input("Ingresa el número de la acción: "))
        match op:
            case 1:
                print(f"\nSaldo Disponible: {saldo}")
            case 2:
                retiro = float(input("\nIngrese la cantidad para Retirar: "))
                while retiro > 0:
                    print("Error: Debe ser mayor a 0")
                    retiro = float(input("\nIngrese la cantidad para Retirar: "))
                if retiro < saldo:
                    saldo -= retiro
                    print("Retiro Exitoso \n Retire el dinero")
                else:
                    print("Error: Saldo Insuficiente")
            case 3:
                deposito = float(input("Ingrese la cantidad para Depositar"))
                while deposito > 0:
                    print("Error: Debe ser mayor a 0")
                    deposito = float(input("Ingrese la cantidad para Depositar"))
                saldo += deposito
            case 4:
                print("Sesión Finalizada")
                break
            case _:
                print("Error: Acción Invalida")


# === Ejercio 4: Verificar Numero Primo ===
def es_primo():
    n = int(input("Ingresa tu posbile primo: "))
    if n > 1:
        for i in range(2, int(raizCuadrada(n)) + 1):
            if n % i == 0:
                print("No es primo")
                break
            print("Si es primo")
    else:
        print("No es posible")
    

# === Ejercio 5: Contar dígitos de un número ===
def cantidad_cifras():
    numero: int = int(input("Ingresa un número"))
    cifras = 0
    while numero != 0:
        numero //= 10
        cifras += 1
    print(f"Tiene {cifras} cifras")


# === Ejercio 6: Serie de números descendente ===
def cuenta_regresiva():
    num: int = int(input("Ingresa un número"))
    while num > 0:
        print(num)
        num -= 1


# === Ejercio 7: Sumar números positivos ===
def suma_positivos():
    suma: float = 0
    for i in range(8):
        num = float(input("Ingresa un número: "))
        if num > 0:
            suma += num
    print(f"La suma de los positivos es {suma}")


# === Ejercio 8: Contar letras en una frase ===
def longitud_frase():
    frase: str = input("Ingresa una frase: ")
    caracteres: int = 0
    for letra in frase:
        if letra != " ":
            caracteres += 1
    print(f"Tiene {caracteres} número de caracteres")

# === Ejercio 9: Número mayor ingresado ===
def mayor_num():
    op: float = 0
    num: float = 0
    print("Ingresa números y te dire cual fue el mas grande (ingresa -1 para parar)")
    while op != -1:
        op = float(input("Número: "))
        if op > num:
            num = op
    print(f"El número mas grande fue {num}")


# === Ejercio 10: Patrón de asteriscos ===
def piramide_invertida():
    n: int = int(input("Ingresa el tamaño de la base de la piramide: "))
    while n > 0:
        print("*" * n)
        n -= 1
