package Mod_03_POO.Java.Ejercicios.clase_22.ejercicio42;

public class App {
  public static void main(String[] args) {
    Sede sedeNorte = new Sede(101, "Av. Primavera 123", "Cali");
    Sede sedeSur = new Sede(102, "Av. Central 456", "Cartagena");

    Envio cargaA = new Envio("GUIA-A1", "987654321", 5.0, "normal", sedeNorte);
    Envio cargaB = new Envio("GUIA-B2", "543216789", 3.5, "alta", sedeNorte);
    Envio cargaC = new Envio("GUIA-C3", "678954321", 2.0, "express", sedeSur);

    System.out.println("Carga [" + cargaA.getCodigoGuia() + "] -> Total a pagar: COP "
        + cargaA.obtenerCostoTotal());
    System.out.println("Carga [" + cargaB.getCodigoGuia() + "] -> Total a pagar: COP "
        + cargaB.obtenerCostoTotal());
    System.out.println("Carga [" + cargaC.getCodigoGuia() + "] -> Total a pagar: COP "
        + cargaC.obtenerCostoTotal());
  }
}
