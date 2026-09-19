package Mod_03_POO.Java.Clase_24;

// Una clase abstracta define qué deben tener sus hijas, pero no cómo.
abstract class Figura {
  String nombre;

  Figura(String nombre) {
    this.nombre = nombre;
  }

  // No tiene cuerpo; las clases hijas deben implementarlo.
  abstract double calcularArea();

  // Una clase abstracta también puede tener métodos normales.
  void mostrarInfo() {
    System.out.println(nombre + " tiene un area de: " + calcularArea());
  }
}


class Circulo extends Figura {
  double radio;

  Circulo(double radio) {
    // Envía el nombre al constructor de la clase padre.
    super("Circulo");
    this.radio = radio;
  }

  // Aquí se define el método abstracto.
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
    // Una clase abstracta no se puede instanciar directamente.
    // Figura figura = new Figura("x");

    // Polimorfismo: ambas referencias son Figura, pero cada objeto
    // calcula su área de forma diferente.
    Figura f1 = new Circulo(5);
    Figura f2 = new Rectangulo(4, 6);

    f1.mostrarInfo();
    f2.mostrarInfo();
  }
}
