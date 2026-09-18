#   Activitad 1: Ingresar un numero y decir si es par o impar

num: int = int(input("Ingresa el número que quiere verificar si es par o impar: "))

if num % 2 == 0:
    print(f"Tu número {num} es par")
else:
    print(f"Tu número {num} es impar")

# ==========
print("")
# ==========

#   Actividad 2: Verrificar si un estudiante gano el examen (mayor o igual a 10.5 para aprobar)

nota: float = float(input("Ingresa su nota final del examen: "))

if nota >= 10.5:
    print(f"Felicidades, aprovaste con tu nota de {nota}")
else:
    print(f"Reprobaste con {nota} el examen")