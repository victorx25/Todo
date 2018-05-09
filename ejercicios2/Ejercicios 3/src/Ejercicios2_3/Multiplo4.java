package Ejercicios2_3;

/**
 * Multiplo4.java
 * Programa que pide un tope por teclado y muestro los multiplos por pantalla
 * @author dam17-18 VMM 
 */
import java.util.Scanner;

public class Multiplo4 {
	
	public static int pedirTope() {
		
		// Declaracion de variables
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el tope: ");
		int tope = teclado.nextInt();
		return tope;
	}
	
public static void mostrarMultiplos2(int tope) {
		
		// Declaracion de variables
		Scanner teclado = new Scanner(System.in);
		// Constante, el maximo valor del multiplo
		System.out.println("Dime el tope: ");
		
		int mult  ;							// Almacena el multiplo calculado
		int cont  ;							// Contador utilizado en el calculo

		// Inicializa las variables
		mult = 0 ;
		cont = 0 ;

		System.out.println("\t Multiplos de 2\n");
		while (mult < tope)					// Bucle de calculo y visualizacion
		{
			mult = cont * 2;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;	
		}
	}

		 public static void main(String argumentos[]) {
			 mostrarMultiplos2(pedirTope());
		 }
}
