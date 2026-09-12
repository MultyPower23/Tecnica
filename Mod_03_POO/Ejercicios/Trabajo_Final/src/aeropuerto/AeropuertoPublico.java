package aeropuerto;

// Hereda de Aeropuerto: tiene todo lo del padre (nombre, ciudad, pais, companias)
// más el dato propio de este tipo, la subvención del gobierno.
public class AeropuertoPublico extends Aeropuerto {

  private double subvencionGobierno;

  public AeropuertoPublico(String nombre, String ciudad, String pais, double subvencionGobierno) {
    // super(...) construye la parte "Aeropuerto" antes de construir la parte "pública".
    // Sin esta línea no compila: el padre no tiene un constructor vacío que llamar solo.
    super(nombre, ciudad, pais);
    this.subvencionGobierno = subvencionGobierno;
  }

  public double getSubvencionGobierno() {
    return subvencionGobierno;
  }

  // @Override confirma que esto reemplaza el método abstracto del padre, no que
  // crea uno nuevo por accidente (si el nombre no coincidiera exacto, el compilador avisaría).
  @Override
  public String informacionDeFinanciacion() {
    return "Aeropuerto público. Subvención del gobierno: $" + subvencionGobierno;
  }
}
