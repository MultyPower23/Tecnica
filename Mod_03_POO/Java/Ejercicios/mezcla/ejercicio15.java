package Mod_03_POO.Java.Ejercicios.mezcla;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ejercicio15 {
  public static void main(String[] args) {
    // Cambiar las filas por las columnas de una matriz.

    int nFilas, nColumnas, matrizA[][], matrizB[][];
    Scanner sc = new Scanner(System.in);

    // CREAR MATRICES
    nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas:"));
    nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas:"));
    matrizA = new int[nFilas][nColumnas];
    matrizB = new int[nColumnas][nFilas];
    System.out.println("Escriba cada elemento de la matriz despues del enter");

    // RELLENAR MATRIZ A
    for (int i = 0; i < nFilas; i++) {
      for (int j = 0; j < nColumnas; j++) {
        System.out.println("Matriz[" + i + "] " + "[" + j + "]");
        matrizA[i][j] = sc.nextInt();
      }
    }

    // RELLENAR MATRIZ B
    for (int i = 0; i < nFilas; i++) {
      for (int j = 0; j < nColumnas; j++) {
        matrizB[j][i] = matrizA[i][j];
      }
    }

    // IMPRIMIR MATRIZ A
    System.out.println("--- Matriz A (original) ---");
    for (int i = 0; i < nFilas; i++) {
      for (int j = 0; j < nColumnas; j++) {
        System.out.print(matrizA[i][j] + " ");
      }
      System.out.println();
    }

    // IMPRIMIR MATRIZ B
    System.out.println("--- Matriz B (traspuesta) ---");
    for (int i = 0; i < nColumnas; i++) {
      for (int j = 0; j < nFilas; j++) {
        System.out.print(matrizB[i][j] + " ");
      }
      System.out.println();
    }

    sc.close();
  }
}
