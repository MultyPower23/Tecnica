package Mod_03_POO.Java.Ejercicios;

import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] args) {
    /* Pedir números hasta
    que se teclee un 0,
    mostrar la suma de
    todos los números
    introducidos
    */

    Scanner sc = new Scanner(System.in);
    int num, sum = 0;
    System.out.println("Dime números y los sumare (ingresa '0' para finalizar)");

    do {
      System.out.print("Ingresa el número: ");
      num = sc.nextInt();
      sum += num;
    } while (num != 0);

    System.out.println("La suma final es: " + sum);
    sc.close();
  }
}
