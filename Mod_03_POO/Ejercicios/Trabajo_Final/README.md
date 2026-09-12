# Sistema de Gestión Aeroportuaria — Proyecto Final Java

**Integrantes:** Sebastian Hernandez y Juan Esteban Ciro

**Materia:** Programación orientada a objetos — Técnica laboral (UPB Medellín)

## Qué hace el programa

Simula una compañía de gestión aeroportuaria: administra aeropuertos, las compañías
aéreas que operan en cada uno, los vuelos que ofrecen y los pasajeros que han
reservado asiento. Funciona por consola, con un menú de cinco consultas que se repite
hasta que el usuario elige salir.

Los datos viven en memoria mientras el programa está abierto — no se usa base de
datos ni archivos. Al arrancar, el programa carga datos de prueba (aeropuertos,
compañías, vuelos y pasajeros) desde el método `cargarDatos()`, para que el menú
tenga algo con qué responder desde el primer momento.

## Estructura de clases

- **Pasajero** — nombre, número de pasaporte, nacionalidad.
- **Vuelo** — identificador, origen, destino, precio, cupo máximo, lista de `Pasajero`.
- **Compania** — nombre, lista de `Vuelo`.
- **Aeropuerto** (clase padre, abstracta) — nombre, ciudad, país, lista de `Compania`.
- **AeropuertoPublico** (hija) — lo del padre + cuantía de la subvención del gobierno.
- **AeropuertoPrivado** (hija) — lo del padre + lista de empresas patrocinadoras.
- **Principal** — contiene el `main`, la lista de aeropuertos y el menú.
- **Utilidades** — método `imprimirEncabezado()`, usado por cada opción del menú.

`AeropuertoPublico` y `AeropuertoPrivado` heredan de `Aeropuerto` y redefinen el
método abstracto `informacionDeFinanciacion()`, cada una a su manera — así la
opción 2 del menú no pregunta de qué tipo es el aeropuerto, solo llama al método.

## Cómo compilar y correr

Desde la raíz del repo:

```bash
javac -d bin src/aeropuerto/*.java
java -cp bin aeropuerto.Principal
```

Esto compila todos los `.java` del paquete `aeropuerto` hacia la carpeta `bin/`
(ignorada por git) y ejecuta el programa desde ahí. También se puede correr
directamente con el botón "Run" de VS Code sobre `Principal.java`, una vez la
extensión de Java detecte el proyecto.

## Menú

| Opción | Qué hace |
| --- | --- |
| 1 | Consultar los aeropuertos gestionados (públicos y privados por separado) |
| 2 | Ver la financiación de un aeropuerto (subvención o patrocinadores según el tipo) |
| 3 | Ver las compañías que operan en un aeropuerto |
| 4 | Ver los vuelos de una compañía en un aeropuerto |
| 5 | Buscar vuelos entre dos ciudades |
| 0 | Salir |

## Estado del proyecto

- [x] Fase 1 — Pasajero y Vuelo
- [x] Fase 2 — Compania y Aeropuerto
- [x] Fase 3 — Herencia (AeropuertoPublico / AeropuertoPrivado)
- [x] Fase 4 — Datos de prueba (`cargarDatos()`)
- [ ] Fase 5 — Menú (`Principal`)
- [ ] Fase 6 — Pruebas y evidencias
