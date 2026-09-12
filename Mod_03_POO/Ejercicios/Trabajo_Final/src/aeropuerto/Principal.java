package aeropuerto;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

  // La lista que arma Utilidades.cargarDatos() se guarda aquí una sola vez,
  // al arrancar, para que todas las opciones del switch la puedan usar.
  // static porque main() es static y nunca creamos un new Principal(); todo vive
  // a nivel de la clase, no de un objeto.
  private static ArrayList<Aeropuerto> aeropuertos;
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    aeropuertos = Utilidades.cargarDatos();
    String op; // String, no int: así una letra no revienta el programa, solo cae al default
    while (true) {
      Utilidades.cambiarPagina(); // pantalla limpia + encabezado antes de mostrar el menú
      mostrarMenu();
      op = sc.nextLine().trim();
      Utilidades.cambiarPagina(); // se limpia otra vez para que el resultado no quede pegado al
                                  // menú
      switch (op) {
        case "1":
          imprimirTitulo("AEROPUERTOS GESTIONADOS");
          consultarAeropuertos();
          break;
        case "2":
          imprimirTitulo("FINANCIACIÓN DE UN AEROPUERTO");
          verFinanciacion();
          break;
        case "3":
          imprimirTitulo("COMPAÑÍAS DE UN AEROPUERTO");
          verCompaniasDeAeropuerto();
          break;
        case "4":
          imprimirTitulo("VUELOS DE UNA COMPAÑÍA");
          verVuelosDeCompania();
          break;
        case "5":
          imprimirTitulo("VUELOS ENTRE DOS CIUDADES");
          buscarVuelosEntreCiudades();
          break;
        case "0":
          System.out.println("Saliendo...");
          sc.close(); // solo aquí, una vez: cerrarlo antes cortaría la lectura en la siguiente
                      // vuelta
          return;
        default:
          System.out.println("=====================================");
          System.out.println("Opción no válida. Intente de nuevo.");
          System.out.println("=====================================");
      }

      System.out.println();
      System.out.println("Presione Enter para continuar...");
      sc.nextLine();
    }
  }

  public static void mostrarMenu() {
    System.out.println("1. Consultar Aeropuertos");
    System.out.println("2. Financiación de Aeropuertos");
    System.out.println("3. Compañías de los Aeropuertos");
    System.out.println("4. Vuelos de la Compañía");
    System.out.println("5. Buscar Vuelos");
    System.out.println("0. Salir");
    System.out.print("Ingrese una opción: ");
  }

  private static void imprimirTitulo(String titulo) {
    System.out.println();
    System.out.println(">>> " + titulo + " <<<");
    System.out.println("-------------------------------------");
  }

  // ---------------------------------------------------------------------
  // Opción 1: públicos y privados por separado. Nombre, ciudad y país.
  // ---------------------------------------------------------------------
  private static void consultarAeropuertos() {
    // instanceof aquí SÍ está bien: solo separa en dos grupos para imprimir, no decide
    // comportamiento distinto (eso es lo que hace mal usar instanceof). Comparar con
    // verFinanciacion() de abajo, que es el caso real de polimorfismo.
    System.out.println("--- Aeropuertos públicos ---");
    for (Aeropuerto a : aeropuertos) {
      if (a instanceof AeropuertoPublico) {
        System.out.println(a); // usa Aeropuerto.toString()
      }
    }

    System.out.println("--- Aeropuertos privados ---");
    for (Aeropuerto a : aeropuertos) {
      if (a instanceof AeropuertoPrivado) {
        System.out.println(a); // usa Aeropuerto.toString()
      }
    }
  }

  // ---------------------------------------------------------------------
  // Opción 2: LA CLAVE DEL PROYECTO. Sin instanceof: el método abstracto
  // informacionDeFinanciacion() responde distinto según la subclase real.
  // ---------------------------------------------------------------------
  private static void verFinanciacion() {
    System.out.print("Nombre del aeropuerto (nombre completo e igual): ");
    String nombre = sc.nextLine();

    Aeropuerto encontrado = buscarAeropuertoPorNombre(nombre); // busca en la lista
    if (encontrado == null) {
      System.out.println("No se encontró un aeropuerto con ese nombre.");
      return; // corta aquí, no sigue
    }

    System.out.println(encontrado.informacionDeFinanciacion()); // cada subclase responde distinto
  }

  // ---------------------------------------------------------------------
  // Opción 3: compañías que operan en un aeropuerto.
  // ---------------------------------------------------------------------
  private static void verCompaniasDeAeropuerto() {
    System.out.print("Nombre del aeropuerto (nombre completo e igual): ");
    String nombre = sc.nextLine();

    Aeropuerto encontrado = buscarAeropuertoPorNombre(nombre); // paso 1: buscar el aeropuerto
    if (encontrado == null) {
      System.out.println("No se encontró un aeropuerto con ese nombre.");
      return;
    }

    if (encontrado.getCompanias().isEmpty()) { // aeropuerto existe pero sin companias
      System.out.println("Este aeropuerto no tiene compañías registradas.");
      return;
    }

    for (Compania c : encontrado.getCompanias()) { // paso 2: recorrer sus companias
      System.out.println(c); // usa Compania.toString()
    }
  }

  // ---------------------------------------------------------------------
  // Opción 4: vuelos de una compañía puntual en un aeropuerto puntual.
  // ---------------------------------------------------------------------
  private static void verVuelosDeCompania() {
    System.out.print("Nombre del aeropuerto (nombre completo e igual): ");
    String nombreAeropuerto = sc.nextLine();

    Aeropuerto encontrado = buscarAeropuertoPorNombre(nombreAeropuerto); // paso 1: el aeropuerto
    if (encontrado == null) {
      System.out.println("No se encontró un aeropuerto con ese nombre.");
      return;
    }

    System.out.print("Nombre de la compañía: ");
    String nombreCompania = sc.nextLine();

    Compania encontrada = null;
    for (Compania c : encontrado.getCompanias()) { // paso 2: buscar SOLO entre las companias de ESE
                                                   // aeropuerto
      if (c.getNombre().equalsIgnoreCase(nombreCompania)) {
        encontrada = c;
        break; // ya la encontró, no sigue buscando
      }
    }

    if (encontrada == null) { // existe la compania, pero no en este aeropuerto
      System.out.println("Esa compañía no opera en ese aeropuerto.");
      return;
    }

    if (encontrada.getVuelos().isEmpty()) {
      System.out.println("Esa compañía no tiene vuelos registrados.");
      return;
    }

    for (Vuelo v : encontrada.getVuelos()) { // paso 3: sus vuelos
      System.out.println(v); // usa Vuelo.toString()
    }
  }

  // ---------------------------------------------------------------------
  // Opción 5: buscar por ruta en TODOS los aeropuertos, sin repetir un
  // mismo vuelo si su compañía opera en más de un aeropuerto (Avianca en
  // este caso, ver Utilidades.cargarDatos()).
  // ---------------------------------------------------------------------
  private static void buscarVuelosEntreCiudades() {
    System.out.print("Ciudad de origen: ");
    String origen = sc.nextLine();
    System.out.print("Ciudad de destino: ");
    String destino = sc.nextLine();

    // yaMostrados.contains(v) funciona sin que Vuelo tenga equals() propio, porque son
    // literalmente el mismo objeto en memoria (Avianca comparte sus vuelos entre dos
    // aeropuertos, ver Utilidades.cargarDatos()) — no dos copias con los mismos datos.
    ArrayList<Vuelo> yaMostrados = new ArrayList<>(); // para no repetir el mismo vuelo
    boolean encontroAlguno = false;

    for (Aeropuerto a : aeropuertos) { // recorre cada aeropuerto...
      for (Compania c : a.getCompanias()) { // ...cada compania de ese aeropuerto...
        for (Vuelo v : c.getVuelos()) { // ...cada vuelo de esa compania
          boolean coincideRuta = v.getCiudadOrigen().equalsIgnoreCase(origen)
              && v.getCiudadDestino().equalsIgnoreCase(destino);

          if (coincideRuta && !yaMostrados.contains(v)) { // coincide y no se mostró antes
            System.out.println(v); // usa Vuelo.toString()
            yaMostrados.add(v); // marcarlo como ya mostrado
            encontroAlguno = true;
          }
        }
      }
    }

    if (!encontroAlguno) { // ningun vuelo cumplio la condicion
      System.out.println("No se encontraron vuelos para esa ruta.");
    }
  }

  // Método de apoyo reutilizado por las opciones 2, 3 y 4.
  private static Aeropuerto buscarAeropuertoPorNombre(String nombre) {
    for (Aeropuerto a : aeropuertos) {
      if (a.getNombre().equalsIgnoreCase(nombre)) {
        return a;
      }
    }
    return null;
  }
}
