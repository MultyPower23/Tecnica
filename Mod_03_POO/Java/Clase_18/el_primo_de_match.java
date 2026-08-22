package Tecnica.Mod_03_POO.Java.Clase_18;

import javax.swing.JOptionPane;

public class el_primo_de_match {
    public static void main(String[] args) {
        int num1, num2, suma, resta, multi, div;
        char op;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el primer número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el segundo número: "));

        op = JOptionPane.showInputDialog("Escriba la primera letra de la operacion que quiera realizar\n" +
                "'s' para sumar\n" +
                "'r' para restar\n" +
                "'m' para multiplicar\n" +
                "'d' para dividir").charAt(0);

        switch (op) {
            case 's':
            case 'S':
                suma = num1 + num2;
                JOptionPane.showMessageDialog(null, "La suma de los 2 números es: " + suma);
                break;

            case 'r':
            case 'R':
                resta = num1 - num2;
                JOptionPane.showMessageDialog(null, "La resta de los 2 números es: " + resta);
                break;

            case 'm':
            case 'M':
                multi = num1 * num2;
                JOptionPane.showMessageDialog(null, "La multiplicacion de los 2 números es: " + multi);
                break;

            case 'd':
            case 'D':
                div = num1 / num2;
                JOptionPane.showMessageDialog(null, "La division de los 2 números es: " + div);
                break;

        }
    }
}