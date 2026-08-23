package Mod_03_POO.Java.Ejercicios.ejercicio41;

public class Tablero {
  private byte x;
  private byte y;

  public Tablero(byte x, byte y) {
    this.x = x;
    this.y = y;
  }

  // Ubicación del personaje
  public String getCoords() {
    return "(" + this.x + ", " + this.y + ")";
  }

  public byte getX() {
    return this.x;
  }

  public byte getY() {
    return this.y;
  }

  // Movimiento del personaje
  public void Derecha(byte incremento) {
    this.x += incremento;
  }

  public void Izquierda(byte decremento) {
    this.x -= decremento;
  }

  public void Arriba(byte incremento) {
    this.y += incremento;
  }

  public void Abajo(byte decremento) {
    this.y -= decremento;
  }
}
