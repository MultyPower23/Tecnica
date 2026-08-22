package Mod_03_POO.Java.Ejercicios.clase_22.ejercicio42;

public class Sede {
  private int idSede;
  private String ubicacion;
  private String municipio;

  public Sede(int idSede, String ubicacion, String municipio) {
    this.idSede = idSede;
    this.ubicacion = ubicacion;
    this.municipio = municipio;
  }

  public int getIdSede() {
    return idSede;
  }

  public String getUbicacion() {
    return ubicacion;
  }

  public String getMunicipio() {
    return municipio;
  }
}
