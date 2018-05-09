package ejercicios5;

public class SubCadena {

	public static int obtenerNumeroVecesSubCadena(String palabra, String texto) {
		
		int contador = 0;
		int posicion;
		
		posicion = texto.indexOf(palabra);
		while(posicion != -1) {
			contador++;
			posicion = texto.indexOf(palabra, posicion + 1);
		}
		return contador;
	}
	
	public static void main(String[] args) {
		System.out.println(obtenerNumeroVecesSubCadena("en", "Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el interior del submarino se está muy apretado. Así que estamos leyendo todo el día. Vamos a salir en 5 días"));

	}

}
