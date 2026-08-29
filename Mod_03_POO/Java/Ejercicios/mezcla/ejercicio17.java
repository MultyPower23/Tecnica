package Mod_03_POO.Java.Ejercicios.mezcla;

public class ejercicio17 {
  public static void main(String[] args) {
    // Crear una matriz de tamaño 7 x 7,
    // rellenarla de forma que los elementos de la diagonal
    // principal sean 1 y el resto 0.


    byte bi, diagonal[][] = new byte[7][7];
    for (byte i = 0; i <= 6; i++) {
      for (byte j = 0; j <= 6; j++) {
        if (i == j) {
          bi = 1;
        } else {
          bi = 0;
        }
        diagonal[i][j] = bi;
      }
    }
    System.out.println("--- Diagonal binaria ---");
    for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 7; j++) {
        System.out.print(diagonal[i][j] + " ");
      }
      System.out.println();
    }
  }
}
