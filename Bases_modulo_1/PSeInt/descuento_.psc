Algoritmo descuento_
	Definir precio Como Real
	Definir cate Como Cadena
	Escribir 'Ingresa el precio del articulo'
	Leer precio
	Escribir 'Ingresa su categoria (A-B-C)'
	Leer cate
	cate <- Mayusculas(cate)
	Mientras  NO ((cate=='A') O (cate=='B') O (cate=='C')) Hacer
		Escribir 'Categoria no valida'
		Escribir 'Ingresa su categoria (A-B-C)'
		Leer cate
		cate <- Mayusculas(cate)
	FinMientras
	Según cate Hacer
		'A':
			precio <- precio*(1-0.1)
			Escribir 'El articulo tiene 10% de descuento'
		'B':
			precio <- precio*(1-0.2)
			Escribir 'El articulo tiene 20% de descuento'
		'C':
			precio <- precio*(1-0.3)
			Escribir 'El articulo tiene 30% de descuento'
	FinSegún
	Escribir 'Precio final es de ', precio
FinAlgoritmo
