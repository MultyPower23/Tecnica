package Tecnica.POO_modulo_2.Java.Ejercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class clase_16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // traspuesta(sc);
    // simetrica(sc);
    // binario(sc);
    suma(sc);
    marco(sc);

    sc.close();
  }

  // ==================================================

  public static void traspuesta(Scanner sc) {
    /*
     * Cambiar las filas por las
     * columnas de una matriz
     */

    int nFilas, nColumnas, matrizA[][], matrizB[][];

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
  }

  // ==================================================

  public static void simetrica(Scanner sc) {
    /*
     * Verificar si una
     * matriz es simetrica
     * (igual a su traspuesta)
     */
    int nFilas, nColumnas, matrizA[][], matrizB[][];
    boolean cuadrada, esSimetrica;

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

    // MATRIZ CUADRADA
    cuadrada = (nFilas == nColumnas);
    if (cuadrada) {
      System.out.println("La matriz es cuadrada");
    } else {
      System.out.println("La matriz no es cuadrada");
    }

    // VERIFICAR SI LA MATRIZ ES IGUAL A SU TRASPUESTA
    esSimetrica = true;
    if (cuadrada) {
      for (int i = 0; i < nFilas; i++) {
        for (int j = 0; j < nColumnas; j++) {
          if (matrizA[i][j] != matrizB[i][j]) {
            esSimetrica = false;
          }
        }
      }
    } else {
      esSimetrica = false;
    }

    // IMPRIMIR RESULTADO
    if (esSimetrica) {
      System.out.println("La matriz ingresada es igual a su traspuesta (es simetrica)");
    } else {
      System.out.println("La matriz ingresada no es igual a su traspuesta");
    }
  }

  // ==================================================

  public static void binario(Scanner sc) {
    /*
     * Crear una matriz de
     * tamaño 7 x 7, rellenarla
     * de forma que los
     * elementos de la diagonal
     * principal sean 1 y el resto
     * 0.
     */

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

  // ==================================================

  public static void suma(Scanner sc) {

    /*
     * Crear y cargar una matriz
     * de tamaño n x m, mostrar
     * la suma de cada fila y de
     * cada columna
     */

    int filas, columnas, matriz[][];

    filas = Integer.parseInt(
        JOptionPane.showInputDialog("Ingrese el número de filas:"));
    columnas = Integer.parseInt(
        JOptionPane.showInputDialog("Ingrese el número de columnas:"));
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
  }

  // ==================================================

  public static void marco(Scanner sc) {
    /*
     * Crear una matriz “marco” de
     * tamaño 6 x 6 : todos sus
     * elementos deben ser cero a
     * excepción de los elementos
     * que se encuentran en el borde,
     * estos deben de ser 1. y
     * mostrar en consola
     */

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

  // ==================================================

}
