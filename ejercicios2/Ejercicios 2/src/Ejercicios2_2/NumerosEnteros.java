package Ejercicios2_2;

import java.util.Scanner;

/**
 * NumerosEnteros.java
 * Programa ejemplo que suma 8 numeros
 * @author dam17-18 VMM
 */

public class NumerosEnteros
{
	public static void main(String argumentos[])
	{
		Scanner teclado = new Scanner(System.in);
		
	int num1;
	int num2;
	int num3;
	int num4;	
	int num5;	
	int num6;	
	int num7;	
	int num8;
	
	System.out.println("Dame el numero 1: ");
num1=teclado.nextInt();
	System.out.println("Dame el numero 2: ");
num2=teclado.nextInt();
	System.out.println("Dame el numero 3: ");
num3=teclado.nextInt();
	System.out.println("Dame el numero 4: ");
num4=teclado.nextInt();
	System.out.println("Dame el numero 5: ");
num5=teclado.nextInt();
	System.out.println("Dame el numero 6: ");
num6=teclado.nextInt();
	System.out.println("Dame el numero 7: ");
num7=teclado.nextInt();
	System.out.println("Dame el numero 8: ");
num8=teclado.nextInt();

//realiza la operacion matematica establecida y muestra por pantalla el resultado de ella
int resultado=num1+num2+num3+num4+num5+num6+num7+num8;

	
System.out.println("resultado "+resultado);
	
	}
}

