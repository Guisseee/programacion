/*Programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    
    System.out.print("Introduzca un número: ");
    int numeroIntroducido = s.nextInt();

    System.out.println("   n  |    n²   |    n³");
    System.out.println("---------------------------");
    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
      System.out.printf("%5d |%8d |%9d\n", i, i * i, i * i * i);
    }
  }
}
