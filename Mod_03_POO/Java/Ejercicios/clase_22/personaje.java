package Mod_03_POO.Java.Ejercicios.clase_22;

import javax.swing.JOptionPane;

public class personaje {
  public static void main(String[] args) {

    Tablero p1 = new Tablero((byte) 0, (byte) 0);
    JOptionPane.showMessageDialog(null, "Coordenadas iniciales: " + p1.getCoords() + " (x, y)");

    boolean seguir = true;

    while (seguir) {
      String menu = """
          Elige una opción:
          1. Mover Arriba
          2. Mover Abajo
          3. Mover Derecha
          4. Mover Izquierda
          5. Salir
          """;

      String op = JOptionPane.showInputDialog(menu);

      if (op == null || op.equals("5")) {
        seguir = false;
        JOptionPane.showMessageDialog(null, "Juego terminado.\nPosición final: " + p1.getCoords());
        break;
      }

      String entrada = JOptionPane.showInputDialog("¿Cuántas unidades quieres moverte?");
      if (entrada == null) {
        continue;
      }

      byte incremento = Byte.parseByte(entrada);

      switch (op) {
        case "1":
          p1.Arriba(incremento);
          break;
        case "2":
          p1.Abajo(incremento);
          break;
        case "3":
          p1.Derecha(incremento);
          break;
        case "4":
          p1.Izquierda(incremento);
          break;
        default: {
          JOptionPane.showMessageDialog(null, "Opción no válida. Intenta de nuevo.");
          continue;
        }
      }

      JOptionPane.showMessageDialog(null, "Nueva posición: " + p1.getCoords() + " (x, y)");
    }
  }
}
