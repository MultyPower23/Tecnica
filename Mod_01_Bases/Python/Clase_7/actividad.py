# ACTIVIDAD:

# 1. Cuenta cuantas veces aparece la letra 'a' en "anastacia"
a = 0
for i in "anastacia":
    if i.lower() == "a":
        a += 1
print(f"'Anastacia' tiene {a} 'a's en su nombre")
print()

# 2. Sumar todos los numeros de una lista
nums = input("Ingresa números separados por espacios: ").split()
total = 0
for x in nums:
    total += float(x)
print(f"La suma final es {total}")
print()

# 3.Tabla del 5 (del 1 al 10)
print("La tabla del 5 es:")
for x in range(1,11):
    print(f"5 * {x} = {5*x}")
