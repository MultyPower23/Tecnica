Función suma <- sum(n1,n2)
	suma <- n1+n2
FinFunción

Función resta <- res(n1,n2)
	resta <- n1-n2
FinFunción

Función multi <- mul(n1,n2)
	multi <- n1*n2
FinFunción

Función division <- div(n1,n2)
	division <- n1/n2
FinFunción

Algoritmo operaciones_matematicas_
	Definir a, b Como Real
	Definir op Como Entero
	Escribir '¿Que operación deseas?'
	Escribir '1.SUMA. 2.RESTA. 3.', Mayusculas('multiplicación'), '. 4.DIVISIÓN'
	Leer op
	Mientras (op>4) o (op<1) Hacer
		Escribir 'Operación invalida'
		Escribir 'Ingresa otra operación valida'
		Escribir '1.SUMA. 2.RESTA. 3.', Mayusculas('multiplicación'), '. 4.DIVISIÓN'
		Leer op
	FinMientras
	Escribir 'Dame dos numeros'
	Leer a
	Leer b
	Según op Hacer
		1:
			Escribir 'La suma de esos dos es ', sum(a,b)
		2:
			Escribir 'La resta de esos dos es ', res(a,b)
		3:
			Escribir 'La multiplicación de esos dos es ', mul(a,b)
		4:
			Escribir 'La división de esos dos es ', div(a,b)
	FinSegún
FinAlgoritmo
