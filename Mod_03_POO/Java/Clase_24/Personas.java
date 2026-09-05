package Mod_03_POO.Java.Clase_24;

public class Personas {
  // "static" significa que esta variable NO le pertenece a un objeto en particular,
  // le pertenece a la CLASE completa. Es como un contador compartido: si creas
  // 3 objetos, los 3 "ven" y modifican el MISMO contador
  static int contadorPersonas = 0;

  // "private" es encapsulamiento: nadie de afuera puede tocar nombre/apellidos
  // directamente (persona.nombre = "x" no compilaria), tienen que pasar
  // por los metodos getNombre()/setNombre() de aca abajo
  private String nombre;
  private String apellidos;

  // El constructor es el metodo especial que se ejecuta automaticamente
  // cada vez que haces "new Personas(...)". Sirve para dejar el objeto
  // listo desde el momento en que nace
  public Personas(String nombre, String apellidos) {
    // "this.nombre" es el atributo de la clase, "nombre" (sin this) es el parametro
    // que llego por fuera. Sin el "this." Java se confundiria entre los dos
    this.nombre = nombre;
    this.apellidos = apellidos;

    // INCREMENTAR EL ATRIBUTO ESTATICO
    // cada vez que se crea una persona nueva, el contador compartido sube en 1
    Personas.contadorPersonas++;
  }

  // @Override aca es distinto al de Animal.java: no estamos sobreescribiendo
  // un metodo de una clase que nosotros hicimos, sino uno que TODA clase en Java
  // hereda automaticamente de la clase Object (la superclase de todo en Java)
  @Override
  public String toString() {
    // super.toString() llama a la version ORIGINAL de Object, que devuelve
    // algo como "Personas@1b6d3586" (la direccion de memoria del objeto)
    // Lo pegamos al final solo para ver la diferencia entre lo "bonito"
    // que armamos nosotros y lo "feo" que Java da por defecto
    return "Nombre: " + this.nombre + ", Apellidos: " + this.apellidos + " , Dir Men.: "
        + super.toString();
  }

  // Estos 4 metodos son los "getters y setters": la forma correcta y controlada
  // de leer o cambiar los atributos privados desde afuera de la clase
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public static void main(String[] args) {
    System.out.println(" *** Creacion de Clase y Objeto Persona ***");
    System.out.println(" *** Variables Static ***");

    var objeto1 = new Personas("Papu", "Gomez");
    // Al hacer println(objeto1), Java llama automaticamente a toString()
    // por eso vemos el texto bonito y no solo la direccion de memoria
    System.out.println(objeto1);
    System.out.println("Variable estatica " + Personas.contadorPersonas + "°");

    var objeto2 = new Personas("Jero", "Zadi");
    System.out.println(objeto2);
    // Ojo aca: el contador ya viene en 1 desde el objeto1, por eso ahora marca 2
    // (no es un contador por objeto, es UNO SOLO compartido entre todos)
    System.out.println("Variable estatica " + Personas.contadorPersonas + "°");
  }
}
