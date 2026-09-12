package aeropuerto;

import java.util.ArrayList;

public class Vuelo {

  private String identificador;
  private String ciudadOrigen;
  private String ciudadDestino;
  private double precio;
  private int numeroMaximoPasajeros;
  private ArrayList<Pasajero> pasajeros;

  public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio,
      int numeroMaximoPasajeros) {
    this.identificador = identificador;
    this.ciudadOrigen = ciudadOrigen;
    this.ciudadDestino = ciudadDestino;
    this.precio = precio;
    this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    this.pasajeros = new ArrayList<>();
  }

  // Getters
  public String getIdentificador() {
    return identificador;
  }

  public String getCiudadOrigen() {
    return ciudadOrigen;
  }

  public String getCiudadDestino() {
    return ciudadDestino;
  }

  public double getPrecio() {
    return precio;
  }

  public int getNumeroMaximoPasajeros() {
    return numeroMaximoPasajeros;
  }

  public ArrayList<Pasajero> getPasajeros() {
    return pasajeros;
  }

  // true si se pudo reservar, false si ya estaba lleno. Quien llama decide qué imprimir
  // con ese resultado — esta clase no imprime nada por su cuenta.
  public boolean reservarAsiento(Pasajero pasajero) {
    if (pasajeros.size() >= numeroMaximoPasajeros) {
      return false;
    }
    pasajeros.add(pasajero);
    return true;
  }

  @Override
  public String toString() {
    return identificador + ": " + ciudadOrigen + " -> " + ciudadDestino + " ($" + precio + ", "
        + pasajeros.size() + "/" + numeroMaximoPasajeros + " puestos ocupados)";
  }
}
