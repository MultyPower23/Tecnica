package Tecnica.POO_modulo_2.Java.Clase_17;

import java.util.LinkedList;
import java.util.Queue;

public class FIFO {
  /*
   * ===== COLAS =====
   * se aplica el metodo FIFO (First In; First Out)
   * -> el primero que entra es el primero que sale
   *
   * offer(10) = Insertar (se pone al final de la fila)
   * poll() = Retirar (saca al que esta al frente)
   * peek() = Consultar (mirar quien es el proximo, sin sacarlo)
   */
  public static void main(String[] args) {
    // Es literal una fila para ser atendido
    Queue<String> fila = new LinkedList<>();
    fila.offer("Manso"); // este es el primero en la fila
    fila.offer("Felipe");
    fila.offer("Ranger");
    fila.offer("Bryan");
    fila.offer("Ciro"); // este es el ultimo en llegar

    System.out.println(fila);

    // usar el primer dato
    System.out.println("\nPersona atendida");
    // poll() siempre saca al que esta al frente de la fila (Manso), no al ultimo
    String atendido = fila.poll();

    System.out.println("Primera persona atendida: " + atendido);
    System.out.println("\nPersona pendientes por ser atendida");
    System.out.println(fila); // Manso ya no aparece, Felipe paso a ser el frente
  }

  public static void impresora() {
    // Como la fila de una impresora compartida en la oficina:
    // el primer documento que mandaste es el primero que sale impreso
    Queue<String> cola = new LinkedList<>();
    cola.offer("TareaJava");
    cola.offer("Informe");
    cola.offer("Factura");
    cola.offer("HojaVida"); // este es el ultimo en la fila

    System.out.println("Cola de impresion: " + cola);

    // peek() te deja ver quien sigue SIN sacarlo de la cola todavia
    String primerDocumento = cola.peek();

    // poll() ya lo saca de verdad, como si la impresora lo escupiera
    String documentoImpreso = cola.poll();

    System.out.println("Primer documento a imprimir: " + primerDocumento);
    System.out.println("Documento impreso: " + documentoImpreso);
    System.out.println("Cola de impresion despues de imprimir: " + cola);

    // Pregunta de la guia: ¿Por que una cola es apropiada para una impresora?
    // R: Porque es justo, respeta el orden de llegada (FIFO). Si alguien
    // manda un documento primero, no seria justo que la impresora
    // le "salte la fila" y imprima el ultimo que llego primero.
  }
}