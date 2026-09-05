package Mod_03_POO.Java.Ejercicios.Taller;
import java.util.Scanner;

public class e2 {
  public static void main(String[] args) {
    System.out.println("Por:\n - Sebastian Hernandez Muñoz\n - Juan Esteban Ciro Gallego\n");

    Scanner sc = new Scanner(System.in);
    double horas_semana, salario_hora, paga_semanas;
    System.out.println(
        "Ingrese las horas trabajadas en la semana y el salario por hora de un trabajador, se le realizara el calculo de su salario semanal:");

    System.out.print("Horas: ");
    horas_semana = sc.nextDouble();
    System.out.print("Salario por hora: $");
    salario_hora = sc.nextDouble();

    paga_semanas = horas_semana * salario_hora;
    System.out.println("El trabajador recibe de paga semanal: $" + paga_semanas);

    sc.close();
  }
}
