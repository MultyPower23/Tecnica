#   Actividad 3: El programa debe pedir una clave de acceso (ej: 1234).
# Si la clave es correcta: Pregunta cuanto dinero quiere retirar.
# Si es incorrecta la clave niega el acceso
# Si el monto es menor o igual al saldo disponible (debes colocar de saldo fijo $500): Imprime "Retiro exitoso"
# De lo contrario imprime lo opuesto

contra: int = 12357
saldo: float = 500

pin: int = int(input("Ingresa el PIN: "))

if pin == contra:
    print("Acceso Permitido")
    monto: float = float(input("Ingresa el monto que desea retirar: "))

    if monto <= saldo:
        saldo -= monto
        print("Retiro Exitoso")
        print(f"Saldo actual ${saldo}")

    else:
        print("Retiro Fallido \nMonto mayor al saldo disponible")

    print("Cerrada la sesión")

else:
    print("Acceso Denegado \nPIN Incorrecto")