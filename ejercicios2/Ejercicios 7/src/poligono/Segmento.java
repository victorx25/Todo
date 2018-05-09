package poligono;

/**
 * Segmento.java
 * 	Un punto en un espacio cartesiano
	Un segmento de recta (en un contexto geométrico).
	Un polígono (en un contexto geométrico). 
 * @author dam17-06  2018.03.13
 */

public class Segmento {
	
	private Punto inicio;
	private Punto fin;
	
	
	// Constructor
	public Segmento(int x, int y, int x1, int y1) {
	
		inicio = new Punto(x,y);
		fin = new Punto(x1,y1);
	}
	
	public Segmento() {
		inicio = new Punto();
		fin = new Punto();
	}
	
	@Override
	public String toString() {
		return "Segmento [inicio=" + inicio + ", fin=" + fin + "]";
	}



	public static void main(String arguments[]) {
		
		Segmento segmento1 = new Segmento(1,2,3,4);
		Segmento segmento2 = new Segmento(5,6,7,8);
		
		System.out.println("Segmento 1: " + segmento1);
		System.out.println("Segmento 2: " + segmento2);		
		
	}
	
}