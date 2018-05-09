package Ejercicios2_3;

/**
 * Ecuacion.java
 * Programa que realiza una ecuacion matematica y muestra los resultados segun los datos introducidos
 * @author dam17-18 VMM
 */
import java.util.Scanner;

public class Ecuacion {
	public static void evaluarDiscriminante(double a, double b, double c)
	{
		
		double d;
		double X1 = 0;
		double X2 = 0;
		
		//pide los diferentes valores necesarios y realiza unas operaciones necesarias 
		//dandole valores a unos de ellos
		
		int elevado = (int) Math.pow(b,2);
		d = (elevado - 4*a*c);
		
		//condiciones del tipo if las cuales si se cumplen o no relizan diferentes operacione
		//y muestra diferentes textos por pantalla
		if ((a == 0) && (b != 0)) {
		X1= -c / b;
		System.out.println("La ecuacion es: " + X1);
		}
		
		if ((a != 0) && (b != 0)) { 
		X1 = (((-b) + (Math.sqrt(d))) / (2*a));
		X2 = (((-b) - (Math.sqrt(d))) / (2*a));
		System.out.println("Los resultados de las ecuaciones serian: " + X1 + " y " + X2);
		}
		
		if ((a == 0) && (b == 0)) {
		System.out.println("La ecuacion es degenerada");
		}
		
		if ((d >= 0) &&  (a != 0) && (b != 0)){System.out.println("hay dos raices reales");
		}
		
		if ((d < 0) &&  (a != 0) && (b != 0)) {System.out.println("hay dos raices complejas de la forma: x + yi y x - yi");
		}
	}
		public static void main(String argumentos[])
		{
			evaluarDiscriminante(1,1,0);
		}
	}
