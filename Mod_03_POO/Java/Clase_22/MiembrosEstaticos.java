package Mod_03_POO.Java.Clase_22;

// ⚠️ ESTE ARCHIVO NO VIENE DE TUS APUNTES DE CLASE.
// La presentación menciona "Miembros estáticos de una clase" (punto 11 del
// índice) pero no hay código tuyo capturado sobre ese tema, así que este
// ejemplo lo armo desde cero solo para que puedas entenderlo. Cuando
// tengas tus propios apuntes/ejercicios de esta parte, esto es lo primero
// que deberías reemplazar.
//
// MIEMBROS ESTATICOS = atributos o métodos marcados con la palabra clave
// "static". La diferencia clave con lo que viste en Clase1/Clase2:
//
// - Un atributo NORMAL (de instancia) pertenece a CADA objeto por
// separado. Si tienes 3 Personas, cada una tiene su propio "nombre".
// - Un atributo STATIC pertenece a la CLASE, no a cada objeto. Existe
// una sola copia, compartida por todos los objetos que se creen.
// Si un objeto lo cambia, TODOS los demás "ven" el cambio, porque en
// realidad es la misma casilla de memoria para todos.
public class MiembrosEstaticos {

  // Atributo de instancia: cada objeto tiene el suyo propio
  private String nombre;

  // Atributo estático: es UNO SOLO, compartido por todas las Personas que
  // se creen. Lo usamos como contador de cuántos objetos se han hecho.
  private static int contadorDeObjetos = 0;

  public MiembrosEstaticos(String nombre) {
    this.nombre = nombre;
    // Cada vez que se crea un objeto nuevo (se llama este constructor),
    // se le suma 1 al contador compartido. No importa desde qué objeto
    // se dispare esto: siempre está tocando la MISMA variable.
    contadorDeObjetos++;
  }

  public String getNombre() {
    return nombre;
  }

  // Método estático: se llama sobre la CLASE, no sobre un objeto puntual
  // (por eso no necesita "this" ni sabe nada de un nombre en particular).
  // Solo tiene sentido para leer/mostrar el dato compartido.
  public static int getContadorDeObjetos() {
    return contadorDeObjetos;
  }

  public static void main(String[] args) {
    System.out.println("Objetos creados al inicio: " + MiembrosEstaticos.getContadorDeObjetos()); // 0

    MiembrosEstaticos persona1 = new MiembrosEstaticos("Laura");
    MiembrosEstaticos persona2 = new MiembrosEstaticos("Andrés");
    MiembrosEstaticos persona3 = new MiembrosEstaticos("Camilo");

    // Cada persona tiene su propio nombre (atributo de instancia)
    System.out.println(persona1.getNombre()); // Laura
    System.out.println(persona2.getNombre()); // Andrés
    System.out.println(persona3.getNombre()); // Camilo

    // Pero el contador es UNO SOLO para las tres, por eso ya marca 3 sin
    // importar desde qué objeto lo consultes (o directo desde la clase):
    System.out.println("Objetos creados en total: " + MiembrosEstaticos.getContadorDeObjetos()); // 3
    System.out
        .println("Mismo dato visto desde persona3: " + MiembrosEstaticos.getContadorDeObjetos()); // 3
                                                                                                  // (aunque
                                                                                                  // se
                                                                                                  // ve
                                                                                                  // raro
                                                                                                  // usarlo
                                                                                                  // así)
  }
}

// ⚡ Contraste con Python: esto es exactamente lo mismo que un ATRIBUTO DE
// CLASE en Python (el que se define directo dentro de "class X:", fuera de
// __init__ y sin usar self). Ejemplo equivalente en Python:
//
// class Persona:
// contador_de_objetos = 0 # esto es el "static"
//
// def __init__(self, nombre):
// self.nombre = nombre # esto es el atributo de instancia
// Persona.contador_de_objetos += 1
//
// La trampa clásica en Python (y por eso vale la pena tenerla clara acá
// también) es que si haces self.contador_de_objetos = 5 dentro de un
// método, en realidad estás CREANDO un atributo de instancia nuevo que
// tapa al de clase para ESE objeto puntual, en vez de modificar el
// compartido. En Java pasa algo parecido: si accedes al static a través
// de un objeto (persona3.contadorDeObjetos) sigue siendo el mismo dato
// compartido, pero por eso mismo la buena práctica es acceder siempre
// por el nombre de la clase (MiembrosEstaticos.contadorDeObjetos),
// para que quede clarísimo que NO es algo propio de ese objeto.
