package Ejercicios2_3;

/**
 * TablsMultiplicar.java
 * Programa que realiza tablas de multiplicar del numero facilitado multiplicandolo desde el 0 hasta el 15
 * @author dam17-18 VMM
 */
public class TablasMultiplicar {
	
	public static void calcularMostrarTabla(int num) {

		int contador;
		int multiplicar;
		
		for (contador = 0; contador <= 15; contador++) {
			multiplicar = num * contador;
			System.out.println(num + " x " + contador + " = " + multiplicar);
		}
	}
		public static void main(String argumentos[])
		{
			calcularMostrarTabla(5);
			
	}
}
