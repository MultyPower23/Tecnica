package Tecnica.Mod_03_POO.Java.Clase_20;

import java.util.Scanner;

public class repaso_ordenamientos {
  public static void main(String[] args) {
    // DECLARACION DE VARIABLES
    int arreglo[], nElementos;
    Scanner sc = new Scanner(System.in);

    // INGRESAR CANTIDAD DE ELEMENTOS
    System.out.print("Ingrese la cantidad de elementos del arreglo: ");
    nElementos = sc.nextInt();
    arreglo = new int[nElementos];

    // CARGAR ARREGLO
    for (int i = 0; i < nElementos; i++) {
      System.out.print("Ingrese el elemento " + (i + 1) + ": ");
      arreglo[i] = sc.nextInt();
      // arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el
      // elemento " + (i +
      // 1)));
    }

    // IMPRIMIR ARREGLO
    System.out.println("\nArreglo Original Desordenado:");
    for (int i = 0; i < nElementos; i++) {
      System.out.print(arreglo[i] + ", ");
    }

    // ORDENAR ARREGLO
    for (int i = 0; i < arreglo.length - 1; i++) {
      for (int j = 0; j < (arreglo.length - 1 - i); j++) {
        if (arreglo[j] > arreglo[j + 1]) {

        }
      }
    }
    sc.close();
  }
}
