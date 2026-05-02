Algoritmo verificar_contrasena_
	Definir spe, num, mayus, minus Como Lógico
	Definir len, i Como Entero
	Definir contra, debe,car Como Cadena
	Repetir
		num <- FALSO
		mayus <- FALSO
		minus <- FALSO
		spe <- FALSO
		debe <- 'Debe incluir: '
		Escribir 'INGRESA UNA CONTRASEÑA'
		Escribir 'Debe contener 8 caracteres minimo'
		Escribir 'Debe incluir minimo una letra, un número, una mayúscula, una minúscula y un caracter especial'
		Leer contra
		len <- longitud(contra)
		Para i<-1 Hasta len Hacer
			car <- Subcadena(contra,i,i)
			Si (car>='0' Y car<='9') Entonces
				num <- VERDADERO
			FinSi
			Si (car>='A' Y car<='Z') Entonces
				mayus <- VERDADERO
			FinSi
			Si (car>='a' Y car<='z') O (car>='A' Y car<='Z') Entonces
				minus <- VERDADERO
			FinSi
			Si  NO ((car>='a' Y car<='z') O (car>='A' Y car<='Z') O (car>='0' Y car<='9')) Entonces
				spe <- VERDADERO
			FinSi
		FinPara
		Si len<8 Entonces
			debe <- 'Tiene solo '+ConvertirATexto(len)+' caracteres. '+debe
		FinSi
		Si  NO (mayus O minus) Entonces
			debe <- debe+'una Letra '
		FinSi
		Si  NO (num) Entonces
			debe <- debe+'un Número '
		FinSi
		Si  NO (mayus) Entonces
			debe <- debe+'una Mayúscula '
		FinSi
		Si  NO (minus) Entonces
			debe <- debe+'una Minúscula'
		FinSi
		Si  NO (spe) Entonces
			debe <- debe+'un Caracter Especial '
		FinSi
		Si  NO ((mayus==VERDADERO) Y (num==VERDADERO) Y (spe==VERDADERO) Y (minus==VERDADERO)) Entonces
			Escribir 'CONTRASEÑA INVALIDA'
			Escribir debe
		FinSi
	Hasta Que (mayus==VERDADERO) Y (num==VERDADERO) Y (spe==VERDADERO) Y (minus==VERDADERO)
	Escribir 'CONTRASEÑA VALIDA'
	Escribir ''
FinAlgoritmo
