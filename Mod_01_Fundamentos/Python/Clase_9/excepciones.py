# es una caja de errores, donde podemos controlar el flujo de ejecucion de nuestro programa
# Las excepciones son errores que ocurren durante la ejecución del programa
# la sintaxis del código es correcta, pero durante la ejecución ha ocurrido “algo inesperado”

def suma(a,b):
    return a+b
def resta(a,b):
    return a-b
def multi(a,b):
    return a*b
def dividir(a,b):
    try:                # aca se intenta hacer la division de forma normal
        return a/b
    except ZeroDivisionError:       # y en caso de que el denominador hubiera sido 0 daba error, entonces nos anticipamos para evitar que el programa crashee
        return "[ERROR]: No se puede dividir entre cero (0) \n- Ingrese otro denominador valido"

print("CALCULADORA")
while True:
    digi1 = int(input("Ingrese el primer numero: "))
    digi2 = int(input("Ingrese el segundo numero: "))

    op = input("Ingrese la operacion a realizar: Suma, Resta. Multiplicación o División: ")

    match op.lower():
        case "suma":
            print(suma(digi1,digi2))
        case "resta":
            print(resta(digi1,digi2))
        case "multiplicacion":
            print(multi(digi1,digi2))
        case "division":
            print(dividir(digi1,digi2))
        case "0":
            print("Fin")
            break
        case _:
            print("Procedimiento inválido")

#---ejemplo excepción 2

def divide():
    try:
        op1=(float(input("Introduce el primer número: ")))
        op2=(float(input("Introduce el segundo número: ")))
        print("la división es: ", str (op1/op2))
    except ValueError:
        print("Datos ingresados ​​no son válidos")
    except ZeroDivisionError:
        print("no se puede dividir entre 0")
    finally:
        print("Cálculo finalizado")

print("DIVISIÓN")
divide()

