package Mod_03_POO.Java.Clase_18;

public class formatos_strings {
  public static void main(String[] args) {
    /*
     * ===========================================================
     * --------------- FORMATO DE SALIDA (strings) ---------------
     * ===========================================================
     *
     * \t -> Tabulación (4 espacios)
     * \n -> Salto de línea
     * \b -> Retroceso (borra el último carácter)
     * \' -> Comilla simple
     * \" -> Comilla doble
     * \\ -> Barra invertida
     *
     */
    System.out.println("Hola\tMundo");
    System.out.println("Hola\nMundo");
    System.out.println("Hola\bMundo");
    System.out.println("Hola\'Mundo");
    System.out.println("Hola\"Mundo");
    System.out.println("Hola\\Mundo");
  }
}
