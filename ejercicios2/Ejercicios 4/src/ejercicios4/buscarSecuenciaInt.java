package ejercicios4;

public class buscarSecuenciaInt{

		public static int buscarSecuenciaInt(int[]array,int[]array2) {

			int i;
			int j;
			int contador = 0;
			
			for(i = 1; i < array.length; i++){
			for (j = 1; j < array2.length; j++) {
				
				while (array[i] == array2[j]) {
					contador++;
					j++;
					i++;
				}
			}
			j = 1;
			}
			return contador;	

		}
		public static void main(String args[]) {
			
			int[]array = new int[] {1,2,4};
			int[]array2 = new int[] {1,2,4};
			System.out.println(buscarSecuenciaInt(array,array2));
		}
	}
