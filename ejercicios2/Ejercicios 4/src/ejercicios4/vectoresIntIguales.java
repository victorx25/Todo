package ejercicios4;

public class vectoresIntIguales {

		public static boolean vectoresIntIguales(int[]array,int[]array2) {

			int i;
			boolean verdadero = true;
			
	if (array.length != array2.length) {
		return !verdadero;	
			}
	else {
		for (i = 0; i < array.length; i++) {
			if (array[i] != array2[i]) {
				return !verdadero;
			}
		}
	}
		return verdadero;	
		}
		public static void main(String args[]) {
			
			int[]array = new int[] {1,3,2};
			int[]array2 = new int[] {1,2,3,2};
			System.out.println(vectoresIntIguales(array,array2));
		}
	}
