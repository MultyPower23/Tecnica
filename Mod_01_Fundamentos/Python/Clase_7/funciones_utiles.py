# =====================
# ====== RANGE() ======
# =====================
# range() es una funcion que genera una lista de numeros enteros siguiendo una succesion aritmetica
# Su estructura es esta: range(inicio,final,pasos)
# es obligatorio poner el final pero se puede evitar poner el inicio y pasos, por defecto sera 0 y 1
# siempre le restara 1 al final, entonces si pongo 5 hara una lista con 5 valores pero sera hasta 4: [0,1,2,3,4]

for i in range(20): # aca range daria una lista del 0 al 19, 20 valores
    print(i)
print()

for i in range(20):
    print(2 ** i)
print()

for x in range(20):
    if x % 2 == 0:
        print(f"{x} es par")
    else:
        print(f"{x} es impar")
print()

lista = [1,5,-8,2.3,True,"Final"]
for num in lista: # Recorre cada valor indiviual de la lista
    print(num)
print()

print("Comienzo")
for i in [1,1,1]: # Es como range(3), hara que el for se repita 3 veces exactas
    print("Hola", end=(" ")) # El [end=("")] me permite decir que debe ir al final de imprimir, ejm: al poner [end=(" ")] evito saltar de linea al poner un espacio
print("\n")



# ===================
# ====== LEN() ======
# ===================
# len() es una funcion que devuelve la longitud de un valor, sea el numero de valores que tiene una lista o numero de caracteres de un texto
# solo admite un solo parametro y debe ser del tipo string o array

lista = [1,5,-8,2.3,True,"Final"]
print(len(lista)) # aca len() devolvera 6

lista = [1,5,-8,2.3,True,"Final"]
for i in range(len(lista)):
    print(lista[i])



# ======== EJEMPLOS =========
print("EJEMPLO 1: \n - ")
print()

print("EJEMPLO 2: \n - Nombres en Lista")
for i in ["alba", "sai"]:
    print(i)
print()

print("EJEMPLO 3: \n - Lista y Potencia")
for numero in range(5):
    print(f"{numero} * {numero} = {numero ** 2}")
print()

print("EJEMPLO 4: \n - Mostrar Caracteres")
for i in "AMIGO":
    print(f"Dame una {i}")
print("¡AMIGO!")
print()