package Mod_03_POO.Java.Ejercicios;

import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {
    // Pedir numeros hasta que se teclee uno negativo,
    // y mostrar cuanto numero se ha introducido.

    Scanner sc = new Scanner(System.in);
    int i = 0, num;
    System.out.println("Dime números y los contare (ingresa un negativo o '0' para finalizar)");

    do {
      System.out.print("Ingresa el número: ");
      num = sc.nextInt();
      if (num > 0) {
        i++;
      }
    } while (num > 0);

    System.out.println("Ingresaste " + i + " números positivos");
    sc.close();
  }
}
