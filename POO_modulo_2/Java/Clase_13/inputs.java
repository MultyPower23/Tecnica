package Tecnica.POO_modulo_2.Java.Clase_13;

import java.util.Scanner;

public class inputs {
  public static void main(String[] args) {

    // Inicialización del lector de consola (Backend listening)
    Scanner entrada = new Scanner(System.in);

    // Declaración de variable vacía especificando su tipo (String)
    String nombre;

    System.out.print("Ingrese su nombre: ");

    /*
     * ---------------------------------------------------------------------
     * MÉTODOS DE CAPTURA DE TEXTO (Diferencia clave):
     * - entrada.next(); -> Captura solo el primer valor (hasta el primer espacio).
     * - entrada.nextLine(); -> Captura la línea completa (varias palabras con
     * espacios).
     * ---------------------------------------------------------------------
     */
    nombre = entrada.nextLine();

    byte edad;
    System.out.print("Ingrese su edad: ");

    edad = entrada.nextByte(); // un jodido .next por cada tipo joder

    // Salida con interpolación de texto mediante comodines (%s para String, %d para
    // entero)
    System.out.printf("%s tiene %d años", nombre, edad);
  }
}