package ejercicios5;

public class InvertirText {

	public static String invertirTexto(String texto) {
		StringBuilder sb = new StringBuilder();
		String invertido = "";
		
		int i;
		
		for(i = texto.length()-1; i >= 0; i--) {
			
			sb = sb.append(texto.charAt(i));
			invertido = sb.toString();
		}
		
		return invertido;
	}
	public static void main(String arguments[]) {
		System.out.println(invertirTexto("hola"));
	}
}
