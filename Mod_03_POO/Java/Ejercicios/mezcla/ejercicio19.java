package Mod_03_POO.Java.Ejercicios.mezcla;

public class ejercicio19 {
  public static void main(String[] args) {
    // Crear una matriz “marco” de tamaño 6 x 6.
    // Todos sus elementos deben ser cero a excepción
    // de los elementos que se encuentran en el borde,
    // estos deben de ser 1. Y mostrar en consola.

    int matriz[][] = new int[6][6];
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        if (i == 0 || i == 5 || j == 0 || j == 5) {
          matriz[i][j] = 1;
        } else {
          matriz[i][j] = 0;
        }
      }
    }
    System.out.println("\n--- Marco ---");
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }
}
