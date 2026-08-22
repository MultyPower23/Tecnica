package Mod_03_POO.Java.Ejercicios.clase_22;

public class Cuadrilatero {
  private float lado1;
  private float lado2;

  public Cuadrilatero(float lado1, float lado2) {
    this.lado1 = lado1;
    this.lado2 = lado2;
  }

  public Cuadrilatero(float lado1) {
    this.lado1 = this.lado2 = lado1;
  }

  public float getPerimetro() {
    var perimetro = 2 * (lado1 + lado2);
    return perimetro;
  }

  public float getArea() {
    var area = lado1 * lado2;
    return area;
  }
}
