package Mod_03_POO.Java.Ejercicios.Taller;
import java.util.Scanner;

public class e4 {
  public static void main(String[] args) {
    System.out.println("Por:\n - Sebastian Hernandez Muñoz\n - Juan Esteban Ciro Gallego\n");

    Scanner sc = new Scanner(System.in);
    short salario_carros = 1000, comision_carros = 150, valor_carro = 20000;
    int ganancias_carros;
    byte carros_vendidos = 0;
    float porc_carro = 0.05f;

    System.out.println("Ingresa los siguientes datos para saber cuanto se gano en la venta de carros en este mes:");
    System.out.println("Salario base: $" + salario_carros);

    System.out.print("Ingrese la cantidad de carros vendidos: ");
    carros_vendidos = sc.nextByte();

    ganancias_carros = (int) (carros_vendidos * (comision_carros + (valor_carro * porc_carro)));

    System.out.println("Ganancias por ventas: $" + ganancias_carros);

    sc.close();
  }
}
