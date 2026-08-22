package Mod_03_POO.Java.Clase_18;

public class clase_math {
  public static void main(String[] args) {
    /*
     * =================================================
     * --------------- FUNCIONES DE MATH ---------------
     * =================================================
     *
     * Todas excepto abs() deben trabajar con double, o falla
     */

    // ----- RAIZ CUADRADA -----
    // Math.sqrt(base)
    double base1 = 4;
    double raiz = Math.sqrt(base1);
    System.out.printf("Raiz cuadrada de %.2f es %.2f", base1, raiz);

    // ----- POTENCIA -----
    // Math.pow(base,indice)
    double base2 = 3, indice = 3;
    double potencia = Math.pow(base2,indice);
    System.out.printf("\nLa potencia de %.2f elvado a 3 es %.2f", base2, potencia);

    // ----- REDONDEO -----
    // Math.round(numero,decimas)
    // double
    final double pi = 3.14159265359;
    double redondeadoD = Math.round(pi);
    System.out.printf("\nEl redondeo de %f es %.2f", pi,redondeadoD);
    // float
    float numero1 = 23.09f;
    double redondeadoF = Math.round(numero1);
    System.out.printf("\nEl redondeo de %f es %.2f", numero1,redondeadoF);

    // ----- RANDOM -----
    double random1 = Math.random(); // solo genera entre 0 y 1 sin incluir a estos
    System.out.println("\nRandom: " + random1);
  }

}
