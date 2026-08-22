package Mod_03_POO.Java.Ejercicios;

import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args) {
    /*Leer un numero e indicar
    si par o impar . El
    proceso se repetirá hasta
    que se introduzca un
    cero (0)
    */
    
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
