package Mod_03_POO.Java.Ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ejercicio14 {
  public static void main(String[] args) {
    // Verificar si una matriz es cuadrada.

    Scanner sc = new Scanner(System.in);
    int nFilas, nColumnas, matrizA[][];
    boolean cuadrada;

    // CREAR MATRICES
    nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas:"));
    nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas:"));
    matrizA = new int[nFilas][nColumnas];
    System.out.println("Escriba cada elemento de la matriz despues del enter");

    // RELLENAR MATRIZ A
    for (int i = 0; i < nFilas; i++) {
      for (int j = 0; j < nColumnas; j++) {
        System.out.println("Matriz[" + i + "] " + "[" + j + "]");
        matrizA[i][j] = sc.nextInt();
      }
    }

    cuadrada = (nFilas == nColumnas);
    if (cuadrada) {
      System.out.println("La matriz es cuadrada");
    } else {
      System.out.println("La matriz no es cuadrada");
    }

    sc.close();
  }
}
