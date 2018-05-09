package Ejercicios2_2;

import java.util.Scanner;

/**
 * Suma.java
 * Programa que que secoge una serie de numeros introducidos por teclado
 * los cuales luego los suma y muestra su suma y la media de todos
 * @author dam17-18 VMM
 */
public class Suma
{
	public static void main(String argumentos[])
	{
		Scanner teclado = new Scanner(System.in);
	
		double suma;
		double num;
		int contador = 0;
		
		System.out.println("dime el numero: ");
		num = teclado.nextInt(); 
		suma = num;
		
		//condicion while que se realiza mientras la variable "num" es distinta de 0
		//en su interior se realiza la suma de los numeros introducidos y la variable "contador"
		//aumenta en uno mientras se cumpla la condicion while
		while (num != 0) {
			System.out.println("dime el numero: ");
			num = teclado.nextInt();
			suma = suma + num;
			contador++;
		}
		
		System.out.println("la suma es: " + suma + " , y la media es : " + suma/contador);
	
			
	}
}