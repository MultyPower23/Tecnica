package Mod_03_POO.Java.Ejercicios.mezcla;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ejercicio18 {
  public static void main(String[] args) {
    // Crear y cargar una matriz de tamaño n x m,
    // y mostrar la suma de cada fila y de cada columna.


    int filas, columnas, matriz[][];
    Scanner sc = new Scanner(System.in);

    filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas:"));
    columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas:"));
    matriz = new int[filas + 2][columnas + 2];

    // RELLENAR MATRIZ
    System.out.println("Escriba cada elemento de la matriz después del enter");
    for (int i = 0; i < filas + 1; i++) {
      for (int j = 0; j < columnas + 1; j++) {
        if (i == 0 && j == 0) {
          matriz[i][j] = 0;
        } else if (i == 0) {
          matriz[i][j] = j;
        } else if (j == 0) {
          matriz[i][j] = i;
        } else {
          matriz[i][j] = sc.nextInt();
        }
      }
    }

    // SUMAR FILAS
    for (int i = 1; i <= filas; i++) {
      int sumaFila = 0;
      for (int j = 1; j <= columnas; j++) {
        sumaFila += matriz[i][j];
      }
      matriz[i][columnas + 1] = sumaFila;
    }

    // SUMAR COLUMNAS
    for (int j = 1; j <= columnas; j++) {
      int sumaColumna = 0;
      for (int i = 1; i <= filas; i++) {
        sumaColumna += matriz[i][j];
      }
      matriz[filas + 1][j] = sumaColumna;
    }

    // SUMA TOTAL
    int sumaTotal = 0;
    for (int i = 1; i <= filas; i++) {
      sumaTotal += matriz[i][columnas + 1];
    }
    matriz[filas + 1][columnas + 1] = sumaTotal;

    // IMPRIMIR MATRIZ
    System.out.println("\n--- Matriz ---");
    for (int i = 0; i < filas + 2; i++) {
      for (int j = 0; j < columnas + 2; j++) {
        System.out.printf("%5d", matriz[i][j]);
      }
      System.out.println();
    }

    sc.close();
  }
}
