package Mod_03_POO.Java.Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio4 {
  public static void main(String[] args) {
    // Realizar un juego para adivinar un número.
    // Para ello generar un numero aleatorio entre 0 y 100,
    // y luego ir pidiendo números indicando si es mayor o menor con respecto a X.
    // El proceso termina cuando el usuario acierta y mostrar el número de intentos.

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
}
