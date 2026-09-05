package Mod_03_POO.Java.Ejercicios.Taller;
import java.util.Scanner;

public class e8 {
  public static void main(String[] args) {
    System.out.println("Por:\n - Sebastian Hernandez Muñoz\n - Juan Esteban Ciro Gallego\n");

    Scanner sc = new Scanner(System.in);
    double a2, b2, c2, raiz, x1, x2;

    System.out.println("Ingrese los coeficientes de la ecuación de segundo grado (ax^2 + bx + c = 0):");

    System.out.print("a: ");
    a2 = sc.nextDouble();
    System.out.print("b: ");
    b2 = sc.nextDouble();
    System.out.print("c: ");
    c2 = sc.nextDouble();

    raiz = Math.sqrt(Math.pow(b2, 2) - (4 * a2 * c2));

    x1 = (-b2 + raiz) / (2 * a2);
    x2 = (-b2 - raiz) / (2 * a2);

    System.out.println("Los dos posibles resultados de " + a2 + "x^2 + " + b2 + "x + " + c2 +
        " son x1 = " + x1 + " y x2 = " + x2);

    sc.close();
  }
}
