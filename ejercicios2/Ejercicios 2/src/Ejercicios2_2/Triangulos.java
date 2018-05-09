package Ejercicios2_2;

import java.util.Scanner;

/**
 * Triangulos.java
 * Programa que pide las dimensiones de un triangulo y determina de que tipo de triangulo se trata
 * @author dam17-18 VMM
 */
public class Triangulos
{
	public static void main(String argumentos[])
	{
		Scanner teclado = new Scanner(System.in);
	
		double a;
		double b;
		double c;
		
		System.out.println("Dime el primer lado del triandulo (a): ");
		a = teclado.nextDouble();
		System.out.println("Dime el segundo lado del triandulo (b): ");
		b = teclado.nextDouble();
		System.out.println("Dime el tercer lado del triandulo (c): ");
		c = teclado.nextDouble();
		
		//condiciones del tipo if, else-if y else las cuales muestran diferentes textos
		{
		if ((a == b) && (a == c))
		System.out.println("El triangulo es equilatero");
		
		else if  ((a != b) && (a != c)) {
		System.out.println("El triangulo es escaleno");
		}
		else {
			System.out.println("El triangulo es isosceles");
		}
		
		}
	}
}
