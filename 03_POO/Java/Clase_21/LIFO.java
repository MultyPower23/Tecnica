package Tecnica.POO_modulo_2.Java.Clase_17;

import java.util.Stack;

public class LIFO {
  /*
   * ===== ESTRUCTURAS LINEALES =====
   * pilas (stacks) -> para historiales y memoria
   * colas (queues) -> para turnos y procesos
   *
   * ===== PILAS =====
   * se aplica el metodo LIFO (Last In; First Out)
   * -> el ultimo que entra es el primero que sale
   *
   * push(10) = Insertar
   * pop() = Retirar
   * peek() = Consultar (mirar sin sacar)
   */
  public static void main(String[] args) {

    // Pensalo como ir apilando platos uno encima del otro
    Stack<String> platos = new Stack<>();
    platos.push("PLATO1"); // este queda hasta abajo de la torre
    platos.push("PLATO2");
    platos.push("PLATO3");
    platos.push("PLATO4");
    platos.push("PLATO5"); // este queda arriba de todo

    System.out.println("Pila de platos");
    System.out.println(platos); // se imprime en orden de insercion, pero el que "sale" primero es PLATO5
  }

  public static void historial() {
    // Como el boton "atras" del navegador: la ultima pagina que visitaste
    // es la primera a la que volves si le das para atras
    Stack<String> historial = new Stack<>();
    historial.push("Google");
    historial.push("Youtube");
    historial.push("Wikipedia");
    historial.push("Github"); // esta queda en la cima, es la pagina "actual"

    System.out.println("Historial de navegacion");
    System.out.println(historial);

    // Utilice pop() para regresar a la pagina anterior
    // pop() siempre saca el que esta en la cima (el ultimo que entro)
    String paginaEliminada = historial.pop();

    System.out.println("\nPagina eliminada: " + paginaEliminada);
    System.out.println("Historial restante: " + historial);

    // Pregunta de la guia: ¿Que pagina se elimina primero?
    // R: Github, porque fue la ultima en entrar (LIFO: last in, first out)
  }
}