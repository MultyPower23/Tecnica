package Mod_03_POO.Java.Ejercicios;

import javax.swing.JOptionPane;

public class clase_21 {
  public static void main(String[] args) {
    // === Moto ===
    Moto moto1 = new Moto();
    moto1.creacion();
    moto1.prender(true);
    moto1.acelerar((short) 50);
    moto1.acelerar((short) 120);
    moto1.frenar((short) 20);
    moto1.frenar((short) 100);
    moto1.apagar(true);

    // === Mouse ===
    Mouse mouse1 = new Mouse();
    mouse1.creacion();
    mouse1.encender();
    mouse1.clickIzquierdo();
    mouse1.clickDerecho();
    mouse1.apagar();

    // === Farmaco ===
    Farmaco farmaco1 = new Farmaco();
    farmaco1.creacion();
    farmaco1.mostrar();
    farmaco1.vender(5);
    farmaco1.comprar(10);
  }

  public static class Moto {
    boolean motorPrendido = false;
    String marca, modelo;
    short velMax, velActual;

    public void creacion() {
      modelo = JOptionPane.showInputDialog("Ingrese el modelo de la moto: ");
      marca = JOptionPane.showInputDialog("Ingrese la marca de la moto: ");
      velMax = Short.parseShort(JOptionPane.showInputDialog("Ingrese la velocidad maxima de la moto: "));
    }

    public void mostrar() {
      if (modelo == null || marca == null || velMax == 0) {
        System.out.println("La moto no ha sido creada, ejecutando fabricación...");
        creacion();
      }
      System.out.println("Modelo: " + modelo);
      System.out.println("Marca: " + marca);
      System.out.println("Velocidad maxima: " + velMax);
      System.out.println("Velocidad actual: " + velActual);
      System.out.println("Motor prendido: " + motorPrendido);
    }

    public void prender(boolean prender) {
      if (motorPrendido == false) {
        motorPrendido = true;
        System.out.println("La moto ya arranco");
      } else {
        System.out.println("La moto ya esta prendida");
      }
    }

    public void apagar(boolean apagar) {
      if (motorPrendido == false) {
        motorPrendido = false;
        velActual = 0;
        System.out.println("La moto ya se apago");
      } else {
        System.out.println("La moto ya esta apagada");
      }
    }

    public void acelerar(short velocidad) {
      if (!motorPrendido) {
        System.out.println("La moto esta apagada");
        return;
      }

      if (velActual + velocidad < velMax) {
        System.out.println("Acelerando de " + velActual + "km/h hasta " + (velActual + velocidad) + "km/h");
        velActual = (short) (velActual + velocidad);
      } else {
        velActual = velMax;
        System.out.println("La moto ya esta al limite de velocidad");
      }
    }

    public void frenar(short velocidad) {
      if (!motorPrendido) {
        System.out.println("La moto esta apagada");
        return;
      }

      if (velActual - velocidad > 0) {
        System.out.println("Frenando desde " + velActual + "km/h hasta " + (velActual - velocidad) + "km/h");
        velActual = (short) (velActual - velocidad);
      } else {
        velActual = 0;
        System.out.println("La moto ya esta quieta");
      }
    }
  }

  public static class Mouse {
    int dps;
    String marca, modelo;
    boolean conectado = false, izquierdo = false, derecho = false;

    public void creacion() {
      modelo = JOptionPane.showInputDialog("Ingrese el modelo del mouse: ");
      marca = JOptionPane.showInputDialog("Ingrese la marca del mouse: ");
      dps = Short.parseShort(JOptionPane.showInputDialog("Ingrese la velocidad del dps: "));
    }

    public void mostrar() {
      if (modelo == null || marca == null || dps == 0) {
        System.out.println("El mouse no ha sido creado, ejecutando fabricación...");
        creacion();
      } else {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("DPS: " + dps);
      }
    }

    public void encender() {
      if (!conectado) {
        conectado = true;
        System.out.println("El mouse esta encendido");
      } else {
        System.out.println("El mouse ya esta encendido");
      }
    }

    public void apagar() {
      if (conectado) {
        conectado = false;
        System.out.println("El mouse esta apagado");
      } else {
        System.out.println("El mouse ya esta apagado");
      }
    }

    public void clickIzquierdo() {
      if (conectado) {
        izquierdo = true;
        System.out.println("Click izquierdo realizado");
      } else {
        System.out.println("El mouse esta apagado");
      }
    }

    public void clickDerecho() {
      if (conectado) {
        derecho = true;
        System.out.println("Click derecho realizado");
      } else {
        System.out.println("El mouse esta apagado");
      }
    }
  }

  public static class Farmaco {
    String nombre, laboratorio;
    int cantidad, precio;

    public void creacion() {
      nombre = JOptionPane.showInputDialog("Ingrese el nombre del farmaco: ");
      laboratorio = JOptionPane.showInputDialog("Ingrese el laboratorio del farmaco: ");
      cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del farmaco: "));
      precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del farmaco: "));
    }

    public void mostrar() {
      if (nombre == null || laboratorio == null || cantidad == 0 || precio == 0) {
        System.out.println("El farmaco no ha sido creado, ejecutando fabricación...");
        creacion();
      } else {
        System.out.println("Nombre: " + nombre);
        System.out.println("Laboratorio: " + laboratorio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: " + precio);
      }
    }

    public void vender(int cantidadVendida) {
      if (cantidadVendida <= cantidad) {
        cantidad -= cantidadVendida;
        System.out.println("Se vendieron " + cantidadVendida + " unidades del farmaco " + nombre);
      } else {
        System.out.println("No hay suficiente stock del farmaco " + nombre);
      }
    }

    public void comprar(int cantidadComprada) {
      cantidad += cantidadComprada;
      System.out.println("Se compraron " + cantidadComprada + " unidades del farmaco " + nombre);
    }
  }
}
