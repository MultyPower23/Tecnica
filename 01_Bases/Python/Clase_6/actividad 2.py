#  Actividad 2: Realizar una biblioteca de poemas

poemas = [f"{'Aquí (Octavio Paz)'.upper()}\nMis pasos en esta calle\nResuenan\nEn otra calle\nDonde\nOigo mis pasos\nPasar en esta calle\nDonde\nSólo es real la niebla.",
    f"{'Cada vez que pienso en ti (Anónimo)'.upper()}\nCada vez que pienso en ti,\nmis ojos rompen en llanto;\nPublicidad\ny muy triste me pregunto,\n¿por qué te quiero tanto?",
    f"{'Síndrome (Mario Benedetti)'.upper()}\nTodavía tengo casi todos mis dientes\ncasi todos mis cabellos y poquísimas canas\npuedo hacer y deshacer el amor\ntrepar una escalera de dos en dos\ny correr cuarenta metros detrás del ómnibus\no sea que no debería sentirme viejo\npero el grave problema es que antes\nno me fijaba en estos detalles."]

op: int = 0
print("Tengo estos poemas: \n1.'Aquí (Octavio Paz)' \n2.'Cada vez que pienso en ti (Anónimo)' \n3.'Síndrome (Mario Benedetti)'")

while True:
    op = int(input("\n Que poema quieres leer? (ingresa el numeral): "))

    if 1 <= op <= 3:
        print(f"\n {poemas[op-1]}")
    else:
        print("Error: Poema no válido\n")