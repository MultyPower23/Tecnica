def fibonacci_recursiva(n):     # aca queremos obtener el n-esimo numero de la sucesion de Fibonacc, osea que el numero siguiente sea la suma de los dos anteriores
    if n <= 1:          # verificamos que el numero sea mayor de 0, de lo contrario regresara el mismo numero
        return n
    else:
        return fibonacci_recursiva(n-1) + fibonacci_recursiva(n-2)      # aca aplicamos la "Recursividad" de  la misma funcion, encontrando los dos valores anteriores de la sucesion y suamndolos
    # en algun punto de la recurividad 'n' tomara el valor de 1 finalizando los subprocesos y regresando internamente
    # no es buena idea hacer mucha recursividad ya que satura mucho la memoria RAM y para numeros grandes puede ir muy lento
    

def fibonacci(n):       # aca no aplicaremos la recursividad, y obtendremos la lista completa hasta el n-esimo numero
    a, b = 0, 1         # partimos definiendo a y b con 0 y 1 respectivamente
    for _ in range(n):          # y con un for haremos n interacciones 
        print(a, end=" ")       # este se encarga de organizar como estara la lista para que este mas oredenada
        a, b = b, a + b         # aca estamos re definiendo los valores de 'a' y 'b', a 'a' le daremos el valor anterior de sucesion, osea 'b'
                                # y a 'b' le daremos el valor de la suma de los anteriores, osea 'a' y 'b' antes de cambiarles el valor


def factorial_iterativo(n):         # aca queremos saber cual es el n-esimo factoral
    if n <= 1:              # si 'n' fuera 1, 0 o inferior su factorial es 1
        return 1
    resultado = 1           # partiremos del primer numero posible, el 1
    for i in range(2, n + 1):       # iremos interando desde 2 hasta n
        resultado *= i              # y iremos multiplicando el resultado inicial (1) por cada valor hasta n
    return resultado        # devolvemos el valor del n-esimo factorial


print(factorial_iterativo(10))