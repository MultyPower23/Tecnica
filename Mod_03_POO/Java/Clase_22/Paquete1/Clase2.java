package Mod_03_POO.Java.Clase_22.Paquete1;

public class Clase2 {
  public static void main(String[] args) {
    // Se crea un objeto de Clase1.
    Clase1 objeto1 = new Clase1();

    // Default: funciona porque estamos en el mismo paquete.
    objeto1.atributo1 = 10;

    // Los atributos private se usan mediante los métodos Set/Get.
    objeto1.SetEdad(15);
    System.out.println("La edad es de " + objeto1.GetEdad() + " años");

    objeto1.SetNombre("Juan");
    System.out.println("El nombre es " + objeto1.GetNombre());
  }
}

// Encapsular permite controlar cómo se accede a los datos.
