package aeropuerto;

import java.util.ArrayList;

// Clase padre. Es "abstract" porque nunca vamos a crear un Aeropuerto genérico:
// todo aeropuerto real es público o privado. Esta clase solo guarda lo que
// ambos tipos tienen en común, y obliga a las hijas a definir el resto.
public abstract class Aeropuerto {
  private String nombre;
  private String ciudad;
  private String pais;
  private ArrayList<Compania> companias;

  public Aeropuerto(String nombre, String ciudad, String pais) {
    this.nombre = nombre;
    this.ciudad = ciudad;
    this.pais = pais;
    this.companias = new ArrayList<>();
  }

  public String getNombre() {
    return nombre;
  }

  public String getCiudad() {
    return ciudad;
  }

  public String getPais() {
    return pais;
  }

  public ArrayList<Compania> getCompanias() {
    return companias;
  }

  // agregar una compañía
  public void agregarCompania(Compania compania) {
    companias.add(compania);
  }

  @Override
  public String toString() {
    return nombre + " (" + ciudad + ", " + pais + ")" + " - Compañías: " + companias.size();
  }

  // Sin cuerpo a propósito: el padre no sabe si va a hablar de subvención o de
  // patrocinadores. Cada hija implementa esto con @Override, cada una a su manera.
  // Así el menú llama este único método sin preguntar antes qué tipo de aeropuerto es.
  public abstract String informacionDeFinanciacion();
}
