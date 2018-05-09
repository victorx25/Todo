package Ejercicios2_3;

/**
 * Multiplo1
 * Programa que muestra por pantalla los multiplos de un numero hasta un tope estimado
 * @author dam17-18 VMM
 */
import java.util.Scanner;

public class Multiplo1 {

	 public static void mostrarMultiplos1() {
			// Declaracion de variables
			Scanner teclado = new Scanner(System.in);
			final int TOPE = 16  ; 				// Constante, el maximo valor del multiplo
			int mult  ;							// Almacena el multiplo calculado
			int cont  ;							// Contador utilizado en el calculo

			// Inicializa las variables
			mult = 0 ;
			cont = 0 ;

			System.out.println("\t Múltiplos de 2\n");
			while (mult < TOPE)					// Bucle de calculo y visualizacion
			{
				mult = cont * 2;
				System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
				++cont;	
			}
			teclado.close();	
}
	 public static void main(String argumentos[]) {
	 mostrarMultiplos1();
}
}
