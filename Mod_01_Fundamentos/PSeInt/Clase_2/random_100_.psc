Algoritmo random_100_
	Definir array, n Como Entero
	Escribir "Ingresa cuantos números randoms deseas"
	Leer n
	Dimension array[n]
	Para i = 0 Hasta n-1 Hacer
		array[i] = Aleatorio(1,100)
		Escribir "Posición ",i+1," lista ", array[i]
	FinPara
FinAlgoritmo
