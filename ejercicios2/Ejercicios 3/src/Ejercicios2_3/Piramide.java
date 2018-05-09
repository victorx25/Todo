package Ejercicios2_3;

/**
 * Piramide.java
 * Programa que muestra por pantalla una piramide formada con caracteres segun el tamano indicado
 *@author dam17-18 VMM 
 */
public class Piramide {

	public static void piramide(int tamano) {

		for(int i = 1; i <= tamano; i++){
		int n;
			for( n = 0; n < tamano-i ; n++){
				System.out.print(" "); //imprime los espacios
				}
					for( ; n < (tamano+i)-1;n++){
						System.out.print("*"); //imprime los asteriscos
					}
			System.out.println(); //cambio de lienea 
			}
	}	
	public static void main(String[] args) {
		
		piramide(5);
	}
}