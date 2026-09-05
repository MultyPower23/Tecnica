package Mod_03_POO.Ejercicios.Taller;
import java.util.Scanner;

public class e14 {

  public static void main(String[] args) {
    System.out.println("Por:\n - Sebastian Hernandez Muñoz\n - Juan Esteban Ciro Gallego\n");

    Scanner sc = new Scanner(System.in);
    int dia, mes, año;

    System.out.print("Ingresa el día: ");
    dia = sc.nextInt();
    System.out.print("Ingresa el mes: ");
    mes = sc.nextInt();
    System.out.print("Ingresa el año: ");
    año = sc.nextInt();

    sc.close();

    if (Correcta(dia, mes, año)) {
      System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es CORRECTA.");
    } else {
      System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es INCORRECTA.");
    }
  }

  public static boolean Correcta(int dia, int mes, int año) {

    if (año == 1582 && mes == 10 && dia >= 5 && dia <= 14) {
      return false;
    }

    if (año <= 0) {
      return false;
    }
    if (mes < 1 || mes > 12) {
      return false;
    }

    int DiadeMes = Dia(mes);

    return dia >= 1 && dia <= DiadeMes;
  }

  private static int Dia(int mes) {
    switch (mes) {
      case 1: // enero
      case 3: // marzo
      case 5: // mayo
      case 7: // julio
      case 8: // agosto
      case 10: // octubre
      case 12: // diciembre
        return 31;

      case 4: // abril
      case 6: // junio
      case 9: // septiembre
      case 11: // noviembre
        return 30;

      case 2: // febrero
        return 28;

      default:
        return 0;
    }
  }
}