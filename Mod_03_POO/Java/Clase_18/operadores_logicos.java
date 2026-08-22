package Tecnica.Mod_03_POO.Java.Clase_18;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class operadores_logicos {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    // ===== OPERADORES LOGICOS =====
    int a, b;
    a = 25;
    b = 78;

    boolean resultado = a > b;
    System.out.println(resultado);

    resultado = a < b;
    System.out.println(resultado);

    resultado = a < b - 23;
    System.out.println(resultado);

    resultado = a <= b - 23;
    System.out.println(resultado);

    resultado = a == b - 23;
    System.out.println(resultado);

    String nombre1 = "Ciro";
    String nombre2 = "ciro";

    System.out.println(nombre1 == nombre2);

    // ===== IF ELSE =====
    int num1, dato = 4;

    num1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba que un número del 1 al 10: "));

    if (num1 == dato) {
      JOptionPane.showMessageDialog(null, "Adivino el número");
    } else {
      JOptionPane.showMessageDialog(null, "No adivino el número");
    }

    // ===== OPERADOR TERNARIO =====
    int num6;
    String mensaje;
    num6 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número"));
    mensaje = (num6 % 2 == 0) ? "El número es par" : "El número es impar";

    JOptionPane.showMessageDialog(null, mensaje);
    entrada.close();
  }
}