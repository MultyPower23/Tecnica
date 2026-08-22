SubProceso EvaluarMateria(nombre,nota)
	Si nota >= 3.5 Entonces
		Escribir "Materia: ", nombre, " | Nota: ", nota, " | Estado: GANO"
	SiNo
		Escribir "Materia: ", nombre, " | Nota: ", nota, " | Estado: PERDIO"
	FinSi
FinSubProceso

Algoritmo notas_
	
	//Definir todas las variables
	Definir cant, i Como Entero
	Definir calificaciones Como Real
	Definir nombre Como Caracter
	Escribir "Ingresa la Cantidad de Materias:"
	Leer cant
	
	//Arrays de las materias y las notas
	Dimensionar nombre[cant]
	Dimensionar calificaciones[cant]
	
	//Llenar materias y notas
	Para i = 0 Hasta cant-1 Hacer
		Escribir "Nombre de la Materia:"
		Leer nombre[i]
		//Notas aleatroias entre 1.0 a 5.0
		calificaciones[i] = Aleatorio(10,50) / 10
	FinPara
	
	Escribir "=== RESULTADOS FINALES ==="
	Leer Esperar
	
	//Evaluar el estado de las materias
	Para i = 0 Hasta cant-1 Hacer
		EvaluarMateria(nombre[i], calificaciones[i])
	FinPara
	
	Escribir "=========================="
	
FinAlgoritmo

