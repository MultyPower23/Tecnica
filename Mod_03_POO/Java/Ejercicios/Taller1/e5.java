package Mod_03_POO.Java.Ejercicios.Taller1;
import java.util.Scanner;

public class e5 {
  public static void main(String[] args) {
    System.out.println("Por:\n - Sebastian Hernandez Muñoz\n - Juan Esteban Ciro Gallego\n");

    Scanner sc = new Scanner(System.in);
    float porc_1 = 0.1f, porc_2 = 0.25f, porc_3 = 0.25f, porc_4 = 0.40f;
    double parti, prim_parcial, segun_parcial, exam_final, definitiva;

    System.out.println("Ingrese las calificaciones de los cuatro aspectos:");

    System.out.print("Participación: ");
    parti = sc.nextDouble();

    System.out.print("Primer examen parcial: ");
    prim_parcial = sc.nextDouble();

    System.out.print("Segundo examen parcial: ");
    segun_parcial = sc.nextDouble();

    System.out.print("Examen final: ");
    exam_final = sc.nextDouble();

    definitiva = (parti * porc_1) + (prim_parcial * porc_2) + (segun_parcial * porc_3) + (exam_final * porc_4);

    System.out.printf("La calificación final es: %.2f", definitiva);
    sc.close();
  }
}
