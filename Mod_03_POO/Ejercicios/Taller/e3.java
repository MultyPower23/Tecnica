package Mod_03_POO.Ejercicios.Taller;
import java.util.Scanner;

public class e3 {
  public static void main(String[] args) {
    System.out.println("Por:\n - Sebastian Hernandez Muñoz\n - Juan Esteban Ciro Gallego\n");

    Scanner sc = new Scanner(System.in);
    double G;

    System.out.print("Ingrese la cantidad de dinero de Guillermo: $");
    G = sc.nextDouble();
    double L = G / 2, J = (L + G) / 2, dinero = G + L + J;

    System.out.printf(
        "\nGuillermo tiene $%.2f, por lo tanto Luis tiene $%.2f y Juan tiene $%.2f. Entre todos juntos tienen $%.2f",
        G, L, J, dinero);

        sc.close();
  }
}
