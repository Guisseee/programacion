/* Programa que vaya generando números aleatorios pares
 * entre 0 y 100 y que no termine hasta que no saque el número 24.
 * Autor: Guillermo Jauregui Lahoz
 */
public class Ejercicio9 {
  public static void main(String[] args) {
    int n = 0;
    int cuentaNumeros = 0;
    
    while (n != 24) {
      n = (int)(Math.random() * 51) * 2;
      System.out.print(n + " ");
      cuentaNumeros++;
    }
    System.out.println("\nSe han generado " + cuentaNumeros + " números.");
  }
}
