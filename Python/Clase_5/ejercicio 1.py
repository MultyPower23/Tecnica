horas_totales = int(input("Ingresa el número de horas: "))

if horas_totales < 0:
    print("Error: No es posible horas negativas")
else:
    semanas = horas_totales // 168
    sobras = horas_totales % 168

    dias = sobras // 24
    horas = sobras % 24

    print(f"{horas_totales} horas son equivalentes a: {semanas} semanas {dias} dias y {horas} horas")

