package Ejercicios2_3;

/**
 * Cadrado.java
 * Programa que muestra un cuadrado formado por carcteres y un tamaño que se le determine
 * @author dam17-18 VMM
 */
public class Cuadrado {

		public static void muestraCuadrado(int medida, char caracter)
		{
			
			int x;
			int y;
			
			//condicion for con la cual "x" comienza desde 1, y mientras sea <= que la variable medida
			//ira sumando uno a "x" y realiza saltos de linea
			for (x = 1; x <= medida; x++) { 
				System.out.println("");
			//condicion for con la cual "y" comienza desde 1, y mientras sea <= que la variable medida
			//ira sumando uno a "y"
			for (y = 1; y <= medida; y++) {
			//condicion if que si se cumple va insertando "*"
			if (x == 1 || y == 1) System.out.print(" " + caracter);
			//condicion else if que si se cumple introduce "*", y sino inserta barra de espacio
			else if ((x == medida) || (y == medida)) 
						System.out.print(" " + caracter);
			else System.out.print("  ");		
				
				}
			}
		}
		public static void main(String argumentos[])
		{
			muestraCuadrado(5, 'a');
	}
}
