package Mod_03_POO.Java.Ejercicios.mezcla;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ejercicio16 {

  public static void main(String[] args) {
    // Verificar si una matriz es simetrica (igual a su traspuesta).

    int nFilas, nColumnas, matrizA[][], matrizB[][];
    boolean cuadrada, esSimetrica;
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

    sc.close();
  }

}
