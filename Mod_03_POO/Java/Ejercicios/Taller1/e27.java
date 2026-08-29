package Mod_03_POO.Java.Ejercicios.Taller1;
import java.util.Scanner;

public class e27 {

  public static void main(String[] args) {
    System.out.println("Por:\n - Sebastian Hernandez Muñoz\n - Juan Esteban Ciro Gallego\n");

    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.print("Ingrese el número " + (i + 1) + ": ");
      numeros[i] = sc.nextInt();
    }
    sc.close();

    System.out.println("\nOrden intercalado (extremos hacia el centro):");
    intercalado(numeros);
  }

  public static void intercalado(int[] arreglo) {
    int izquierda = 0, derecha;
    derecha = arreglo.length - 1;

    while (izquierda < derecha) {
      System.out.println(arreglo[izquierda]);
      System.out.println(arreglo[derecha]);
      izquierda++;
      derecha--;
    }

    if (izquierda == derecha) {
      System.out.println(arreglo[izquierda]);
    }
  }
}