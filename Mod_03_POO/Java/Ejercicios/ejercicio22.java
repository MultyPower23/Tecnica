package Mod_03_POO.Java.Ejercicios;

public class ejercicio22 {
  public static void main(String[] args) {
    // Verificar si un número es par o no, empleando funciones.

    System.out.println("¿Es par 10? " + esPar(10));
    System.out.println("¿Es par 15? " + esPar(15));
  }

  static boolean esPar(int numero) {
    return numero % 2 == 0;
  }
}
