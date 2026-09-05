package Mod_03_POO.Java.Ejercicios.Taller;
import java.util.Scanner;

public class e15 {

  public static void main(String[] args) {
    System.out.println("Por:\n - Sebastian Hernandez Muñoz\n - Juan Esteban Ciro Gallego\n");

    Scanner sc = new Scanner(System.in);
    int num1, num2, resultado;

    System.out.println("===== BIENVENIDO =====");
    System.out.println("¿Qué desea hacer?\n" +
        "Suma (S o s)\n" +
        "Resta (R o r)\n" +
        "Multiplicación (M o m)\n" +
        "División (D o d)");

    String op = sc.nextLine();
    switch (op) {
      case "S":
      case "s":
        System.out.print("1° Número: ");
        num1 = sc.nextInt();
        System.out.print("2° Número: ");
        num2 = sc.nextInt();
        resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
        break;

      case "R":
      case "r":
        System.out.print("1° Número: ");
        num1 = sc.nextInt();
        System.out.print("2° Número: ");
        num2 = sc.nextInt();
        resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
        break;

      case "M":
      case "m":
        System.out.print("1° Número: ");
        num1 = sc.nextInt();
        System.out.print("2° Número: ");
        num2 = sc.nextInt();
        resultado = num1 * num2;
        System.out.println("El resultado de la multiplicaión es: " + resultado);
        break;

      case "D":
      case "d":
        System.out.print("1° Número: ");
        num1 = sc.nextInt();
        System.out.print("2° Número: ");
        num2 = sc.nextInt();
        resultado = num1 / num2;
        System.out.println("El resultado de la división es: " + resultado);
        break;

      default:
        System.out.println("Opción incorrecta o nula");
        System.out.println("Intentelo nuevamente");
    }
    sc.close();
  }
}
