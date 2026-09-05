package Mod_03_POO.Java.Clase_24;

// ============================================================================
// ⚠️ NOTA: este archivo NO viene de la clase, lo arme yo (Claude) como refuerzo
// porque en el Clase_24.md se menciona "clases abstractas" pero no habia
// codigo de ejemplo. Usalo para entender el concepto, pero revisalo con lo
// que realmente explico el profe antes de darlo por definitivo.
// ============================================================================

// Una clase abstracta es como un "molde incompleto a proposito": define que
// TODAS sus clases hijas van a tener un metodo llamado calcularArea(),
// pero no dice COMO calcularlo, porque cada figura lo hace distinto.
// Por eso no se puede hacer "new Figura()" directamente, solo tiene sentido
// crear objetos de sus hijas (Circulo, Rectangulo, etc.)
abstract class Figura {
  String nombre;

  Figura(String nombre) {
    this.nombre = nombre;
  }

  // Metodo abstracto: no tiene cuerpo ({ }), solo la firma.
  // Es una "promesa": quien herede de Figura ESTA OBLIGADO a implementarlo
  abstract double calcularArea();

  // Una clase abstracta SI puede tener metodos normales con codigo completo,
  // no todo tiene que ser abstracto
  void mostrarInfo() {
    System.out.println(nombre + " tiene un area de: " + calcularArea());
  }
}


class Circulo extends Figura {
  double radio;

  Circulo(double radio) {
    super("Circulo"); // le pasamos el nombre al constructor de la clase padre
    this.radio = radio;
  }

  // Aca SI cumplimos la promesa: le damos el cuerpo real al metodo abstracto
  @Override
  double calcularArea() {
    return Math.PI * radio * radio;
  }
}


class Rectangulo extends Figura {
  double base, altura;

  Rectangulo(double base, double altura) {
    super("Rectangulo");
    this.base = base;
    this.altura = altura;
  }

  @Override
  double calcularArea() {
    return base * altura;
  }
}


class pruebaFiguras {
  public static void main(String[] args) {
    // Figura figura = new Figura("x"); // <-- esto NO compila, es el punto clave
    // de las clases abstractas: no se pueden instanciar directamente

    Figura f1 = new Circulo(5);
    Figura f2 = new Rectangulo(4, 6);

    // Mismo truco de polimorfismo que en Animal.java: tratamos ambas figuras
    // como si fueran simples "Figura", pero cada una calcula su area distinto
    f1.mostrarInfo();
    f2.mostrarInfo();
  }
}
