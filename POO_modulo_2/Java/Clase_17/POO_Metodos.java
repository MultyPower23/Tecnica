package Tecnica.POO_modulo_2.Java.Clase_17;

import javax.swing.JOptionPane;

public class POO_Metodos { // Metodos de una clase

  public static class ParejaIntegers {
    // Atributos: cada objeto de este tipo va a "cargar" estos 6 valores consigo
    // mismo
    int num1, num2, suma, resta, multi, divi;

    // Este metodo le pide al usuario los numeros y los guarda EN el objeto
    public void leerNumero() {
      num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
      num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
    }

    // Ojo: estos metodos no reciben nada por parametro, porque ya tienen
    // num1 y num2 guardados adentro del objeto (son atributos, no variables
    // locales)
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
      divi = num1 / num2; // ojo con esto: si num2 es 0, esto revienta (division por cero)
    }

    // Este solo imprime lo que ya se calculo antes, no calcula nada nuevo
    public void mostrar() {
      System.out.println("La suma es: " + suma);
      System.out.println("La resta es: " + resta);
      System.out.println("La multiplicacion es: " + multi);
      System.out.println("La division es: " + divi);
    }
  }

  public static void main(String[] args) {
    // Creamos UN objeto y vamos llamando sus metodos en orden,
    // como una receta de cocina paso a paso
    ParejaIntegers pareja = new ParejaIntegers();
    pareja.leerNumero();
    pareja.sumar();
    pareja.restar();
    pareja.multi();
    pareja.divi();
    pareja.mostrar();
  }
}