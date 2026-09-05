package Mod_03_POO.Ejercicios.Taller;
import java.util.Scanner;

public class e12 {
  public static void main(String[] args) {
    System.out.println("Por:\n - Sebastian Hernandez Muñoz\n - Juan Esteban Ciro Gallego\n");

    Scanner sc = new Scanner(System.in);
    int valor;

    System.out.println("Ingresa el costo de tu compra: ");
    valor = sc.nextInt();

    if (valor >= 300) {
      System.out.println("Como supera los $300 se aplica un descuento del 20%");
      valor *= 0.8;
    } else {
      System.out.println("No supera los $300, no aplica el descuento");
    }
    System.out.println("Tu compra queda con un costo de $" + valor);

    sc.close();
  }
}
