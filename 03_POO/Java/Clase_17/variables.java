package Tecnica.POO_modulo_2.Java.Clase_13;

public class variables {
  /*
   * =========================================================================
   *                  TIPOS PRIMITIVOS EN JAVA
   * Estructura, Tamaños (Bytes/Bits), Rangos y Ejemplos Prácticos
   * =========================================================================
   */

  // =========================================================================
  // 1. TIPOS ENTEROS
  // =========================================================================

  // --- byte ---
  // Memoria: 1 Byte o 8 bits.
  // Rango exacto: -128 a 127.
  byte miByte = 125;

  // --- short ---
  // Memoria: 2 Bytes o 16 bits.
  // Rango exacto: -32,768 a 32,767.
  short miShort = 30000;

  // --- char ---
  // Memoria: 2 Bytes o 16 bits.
  // Nota: Se clasifica como entero porque usa códigos numéricos Unicode de fondo.
  // Requisito: Siempre se escribe encerrado entre comillas simples (' ').
  char miLetra = 'J';

  // --- int ---
  // Memoria: 4 Bytes o 32 bits.
  // Rango exacto: -2,147,483,648 a 2,147,483,647.
  int miInt = 2147483;

  // --- long ---
  // Memoria: 8 Bytes o 64 bits.
  // Rango exacto: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.
  // Práctica: Se le añade una 'L' al final si el número es muy grande.
  long miLong = 922337203685477580L;

  // =========================================================================
  // 2. TIPOS FLOTANTES / DECIMALES
  // =========================================================================

  // --- float ---
  // Memoria: 4 Bytes o 32 bits.
  // Rango aproximado: 1.4e-045 a 3.4e+038.
  // REGLA DE ORO (*anexar la f*): Obligatorio poner la 'f' al final del número.
  float pi = 3.1415926535f;

  // --- double ---
  // Memoria: 8 Bytes o 64 bits.
  // Rango aproximado: 4.9e-324 a 1.8e+308.
  // Nota: Es el tipo decimal por defecto y posee mucha mayor precisión que float.
  double e = 2.718281828459045235360;

  // =========================================================================
  // 3. TIPO BOOLEAN / LÓGICOS
  // =========================================================================

  // --- boolean ---
  // Capacidad: Solo almacena estados lógicos: 'true' (verdadero) o 'false'
  // (falso).
  // REGLA DE ORO (*valor por default*): Si no se inicializa, su valor por defecto
  // es false.
  boolean examenAprobado = true;

}
