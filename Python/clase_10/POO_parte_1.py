# ========================================
# === PROGRAMACION ORIENTADA A OBJETOS ===
# ========================================

# Un objeto o clase es como un molde que funciona para crear multiples objetos siguiendo una misma base sin
#   tener que hacer un bloque para cada uno, es una programacion modular.

# Se podria ver como una funcion, solo que a esta no le interesa mucho los parametros, no como las clases.
# Las clases cuentran con atributos (propiedades o variables), metodos (comportamientos o funciones) y estados.

# Se diferencia de la programacion orientada a procesos (la que hemos trabajado) ya que esta puede presentar muchas
#   fallas como codigo espaguetti, volverse gigante o un error en una linea joder todo el algoritmo, mientras que POO es muy modular o seccionado,
#   es mas individual, breve, ordenado y al cambiar algo en una clase modifica todas las instancias (objetos) de esa clase, sin tener que modificar uno a uno.

# Un ejemplo de POP seria un coche, si quiero 5 coches deberia programar cada uno individual, darles configurar sus propiedades como color,
#   tamaño, ruedas, motor, etc, todo eso 5 veces y repetirlo si quiero mas.
#   Mientras que con POO solo deberia hacer eso una vez y cada vez que quiera un coche nuevo solo deberia decir los parametros que quiero que tenga
#   ejm: Coche(color:rojo, ruedas:todoterreno, envergadura:3m), Coche(color:azul, ruedas:carrera, envergadura:4m);
#   aca ya tendria 2 carros facilmente y serian individuales uno del otro, puedo alterar el estado o cualquier parameetro de cada uno sin afectar o dañar al otro

# Al crear una instancia tambien podemos "sobrecargar" una variable, osea meter multiples valores o informacion dentro de una sola variable

# En resumen son una fabrica que crean objetos con un mismo molde pero diferentes e individual entre si


class Coche:  # clase (Fabrica de objetos) -- las clases son mejor iniciar con Mayuscula para diferenciar de las funciones
    # atributos o propiedades
    largoChasis = 250
    anchoChasis = 120
    ruedas = 4

    # estado
    enMarcha = False

    # metodos
    def arrancar(self):
        self.enMarcha = True  # el self. lo que hace es referirse a si mismo, o a su propia instancia, y permite guardar los nuevos cambios dentro del objeto actual

    def estado(self):
        if self.enMarcha:
            return "El coche esta en marcha"
        else:
            return "El coche esta parado"


# instancia
miCoche1 = Coche()  # objeto 1
miCoche2 = Coche()  # objeto 2

miCoche2.largoChasis = 300
# al llamar ese atributo del objeto debo copiar el nombre del objeto que coloque para definir que estoy hablando de las informacion que este tiene guardada dentro suyo,
#   y luego llamar a la variable (atributo), funcion (metodo), o lo que quieras que contenga la clase, y se pueden tan solo mostrar o editar.

print(f"El largo del coche 1 es: {miCoche1.largoChasis}")
print(f"El coche 1 tiene {miCoche1.ruedas} ruedas")

print(f"El largo del coche 2 es: {miCoche2.largoChasis}")
print(f"El coche 2 tiene {miCoche2.ruedas} ruedas")

# comportamiento
miCoche1.arrancar()
print(miCoche1.estado())
print(miCoche2.estado())


class Coche2:

    def __init__(  # constructor inicial -- aca puedo pedir los atributos para el objeto al llamrlo, como los parametros en una funcion
        self,
        largoChasis: int | float,
        anchoChasis: int | float,
        ruedas: int = 4,
        enMarcha: bool = False,
    ):  # este metodo permite tener un mejor orden a diferencia del ejemplo anterior al separarar los atributos del resto en su propio apartado
        self.__largoChasis = largoChasis  # el __ vuelve privado los atributos, osea que ya no se pueden llamar de forma
        #                                       diferente al momento de crear la instancia o con metodos, la unica forma de modificarlos
        #                                       es internamente con metodos
        self.__anchoChasis = anchoChasis
        self.__ruedas = ruedas

        self.__enMarcha = enMarcha

    def arrancar(self):
        self.__enMarcha = True  # aca puedo modificar el atributo a pesar que es privado gracias a que es un metodo

    def estado(self):
        if self.__enMarcha:
            return "El coche esta en marcha"
        else:
            return "El coche esta parado"


miCoche3 = Coche2(250, 100)
