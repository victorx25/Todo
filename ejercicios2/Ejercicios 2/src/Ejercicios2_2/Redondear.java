package Ejercicios2_2;

import java.util.Scanner;

/**
 * Redondear.java
 *Programa que redondea cualquier numero introducido con decimales a la cantidad deseada de ellos
 *@author dam17-18 VMM
 */
public class Redondear
{
	public static void main(String argumentos[])
	{
		Scanner teclado = new Scanner(System.in);
		Scanner teclado1 = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);

		String s;
		double num;
		int digitos;
		 //condicion do-while que sirve para introducir los valores deseados
		 //y realizar las operaciones necesarias
		do {
			System.out.println("Dime un numero con decimales: ");
			num = teclado.nextDouble();
			System.out.println("Dime cuantos digitos quieres redondear: ");
			digitos = teclado1.nextInt();
			//operacion matematica de elevar un numero a otro
			int cifras =(int) Math.pow(10,digitos);
			//operacion matematica la cual sirve para redondear un numero con decimales
			double resultado = Math.rint(num * cifras)/cifras;
			System.out.println("El numero redondeado es: " + resultado);
			System.out.println("quieres continuar? s/n : ");
			s = teclado2.nextLine();
			
		} while (s.equals("s") );
	System.out.println("ya hemos terminado de redondear");
	}
}