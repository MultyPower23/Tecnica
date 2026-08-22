package Mod_03_POO.Java.Clase_21;

public class POO_Base { // ostias, ya tan rapido?

  // Esta es la "receta" o plano de lo que es un Carro
  // Todavia no es un carro real, es solo la plantilla
  public static class Carro {
    // Atributos = las caracteristicas que va a tener CADA carro
    String color, marca;
    int km;
  }

  public static void main(String[] args) {
    // Aca "instanciamos" la clase: creamos un carro REAL a partir del molde
    Carro carro1 = new Carro();
    carro1.color = "Blanco";
    carro1.marca = "Toyota";
    carro1.km = 0;

    System.out.println("El carro 1 es de color: " + carro1.color);
    System.out.println("El carro 1 es de marca: " + carro1.marca);
    System.out.println("El carro 1 tiene: " + carro1.km + " km");

    // Creamos otro carro con el MISMO molde, pero con sus propios datos
    // (esta es la magia: un molde, infinitos objetos diferentes)
    Carro carro2 = new Carro();
    carro2.color = "Azul";
    carro2.marca = "Chevrolet";
    carro2.km = 0;
  }
}
