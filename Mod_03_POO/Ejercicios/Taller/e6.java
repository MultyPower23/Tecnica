package Mod_03_POO.Ejercicios.Taller;
import java.util.Scanner;

public class e6 {
  public static void main(String[] args) {
    System.out.println("Por:\n - Sebastian Hernandez Muñoz\n - Juan Esteban Ciro Gallego\n");

    Scanner sc = new Scanner(System.in);
    double a, b, cA, cB, cAB;

    System.out.println("Ingrese los valores de a y b para calcular el cuadrado de la suma (a+b)^2:");
    System.out.print("a: ");
    a = sc.nextDouble();
    System.out.print("b: ");
    b = sc.nextDouble();

    cA = a * a;
    cB = b * b;
    cAB = 2 * a * b;

    if (b >= 0) {
      System.out.printf("(%.1f + %.1f)² = %.1f + %.1f + %.1f", a, b, cA, cAB, cB);
    } else {
      System.out.printf("(%.1f - %.1f)² = %.1f - %.1f + %.1f", a, -b, cA, -cAB, cB);
    }
    System.out.println("\nLo que da resultado: " + (cA + cAB + cB));

    sc.close();
  }
}
