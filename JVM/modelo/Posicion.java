package modelo;
/** Proyecto: Juego de la vida.
 *  Implementa el concepto de Posicion según el modelo 2.
 *  Representa coordenada del espacio donde una celda del mundo simulado.  
 *  @since: prototipo 2
 *  @source: Posicion.java 
 *  @version: 2 - 2018/03/21 
 *  @author: alexmote
 */
public class Posicion {
	private int x;
	private int y;

	public Posicion(int x,int y) {
		setX(x);
		setY(y);
	}

	public Posicion() { //COnstructor por defecto
		this(0,0);

	}

	public Posicion(Posicion posicion) { //Constructor copia
		x = posicion.x;
		y = posicion.y;

	}

	public void setY(int y) {

		this.x=x;
	}

	public void setX(int x) {

		this.y=x;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}


	/**
	 * hashCode() complementa al método equals y sirve para comparar objetos de forma 
	 * rápida en estructuras Hash. 
	 * Cuando Java compara dos objetos en estructuras de tipo hash (HashMap, HashSet etc)
	 * primero invoca al método hashcode y luego el equals.
	 * @return un número entero de 32 bit.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}


	/**
	 * Dos objetos son iguales si: 
	 * Son de la misma clase.
	 * Tienen los mismos valores en los atributos; o son el mismo objeto.
	 * @return falso si no cumple las condiciones.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj != null && getClass() == obj.getClass()) {
			if (this == obj) {
				return true;
			}
			if (x == ((Posicion)obj).x 
					&& y ==((Posicion)obj).y) {
				return true;
			}
		}
		return false;
	}


	/**
	 * Genera un clon del propio objeto realizando una copia
	 * @return el objeto clonado
	 */
	@Override
	public Posicion clone() {
		return new Posicion(this);
	}

	@Override
	public String toString() {
		return "("+ x + "," + y + ")";
	}


}//class
