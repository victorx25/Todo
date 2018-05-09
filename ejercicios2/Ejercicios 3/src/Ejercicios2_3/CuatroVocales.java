package Ejercicios2_3;

/**
 * CuatroVocales.java
 * Programa que lee una lista de palabras e indica cuales de ellas contienen cuatro vocales o mas
 * @author dam17-18 VMM
 */
import java.util.ArrayList;
import java.util.List;
public class CuatroVocales {

	public static void palabrasCuatroVocales(String palabras) {

		palabras = palabras.toLowerCase();
		int i = 0;
		String[] cumplen = palabras.split(" "); 
		List<String> lista = new ArrayList<String>();
		
		for (i = 0; i < cumplen.length; i++) {
			if (cumplen[i].contains("a") && (cumplen[i].contains("e")) && (cumplen[i].contains("i")) && (cumplen[i].contains("o"))){
				
				lista.add(cumplen[i]);	
			}
			else if (cumplen[i].contains("a") && (cumplen[i].contains("e")) && (cumplen[i].contains("i")) && (cumplen[i].contains("u"))){
				
				lista.add(cumplen[i]);	
			}
			else if (cumplen[i].contains("o") && (cumplen[i].contains("o")) && (cumplen[i].contains("i")) && (cumplen[i].contains("u"))){
	
				lista.add(cumplen[i]);	
			}
			else if (cumplen[i].contains("a") && (cumplen[i].contains("e")) && (cumplen[i].contains("o")) && (cumplen[i].contains("u"))){
	
				lista.add(cumplen[i]);	
			}
			else if (cumplen[i].contains("i") && (cumplen[i].contains("e")) && (cumplen[i].contains("o")) && (cumplen[i].contains("u"))){
				
				lista.add(cumplen[i]);	
			}
		}
		
		
		System.out.println(lista);
	}
		public static void main(String argumentos[])
		{
		palabrasCuatroVocales("aeio hola murcielago");
			
	}
}