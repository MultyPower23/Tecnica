package Mod_03_POO.Java.Ejercicios;

import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    /* Leer un numero e indicar
    si es positivo o negativo.
    El proceso se repetirá
    hasta que se introduzca
    un cero (0)
    */

    Scanner sc = new Scanner(System.in);
    int num;
    System.out
        .println("Dime números y dire si son positivos o negativos (ingresa '0' para finalizar)");

    do {
      System.out.print("Ingresa el número: ");
      num = sc.nextInt();
      if (num > 0) {
        System.out.println(num + " es positivo");
      } else if (num < 0) {
        System.out.println(num + " es negativo");
      }
    } while (num != 0);

    sc.close();
  }

}
