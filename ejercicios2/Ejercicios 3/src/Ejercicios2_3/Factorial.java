package Ejercicios2_3;

/**
 * Factorial.java
 * Programa que calcula el factorial del numero introducido
 * @author dam17-18 VMM
 */
import java.util.Scanner;

public class Factorial {
	

	public static void factorial(int num) {
	
		
		int num0;
		int factorial = 1;
		
		num0 = num;
		//condicion del tipo while la cual mientras se cumpla un tipo de condicion
		//realizara la operacion matematica y resta uno a la variable "num"
		while ((num != 0)) {
			
			factorial= factorial * num;
			num--;	
		}
		System.out.println("El factorial de " + num0 + " es: " + factorial);
	}
	
	public static void main(String argumentos[]){
		
	factorial(5);
	
	}
}
