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
    

# ==========================
# == SELECCION DE EJEMPLO ==
# ==========================
op: int = 0

while True:
    print("Elige el ejemplo que quieres ver sus pruebas \n1.Multiplos de 5, \n2.Suma de Impares \n3.Cajero Automatico \n3.Es Numero Primo")

    op = int(input("Elección: "))

    match op:
        case 1:
            multi_cinco()
        case 2:
            suma_impares()
        case 3:
            cajero()
        case 4:
            es_primo()
        case _:
            print("Esa opción no es válida")

    print("Algoritmo finalizado \n")