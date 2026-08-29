package Mod_03_POO.Java.Ejercicios.Taller1;
import java.util.Scanner;

public class e10 {
  public static void main(String[] args) {
    System.out.println("Por:\n - Sebastian Hernandez Muñoz\n - Juan Esteban Ciro Gallego\n");

    Scanner sc = new Scanner(System.in);
    char letra;

    System.out.println("Dame letras y diré si es mayúscula o minúscula (0 para salir)");

    do {
      System.out.print(": ");
      letra = sc.next().charAt(0);

      if (letra == '0') {
        break;
      }

      if (Character.isUpperCase(letra)) {
        System.out.println("La letra " + letra + " es mayúscula");
      } else if (Character.isLowerCase(letra)) {
        System.out.println("La letra " + letra + " es minúscula");
      } else {
        System.out.println("El carácter " + letra + " no es una letra");
      }

    } while (true);

    sc.close();
  }
}