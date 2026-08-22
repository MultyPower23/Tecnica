package Mod_03_POO.Java.Clase_22.Paquete1;

// Esta clase junta dos temas de la clase: ENCAPSULAMIENTO (con sus
// métodos accesores Set/Get) y MODIFICADORES DE ACCESO.
//
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

  // "public" -> lo puede tocar CUALQUIER clase, esté en el paquete que
  // esté (con tal de que importes la clase). Es el más abierto de todos,
  // y justamente por eso rompe el encapsulamiento si lo usas en atributos:
  // cualquiera podría poner objeto1.atributo2 = -9999 sin que la clase
  // pueda validar nada.
  public int atributo2;

  // "private" -> SOLO se puede usar dentro de esta misma clase (Clase1).
  // Ni siquiera otra clase del mismo paquete puede tocarlo directo.
  // Por eso "edad" y "nombre" quedan privados: para forzar a que cualquier
  // otra clase pase por los métodos Set/Get de aquí abajo.
  private int edad;
  private String nombre;

  // --- METODOS ACCESORES (Setters y Getters) ---
  // Set = "establecer/enviar" -> recibe un valor y lo guarda en el atributo
  // Get = "obtener/mostrar" -> no recibe nada, devuelve el valor guardado
  //
  // Con esto, "edad" y "nombre" siguen siendo privados (protegidos), pero
  // el resto del programa igual puede leerlos y cambiarlos... solo que
  // pasando por acá, no directo. Esto es justo lo que se conoce como
  // ENCAPSULAMIENTO: el atributo real queda oculto y solo se expone lo que
  // la clase decide exponer.
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

// ⚡ Contraste con Python: en Python NO existe un "private" real como en
// Java (el compilador no te bloquea el acceso). Lo que se usa es una
// convención:
// - _atributo -> "por favor no lo toques desde afuera" (nadie te lo
// impide, es solo un acuerdo entre programadores)
// - __atributo -> Python le cambia el nombre por dentro (name mangling)
// para hacerlo más difícil de acceder por accidente,
// pero técnicamente sigue siendo posible.
// En Java, "private" SÍ es una regla que el compilador obliga: si otra
// clase intenta tocar el atributo directo, ni siquiera compila.
//
// ⚠️ Nota sobre "protected": es el cuarto modificador de acceso en Java
// (default, public, private y protected), y no salió reflejado en tus
// apuntes de esta clase porque su utilidad real se ve con HERENCIA (tema
// que aparece más adelante en el índice de la presentación, punto 12).
// Adelanto rápido para que lo tengas mapeado:
// - protected = como "private", pero además lo pueden usar las clases
// que hereden de esta (subclases), aunque estén en otro paquete.
// Cuando llegue la clase de herencia, esto se va a ver con ejemplos reales.
