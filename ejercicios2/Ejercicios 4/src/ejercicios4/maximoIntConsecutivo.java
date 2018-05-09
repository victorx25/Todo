package ejercicios4;

public class maximoIntConsecutivo {

		public static int maximoIntConsecutivo(int[]array) {

			int contador = 1;
			int i;
			
		for (i = 1; i < array.length; i++) {
			if (array[i]-1 == array[i-1]) {
				contador++;
		}
		}
		return contador;
		}
		public static void main(String args[]) {
			
			int[]array = new int[] {1,3,2};
			System.out.println(maximoIntConsecutivo(array));
		}
	}
