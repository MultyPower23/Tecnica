package Mod_03_POO.Java.Clase_19;

import java.util.Scanner;

public class bucles {
  public static void main(String[] args) {

    // int i;

    // --- BUCLE WHILE ---
    // Primero revisa la condición y luego ejecuta el código.
    // Si es falsa desde el inicio, no entra al bloque.
    // i = 100; while (i >= 50) { System.out.println(i); i--; }

    // --- BUCLE DO-WHILE ---
    // Primero ejecuta el código y después revisa la condición.
    // Por eso siempre se ejecuta al menos una vez.
    // i = 1; do { System.out.println(i); i++; } while (i <= 10);

    Scanner sc = new Scanner(System.in);

    // Se declara afuera porque también se usa en el while
    String password;

    // --- CASO PRÁCTICO: EL LOGIN ---
    do {
      // El do se ejecuta primero, así que pide la contraseña de una vez
      System.out.println("Ingrese su contraseña: ");
      password = sc.nextLine();

      // En Java, para comparar textos se usa .equals()
      // ! significa "no"
      if (!password.equals("hola")) // if (password != "hola") no compara correctamente los textos
      {
        System.out.println("Contraseña incorrecta");
      }

    } while (!password.equals("hola"));

    // Sale del bucle cuando la contraseña es correcta
    System.out.println("Bienvenido al sistema");

    sc.close();
  }
}
