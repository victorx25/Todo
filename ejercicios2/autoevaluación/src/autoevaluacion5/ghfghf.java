package autoevaluacion5;

public class ghfghf {

	public static int metodo(String str1, String str2) {
	    int len1 = str1.length();
	    int len2 = str2.length();
	    int limite = Math.min(len1, len2);  // Obtiene el menor
	    int k = 0;
	    while (k < limite) {
	        char c1 = str1.charAt(k);
	        char c2 = str2.charAt(k);
	        if (c1 != c2) {
	            return c1 - c2;
	        }
	        k++;
	    }
	    return len1 - len2;
	}
	public static void main(String[] args) {
		System.out.println(metodo("hol","hola"));

	}

}
