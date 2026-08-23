package Mod_03_POO.Java.Ejercicios.ejercicio42;

public class Envio {
  private String codigoGuia;
  private String idCliente;
  private double pesoMasa;
  private String nivelUrgencia; // "normal", "alta", "express"
  private Sede centroLogistico;

  private static final double TARIFA_POR_KILO = 1000;
  private static final double RECARGO_ALTA_PRIORIDAD = 10000;
  private static final double RECARGO_EXPRESS = 20000;

  public Envio(String codigoGuia, String idCliente, double pesoMasa, String nivelUrgencia,
      Sede centroLogistico) {
    this.codigoGuia = codigoGuia;
    this.idCliente = idCliente;
    this.pesoMasa = pesoMasa;
    this.nivelUrgencia = nivelUrgencia;
    this.centroLogistico = centroLogistico;
  }

  public String getCodigoGuia() {
    return codigoGuia;
  }

  public String getIdCliente() {
    return idCliente;
  }

  public double getPesoMasa() {
    return pesoMasa;
  }

  public String getNivelUrgencia() {
    return nivelUrgencia;
  }

  public Sede getCentroLogistico() {
    return centroLogistico;
  }

  public double obtenerCostoTotal() {
    double importe = pesoMasa * TARIFA_POR_KILO;

    if (nivelUrgencia.equalsIgnoreCase("alta")) {
      importe += RECARGO_ALTA_PRIORIDAD;
    } else if (nivelUrgencia.equalsIgnoreCase("express")) {
      importe += RECARGO_EXPRESS;
    }

    return importe;
  }
}
