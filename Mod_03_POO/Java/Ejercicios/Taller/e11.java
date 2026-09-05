package Mod_03_POO.Java.Ejercicios.Taller;
import java.util.Scanner;

public class e11 {
  public static void main(String[] args) {
    System.out.println("Por:\n - Sebastian Hernandez Muñoz\n - Juan Esteban Ciro Gallego\n");

    Scanner sc = new Scanner(System.in);
    int n1, n2;

    System.out.println("Ingresa dos números:");
    System.out.println("1°: ");
    n1 = sc.nextInt();
    System.out.println("2°: ");
    n2 = sc.nextInt();

    if (n1 == n2) {
      System.out.println("Los dos son iguales");
    } else if (n1 > n2) {
      System.out.println(n1 + " es el mayor");
    } else {
      System.out.println(n2 + " es el mayor");
    }

    sc.close();
  }
}
