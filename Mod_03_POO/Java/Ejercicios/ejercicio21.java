package Mod_03_POO.Java.Ejercicios;

public class ejercicio21 {
  public static void main(String[] args) {
    // Sumar dos valores empleando funciones.

    int arg1 = 23, arg2 = 9;
    int resultado = suma(arg1, arg2);
    System.out.println("El resultado de la primera suma es: " + resultado);

    System.out.println("El resultado de la segunda suma es: " + suma(5, 7));
  }

  static int suma(int a, int b) {
    var resultado = a + b;
    return resultado;
  }
}
