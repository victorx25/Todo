package ejercicios5;

public class rightPad {

	public static String padRight(String texto, char a, int num) {
		
		StringBuilder sb = new StringBuilder(texto);
		int x = num - texto.length();
		int i;
		
		for(i = 0; i < x; i++) {
			sb.append(a);
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {

		System.out.println(padRight("Introducción", '*', 20));
		
	}

}
