package ejercicios5;

public class parentesis {

	public static boolean parentesisCorrectos(String texto) {
		
		int caracter;
		int contador = 0;
		
		caracter = texto.indexOf('(');
		while(caracter != -1) {
			contador++;
			caracter = texto.indexOf('(',caracter + 1);
		}
		caracter = 0;
		caracter = texto.indexOf(')');
		while(caracter != -1) {
			contador--;
			caracter = texto.indexOf(')',caracter + 1);
		}
		if(contador == 0) return true;
		else return false;

	}
	
	public static void main(String[] args) {
	
		System.out.println(parentesisCorrectos("(())"));
		
	}

}
