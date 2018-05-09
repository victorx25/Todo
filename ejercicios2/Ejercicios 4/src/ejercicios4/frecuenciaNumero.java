package ejercicios4;

public class frecuenciaNumero {

		public static int frecuenciaNumero(int[]array,int num) {

			int contador = 0;
			int i;
			
			for(i = 0; i < array.length; i++){
			
				if (num == array[i]) {
					contador++;
				}
		}	
			return contador;
		}
		public static void main(String args[]) {
			
			int[]array = new int[] {1,2,3,2};
			System.out.println(frecuenciaNumero(array,2));
		}
	}
