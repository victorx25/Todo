package Ejercicios2_2;

import java.util.Scanner;

/**
 * Operaciones.java
 * Programa que pregunta que tipo de operacion quieres realizar 
 * y las realiza con datos introducidos por teclado
 * @author dam17-18 VMM
 */
public class Operaciones
{
	public static void main(String argumentos[])
	{
		Scanner teclado = new Scanner(System.in);
		Scanner teclado1 = new Scanner(System.in);
		String SN;
		String M;
		double num;
		double num1;
		double suma = 0;
		double resta = 0;
		double multiplicar = 1;
		double division = 1;
	
		
		System.out.println("Que desea realizar? sumar (s), restar (r), multiplicar (m), dividir (d) o terminar (t): ");
		M = teclado.nextLine();
		
		do {
			while (!M.contentEquals("s") && !M.contentEquals("r") && !M.contentEquals("m") && !M.contentEquals("d") && !M.contentEquals("t"))  {
				System.out.println("Ese comando no existe");
				System.out.println("Que desea realizar? sumar (s), restar (r), multiplicar (m), dividir (d) o terminar (t): ");
				M = teclado.nextLine();	
			}
			while (M.equals("s")) {
			System.out.println("dime un numero: ");
			num = teclado1.nextDouble();
			System.out.println("dime otro numero: ");
			num1 = teclado1.nextDouble();
			suma = num + num1;
			System.out.println("El resultado es: " + suma + " , " + "Quieres continuar introduciendo numeros? s/n: ");
			SN = teclado.nextLine();
			while (SN.equals("s")) {
			System.out.println("dime otro numero: ");
			num = teclado1.nextDouble();
			suma = suma + num;
			System.out.println("El resultado es: " + suma + " , " + "Quieres continuar introduciendo numeros? s/n: ");
			SN = teclado.nextLine();
			}
			System.out.println("Que desea realizar? sumar (s), restar (r), multiplicar (m), dividir (d) o terminar (t): ");
			M = teclado.nextLine();
			}
				
			while (M.equals("r")) {
			System.out.println("dime un numero: ");
			resta = teclado1.nextDouble();
			System.out.println("dime otro numero: ");
			num = teclado1.nextDouble();
			resta = resta - num;
			System.out.println("El resultado es: " + resta + " , " + "Quieres continuar introduciendo numeros? s/n: ");
			SN = teclado.nextLine();
			while (SN.equals("s")) {
			System.out.println("dime otro numero: ");
			num = teclado1.nextDouble();
			resta = resta - num;
			System.out.println("El resultado es: " + resta + " , " + "Quieres continuar introduciendo numeros? s/n: ");
			SN = teclado.nextLine();
			}
			System.out.println("Que desea realizar? sumar (s), restar (r), multiplicar (m), dividir (d) o terminar (t): ");
			M = teclado.nextLine();
			}
			
			while (M.equals("m")) {
			System.out.println("dime un numero: ");
			num = teclado1.nextDouble();
			System.out.println("dime otro numero: ");
			num1 = teclado1.nextDouble();
			multiplicar = num * num1;
			System.out.println("El resultado es: " + multiplicar + " , " + "Quieres continuar introduciendo numeros? s/n: ");
			SN = teclado.nextLine();
			while (SN.equals("s")) {
			System.out.println("dime otro numero: ");
			num = teclado1.nextDouble();
			multiplicar = multiplicar * num;
			System.out.println("El resultado es: " + multiplicar + " , " + "Quieres continuar introduciendo numeros? s/n: ");
			SN = teclado.nextLine();
			}
			System.out.println("Que desea realizar? sumar (s), restar (r), multiplicar (m), dividir (d) o terminar (t): ");
			M = teclado.nextLine();
			}
			
			while (M.equals("d")) {	
			System.out.println("dime un numero: ");
			num = teclado1.nextDouble();
			System.out.println("dime otro numero: ");
			num1 = teclado1.nextDouble();
			division = (num / num1) / division;
			System.out.println("El resultado es: " + division + " , " + "Quieres continuar introduciendo numeros? s/n: ");
			SN = teclado.nextLine();
			while (SN.equals("s")) {
			System.out.println("dime otro numero: ");
			num = teclado1.nextDouble();
			division = division / num;
			System.out.println("El resultado es: " + division + " , " + "Quieres continuar introduciendo numeros? s/n: ");
			SN = teclado.nextLine();
			}
			System.out.println("Que desea realizar? sumar (s), restar (r), multiplicar (m), dividir (d) o terminar (t): ");
			M = teclado.nextLine();
			}
		} while (!M.equals("t"));
		System.out.println("Hemos terminado con las mates por hoy, ya continuaremos otro dia guapeton ;)");
		
	}
}	