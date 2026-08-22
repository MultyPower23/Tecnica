name = input("¿Cual es el nombre del empleado?: ")
horas = float(input("¿Cuantas horas trabaja semanalmente?: " ))
salario = float(input("¿Cuanto se le paga la hora?: "))

paga = salario * horas

print("El empleado", name, "esta ganando $", paga, "a la semana")