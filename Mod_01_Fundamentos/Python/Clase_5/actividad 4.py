#   Actividad 4: El usuario debe ingresar tres numeros enteros distintos y la pantalla debe mostrarlos ordenados de mayor a menor.

print("Debes ingresar tres numeros enteros distintos")
num1: int = int(input("Ingresa el primer número: "))
num2: int = int(input("Ingresa el segundo número: "))
num3: int = int(input("Ingresa el tercer número: "))

if (num1 == num2) or (num1 == num3) or (num2 == num3):
    print("Deben ser los tres números distintos")

else:
    lista = []
    if (num1 > num2) and (num1 > num3):
        lista.append(num1)
        if num2 > num3:
            lista.append(num2)
            lista.append(num3)
        else: 
            lista.append(num3)
            lista.append(num2)

    elif (num1 > num2) and (num1 < num3):
        lista.append(num3)
        if num1 > num2:
            lista.append(num1)
            lista.append(num2)
        else:
            lista.append(num2)
            lista.append(num1)


    elif (num1 < num2) and (num1 > num3):
        lista.append(num2)
        if num1 > num3:
            lista.append(num1)
            lista.append(num3)
        else:
            lista.append(num3)
            lista.append(num1)
        
    elif (num1 < num2) and (num1 < num3):
        if num2 > num3:
            lista.append(num2)
            lista.append(num3)
        else:
            lista.append(num3)
            lista.append(num2)
        lista.append(num1)

    print(lista)
    
        