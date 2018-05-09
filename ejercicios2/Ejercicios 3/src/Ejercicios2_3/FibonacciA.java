package Ejercicios2_3;

import java.util.Scanner;

/**
 * Fibonacci.java
 *Programa el cual calcula el valor de la posicion que indiques de la tabla de Fibonacci,dentro de unos limites ya establecidos
 *@author dam17-18 VMM
 */
public class FibonacciA
{
	final static int LIMITE_INFERIOR = 0;
	final static int LIMITE_SUPERIOR = 100;
	
	   public static void main(String argumentos[]) {
       	fibonacciA(12);
       }
   
	
	public static void fibonacciA(int num0)
	{
	
	
		 int num1;
		 int num2;
		 int i;
		
		 assert num0 >= LIMITE_INFERIOR: "Numero negativo" ;
		 assert num0 <= LIMITE_SUPERIOR: "Fuera de rango" ;

		 //condicion do-while que sirve para evital la introduccion de valores incorrectos
	       
	        System.out.println("El numero " + num0 + " de la serie de Fibonacci es: ");

	        num1=1;
	        num2=1;
	        
	        //conjunto de condiciones la cuales sirven para realizar las diferentes operaciones matematicas
	        //segun el valor introducido
	        if (num0 != LIMITE_INFERIOR) {
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

