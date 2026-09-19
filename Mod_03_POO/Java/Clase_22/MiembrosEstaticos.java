package Mod_03_POO.Java.Clase_22;

// Miembros estáticos: atributos o métodos que usan "static".
// Los atributos normales pertenecen a cada objeto, mientras que los static
// pertenecen a la clase y son compartidos por todos los objetos.
public class MiembrosEstaticos {

  // Cada objeto tiene su propio nombre
  private String nombre;

  // Solo hay un contador, compartido por todos los objetos
  private static int contadorDeObjetos = 0;

  public MiembrosEstaticos(String nombre) {
    // Esto es un constructor: se ejecuta automáticamente cada vez que se crea un objeto de esta
    // clase.
    this.nombre = nombre;

    // Cada vez que se crea un objeto, aumenta el contador
    contadorDeObjetos++;
  }

  public String getNombre() {
    return nombre;
  }

  // Método static para consultar el dato compartido
  public static int getContadorDeObjetos() {
    return contadorDeObjetos;
  }

  public static void main(String[] args) {
    System.out.println("Objetos creados al inicio: " + MiembrosEstaticos.getContadorDeObjetos()); // 0

    MiembrosEstaticos persona1 = new MiembrosEstaticos("Laura");
    MiembrosEstaticos persona2 = new MiembrosEstaticos("Andrés");
    MiembrosEstaticos persona3 = new MiembrosEstaticos("Camilo");

    // Cada persona tiene su propio nombre
    System.out.println(persona1.getNombre()); // Laura
    System.out.println(persona2.getNombre()); // Andrés
    System.out.println(persona3.getNombre()); // Camilo

    // El contador es uno solo para los tres objetos
    System.out.println("Objetos creados en total: " + MiembrosEstaticos.getContadorDeObjetos()); // 3
    System.out
        .println("Mismo dato visto desde persona3: " + MiembrosEstaticos.getContadorDeObjetos()); // 3
  }
}

// En Python, un atributo de clase funciona de forma parecida:
//
// class Persona:
// contador_de_objetos = 0
//
// def __init__(self, nombre):
// self.nombre = nombre
// Persona.contador_de_objetos += 1
