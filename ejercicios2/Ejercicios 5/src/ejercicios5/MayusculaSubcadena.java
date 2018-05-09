package ejercicios5;

public class MayusculaSubcadena {

	public static String PasarMayusculaSubCadena(String texto) {
		
		int posicion;
		
		String[] cadena = texto.split("<mayus>|</mayus>");
		for (int i = 0; i < cadena.length; i++) {
			posicion = texto.indexOf(cadena[i]);
		
		}
		return texto;
			}
			
	
	public static void main(String[] args) {
		System.out.println(PasarMayusculaSubCadena("Estamos viviendo en un <mayus>submarino amarillo</mayus>.No tenemos <mayus>nada</mayus> qué hacer"));

	}

}
