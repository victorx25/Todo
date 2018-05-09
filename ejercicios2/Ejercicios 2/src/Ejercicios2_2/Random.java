package Ejercicios2_2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Random.java
 * Programa que compara un numero aleatorio entre 1 y 10 
 * y lo compara con el que introduzcas por teclado
 * @author dam17-18 VMM
 */
public class Random
{
	public static void main(String argumentos[])
	{
		Scanner teclado = new Scanner(System.in);
	
		int num;
		int num1;
		//condicion do-while con la cual le da un valor aleatorio a la variable "num1"
		do {
			num1 = ((int)(Math.random() * 10));
		} while (num1 == 0);
			
		System.out.println("Dime un numero entre 1 y 10 porfavor: ");
		num = teclado.nextInt();
		//muestra un cuadro de dialogo en pantalla
		JOptionPane.showMessageDialog(null,"El numero es " +  num1);
		
		//condicion if que si se cumple muestra un cuadro de dialogo con un texto
		if (num == num1) {JOptionPane.showMessageDialog(null,"Los dos numeros son iguales, enhorabuena");
		}
		else if ((num1 == num + 1) || (num1 == num - 1)) {
			JOptionPane.showMessageDialog(null,"Casi aciertas pero no, intentalo denuevo");
		}
		else { JOptionPane.showMessageDialog(null,"Lo siento, no has acertado, intentalo mas tarde");
		}		
	}			
} 