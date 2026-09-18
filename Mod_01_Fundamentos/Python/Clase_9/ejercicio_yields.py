# realizar un programa donde use 3 funciones y el método yield, la primera función guardara
# números del 0 al 9 en yield, la segunda función guardara 10 al 20 y la última función
# llamara las dos anteriores mostrar en un for y tres datos por next.
def generador_bajo():
    for x in range(10):
        yield x

def generador_alto():
    for x in range(10,21):
        yield x

def integrador():
    yield from generador_bajo()
    yield from generador_alto()

mi_generador = integrador()

print("Los Tres primeros datos:")
print(next(mi_generador))
print(next(mi_generador))
print(next(mi_generador))

input("\nPresiona Enter para ver el resto de datos")

print("\nEl resto de datos:")
for num in mi_generador:
    print(num)


# Hacer una función Generador la cual devuelve 7 números enteros al azar (aleatorios):
from random import randrange

def random_siete():
    for i in range(7):
        yield randrange(0,100)

siete = random_siete()
print("\nSiete números randoms:")
for r in siete:
    print(r)