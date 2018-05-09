package ejercicios4;

public class compararVectoresChar {

		public static int compararVectoresChar(char[]array,char[]array2) {

			String array0 = String.valueOf(array);
			String array1 = String.valueOf(array2);
			
			if (array.length != array2.length) System.out.println("tienen que ser del mismo tamano (CODIGO -0)");
			
			else {
				if (array0.compareTo(array1) == 0) return 0;
				else if (array0.compareTo(array1) > 0) return 1;
				else return -1;
			}
			return -0;
	}
			
		
		public static void main(String args[]) {
			
			char[]array = new char[] {'1','3','3','2'};
			char[]array2 = new char[] {'1','2','3'};
			System.out.println(compararVectoresChar(array,array2));
		}
	}
