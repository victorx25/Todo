package Ejercicios2_3;

/**
 * Multiplo2.java
 * Escribe en pantalla los multiplos de 2 por debajo de un TOPE, 16.
 * @author dam17-18 VMM 
 */
import java.util.Scanner;
public class Multiplo2 	{

	 public static void mostrarMultiplos2(int tope) {
		// Declaración de variables
				 				
					int mult  ;							// Almacena el multiplo calculado
					int cont  ;							// Contador utilizado en el cálculo

					// Inicializa las variables
					mult = 0 ;
					cont = 0 ;
					
					
					System.out.println("\t Multiplos de 2\n");
					while (mult < tope)					// Bucle de cálculo y visualización
					{
						mult = cont * 2;
						System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
						++cont;	
					}	
					}
	public static void main(String argumentos[]) {

		mostrarMultiplos2(30);
		
	}
}