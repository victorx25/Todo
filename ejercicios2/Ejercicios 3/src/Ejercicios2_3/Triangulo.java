package Ejercicios2_3;

/**
 * Triangulo.java
 * Programa que pide las dimensiones de un triangulo y determina de que tipo de triangulo se trata
 * @author dam17-18 VMM
 */
import java.util.Scanner;

public class Triangulo
{
	public static boolean esTriangulo(double a, double b, double c) {
		
		if ((a <= 0) || (b <= 0) || (c <= 0)) {
			return false;
		}
		
		else {
			return true;
		}
	}
	
	public static void tipoTriangulo(double a, double b, double c)
	{
		
		//condiciones del tipo if, else-if y else las cuales muestran diferentes textos
		
		if (!esTriangulo (a,b,c)) {
			System.out.println("ERROR");
		}
		
		else if ((a == b) && (a == c))
		System.out.println("El triangulo es equilatero");
		
		else if  ((a != b) && (a != c)) {
		System.out.println("El triangulo es escaleno");
		}
		else {
			System.out.println("El triangulo es isosceles");
		}
		
	}
	public static void main(String argumentos[])
	{
		tipoTriangulo(3,8,7);
}
}
