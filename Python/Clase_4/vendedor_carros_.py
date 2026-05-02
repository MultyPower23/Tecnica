def paga_mensual(n_carros: int, valor: float = 0):
    mes: float = 1000
    if n_carros > 0:
        mes += n_carros * 150
        mes += n_carros * (valor * 0.05)
    return mes

name: str = input("Ingrese el nombre del vendedor: ")
carros: int = int(input("Ingrese cuantos carros vendio: "))
valor: float = 0
if carros > 0:
    valor = float(input("Ingrese el valor de los carros: "))

print("El vendedor", name, "gano este mes $", paga_mensual(carros, valor))