package Mod_03_POO.Java.Ejercicios.clase_22;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    Cuadrilatero c1;
    float lado1, lado2;

    lado1 =
        Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer lado del cuadrilatero"));
    lado2 =
        Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo lado del cuadrilatero"));

    if (lado1 == lado2) {
      c1 = new Cuadrilatero(lado1);
    } else {
      c1 = new Cuadrilatero(lado1, lado2);
    }

    System.out.println("El perimetro es: " + c1.getPerimetro());
    System.out.println("El area es: " + c1.getArea());
  }
}
