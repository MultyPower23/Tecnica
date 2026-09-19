package Mod_03_POO.Java.Clase_22;

// El constructor se ejecuta automáticamente al crear un objeto con new.
// En Java tiene el mismo nombre de la clase y no tiene tipo de retorno.
public class Persona {
  // Atributos: características de cada objeto Persona.
  String nombre;
  int edad;
  float estatura;
  int documento;

  // --- METODO CONSTRUCTOR ---
  // Reglas que cumple este método para que Java lo reconozca como constructor:
  // 1) Se declara "public" (o al menos accesible desde donde lo vas a usar)
  // 2) NO tiene tipo de retorno, ni siquiera "void" (eso lo distingue de un
  // método normal, aunque se vea parecido)
  // 3) Tiene el mismo nombre exacto de la clase
  //
  // Lo que hace: recibe los datos por parámetro y los guarda en los
  // atributos del objeto que se está creando en ese momento.
  public Persona(String nombre, int edad, float estatura, int documento) {
    // this se refiere al atributo del objeto actual.
    this.nombre = nombre;
    this.edad = edad;
    this.estatura = estatura;
    this.documento = documento;
  }

  // Método normal que muestra los datos guardados.
  public void MostrarDatos() {
    System.out.println("tu nombre es " + nombre);
    System.out.println("tienes " + edad + " años");
    System.out.println("mides " + estatura + "cm");
    System.out.println("tu documento es: " + documento);
  }

  public static void main(String[] args) {
    // new crea el objeto y ejecuta su constructor.
    Persona p1 = new Persona("Shairo", 15, 1.72f, 987654321);

    p1.MostrarDatos();
  }
}

// NetBeans/VSCode puede generar el constructor automáticamente con
// Source Action -> Generate Constructors.

// Sobrecarga de constructores: una clase puede tener varios constructores
// si sus firmas son diferentes. Se distinguen por cantidad, tipo u orden
// de los parámetros.
// Ejemplo: Persona(String nombre, int edad) y
// Persona(int edad, String nombre) son válidos porque cambia el orden.
// No pueden existir dos constructores con la misma firma; los nombres
// de los parámetros no cuentan para diferenciarlos.

// En Python una clase solo puede tener un __init__. Varias formas de crear
// el objeto se simulan con valores por defecto o @classmethod.
// En Java sí se pueden tener varios constructores sobrecargados.
