Algoritmo area_triangulo_
	Definir base, altura, area, lista Como Real
	Definir i Como Entero
	Escribir "Hallaremos el área de tres triangulo"
	i = 0
	Dimensionar lista[3]
	Mientras i <= 2
		Escribir ""
		Escribir "Vamos por el ", i+1, "° triangulo"
		Escribir "Ingresa la longitud de su base"
		Leer base
		Escribir "Ingresa la altura"
		Leer altura
		area = (altura * base) / 2
		Escribir "El área del ", i+1, "° triangulo es ", area
		lista[i] = area
		i = i+1
	FinMientras
	Escribir "Todas las áreas de los triangulos son ", lista[0], "", lista[1], "", lista[2]
FinAlgoritmo
