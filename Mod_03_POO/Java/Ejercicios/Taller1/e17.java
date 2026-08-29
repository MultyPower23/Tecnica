package Mod_03_POO.Java.Ejercicios.Taller1;
import java.util.Scanner;

public class e17 {
  public static void main(String[] args) {
    System.out.println("Por:\n - Sebastian Hernandez Muñoz\n - Juan Esteban Ciro Gallego\n");

    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Dime números y dire si son pares o impares (ingresa '0' para finalizar)");

    do {
      System.out.print("Ingresa el número: ");
      num = sc.nextInt();
      if (num % 2 == 0 & num != 0) {
        System.out.println(num + " es par");
      } else if (num % 2 != 0) {
        System.out.println(num + " es impar");
      }
    } while (num != 0);

    sc.close();
  }
}
