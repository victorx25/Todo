package Ejercicios2_3;

/**
 * Fibonacci.java
 * Programa el cual calcula el valor de la posicion que indiques de la tabla de Fibonacci
 * @author dam17-18 VMM
 */
import java.util.Scanner;

public class Fibonacci {

public static void fibonacci(int num0) {
	
	Scanner teclado = new Scanner(System.in);
	
	 int num1;
	 int num2;
	 int i;
	 //condicion do-while que sirve para evital la introduccion de valores incorrectos
       
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
       else {
    	   System.out.println(num2);}
	}
	
	public static void main(String argumentos[]){
		
	fibonacci(5);
	
	}
}
