// 1. LA UBICACIÓN: Le dice a Java en qué "carpeta" o "paquete" está guardado este archivo.
package Mod_03_POO.Java.Clase_17;

// 2. EL CONTENEDOR (CLASE): Todo en Java debe vivir dentro de una "clase". Es el cascarón de
// nuestro código.
public class hello_world {

  // 3. EL PUNTO DE ARRANQUE (MÉTODO MAIN): Es el motor. Sin esto, el programa no
  // sabe cómo empezar a correr.
  public static void main(String[] args) {

    // 4. LA ACCIÓN: La orden específica que le damos a la computadora para que
    // muestre algo en pantalla.
    System.out.println("ohayou sekai!");
    System.out.println("Good morning world!");

    // Se crea una variable con el tipo y nombre asignado y se le coloca un valor
    // asigando
    // tipo nombre = valor
    String nombre = "Juan Esteban Ciro";

    // Se imprime en pantalla el valor de la variable
    System.out.println(nombre);
    String colegio = "UPB Marinilla";
    System.out.println(colegio);

    byte miByte1 = 100;
    byte miByte2 = 28;
    System.out.println(miByte1 + miByte2);

    // constante que inicia con "final"
    final Float pi = 3.14159265359f;
    System.out.println(pi);

  } // Cierra el método main

} // Cierra la clase hello_world
