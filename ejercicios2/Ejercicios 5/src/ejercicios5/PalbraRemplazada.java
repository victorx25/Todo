package ejercicios5;

public class PalbraRemplazada {

	public static String RemplazaPalabras(String texto,String palabras) {
		
		
		String[] cadena = palabras.split(",");
		for (int i = 0; i < cadena.length; i++) {
			String asteriscos = "";
			for(int j = 0;j < cadena[i].length();j++) {
			asteriscos += "*";
				}
			texto = texto.replaceAll(cadena [i],asteriscos );

			}
		
		return texto;
	}
	
	public static void main(String[] args) {
System.out.println(RemplazaPalabras("Oracle ha anunciado hoy su nueva generación de compilador Java hoy."
		+ " Utiliza analizador avanzado y optimizador especial para la JVM de Oracle","JVM,Java,Oracle"));

	}

}
