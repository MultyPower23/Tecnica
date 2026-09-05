package Mod_03_POO.Ejercicios.Taller;
import java.util.Scanner;

public class e1 {
  public static void main(String[] args) {
    System.out.println("Por:\n - Sebastian Hernandez Muñoz\n - Juan Esteban Ciro Gallego\n");

    Scanner sc = new Scanner(System.in);
    float suma = 0;

    System.out.println("Ingresa tus tres calificaciones: ");
    for (byte i = 1; i <= 3; i++) {
      System.out.print(i + "°: ");
      suma += sc.nextFloat();
    }
    System.out.println("\nLa suma de tus notas es: " + suma);

    sc.close();
  }
}
