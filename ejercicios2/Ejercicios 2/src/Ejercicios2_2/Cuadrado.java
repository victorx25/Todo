package Ejercicios2_2;

import java.util.Scanner;

/**
 * Cuadrado.java
 * Programa el cual te pidie las dimensiones de un cuadrado 
 * el cuif (a != 0) || (b != 0) al luego los muestra en pantalla dibujado
 * @author dam17-18 VMM
 */

public class Cuadrado
{
	public static void main(String argumentos[])
	{
		Scanner teclado = new Scanner(System.in);
		
		int medida;
		int x;
		int y;
		System.out.println("Dime las dimensiones del cuadrado que deases: ");
		medida = teclado.nextInt();
		
		//condicion for con la cual "x" comienza desde 1, y mientras sea <= que la variable medida
		//ira sumando uno a "x" y realiza saltos de linea
		for (x = 1; x <= medida; x++) { 
			System.out.println("");
		//condicion for con la cual "y" comienza desde 1, y mientras sea <= que la variable medida
		//ira sumando uno a "y"
		for (y = 1; y <= medida; y++) {
		//condicion if que si se cumple va insertando "*"
		if (x == 1 || y == 1) System.out.print(" *");
		//condicion else if que si se cumple introduce "*", y sino inserta barra de espacio
		else if ((x == medida) || (y == medida)) 
					System.out.print(" *");
		else System.out.print("  ");
				
			
			}
		}
	}
}