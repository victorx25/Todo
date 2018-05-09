package ejercicios4;

public class BuscarInt{

		public static int BuscarInt(int[]array,int num) {

			int contador = -1;
			int i;
			
			for(i = 0; i < array.length; i++){
			
				if (num == array[i]) {
					contador = i;
				}
		}	
			return contador;
		}
		public static void main(String args[]) {
			
			int[]array = new int[] {1,2,3,2};
			System.out.println(BuscarInt(array,2));
		}
	}
