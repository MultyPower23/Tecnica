//Promedio de las notas
Funcion  promedio = prom(nombre,notas)
	suma = 0
	Para i = 0 Hasta 5 Hacer
		suma = suma + notas[i]
	FinPara
	promedio = suma / 6
FinFuncion


Algoritmo prom_seis_notas_
	
	//Definir todas las variables
	Definir cant, i Como Entero
	Definir calificaciones, final Como Real
	Definir nombre Como Caracter
		
	//Array de las notas
	Dimensionar calificaciones[6]
	
	//Nombre de la materia
	Escribir "Nombre de la Materia:"
	Leer nombre
	
	//Notas aleatroias entre 1 a 10
	Para i = 0 Hasta 5 Hacer
		calificaciones[i] = Aleatorio(1,10)
	FinPara
	
	Escribir "=== NOTAS FINALES ==="
	Leer Esperar
	
	//Evaluar el estado de las notas
	Escribir "Tus notas son:"
	Para i = 0 Hasta 5 Hacer
		Escribir i+1, "° Nota: ", calificaciones[i]
	FinPara
	
	Escribir "=========================="
	
	Escribir ""
	
	Escribir "=== RESULTADO FINAL ==="
	Leer Esperar
	
	//Evaluar el estado de la materia
	final = prom(nombre, calificaciones)
	Si  final >= 7 Entonces
		Escribir "GANASTE CON UN PROMEDIO DE ", final, " en ", nombre
	FinSi
	Escribir "Perdiste con un promedio de ", final, " en ", nombre
	Escribir "=========================="
	
FinAlgoritmo

