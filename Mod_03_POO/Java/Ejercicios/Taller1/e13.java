package Mod_03_POO.Java.Ejercicios.Taller1;
import java.util.Scanner;

public class e13 {
  public static void main(String[] args) {
    System.out.println("Por:\n - Sebastian Hernandez Muñoz\n - Juan Esteban Ciro Gallego\n");

    Scanner sc = new Scanner(System.in);
    int horas, extra;
    float total;

    System.out.print("Dime las horas que trabajaste en la semana: ");
    horas = sc.nextInt();

    System.out.println();

    if (horas > 40) {
      extra = horas - 40;
      System.out.println("Trabajaste " + extra + " horas extras");
      total = 40 * 16 + extra * 20;
      System.out.println("Tu pago semanal es de $" + total);
    } else {
      total = horas * 16;
      System.out.println("Tu pago semanal es de $" + total);
    }

    sc.close();
  }
}