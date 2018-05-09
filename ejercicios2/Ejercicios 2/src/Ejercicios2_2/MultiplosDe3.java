package Ejercicios2_2;

import java.util.Scanner;

/**
 * MultiplosDe3.java
 * Programa que sirve para mostrar los multiplos de 3
 * @author dam17-18 VMM
 */
public class MultiplosDe3
{
	public static void main(String argumentos[])
	{
	
	int numero;
	int mostrar; // Muestra que numeros son los multiplos
	
	//condicion for que limita una serie de numeros, donde dentro se encuentra una condicion if
	//con la que muestra solamente por pantalla los numeros multiplos de 3
	for (numero = 1; numero <= 3000; numero++) {
		if (numero % 3 == 0){
			mostrar = numero;
			System.out.println("Multiplos de 3: " + mostrar);
			}
		}	
	}
}