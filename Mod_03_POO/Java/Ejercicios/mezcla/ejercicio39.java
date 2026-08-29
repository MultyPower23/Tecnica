package Mod_03_POO.Java.Ejercicios.mezcla;

import javax.swing.JOptionPane;
import Mod_03_POO.Java.Ejercicios.mezcla.ejercicio39.ParejaIntegers1.ParejaIntegers2;

public class ejercicio39 {
  public static void main(String[] args) {
    // Crear un programa que sume, reste,
    // multiplique y divida dos números,
    // empleando POO.


    System.out.println("=== USANDO METODOS ===");
    ParejaIntegers1 pareja = new ParejaIntegers1();
    pareja.leerNumero();
    pareja.sumar();
    pareja.restar();
    pareja.multi();
    pareja.divi();
    pareja.mostrar();


    System.out.println("=== USANDO PARAMETROS ===");
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));

    System.out.println("Suma: " + ParejaIntegers2.suma(num1, num2));
    System.out.println("Resta: " + ParejaIntegers2.resta(num1, num2));
    System.out.println("Multiplicación: " + ParejaIntegers2.multiplicacion(num1, num2));
    System.out.println("División: " + ParejaIntegers2.division(num1, num2));
  }


  // ===== USANDO METODOS =====
  public static class ParejaIntegers1 {
    int num1, num2, suma, resta, multi, divi;

    public void leerNumero() {
      num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
      num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
    }

    public void sumar() {
      suma = num1 + num2;
    }

    public void restar() {
      resta = num1 - num2;
    }

    public void multi() {
      multi = num1 * num2;
    }

    public void divi() {
      divi = num1 / num2;
    }

    public void mostrar() {
      System.out.println("La suma es: " + suma);
      System.out.println("La resta es: " + resta);
      System.out.println("La multiplicacion es: " + multi);
      System.out.println("La division es: " + divi);
    }


    // ===== USANDO PARAMETROS =====
    public static class ParejaIntegers2 {
      int num1, num2;

      public static int suma(int num1, int num2) {
        return num1 + num2;
      }

      public static int resta(int num1, int num2) {
        return num1 - num2;
      }

      public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
      }

      public static int division(int num1, int num2) {
        return num1 / num2;
      }
    }
  }
}
