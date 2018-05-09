package Ejercicios2_2;

import java.util.Scanner;

/**
 * SerieNumeros
 * Programa que sirve para recoger numero introducidos por teclado y decir cual de ellos es el mayor
 * @author dam17-18 VMM
 */
public class SerieNumeros
{
	public static void main(String argumentos[])
	{
		Scanner teclado = new Scanner(System.in);
		Scanner teclado1 = new Scanner(System.in);
	
		String s;
		int max;
		int num;
		
		System.out.println("dime el numero: ");
		num = teclado.nextInt(); 
		max = num;
		System.out.println("quieres introducir otro numero? s/n : ");
		s = teclado1.nextLine();
		//condicion while que sirve para saber si quieres continuar introduciendo numero o no
		while (s.equals("s")) {
		System.out.println("dime un numero: ");
		num = teclado.nextInt();
		//condicion if la cual sirve para determinar que numero es el mayor
		if (num > max) max = num;
		System.out.println("quieres introducir otro numero? s/n : ");
		s = teclado1.nextLine();
		}
		
		System.out.println("el numero mayor es : " + max);
	
		
		
	}
}