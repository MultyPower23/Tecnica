horas = int(input("Cuantas horas semanales trabajas: "))
paga = 0

if horas <= 40:
    paga = 16 * horas
else:
    paga = (40 * 16) + (horas - 40)*20

print(f"Tu paga final es de ${paga}")
