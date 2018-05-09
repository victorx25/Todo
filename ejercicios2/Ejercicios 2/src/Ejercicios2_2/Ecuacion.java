package Ejercicios2_2;

import java.util.Scanner;

/**
 * Ecuacion.java
 *Programa el cual realiza una operacion matematica, una ecuacion
 *@author dam17-18 VMM
 */
public class Ecuacion
{
	public static void main(String argumentos[])
	{
		Scanner teclado = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double d;
		double X1 = 0;
		double X2 = 0;
		
		//pide los diferentes valores necesarios y realiza unas operaciones necesarias 
		//dandole valores a unos de ellos
		System.out.println("Dime el valor para a: ");
		a = teclado.nextDouble();
		System.out.println("Dime el valor para b: ");
		b = teclado.nextDouble();
		System.out.println("Dime el valor para c: ");
		c = teclado.nextDouble();
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
}

		