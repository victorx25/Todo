package Ejercicios2_1;

/**
* DiagramaBarras.java
* Programa que pide un numero, y a partir de él genera una barra horizontal y una fila de asteriscos según el numero.
* @author dam17-18 - 2017.11.15
*/

public class Hola2 {
	
	// Declaramos las variables
	final static int LIMITE_INFERIOR = -10;
	final static int LIMITE_SUPERIOR = 10;
	final static char CARACTER_BASE = '*';
	
	// Metodo que genera los caracteres, en este caso el caracter '*'.
	public static String generarBloqueCaracteres(int num, char c) {
		String texto = "";	// Variable de texto
		texto = String.valueOf(c); // Convierte el char en un String
		if(num == 0) return texto = ""; // Si el numero es igual a 0, devuelve el texto
		for (int x = 1; x < num; x++) { 
			texto += c;		// Añade el char a la variable texto
		}
		for(int x = -1; x > num; x--) {
			texto += c;		// Añade el char a la variable texto
		}
		
		return texto; // Devuelve el texto al metodo generarBloqueCaracteres
	}
	
	// Metodo que obtiene el texto formado por un bloque, del tamaño indicado, de caracteres iguales. 
	public static void generarBarraHorizontal(int num) {
		
		char palo = '|';	// Variable char
		char espacio = ' ';	// Variable char
		String texto = " "; // Variable texto
		int x;				// Variable entera
		
		// Compara el numero si es menor que el limite inferior o mayor que el limite superior.
		if (num < LIMITE_INFERIOR || num > LIMITE_SUPERIOR) {
			System.out.println(num + " FUERA DE RANGO");	// Imprime el mensaje por pantalla
		}
		else {
			System.out.print(num);	// Imprime el mensaje por pantalla
			System.out.print(espacio);	// Imprime el mensaje por pantalla
			 if ((num < LIMITE_SUPERIOR) && (num >= 0)) {
				for (x = LIMITE_INFERIOR-1; x <= 0; x++) {
					System.out.print(espacio); // Imprime el mensaje por pantalla
				}
				System.out.print(palo); // Imprime el mensaje por pantalla
				texto = generarBloqueCaracteres(num, CARACTER_BASE); // Añade el metodo generarBloqueCaracteres 
				System.out.println(texto); // Imprime el mensaje por pantalla
				
					
				}
			 else if (num == LIMITE_SUPERIOR) {
				 for (x = LIMITE_INFERIOR; x <= 0; x++) {
					 System.out.print(espacio); // Imprime el mensaje por pantalla
			 }
				 System.out.print(palo); // Imprime el caracter '|'
					texto = generarBloqueCaracteres(num, CARACTER_BASE);
					System.out.println(texto); // Imprime el texto
					
			 }
			 else if ((num > LIMITE_INFERIOR) && (num < 0)) {
				 for (x = LIMITE_INFERIOR; x <= num; x++) {
					 System.out.print(espacio); // Imprime los espacios
				 }
				 
					texto = generarBloqueCaracteres(-num, CARACTER_BASE);
					System.out.print(texto); // Imprime el texto
					System.out.print(palo); // Imprime el caracter '|'
					System.out.println(); // Imprime un espacio
						
					}
			 else if (num == LIMITE_INFERIOR) {
				 for (x = LIMITE_INFERIOR; x < num; x++) {
					 System.out.print(espacio); // Imprime los espacios
				 }
					texto = generarBloqueCaracteres(-num, CARACTER_BASE);
					System.out.print(texto); // Imprime el texto
					System.out.print(palo); // Imprime el caracter '|'
					System.out.println(); // Imprime un espacio
			 }
			 
			
		}
			 
		}
		
			
	
	public static void main(String arguments[]) {
		
		generarBarraHorizontal(-11);	// Llama al método
		generarBarraHorizontal(-10);	// Llama al método
		generarBarraHorizontal(-9);	// Llama al método
		generarBarraHorizontal(-8);	// Llama al método
		generarBarraHorizontal(-7);	// Llama al método
		generarBarraHorizontal(-6);	// Llama al método
		generarBarraHorizontal(-5);	// Llama al método
		generarBarraHorizontal(-4);	// Llama al método
		generarBarraHorizontal(-3);	// Llama al método
		generarBarraHorizontal(-2);	// Llama al método
		generarBarraHorizontal(-1);	// Llama al método
		generarBarraHorizontal(0);	// Llama al método
		generarBarraHorizontal(1);	// Llama al método
		generarBarraHorizontal(2);	// Llama al método
		generarBarraHorizontal(3);	// Llama al método
		generarBarraHorizontal(4);	// Llama al método
		generarBarraHorizontal(5);	// Llama al método
		generarBarraHorizontal(6);	// Llama al método
		generarBarraHorizontal(7);	// Llama al método
		generarBarraHorizontal(8);	// Llama al método
		generarBarraHorizontal(9);	// Llama al método
		generarBarraHorizontal(10);	// Llama al método
		generarBarraHorizontal(11);	// Llama al método
	}
	
}