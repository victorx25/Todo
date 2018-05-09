package Ejercicios2_3;

/**
 * Piramide2.java
 * Programa que muestra por pantalla una piramide formada con caracteres segun el tamano indicado
 * @author dam17-18 VMM 
 */
public class Piramide2 {

	public static String piramide2(int num) {

		String piramide2 = Integer.toString(num);
		
		int tamano = Integer.parseInt(piramide2);
		
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
		return piramide2;
	}	
	public static void main(String[] args) {
		
		piramide2(5);
	}
}