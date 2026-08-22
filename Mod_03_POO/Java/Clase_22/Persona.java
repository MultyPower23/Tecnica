package Mod_03_POO.Java.Clase_22;

// Esta clase es el ejemplo clásico para entender el METODO CONSTRUCTOR.
// Piensa en el constructor como el "__init__" de Python: es el método que
// se ejecuta automáticamente apenas creas el objeto (cuando pones "new").
// La diferencia es que en Java el constructor SIEMPRE se llama igual que
// la clase (Persona -> Persona()), no tiene un nombre fijo como __init__.
public class Persona { // Debe tener el mismo nombre del archivo (Persona.java)

  // Atributos = las características que va a tener CADA persona que crees
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
    // "this" le dice a Java "el atributo de ESTE objeto", para no
    // confundirlo con el parámetro que se llama igual.
    // Es lo mismo que en Python cuando escribes self.nombre = nombre
    this.nombre = nombre;
    this.edad = edad;
    this.estatura = estatura;
    this.documento = documento;
  }

  // Método normal (no constructor) que solo muestra los datos ya guardados
  public void MostrarDatos() {
    System.out.println("tu nombre es " + nombre);
    System.out.println("tienes " + edad + " años");
    System.out.println("mides " + estatura + "cm");
    System.out.println("tu documento es: " + documento);
  }

  public static void main(String[] args) {
    // Acá se dispara el constructor automáticamente: apenas pones "new
    // Persona(...)", Java ejecuta el bloque de arriba con estos 4 valores.
    Persona p1 = new Persona("Shairo", 15, 1.72f, 987654321);
    p1.MostrarDatos();
  }
}

// Notas sueltas de la clase (tal cual las anotaste):
//
// - Para más practicidad: clic derecho -> Source Action -> "Generate
// Constructors" y NetBeans/VSCode te arma el constructor solo, tomando
// los atributos que tenga la clase.
//
// - SOBRECARGA DE CONSTRUCTORES: puedes tener más de un constructor en la
// misma clase (ej. uno que reciba 4 datos y otro que reciba solo 2),
// siempre y cuando se puedan diferenciar entre sí. Java los distingue por
// la firma del método, es decir por:
// * la cantidad de parámetros, o
// * el tipo de esos parámetros, o
// * el orden en que van
// Ejemplo: Persona(String nombre, int edad) y Persona(int edad, String
// nombre) SÍ son válidos juntos porque el orden de los tipos es distinto.
//
// - NO SE PUEDE tener dos constructores con exactamente la misma firma
// (mismos tipos, mismo orden), aunque cambies los nombres de los
// parámetros — Java no los distingue por el nombre del parámetro, solo
// por el tipo y el orden.
//
// ⚡ Contraste rápido con Python: en Python una clase solo puede tener UN
// __init__. Si "necesitas" varias formas de crear el objeto, se simula con
// valores por defecto (def __init__(self, nombre, edad=None)) o con
// @classmethod. En Java, en cambio, la sobrecarga de constructores es una
// herramienta real del lenguaje: puedes tener varios constructores de
// verdad, cada uno independiente.
