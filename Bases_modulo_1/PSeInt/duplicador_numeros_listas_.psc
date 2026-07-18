Funcion duplicado = dupli(num)
	duplicado = num*2
FinFuncion

Algoritmo duplicador_numeros_listas_
	Definir lista1, lista2, i Como Entero
	
	//Crea la lista original y la duplicada
	Dimensionar lista1[5]
	Dimensionar lista2[5]
	
	//LLena la lista original
	Para i = 0 Hasta 4 Hacer
		lista1[i] = Aleatorio(1,50)
	FinPara
	
	//Llena la lista duplicada
	Para i = 0 Hasta 4 Hacer
		lista2[i] = dupli(lista1[i])
	FinPara
	
	//Muestra la diferencia entre ambas listas
	Para i = 0 Hasta 4 Hacer
		Escribir "Original ", lista1[i]
		Escribir "Duplicado ", lista2[i]
		Escribir ""
	FinPara	
	
FinAlgoritmo
