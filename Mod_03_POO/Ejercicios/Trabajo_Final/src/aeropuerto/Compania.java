package aeropuerto;

import java.util.ArrayList;

public class Compania {
  private String nombre;
  private ArrayList<Vuelo> vuelos;

  public Compania(String nombre) {
    this.nombre = nombre;
    this.vuelos = new ArrayList<>();
  }

  public String getNombre() {
    return nombre;
  }

  public ArrayList<Vuelo> getVuelos() {
    return vuelos;
  }

  // agregar un vuelo a la compañía
  public void agregarVuelo(Vuelo vuelo) {
    vuelos.add(vuelo);
  }

  @Override
  public String toString() {
    return nombre + " - Vuelos: " + vuelos.size();
  }
}

