package aeropuerto;

import java.util.ArrayList;

// Igual que AeropuertoPublico, pero el dato propio es una lista, no un solo valor.
public class AeropuertoPrivado extends Aeropuerto {

  private ArrayList<String> empresasPatrocinadoras;

  public AeropuertoPrivado(String nombre, String ciudad, String pais) {
    super(nombre, ciudad, pais);
    this.empresasPatrocinadoras = new ArrayList<>();
  }

  public ArrayList<String> getEmpresasPatrocinadoras() {
    return empresasPatrocinadoras;
  }

  // Mismo patrón que agregarVuelo() en Compania y agregarCompania() en Aeropuerto:
  // la lista empieza vacía y se llena de a una empresa a la vez.
  public void agregarPatrocinador(String empresa) {
    empresasPatrocinadoras.add(empresa);
  }

  @Override
  public String informacionDeFinanciacion() {
    return "Aeropuerto privado. Empresas patrocinadoras: " + empresasPatrocinadoras;
  }
}
