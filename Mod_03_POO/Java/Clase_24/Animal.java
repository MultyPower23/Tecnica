package Mod_03_POO.Java.Clase_24;

// El polimorfismo es la capacidad de un objeto de tomar muchas formas, es decir, un objeto
// puede ser tratado como un objeto de su clase base o como un objeto de su clase derivada.

// Esta es la SUPERCLASE (o clase padre): la que define el comportamiento "generico"
// que todos los animales van a compartir
public class Animal {
  public void hacerSonido() {
    System.out.println("El animal hace un sonido");
  }
}


// "extends Animal" es la herencia: Perro HEREDA todo lo que tiene Animal,
// y ademas puede agregar cosas propias o cambiar lo que ya trae
class Perro extends Animal {
  // @Override le dice a Java "ojo, esto no es un metodo nuevo,
  // es una version PROPIA del metodo que ya existia en Animal"
  // Sirve como red de seguridad: si te equivocas escribiendo el nombre del metodo
  // (ej. pusiste haerSonido), Java te avisa en vez de crear un metodo nuevo por error
  @Override
  public void hacerSonido() {
    System.out.println("El perro dice guau guau");
  }
}


// Misma logica que Perro: Gato tambien es un Animal, pero con su propio sonido
class Gato extends Animal {
  @Override
  public void hacerSonido() {
    System.out.println("El gato maulla");
  }
}


class pruebaAnimal {
  // Aca esta la magia del polimorfismo: el parametro es de tipo Animal,
  // pero le podes pasar un Perro O un Gato, y cada uno va a sonar distinto
  // sin que este metodo necesite saber cual es cual
  static void imprimirSonido(Animal animal) { // metodo polimorfo
    animal.hacerSonido();
  }

  public static void main(String[] args) {
    // Fijate: la variable es de tipo Perro, pero la funcion de arriba
    // la recibe "disfrazada" de Animal. Eso es polimorfismo en accion
    var animal1 = new Perro();
    imprimirSonido(animal1); // imprime "guau guau" aunque el metodo solo conoce Animal

    var animal2 = new Gato();
    imprimirSonido(animal2); // imprime "maulla"
  }
}
