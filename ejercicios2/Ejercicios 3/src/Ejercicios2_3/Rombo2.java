package Ejercicios2_3;

/**
 * Rombo2.java
 * Programa que muestra por pantalla un rombo formada con caracteres segun el tamano indicado
 * @author dam17-18 VMM 
 */
public class Rombo2 {

	public static String rombo(int num) {

String rombo2 = Integer.toString(num);
		
		int tamano = Integer.parseInt(rombo2);
		
		tamano = (tamano + 1) / 2;
		for(int i = 1; i <= tamano; i++){
		int n;
		for( n = 0; n < tamano - i ; n++){
			System.out.print(" "); //imprime los espacios
			}
		for( ; n < (tamano + i) - 1;n++){
			System.out.print("*"); //imprime los asteriscos
			}
			System.out.println(); //cambio de lienea 
		}
		for (int i = tamano - 1; i >= 1; i--){
		for (int n = tamano - i; n > 0; n--)
		System.out.print(" ");
		for (int m = 1; m < 2 * i; m++)
		System.out.print("*");
		System.out.println("");
		}
		return rombo2;
	}
			
	public static void main(String[] args) {
		
		rombo(8);
	}
}