package Ejercicios2_3;

/**
 * Multiplo3.java
 * Programa que pide un tope por teclado y muestro los multiplos por pantalla
 * @author dam17-18 VMM 
 */
import java.util.Scanner;

public class Multiplo3 {
	Scanner teclado = new Scanner(System.in);
	
	public static void pedirTope() {
		
		// Declaracion de variables
		Scanner teclado = new Scanner(System.in);
		 				// Constante, el maximo valor del multiplo
		System.out.println("Dime el tope: ");
		int TOPE = teclado.nextInt();
		int mult  ;							// Almacena el multiplo calculado
		int cont  ;							// Contador utilizado en el calculo

		// Inicializa las variables
		mult = 0 ;
		cont = 0 ;

		System.out.println("\t Multiplos de 2\n");
		while (mult < TOPE)					// Bucle de calculo y visualizacion
		{
			mult = cont * 2;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;	
		}
	}
		 public static void main(String argumentos[]) {
			 pedirTope();
		 }
}
