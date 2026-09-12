package aeropuerto;

public class Pasajero {

  private String nombre;
  private String numeroPasaporte;
  private String nacionalidad;

  public Pasajero(String nombre, String numeroPasaporte, String nacionalidad) {
    this.nombre = nombre;
    this.numeroPasaporte = numeroPasaporte;
    this.nacionalidad = nacionalidad;
  }

  // Getters
  public String getNombre() {
    return nombre;
  }

  public String getNumeroPasaporte() {
    return numeroPasaporte;
  }

  public String getNacionalidad() {
    return nacionalidad;
  }

  @Override
  public String toString() {
    return nombre + " (pasaporte " + numeroPasaporte + ", " + nacionalidad + ")";
  }
}
