package Tecnica.Mod_03_POO.Java.Clase_18;

import java.util.Scanner;

public class operadores_matematicos {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Que desea observar:");
    System.out.print("1.Operadores Aritmeticos \n2.Operadores Incrementales y Decrecientes \n3.Ejercicio \n:");

    switch (entrada.next()) {
      case "1":

        // ========== OPERADORES ARITMETICOS ==========
        float num1, num2, suma, resta, multi, div, resto;

        System.err.println();
        System.out.println("Escriba dos números: ");

        System.out.print("Primer número: ");
        num1 = entrada.nextFloat();

        System.out.print("Segundo número: ");
        num2 = entrada.nextFloat();

        System.out.print(
            "Escribe el número del procedimiento a realizar: \n1.Suma; 2.Resta; 3.Multiplicación; 4.Dvisíon y Residuo \n:");
        switch (entrada.next()) {
          case "1":
            suma = num1 + num2;
            System.out.printf("\nLa suma de %.2f y %.2f es %.2f", num1, num2, suma);
            break;

          case "2":
            resta = num1 - num2;
            System.out.printf("\nLa resta de %.2f y %.2f es %.2f", num1, num2, resta);
            break;

          case "3":
            multi = num1 * num2;
            System.out.printf("\nLa multiplicación de %.2f por %.2f es %.2f", num1, num2, multi);
            break;

          case "4":
            div = num1 / num2;
            resto = num1 % num2;
            System.out.printf("\nLa división de %.2f entre %.2f es %.2f, y su residuo es %.2f", num1, num2, div, resto);
            break;

          default:
            System.out.println("No existe ese procedimiento, vuelva a intentar");
        }
        break;
      // ==================================================

      case "2":

        // ========== OPERADORES DE INCREMENTO Y DECREMENTO (x=x+1 - x+=1) ==========
        byte num3 = 1, x = 23, y;

        System.err.println();
        num3++; // aumenta num3 en uno en uno y se autoguarda
        System.out.print(num3);
        num3++;
        System.out.print(", " + num3);
        num3++;
        System.out.print(", " + num3);

        System.err.println();
        num3--; // decrece num 3 en uno en uno y se autoguarda
        System.out.print(num3);
        num3--;
        System.out.print(", " + num3);
        num3--;
        System.out.print(", " + num3);

        System.out.println();

        y = x++; // primero Y adopta el valor de X y luego se le suma el nuevo valor a X
        System.out.printf("\nX = %d \nY = %d", x, y);
        y = ++x;
        System.out.printf("\nX = %d \nY = %d", x, y);

        break;
      // ==================================================

      case "3":
        int z = 5, j;

        j = z++; // primero Y adopta el valor de X y luego se le resta el nuevo valor a X
        System.out.printf("\nZ = %d \nJ = %d", z, j);
        j = ++z;
        System.out.printf("\nZ = %d \nJ = %d", z, j);

        break;
      // ==================================================

      default:
        System.out.println("No existe esa sección, vuelva a intentar");
        break;
    }

    entrada.close();
  }
}
