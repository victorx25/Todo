package Ejercicios2_2;

import java.util.Scanner;

/**
 * Capital.java
 *Programa el cual realiza una operacion matematica de elevar un numero a otro
 *@author dam17-18 VMM
 */

public class Capital
{
	public static void main(String argumentos[])
	{
		Scanner teclado = new Scanner(System.in);
	
		double Ci;
		double r;
		double n;
		
		System.out.println("dime el capital inical: ");
		Ci = teclado.nextInt();
		System.out.println("dime el interes anual: ");
		r = teclado.nextInt();
		System.out.println("dime los anios: ");
		n = teclado.nextInt();
		
		//realiza una operacion matematica, la cual corresponde a elevar un numero a otro
		//y la muestra por pantalla con un texto
		double num = Math.pow(1+r, n);
		System.out.println("El capital final es de " + Ci*num);
		
	}
}