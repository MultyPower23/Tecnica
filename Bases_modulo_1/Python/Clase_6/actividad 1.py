#  Acitividad 1: Pedir numeros enetros y irlos sumando
#   si esta dentro de 100 y 200 y es 0 cerrar programa

total: int = 0
print("Vamos a sumar todos lo números que ingreses \nIngresa \"0\" para finalizar\n")

while True:
    num: int = int(input("Ingresa un número entre 100 y 200: "))
    if not(num in range(100,201)) and num != 0:
        print("Error: Era un número entre 100 y 200 \n")
    else:
        if num == 0:
            print("Suma Finalizada \n")
            break
        else:
            total += num

print(f"La suma total es {total}")