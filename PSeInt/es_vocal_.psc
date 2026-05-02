Algoritmo es_vocal_
	Definir text Como Cadena
	Repetir
		Escribir 'Ingresa una sola letra'
		Leer text
	Hasta Que Longitud(text)==1
	Según text Hacer
		'a', 'A':
			Escribir 'Esa es la primera vocal'
		'e', 'E':
			Escribir 'Esa es la segunda vocal'
		'i', 'I':
			Escribir 'Esa es la tercera vocal'
		'o', 'O':
			Escribir 'Esa es la cuarta vocal'
		'u', 'U':
			Escribir 'Esa es la quinta vocal'
		De Otro Modo:
			Escribir 'Esa es una consonante, no una vocal'
	FinSegún
FinAlgoritmo
