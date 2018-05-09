package Ejercicios2_2;

import java.util.Scanner;

/**
 * NumerosPrimos
 * Programa que muestra los numeros primos comprendidos entre dos numeros introducidos por teclado
 * @author dam17-18 VMM
 */
public class NumerosPrimos
{
	public static void main(String argumentos[])
	{
		Scanner teclado = new Scanner(System.in);
	
	int menor;
	int mayor;
	int indice;
	boolean P;
	
		System.out.println("Dime el primer numero: ");
		menor = teclado.nextInt();
		System.out.println("Dime el segundo numero: ");
		mayor = teclado.nextInt();
		
		for (indice = 0; menor <= mayor ; menor++) {
		P = true;
			for (indice = 2; indice < menor; indice++) {
				if (menor % indice == 0) 
					P = false;
			}		
			if (P) System.out.println("Este numero es primo: " + menor);
		} 
	}
}

