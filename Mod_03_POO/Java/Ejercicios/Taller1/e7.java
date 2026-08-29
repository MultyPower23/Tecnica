package Mod_03_POO.Java.Ejercicios.Taller1;
import java.util.Scanner;

public class e7 {
  public static void main(String[] args) {
    System.out.println("Por:\n - Sebastian Hernandez Muñoz\n - Juan Esteban Ciro Gallego\n");

    Scanner sc = new Scanner(System.in);
    int tiempo, semanas, dias, horas_restantes;

    System.out.print("Ingresa un número de horas: ");
    tiempo = sc.nextInt();

    semanas = tiempo / 168;
    dias = (tiempo % 168) / 24;
    horas_restantes = (tiempo % 168) % 24;

    System.out.println(
        tiempo + " horas equivalen a " + semanas + " semanas, " + dias + " días y " + horas_restantes + " horas.");

    sc.close();
  }
}
