package poligono;

/**
 * Punto.java

	   Define la clase Punto representada por sus coordenadas x e y (números reales).
	
	   Prueba la creación de objetos de la clase instanciando un nuevo punto en la clase Principal, que contiene el método main().
	
	   Asigna valores a las coordenadas de los puntos creados.
	
	   Muestra por pantalla las coordenadas de cada punto.
	
	   Modificar alguna de sus coordenadas accediendo directamente al atributo correspondiente y vuelve a mostrar los puntos por pantalla.
	   Deben seguirse los principios y estilo del código limpio.

 * @author dam17-06  2018.03.13punto1.x = 4;
		punto1.y = 5;
 */



public class Punto {
	
	
	private int x;
	private int y;
	
	
	
	public Punto() {
		x = 0;
		y = 0;
	}
	
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}
	
	
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	public static void main(String arguments[]) {
		
		Punto punto1 = new Punto();
		Punto punto2 = new Punto(1,2);
		
	
		System.out.println("Punto1: " + punto1);
		System.out.println("Punto2: " + punto2);
		
	}

}