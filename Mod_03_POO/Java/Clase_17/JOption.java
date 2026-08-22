package Mod_03_POO.Java.Clase_17;

// Importación de la herramienta para crear ventanas emergentes (UI básica)
import javax.swing.JOptionPane;

public class JOption {
  public static void main(String[] args) {
    String cadena;
    int entero;
    char letra;
    double decimal;

    /*
     * ---------------------------------------------------------------------
     * ENTRADA DE DATOS CON VENTANAS (JOptionPane.showInputDialog)
     * Esta ventana SIEMPRE devuelve el dato como un TEXTO (String),
     * sin importar si el usuario escribe un número, una letra o un decimal.
     * ---------------------------------------------------------------------
     */

    // 1. Caso directo: Como devuelve String, se guarda en 'cadena' sin problema.
    cadena = JOptionPane.showInputDialog(("Escribe una frase: "));

    // 2. Caso Entero: Toca transformar el String a int a la fuerza con
    // Integer.parseInt().
    entero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número: "));

    // 3. Caso Char: Del texto que escribe el usuario, agarramos solo la letra en la
    // posición cero.
    letra = JOptionPane.showInputDialog(("Escribe una letra: ")).charAt(0);

    // 4. Caso Decimal: Toca transformar el String a double usando
    // Double.parseDouble().
    decimal = Double.parseDouble(JOptionPane.showInputDialog("Escriba un número decimal: "));

    /*
     * ---------------------------------------------------------------------
     * SALIDA DE DATOS (JOptionPane.showMessageDialog)
     * Muestra una ventana emergente de alerta con toda la información unida.
     * ---------------------------------------------------------------------
     */
    JOptionPane.showMessageDialog(null, "La frase es: " + cadena + "\nEl número es: " + entero
        + "\nLa letra es: " + letra + "\nEl número decimal es: " + decimal);
  }
}
