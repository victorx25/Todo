package Ejercicios2_2;

import java.util.Scanner;

/**
 * Fibonacci.java
 *Programa el cual calcula el valor de la posicion que indiques de la tabla de Fibonacci
 *@author dam17-18 VMM
 */
public class Fibonacci
{
	public static void main(String argumentos[])
	{
		Scanner teclado = new Scanner(System.in);
	
		 int num0;
		 int num1;
		 int num2;
		 int i;
		 //condicion do-while que sirve para evital la introduccion de valores incorrectos
	        do{
	            System.out.print("Introduce numero mayor que 0: ");
	            num0 = teclado.nextInt();
	        }while(num0 <= 0);
	        System.out.println("El numero " + num0 + " de la serie de Fibonacci es: ");

	        num1=1;
	        num2=1;
	        
	        //conjunto de condiciones la cuales sirven para realizar las diferentes operaciones matematicas
	        //segun el valor introducido
	        if (num0 != 0) {
	        for(i=2;i<=num0;i++){
	             num2 = num1 + num2;
	             num1 = num2 - num1;
	        }
	        }
	        else num2 = 0;
	        
	        if (num2 != 0) {System.out.println(num2 - num1);
	        }
	    }
	}