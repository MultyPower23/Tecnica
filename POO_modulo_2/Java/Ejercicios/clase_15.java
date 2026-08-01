package Tecnica.POO_modulo_2.Java.Ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class clase_15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Elige una opción:");
    System.out.println("1. Positivo o negativo");
    System.out.println("2. Par o impar");
    System.out.println("3. Contador");
    System.out.println("4. Juego de adivinar");
    System.out.println("5. Suma");
    System.out.print("Opción: ");

    switch (sc.nextByte()) {
      case 1:
        positvo_o_negativo(sc);
        break;
      case 2:
        par_o_impar(sc);
        break;
      case 3:
        contador(sc);
        break;
      case 4:
        juego(sc);
        break;
      case 5:
        suma(sc);
        break;
      default:
        System.out.println("Opción inválida");
    }
    sc.close();
  }

  public static void positvo_o_negativo(Scanner sc) {
    int num;
    System.out
        .println("Dime números y dire si son positivos o negativos (ingresa '0' para finalizar)");

    do {
      System.out.print("Ingresa el número: ");
      num = sc.nextInt();
      if (num > 0) {
        System.out.println(num + " es positivo");
      } else if (num < 0) {
        System.out.println(num + " es negativo");
      }
    } while (num != 0);

    System.out.println("FIN");
  }

  public static void par_o_impar(Scanner sc) {
    int num;
    System.out.println("Dime números y dire si son pares o impares (ingresa '0' para finalizar)");

    do {
      System.out.print("Ingresa el número: ");
      num = sc.nextInt();
      if (num % 2 == 0 & num != 0) {
        System.out.println(num + " es par");
      } else if (num % 2 != 0) {
        System.out.println(num + " es impar");
      }
    } while (num != 0);

    System.out.println("FIN");
  }

  public static void contador(Scanner sc) {
    int i = 0, num;
    System.out.println("Dime números y los contare (ingresa un negativo o '0' para finalizar)");

    do {
      System.out.print("Ingresa el número: ");
      num = sc.nextInt();
      if (num > 0) {
        i++;
      }
    } while (num > 0);

    System.out.println("Ingresaste " + i + " números positivos");
    System.out.println("FIN");
  }

  public static void juego(Scanner sc) {
    int i = 0;
    final byte NUM = (byte) ((Math.random() * (100 - 1 + 1)) + 1);
    byte intento;

    int confirmacion = JOptionPane.showConfirmDialog(null,
        "Juguemos un jueguito, yo pensaré en un número random entre el 1 y 100 y vos deberás adivinar cual es. ¿Te animas?",
        "Juego de Adivinanza", JOptionPane.YES_NO_OPTION);

    if (confirmacion != JOptionPane.YES_OPTION) {
      return;
    }

    do {
      intento = Byte.parseByte(JOptionPane.showInputDialog("Adivina el número (1-100):"));
      i++;

      if (intento < NUM) {
        JOptionPane.showMessageDialog(null, "Más arriba");
      } else if (intento > NUM) {
        JOptionPane.showMessageDialog(null, "Más abajo");
      }

    } while (intento != NUM);

    JOptionPane.showMessageDialog(null,
        "¡Ese es! El número era " + NUM + ". Solo te tomo: " + i + " intentos");

    System.out.println("FIN");
  }

  public static void suma(Scanner sc) {
    int num, sum = 0;
    System.out.println("Dime números y los sumare (ingresa '0' para finalizar)");

    do {
      System.out.print("Ingresa el número: ");
      num = sc.nextInt();
      sum += num;
    } while (num != 0);

    System.out.println("La suma final es: " + sum);
    System.out.println("FIN");
  }
}
