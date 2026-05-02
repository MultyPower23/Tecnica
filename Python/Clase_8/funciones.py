# ====================
# ==    FUNCIONES   ==
# ====================

# las funciones son mini algoritmos que pueden ser declaradas (programadas) y llamadas dentro del codigo para realizar acciones concretas
# sirve mucho para ser reutilizadas cuando se va a hacer muchas veces lo mismp o para mantener un orden interno al separar por bloques.

# para ser declaradas es: "def 'nombre'('parametros'):"
# - el 'def' simboliza que se esta declarando la variable.
# - el 'nombre' es la forma a la que nos referiremos a la funcion y con este mismo sera con el que la llamemos.
# - los 'parametros' son un factor opcional, son las variables que la funcion necesita que se introduzcan al momento de llamarlas y solo existen dentro de la funcion
#   una funcion puede multiples parametros y estos se pueden poner tipos obligatorios que se deben cumplir al llamarla o valores por defecto por si al llamarlo no se introducen.

# para llamar a una funcion se debe colocar el nombre seguido de los parentesis, y dentro de los parentesis los parametros de ser necesario
# ejm: saludo(), sumar(2,3), print("Hello World"), etc.

# por lo general y recomendado se definen las funciones en la cabeza del algoritmo, osea arriba del todo.


# === Funciones sin Parametros ===
def saludo():
    print("Hello World")


# === Funciones con Parametros ===
def saludo2(nombre):
    print(f"Hola {nombre}")         # aca 'nombre' tomara el valor que se le introduzca al momento de llamar a la funcion, y si no se introduce nada produce error


# ======== Return ========

# el return es una funcion que permite regresar un valor al momento de que se finalice la funcion
# de lo contrario podria hacer todo el proceso internamente y quedarselo, sin mostrarlo o permitir trabajar con el valor en el algoritmo principal

# tambien sirve para cancelar la funcion o devolverla antes de tiempo y evitar que siga ejecutando, sirve dentro de un if, for, while o otros que ramifican el codigo

def resta(a,b):
    return a-b          # aca esta regresando el valor resultante de la operacion, pero tambien podria regresar otros tipos o incluso otras funciones


# === Parametros pre-definidos con None ===

def multiplicacion(a=None, b=None):          # aca estoy pre-definiendo los valores de 'a' y 'b', entonces si al llamar la funcion no se introduce nada tomara esos valores por defecto
    if a is None or b is None:
        print("La operacion no se puede realizar")          # el punto de pre-definir con None es para evitar que la app se crashe por no haber ingresado los parametros al llamarla
        return
    else:
        return a*b