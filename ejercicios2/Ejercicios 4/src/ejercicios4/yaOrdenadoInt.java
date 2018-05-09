package ejercicios4;

public class yaOrdenadoInt{

		public static boolean yaOrdenadoInt(int[]array) {

			int i;
			boolean verdadero = true;

			for (i = 1;i < array.length; i++) {
				if (array[i-1] > array[i]) {
					verdadero = false;
				}
			}
			return verdadero;
			
		}
		public static void main(String args[]) {
			
			int[]array = new int[] {1,2,5,3};
			System.out.println(yaOrdenadoInt(array));
		}
	}
