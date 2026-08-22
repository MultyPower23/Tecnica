package Tecnica.Mod_03_POO.Java.Clase_21;

public class POO_Parametros {
  public static void main(String[] args) {
    int num1 = 10, num2 = 5;

    // Notá que aca llamamos los metodos con ParejaIntegers.metodo(...)
    // eso es porque son "static": pertenecen a la CLASE, no a un objeto especifico
    // no hace falta hacer "new ParejaIntegers()" para usarlos
    System.out.println("Suma: " + ParejaIntegers.suma(num1, num2));
    System.out.println("Resta: " + ParejaIntegers.resta(num1, num2));
    System.out.println("Multiplicación: " + ParejaIntegers.multiplicacion(num1, num2));
    System.out.println("División: " + ParejaIntegers.division(num1, num2));
  }

  public static class ParejaIntegers {
    // Estos atributos aca ni se usan (nadie los llena), son medio decorativos
    int num1, num2;

    // Cada metodo recibe SUS PROPIOS num1 y num2 por parametro
    // No tienen nada que ver con los atributos de arriba
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