package Ejercicios2_3;

/**
 * CPL.java
 * Programa determina cuantas palabras, caracteres o lineas tiene una frase segun un numero
 * @author dam17-18 VMM
 */
import java.util.ArrayList;
import java.util.List;

public class CPL {
	
	public static void caracteresPalbrasLineas(String frase) {

		
		int contadorL = 1;
		int i;
		String[] cumplen = frase.split(" "); 
		List<String> lista = new ArrayList<String>();
		char caracteres[] = frase.toCharArray();
		
	
			for (i = 0; i < cumplen.length; i++) {
				lista.add(cumplen[i]);
			}
			for (i = 0; i < caracteres.length; i++) {
				if (caracteres[i] == '\n') {
				contadorL++;
				}
			}
			
		System.out.println("palabras " + "= " + (lista.size()));
		System.out.println("caracteres " + "= " + caracteres.length);
		System.out.println("lineas " + "= " + contadorL);
		}
	
		public static void main(String argumentos[])
		{
			caracteresPalbrasLineas("hola amigo\n aaaa");
			
	}
}
