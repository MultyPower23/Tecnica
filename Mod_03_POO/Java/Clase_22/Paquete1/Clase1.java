package Mod_03_POO.Java.Clase_22.Paquete1;

// Encapsulamiento = esconder los atributos "en crudo" detrás de métodos,
// para controlar cómo se leen y cómo se modifican, en vez de dejar que
// cualquiera los toque directo desde afuera.
public class Clase1 {

  // --- ATRIBUTOS, cada uno con un modificador de acceso distinto a
  // propósito, para poder comparar ---

  // Sin modificador -> acceso "default" (también llamado package-private).
  // Solo se puede usar desde clases que estén en el MISMO paquete
  // (Mod_03_POO.Java.Clase_22.Paquete1 en este caso). Ni más restrictivo
  // que private, ni tan abierto como public: es el punto medio.
  int atributo1;

  // Public: se puede acceder desde cualquier clase.
  public int atributo2;

  // Private: solo se puede usar dentro de esta clase.
  private int edad;
  private String nombre;

  // Set guarda un valor; Get devuelve el valor guardado.
  public void SetEdad(int edad) {
    this.edad = edad;
  }

  public int GetEdad() {
    return edad;
  }

  public void SetNombre(String nombre) {
    this.nombre = nombre;
  }

  public String GetNombre() {
    return nombre;
  }
}

// En Python no existe un private real como en Java.
// _atributo es una convención y __atributo usa name mangling,
// pero técnicamente se puede acceder.
// En Java, private sí es una regla del compilador.

// protected es el cuarto modificador de acceso.
// Se parece a private, pero también permite acceso desde las subclases,
// incluso si están en otro paquete. Se usa principalmente con herencia.
