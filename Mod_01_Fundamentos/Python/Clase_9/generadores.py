# ================================
# GENERADORES EN PYTHON
# ================================
# Un generador es una función especial que usa "yield" en lugar de "return".
# A diferencia de una función normal, NO devuelve todos los valores de golpe,
# sino que los produce uno por uno bajo demanda (lazy evaluation).


# =========================================
# EJEMPLO 1: GENERADOR BÁSICO (ESTRUCTURA)
# =========================================
def ejemplo1_generador_basico():
    # Este ejemplo muestra la arquitectura mínima de un generador:
    # 1. Definición de función interna
    # 2. Uso de "yield" en lugar de "return"
    # 3. Consumo mediante un bucle for

    print("\033[32mGENERADOR BÁSICO\033[0m")

    def generador():
        # BLOQUE PRODUCTOR:
        # Esta función NO ejecuta todo de una vez.
        # Cada "yield" pausa la ejecución y devuelve un valor.
        for i in range(3):
            n = 1
            yield n  # Estado se guarda aquí
            n += 1
            yield n
            n += 1
            yield n

    # BLOQUE CONSUMIDOR:
    # El "for" controla la ejecución del generador.
    # Cada iteración reanuda la función desde el último "yield".
    for valor in generador():
        print(valor)


# =========================================
# EJEMPLO 2: LISTA DE PARES (ENFOQUE CLÁSICO)
# =========================================
def ejemplo2_lista_pares():
    # Arquitectura:
    # 1. Función que construye TODOS los datos en memoria
    # 2. Uso de lista (estructura completa en RAM)
    # 3. Retorno final con "return"

    print("\033[32mLISTA DE PARES (SIN GENERADOR)\033[0m")

    def generaPares(limite: int):
        num: int = 1
        miLista = []  # Contenedor en memoria

        # BLOQUE DE CONSTRUCCIÓN:
        # Se generan TODOS los valores antes de devolverlos
        while num <= limite:
            miLista.append(num * 2)
            num += 1  # Control del bucle (sin esto → error crítico)

        # BLOQUE DE SALIDA:
        # Devuelve toda la estructura completa
        return miLista

    limite = int(input("Ingrese el límite: "))
    print(generaPares(limite))


# =========================================
# EJEMPLO 3: GENERADOR DE PARES (EFICIENTE)
# =========================================
def ejemplo3_generador_pares():
    # Arquitectura:
    # 1. No se almacena lista
    # 2. Producción de datos bajo demanda
    # 3. Uso de "yield" para flujo continuo

    print("\033[32mGENERADOR DE PARES (CON YIELD)\033[0m")

    def generaPares2(limite: int):
        num: int = 1

        # BLOQUE PRODUCTOR:
        # No hay lista → cada valor se genera y se entrega inmediatamente
        while num <= limite:
            yield num * 2  # Produce un valor y se pausa
            num += 1  # Actualiza estado interno

    limite = int(input("Ingrese el límite: "))

    # BLOQUE CONSUMIDOR:
    # Igual que antes, pero ahora los datos no existen todos al mismo tiempo
    for par in generaPares2(limite):
        print(par)


# ==========================
# == SISTEMA DE CONTROL ==
# ==========================
# Arquitectura general del archivo:
# - Cada "ejemploX" es un módulo independiente
# - Este bloque actúa como interfaz de usuario (menú)
# - Permite probar cada concepto de forma aislada

op: int = 0

while True:
    print("Elige el ejemplo que quieres ver:")
    print("1. Generador básico")
    print("2. Lista de números pares")
    print("3. Generador de números pares")

    op = int(input("Elección: "))

    match op:
        case 1:
            ejemplo1_generador_basico()
        case 2:
            ejemplo2_lista_pares()
        case 3:
            ejemplo3_generador_pares()
        case _:
            print("Esa opción no es válida")

    print("Algoritmo finalizado\n")
