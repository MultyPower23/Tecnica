package Tecnica.POO_modulo_2.Java.Clase_15;

public class arreglos {
  public static void main(String[] args) {
    int[] numeros = new int[5];
    numeros[0] = 10;
    numeros[1] = 20;
    numeros[2] = 30;
    numeros[3] = 40;
    numeros[4] = 50;

    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Elemento en el índice " + i + ": " + numeros[i]);
    }

    String[] nombre = {"Juan", "Pedro", "Maria", "Luis", "Ana"};

    // for EACH
    System.out.println("Nombres:");
    for (String i : nombre) {
      System.out.print(i + " ");
    }
    System.out.println();

    // Promedio de notas
    double[] notas = {3.4, 4.5, 2.3, 5.0, 3.8};
    double suma = 0, maximo = notas[0];
    for (double nota : notas) {
      suma += nota;
      if (nota > maximo) {
        maximo = nota;
      }
    }
    double promedio = suma / notas.length;
    System.out.println("Promedio de notas: " + promedio);
    System.out.println("Nota máxima: " + maximo);
  }
}
