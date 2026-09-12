package aeropuerto;

import java.util.ArrayList;

/*
 * Clase de utilidades generales para el programa. Solo guarda metodos recurrentes que se usan en
 * varias partes del programa, como imprimir el encabezado con los nombres de los integrantes del
 * equipo.
 */

public class Utilidades {

  // Imprime el encabezado con los nombres de los dos integrantes del equipo.
  public static void imprimirEncabezado() {
    System.out.println("========================================");
    System.out.println("Sistema de Gestion Aeroportuaria");
    System.out.println("Integrantes: Sebastian Hernandez y Juan Esteban Ciro");
    System.out.println("========================================");
  }

  // Limpia la consola. El comando real depende del sistema operativo (cls en Windows,
  // clear en Linux/Mac), por eso se detecta con os.name antes de decidir cuál correr.
  // Si por algún motivo falla (ej. corriendo dentro de un IDE que no lo soporta bien),
  // no truena el programa, simplemente no se limpia.
  public static void limpiarConsola() {
    try {
      if (System.getProperty("os.name").toLowerCase().contains("windows")) {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      } else {
        new ProcessBuilder("clear").inheritIO().start().waitFor();
      }
    } catch (Exception e) {
      // No es crítico si no se pudo limpiar, el programa sigue funcionando igual.
    }
  }

  // Atajo para no repetir estas dos líneas en cada opción del menú.
  public static void cambiarPagina() {
    limpiarConsola();
    imprimirEncabezado();
  }

  // arma una lista con los datos minimos solicitados de aeropuertos con sus respectivas compañías,
  // vuelos y pasajeros para usarla en el programa
  public static ArrayList<Aeropuerto> cargarDatos() {
    // --- Pasajeros (5) ---
    Pasajero p1 = new Pasajero("Sebastian Hernandez", "AB123456", "Colombia");
    Pasajero p2 = new Pasajero("Juan Esteban Ciro", "CD987654", "Colombia");
    Pasajero p3 = new Pasajero("Simón Camilo", "EF112233", "Venezuela");
    Pasajero p4 = new Pasajero("Santiago Gomez", "GH445566", "Colombia");
    Pasajero p5 = new Pasajero("Cristobal Toro", "IJ778899", "Canada");

    // --- Vuelos (6), repartidos entre las 3 compañías ---
    Vuelo av205 = new Vuelo("AV205", "Medellin", "Bogota", 250000.0, 2);
    av205.reservarAsiento(p1);
    av205.reservarAsiento(p2);

    Vuelo av310 = new Vuelo("AV310", "Bogota", "Cartagena", 320000.0, 4);

    Vuelo la100 = new Vuelo("LA100", "Bogota", "Cali", 210000.0, 3);
    la100.reservarAsiento(p3);
    la100.reservarAsiento(p4);

    Vuelo la150 = new Vuelo("LA150", "Bogota", "Miami", 950000.0, 3);

    Vuelo p5200 = new Vuelo("P5200", "Barranquilla", "Bogota", 180000.0, 5);
    p5200.reservarAsiento(p5);

    Vuelo p5210 = new Vuelo("P5210", "Barranquilla", "Cartagena", 150000.0, 2);

    // --- Compañías (3) ---
    Compania avianca = new Compania("Avianca");
    avianca.agregarVuelo(av205);
    avianca.agregarVuelo(av310);

    Compania latam = new Compania("Latam");
    latam.agregarVuelo(la100);
    latam.agregarVuelo(la150);

    Compania wingo = new Compania("Wingo");
    wingo.agregarVuelo(p5200);
    wingo.agregarVuelo(p5210);

    // --- Aeropuertos (3: 2 públicos, 1 privado) ---
    Aeropuerto jmc = new AeropuertoPublico("Jose Maria Cordova", "Rionegro", "Colombia", 8000000.0);
    jmc.agregarCompania(avianca);

    // Avianca también opera en El Dorado: la misma compañía, el mismo objeto, agregado a dos
    // aeropuertos distintos
    Aeropuerto elDorado = new AeropuertoPrivado("El Dorado Internacional", "Bogota", "Colombia");
    elDorado.agregarCompania(avianca);
    elDorado.agregarCompania(latam);
    // Cast obligatorio: elDorado es de tipo Aeropuerto, y agregarPatrocinador() solo
    // existe en AeropuertoPrivado, no en el padre.
    ((AeropuertoPrivado) elDorado).agregarPatrocinador("Grupo Bolivar");
    ((AeropuertoPrivado) elDorado).agregarPatrocinador("Corficolombiana");

    Aeropuerto cortissoz =
        new AeropuertoPublico("Ernesto Cortissoz", "Barranquilla", "Colombia", 3000000.0);
    cortissoz.agregarCompania(wingo);

    ArrayList<Aeropuerto> aeropuertos = new ArrayList<>();
    aeropuertos.add(jmc);
    aeropuertos.add(elDorado);
    aeropuertos.add(cortissoz);

    return aeropuertos;
  }
}
