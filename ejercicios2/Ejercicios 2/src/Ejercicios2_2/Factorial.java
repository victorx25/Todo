package Ejercicios2_2;

import java.util.Scanner;

/**
 * Factorial.java
 *Programa que realiza el factorial del numero que se introduzca por teclado
 *@author dam17-18 VMM
 */
public class Factorial
{
	public static void main(String argumentos[])
	{
		Scanner teclado = new Scanner(System.in);
		int num0;
		int num;
		int factorial = 1;
		System.out.println("dime un numero: ");
		num = teclado.nextInt();
		num0 = num;
		//condicion del tipo while la cual mientras se cumpla un tipo de condicion
		//realizara la operacion matematica y resta uno a la variable "num"
		while ((num != 0)) {
			
			factorial= factorial * num;
			num--;	
		}
		System.out.println("El factorial de " + num0 + " es: " + factorial);

	}
}