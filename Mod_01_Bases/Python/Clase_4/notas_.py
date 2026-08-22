max: float = float(input("Cual es la nota maxima posible: "))

parti: float = float(input("Nota de participación: "))
while (parti > max) or (parti < 0):
    print("No es una nota valida")
    parti = float(input("Nota de participación: "))

parcial1: float = float(input("Nota del primer parcial: "))
while (parcial1 > max) or (parcial1 < 0):
    print("No es una nota valida")
    parcial1 = float(input("Nota del primer parcial: "))

parcial2: float = float(input("Nota del segundo parcial: "))
while (parcial2 > max) or (parcial2 < 0):
    print("No es una nota valida")
    parcial2 = float(input("Nota del segundo parcial: "))

final: float = float(input("Nota del examen final: "))
while (final > max) or (final < 0):
    print("No es una nota valida")
    final = float(input("Nota del examen final: "))

parti *= 0.1
parcial1 *= 0.25
parcial2 *= 0.25
final *= 0.4

total: float = parti + parcial1 + parcial2 + final

print("Sacaste ", total, "en la nota definitiva")

if total >= (max * 0.9):
    print("Sacasate una nota sobresaliente, felicidades")
elif total == (max * 0.7):
    print("Uy, la nota minima, por los pelos")
elif total < (max * 0.7):
    print("Lo lamento mucho, pero tendras que repetir")
    