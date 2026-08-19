package Tecnica.POO_modulo_2.Java.Ejercicios;

import java.util.Scanner;

public class clase_14 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Elegir ejercicio:");
    System.out.println(
        "1.Calificaciones \n2.Salario Semanal \n3.Despejar Incognita \n4.Concesionaria \n5.Nota Final \n6.Binomio Cuadrado \n7.Conversor de Horas \n8.Formula General");
    System.out.print(": ");

    switch (entrada.next()) {
      case "1":
        ejercicio1(entrada);
        break;

      case "2":
        ejercicio2(entrada);
        break;

      case "3":
        ejercicio3(entrada);
        break;

      case "4":
        ejercicio4(entrada);
        break;

      case "5":
        ejercicio5(entrada);
        break;

      case "6":
        ejercicio6(entrada);
        break;

      case "7":
        ejercicio7(entrada);
        break;

      case "8":
        ejercicio8(entrada);
        break;

      default:
        System.out.println("No esta ese ejercicio, vuelva a intentar");
        break;
    }

    entrada.close();
  }

  // ==================================================

  public static void ejercicio1(Scanner entrada) {
    System.out.println("\n-----------------------");

    /*
     * Hacer un programa que calcule e imprima
     * la suma de tres calificaciones.
     * • Pedir las 3 calificaciones,
     * • Imprimir por consola la suma de las 3 calificaciones
     */

    double nota = 0.0, total = 0.0;
    System.out.println("Ingrese tres calificaciones y se le realizara la correspondiente suma:");

    for (int i = 1; i <= 3; i++) {
      System.out.print("Ingrese la nota " + i + ": ");
      nota = entrada.nextDouble();
      total = total + nota;
    }

    System.out.println("Total: " + total);
  }

  // ==================================================

  public static void ejercicio2(Scanner entrada) {
    System.out.println("\n-----------------------");

    /*
     * Hacer un programa que calcule e imprima el salario
     * semanal de un empleado a partir de sus horas semanales
     * trabajadas y de su salario por hora
     */

    double horas_semana, salario_hora, paga_semanas;
    System.out.println(
        "Ingrese las horas trabajadas en la semana y el salario por hora de un trabajador, se le realizara el calculo de su salario semanal:");

    System.out.print("Horas: ");
    horas_semana = entrada.nextDouble();
    System.out.print("Salario por hora: $");
    salario_hora = entrada.nextDouble();

    paga_semanas = horas_semana * salario_hora;
    System.out.println("El trabajador recibe de paga semanal: $" + paga_semanas);
  }

  // ==================================================

  public static void ejercicio3(Scanner entrada) {
    System.out.println("\n-----------------------");

    /*
     * Guillermo tiene N pesos. Luis tiene la mitad de lo que
     * posee Guillermo.
     * Juan tiene la mitad de lo que posee Luis y Guillermo
     * juntos. Hacer un programa que calcule e imprima la
     * cantidad de dinero que tiene los tres.
     */

    double G;

    System.out.print("Ingrese la cantidad de dinero de Guillermo: $");
    G = entrada.nextDouble();
    double L = G / 2, J = (L + G) / 2, dinero = G + L + J;

    System.out.printf(
        "\nGuillermo tiene $%.2f, por lo tanto Luis tiene $%.2f y Juan tiene $%.2f. Entre todos juntos tienen $%.2f",
        G, L, J, dinero);
  }
  // ==================================================

  public static void ejercicio4(Scanner entrada) {
    System.out.println("\n-----------------------");

    /*
     * Una compañía de ventas de carros usados, paga a su personal de ventas un
     * salario de $1000 mensuales, más una comisión de $150 por cada carro vendido,
     * más el 5% del valor de la venta por carro. Cada mes el encargado de la
     * empresa ingresa en la computadora los datos pertinentes. Hacer un programa
     * que calcule e imprima el salario mensual de un vendedor dado
     */

    short salario_carros = 1000, comision_carros = 150, valor_carro = 20000;
    int ganancias_carros;
    byte carros_vendidos = 0;
    float porc_carro = 0.05f;

    System.out.println("Ingresa los siguientes datos para saber cuanto se gano en la venta de carros en este mes:");
    System.out.println("Salario base: $" + salario_carros);

    System.out.print("Ingrese la cantidad de carros vendidos: ");
    carros_vendidos = entrada.nextByte();

    ganancias_carros = (int) (carros_vendidos * (comision_carros + (valor_carro * porc_carro)));

    System.out.println("Ganancias por ventas: $" + ganancias_carros);
  }

  // ==================================================

  public static void ejercicio5(Scanner entrada) {
    System.out.println("\n-----------------------");

    /*
     * La calificación final de un estudiante de informática se
     * calcula con base a las calificaciones de cuatro aspectos
     * de su rendimiento académico: participación, primer
     * examen parcial, segundo examen parcial y examen final,
     * Sabiendo que las calificaciones anteriores entran en la
     * calificación final con ponderaciones del 10% 25% 25% y
     * 40%. Hacer un programa que calcule e imprima la
     * calificación final obtenida por un estudiante.
     */

    float porc_1 = 0.1f, porc_2 = 0.25f, porc_3 = 0.25f, porc_4 = 0.40f;
    double parti, prim_parcial, segun_parcial, exam_final, definitiva;

    System.out.println("Ingrese las calificaciones de los cuatro aspectos:");

    System.out.print("Participación: ");
    parti = entrada.nextDouble();

    System.out.print("Primer examen parcial: ");
    prim_parcial = entrada.nextDouble();

    System.out.print("Segundo examen parcial: ");
    segun_parcial = entrada.nextDouble();

    System.out.print("Examen final: ");
    exam_final = entrada.nextDouble();

    definitiva = (parti * porc_1) + (prim_parcial * porc_2) + (segun_parcial * porc_3) + (exam_final * porc_4);

    System.out.printf("La calificación final es: %.2f", definitiva);
  }

  // ==================================================

  public static void ejercicio6(Scanner entrada) {
    System.out.println("\n-----------------------");

    /*
     * Hacer un programa que calcule el cuadrado de una suma (a+b)^2
     */

    double a, b, cuadrado;

    System.out.println("Ingrese los valores de a y b para calcular el cuadrado de la suma (a+b)^2:");

    System.out.print("a: ");
    a = entrada.nextDouble();

    System.out.print("b: ");
    b = entrada.nextDouble();

    // double cA, cB, cAB;
    // cA = Math.pow(a, 2);
    // cB = Math.pow(b, 2);
    // cAB = 2 * a * b;
    // cuadrado = cA + cAB + cB;
    // System.out.printf("(%.2f+%.2f)^2 \n= %.2f + 2(%.2f)(%.2f) + %.2f \n= %.2f",
    // a, b, a, a, b, b, cuadrado);

    cuadrado = Math.pow(a + b, 2); // este es mucho mas sencillo y directo

    System.out.printf("(%.2f+%.2f)^2 \n= %.2f + 2(%.2f)(%.2f) + %.2f \n= %.2f",
        a, b, a, a, b, b, cuadrado);
  }

  // ==================================================

  public static void ejercicio7(Scanner entrada) {
    System.out.println("\n-----------------------");

    /*
     * Construir un programa que, dado un numero total de
     * horas, devuelve el numero de semanas, días, y horas
     * equivalentes, por ejemplo, dado un total de 1000 horas
     * debe mostrar 5 semanas, 6 días y 16 horas.
     */

    int tiempo, semanas, dias, horas_restantes;

    System.out.print("Ingresa un número de horas: ");
    tiempo = entrada.nextInt();

    semanas = tiempo / 168;
    dias = (tiempo % 168) / 24;
    horas_restantes = (tiempo % 168) % 24;

    System.out.println(
        tiempo + " horas equivalen a " + semanas + " semanas, " + dias + " días y " + horas_restantes + " horas.");
  }

  // ==================================================

  public static void ejercicio8(Scanner entrada) {
    System.out.println("\n-----------------------");

    /*
     * Hacer un programa que calcule y muestre por pantalla las
     * raíces de la ecuación de segundo grado de coeficientes
     * reales
     */

    double a2, b2, c2, raiz, x1, x2;

    System.out.println("Ingrese los coeficientes de la ecuación de segundo grado (ax^2 + bx + c = 0):");

    System.out.print("a: ");
    a2 = entrada.nextDouble();

    System.out.print("b: ");
    b2 = entrada.nextDouble();

    System.out.print("c: ");
    c2 = entrada.nextDouble();

    raiz = Math.sqrt(Math.pow(b2, 2) - (4 * a2 * c2));

    x1 = (-b2 + raiz) / (2 * a2);
    x2 = (-b2 - raiz) / (2 * a2);

    System.out.println("Los dos posibles resultados de " + a2 + "x^2 + " + b2 + "x + " + c2 +
        " son x1 = " + x1 + " y x2 = " + x2);
  }
}