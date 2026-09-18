# 1. Mostrar los números de 0 al 100 con yield
def mostrar100():
    for x in range(101):
        yield x

print("\n--- Números hasta 100 ---")
num100 = mostrar100()
for i in num100:
    # Nota: puse el print antes del input para que veas el número 
    # y luego esperes, pero puedes dejarlo al revés si prefieres.
    print(f"Número: {i}", end="") 
    input()

# 2. Calcular los cuadrados de [1, 2, 3, 4, 5]
def cuadrados():
    # Usamos range(1, 6) para obtener 1, 2, 3, 4, 5
    for x in range(1, 6):
        yield x**2

print("\n--- Cuadrados del 1 al 5 ---")
cuadra = cuadrados()
for i in cuadra:
    input("Presiona Enter para ver el cuadrado:")
    # CORRECCIÓN: Imprimimos 'i' (el valor), no 'cuadra' (el objeto)
    print(i)

# 3. Ejemplos extra con generadores

# Ejemplo A: Semáforo (Ciclo finito)
def semaforo():
    yield "Verde"
    yield "Amarillo"
    yield "Rojo"

print("\n--- Luces Semáforo ---")
luces = semaforo()
print(next(luces)) # Verde
print(next(luces)) # Amarillo
print(next(luces)) # Rojo

# Ejemplo B: Saltos de 10 (Generador infinito)
def saltos_diez():
    numero = 0
    while True:
        yield numero
        numero += 10

print("\n--- Saltos de 10 en 10 ---")
cuenta = saltos_diez()
print(next(cuenta)) # 0
print(next(cuenta)) # 10
print(next(cuenta)) # 20