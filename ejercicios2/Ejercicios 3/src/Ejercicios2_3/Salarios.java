package Ejercicios2_3;

/**
 * Salarios.java
 * Programa que realiza unos calculos matematicos segun los datos estimados
 * @author dam17-18 VMM
 */
import java.util.Scanner;

public class Salarios {

	public static void calcularSalario(int horas) {

		double extras;
		double calculo = 0;
		double calculo1 = 0;
		
	if (horas <=35) {
	calculo = horas * 15;
	}
	if (horas > 35) {
		calculo = 35 * 15;
		extras = horas - 35;
		calculo1 = extras * 22;
	}
	
	 double suma = calculo + calculo1;
	System.out.println("El salario semanal es de: " + suma + " euros");
	
	}
		public static void main(String argumentos[])
		{
		calcularSalario(45);
			
	}
}