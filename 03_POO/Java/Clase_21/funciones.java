package Tecnica.POO_modulo_2.Java.Clase_17;

public class funciones {
  // Ya nos habiamos tardado yeiii
  public static void main(String[] args) {
    // Guardamos el resultado en una variable para reusarlo
    int arg1 = 23, arg2 = 9;
    int resultado = suma(arg1, arg2);
    System.out.println("El resultado de la primera suma es: " + resultado);

    // Aca ni guardamos el resultado, lo mandamos directo al println
    // (esto se puede porque suma() SI devuelve un valor, no es void)
    System.out.println("El resultado de la segunda suma es: " + suma(5, 7));

    // saludar() es void, o sea que no "regresa" nada, solo hace algo (imprimir)
    saludar("Shairo");
    saludar("Chancha"); // se puede llamar tantas veces como quieras, cambiando el argumento

    // esPar() regresa un boolean, por eso podemos concatenarlo directo en el String
    System.out.println("¿Es par 10? " + esPar(10));
    System.out.println("¿Es par 15? " + esPar(15));
  }

  // Recibe dos numeros (parametros) y devuelve (return) su suma
  static int suma(int a, int b) {
    var resultado = a + b; // "var" deja que Java adivine el tipo (aca seria int)
    return resultado;
  }

  // No tiene return porque es void: solo hace una accion, no entrega nada de
  // vuelta
  static void saludar(String nombre) {
    System.out.println("Hola " + nombre);
  }

  // El truco esta en el modulo (%): si el resto de dividir entre 2 es 0, es par
  static boolean esPar(int numero) {
    return numero % 2 == 0;
  }
}