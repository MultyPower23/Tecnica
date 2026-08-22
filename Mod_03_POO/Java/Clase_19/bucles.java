package Mod_03_POO.Java.Clase_19;

import java.util.Scanner;

public class bucles {
  public static void main(String[] args) {

    // int i;

    // --- BUCLE WHILE ---
    // Ojo aquí: el 'while' es súper desconfiado. Primero mira si la condición se
    // cumple y LUEGO
    // hace las cosas.
    // Si 'i' no cumple la regla de entrada, ni se molesta en entrar al bloque { } y
    // se lo salta.
    // i = 100; while (i >= 50) { System.out.println(i); i--; }

    // --- BUCLE DO-WHILE ---
    // El 'do-while' es al revés, manda primero y pregunta después.
    // Va a ejecutar lo que esté dentro del 'do { }' SÍ O SÍ al menos una primera
    // vez,
    // y ya cuando llega abajo al 'while', se fija si le toca repetir o no.
    // i = 1; do { System.out.println(i); i++; } while (i <= 10);

    Scanner sc = new Scanner(System.in);

    // Ojo con esto: la variable 'password' la declaramos AQUÍ AFUERA.
    // Si la metes dentro del 'do { }', cuando el 'while' de abajo intente leerla te
    // va a decir:
    // "Oye, esa variable no existe". Es por el tema del alcance (scope) de las
    // llaves.
    String password;

    // --- CASO PRÁCTICO: EL LOGIN ---
    do {
      // Como estamos en un 'do', esto se va a ejecutar de una apenas arranque el
      // programa.
      System.out.println("Ingrese su contraseña: ");
      password = sc.nextLine();

      // MIRA ESTE TRUCO IMPORTANTE:
      // En Java, NUNCA compares texto con '!=' o '=='. Te vas a volver loco porque
      // dará fallos
      // raros.
      // '==' compara si están en el mismo sitio de memoria. '.equals()' compara LO
      // QUE DICE la
      // palabra.
      //
      // El signo de exclamación '!' léelo mentalmente como un "NO".
      // '!password.equals("hola")' significa: "Si la contraseña NO es igual a hola".
      if (!password.equals("hola")) // if (password != "hola") <-- ¡Lo que tenías aquí no sirve en
                                    // Java!
      {
        System.out.println("Contraseña incorrecta");
      }
      ;

    } while (!password.equals("hola"));
    // Aquí el 'while' pregunta: "¿El usuario metió algo que NO es 'hola'?"
    // - Si dice que SÍ (true): "Uf, se equivocó, lo regreso arriba al 'do' a pedir
    // la clave otra
    // vez".
    // - Si dice que NO (false): "Ah, ya puso 'hola', rompo el bucle y sigo para
    // abajo".
    // PD: No te olvides de ponerle el punto y coma ';' al final del while en el
    // do-while, es el
    // único que lo lleva.

    // Si llegaste hasta esta línea es porque por fin lograste salir del bucle
    // do-while.
    System.out.println("Bienvenido al sistema");

    sc.close();
  }
}
