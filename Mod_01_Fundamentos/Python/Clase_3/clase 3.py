#Variables: Es un espacio dedicado d la memoria RAM encargado de guardar informacion

# Formas de declarar variables
nombre_persona = "Luis"
nombrepersona = "Mateo"
_nombre_persona = "Garcia"
# etc

# Formas incorrectas
# -personas, 4personas, nombre persona

# Imprimir
print("Nombre:", _nombre_persona)

# Tipos de varibles (enteros, decimales, caracteres)
# El type() me dice que tipo de dato es

#  Entero (int) = negativos y positivos (NO DECIMALES)
num_int1 = 23
num_int2 = -15
print("Números Enteros:", num_int1, num_int2, "Son tipo", type(num_int1))

#  Decimales (float) = Números negativos y positivos con parte decimal. Debo si o si poner .0 si es float entero
num_decimal = 2.7
print("Número Reales:", num_decimal, "Es tipo",type(num_decimal))

#  Complejos (complex) = Números con parte real e imaginaria
num_imaginario = 3 + 5J
print("Número Complejo:", num_imaginario, type(num_imaginario))

#  Caracteres (string) = Texto
nombre = "Senku"
print("Nombre:", nombre, type(nombre))

#  Booleanos (bool) = Falso y Verdadero
luz_prendida = True
luz_apagada = True
print("Luz prendida:", luz_prendida, type(luz_prendida))

#  Listas (array) = Para almacenar multiple informacion en celdas 
lista = [8, 7 , -6, "ciro", "si"]
print("Lista:", lista, type(lista),"Posición 3:", lista[2], type(lista))