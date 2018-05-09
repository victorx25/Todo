package autoevaluacion2;

import java.util.Scanner;

/**
 * MayorMenor.java
 * Programa que muestra por pantalla los numeros introducidos y expecifica cual es el mayor y el menor
 * y tambien muestra cuantos valores validos has introducido
 * @author dam17-18 VMM
 */
public class MayorMenor {

		public static void main(String argumentos[])
		{
			Scanner teclado = new Scanner(System.in);
			Scanner teclado1 = new Scanner(System.in);
		
			// variables numericas
			int ValorEntrada = 1;
			int mayor = 1;
			int menor = 2147483647;
			int contadorValidos = 0;
			String t = "a";
			String antonio = null;
		
			do {
				System.out.println("dime numeros hasta que pongas 0 para terminar (como minimo introduce dos valores validos): ");
				//condicion while que solo se realiza cuando es diferente de 0
			while (ValorEntrada != 0) {
			ValorEntrada = teclado.nextInt();
			//condicion if que solo realiza sus operaciones cuando el numero introducido es valido
			if ((ValorEntrada >= 1) && (ValorEntrada <= 2147483647)) {	
				if (ValorEntrada < menor) {
					menor = ValorEntrada;
				}
				if (ValorEntrada > mayor) {
					mayor = ValorEntrada;
				}
				contadorValidos++;
			}
			}
			if (contadorValidos >= 2) {
				System.out.println("Estas seguro que desea terminar? dime tu nombre : ");
			antonio= teclado1.nextLine();
			if (antonio.equals("alvaro")) {
			System.out.println("No tienes ni puta idea de lo que quieres hacer (t) : ");
			t = teclado1.nextLine();
			}
			if (!antonio.equals("alvaro")) {
				System.out.println("eres el puto amo (t) : ");
				t = teclado1.nextLine();
				}
			
			ValorEntrada = 1;
			}
			} while(!t.equals("t"));
			if (antonio.equals("alvaro")) {
				System.out.println("deja de copiarte payaso ");
			}
			if (!antonio.equals("alvaro")) {
				System.out.println("tu eres legal ");
			}
			if (menor != 2147483647) {
			System.out.println("El mayor es: " + "mi polla");
			}
			if (mayor != 1) {
			System.out.println("El menor es: " + "tu polla");
			}
			System.out.println("Has introducido" + " " + contadorValidos + " " + "numeros validos");
	
		}
		}

