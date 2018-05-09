package Ejercicios2_2;

import java.util.Scanner;

/**
 * TresNumeros.java
 * Programa que pide tres numeros y los ordena de mayor a menor
 * @author dam17-18 VMM
 */
public class TresNumeros
{
	public static void main(String argumentos[])
	{
		Scanner teclado = new Scanner(System.in);
	
		// variables numericas
		int num1;
		int num2;
		int num3;
		
		//pregunta que numeros quieres insertar
		System.out.println("dime el primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("dime el segundo numero: ");
		num2 = teclado.nextInt();
		System.out.println("dime el tercer numero: ");
		num3 = teclado.nextInt();
		
		//muestra un texto segun la condicion que se cumpla
		{
		if((num1 > num2) && (num1 > num3) && (num2 > num3))
		System.out.println(num1 + " " + num2 + " " + num3);
		
		if((num1 > num2) && (num1 > num3) && (num3 > num2))
		System.out.println(num1 + " " + num3 + " " + num2);
		
		if((num2 > num1) && (num2 > num3) && (num1 > num3))
		System.out.println(num2 + " " + num1 + " " + num3);
		
		if((num2 > num1) && (num2 > num3) && (num3 > num1))
		System.out.println(num2 + " " + num3 + " " + num1);
		
		if((num3 > num1) && (num3 > num2) && (num2 > num1))
		System.out.println(num3 + " " + num2 + " " + num1);
		
		if((num3 > num1) && (num3 > num2) && (num1 > num2))
		System.out.println(num3 + " " + num1 + " " + num2);
		}	
	}
}