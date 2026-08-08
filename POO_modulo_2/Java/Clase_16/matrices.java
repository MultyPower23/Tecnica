package Tecnica.POO_modulo_2.Java.Clase_16;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class matrices {
  public static void main(String[] args) {
    // Cuando hablamos de matrices, nos referimos a un arreglo de dos dimensiones.
    // Es como una tabla
    // con filas y columnas. En Java, podemos representarlas como un arreglo de
    // arreglos.
    // array unidimensional: int[] vector = new int[tamaño];
    // array bidimensional: int[][] matriz = new int[filas][columnas];

    // ====================================

    int[][] matriz1 = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    for (int i = 0; i < matriz1.length; i++) {
      for (int j = 0; j < matriz1[i].length; j++) {
        System.out.print(matriz1[i][j] + " ");
      }
      System.out.println();
    }

    // ====================================

    Scanner sc = new Scanner(System.in);
    int nFilas, nColumnas, matriz2[][];

    // CREAR MATRIZ
    nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas:")) - 1;
    nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas:")) - 1;
    matriz2 = new int[nFilas][nColumnas];
    System.out.println("Escriba cada elemento de la matriz despues del enter");

    // RELLENAR MATRIZ
    for (int i = 0; i < nFilas; i++) {
      for (int j = 0; i < nColumnas; j++) {
        System.out.println("Matriz[" + i + "] " + "[" + j + "]");
        matriz2[i][j] = sc.nextInt();
      }
    }

    // IMPRIMIR MATRIZ
    for (int i = 0; i < nFilas; i++) {
      for (int j = 0; j < nColumnas; j++) {
        System.out.print(matriz2[i][j] + " ");
      }
      System.out.println();
    }

    // MATRIZ CUADRADA
    if (nFilas == nColumnas) {
      System.out.println("La matriz es cuadrada");
    } else {
      System.out.println("La matriz no es cuadrada");
    }

    sc.close();
    // ====================================
  }
}
