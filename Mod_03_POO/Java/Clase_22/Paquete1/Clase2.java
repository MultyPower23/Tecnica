package Mod_03_POO.Java.Clase_22.Paquete1;

// Esta clase muestra el "consumo" de Clase1 desde afuera: cómo se usa un
// objeto una vez que sus atributos están encapsulados (privados) y solo
// se puede interactuar con ellos a través de los Set/Get.
public class Clase2 {
  public static void main(String[] args) {
    // Se instancia (crea) un objeto de tipo Clase1
    Clase1 objeto1 = new Clase1();

    // atributo1 no tiene modificador (default) y estamos en el MISMO
    // paquete (Paquete1), así que sí lo podemos tocar directo:
    objeto1.atributo1 = 10;

    // edad y nombre son "private" dentro de Clase1, por eso desde acá NO
    // se puede hacer objeto1.edad = 15 directamente (no compilaría).
    // Hay que pasar sí o sí por los métodos Set/Get que la propia clase
    // decidió exponer:
    objeto1.SetEdad(15);
    System.out.println("La edad es de " + objeto1.GetEdad() + " años");

    objeto1.SetNombre("Juan");
    System.out.println("El nombre es " + objeto1.GetNombre());
  }
}

// 🔑 Idea clave de este archivo: encapsular no significa "que nadie pueda
// usar el dato", sino "que nadie lo use SIN pasar por la puerta que la
// clase definió". Clase1 decide cómo se entra y sale de "edad" y
// "nombre"; Clase2 solo puede jugar con las reglas que Clase1 puso.
