/*Programa que Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
do-while.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
public class Ejercicio6{
  public static void main (String[] args){
	
	int numero= 320;
	
	do{
		System.out.println(numero);
		numero-=20;
	} while (numero>=160);
}
}
