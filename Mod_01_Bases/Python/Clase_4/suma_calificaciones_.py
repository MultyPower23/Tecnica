def suma(lista):
    sum: float = 0
    for i in lista:
        i = float(i)
        sum += i
    return sum

cal = input("Dame las calificaciones separadas por espacios: ")
cal = cal.split()
print("El promedio de tus notas es", suma(cal)/len(cal))