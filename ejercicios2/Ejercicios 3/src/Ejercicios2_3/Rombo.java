package Ejercicios2_3;

/**
 * Rombo.java
 * Programa que muestra por pantalla un rombo formada con caracteres segun el tamano indicado
 * @author dam17-18 VMM 
 */
public class Rombo {

	public static void rombo(int tamano) {

		tamano = (tamano + 1) / 2;
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
		for (int i= tamano - 1; i>=1; i--){
		for (int n = tamano - i; n >0; n--)
		System.out.print(" ");
		for (int m = 1; m < 2 * i; m++)
		System.out.print("*");
		System.out.println("");
		}
	}
			
	public static void main(String[] args) {
		
		rombo(8);
	}
}