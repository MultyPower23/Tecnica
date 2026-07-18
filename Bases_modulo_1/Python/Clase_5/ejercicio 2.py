precio = int(input("Ingrese el valor total de su compra: "))

if precio < 0:
    print("Ve que lindo, te regalan plata por comprar o que?")

elif precio >= 300:
    print("Su compra tiene un 20% de descuento")
    precio *= 0.8

print(f"Su compra final vale un total de ${precio}")