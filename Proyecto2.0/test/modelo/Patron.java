package modelo;

import java.util.Arrays;

/** Proyecto: Juego de la vida.
 *  Implementa el concepto de Patron según el modelo 2.
 *  Representa ua formación de celdas conocido que tiene
 *  un comportamiento particular en una simulación.  
 *  @since: prototipo 2
 *  @source: Patron.java 
 *  @version: 2 - 2018/03/21 
 *  @author: alexmote
 */
public class Patron {

	private String nombre;
	private byte[][] esquema;
	
	public Patron(){ //Constructor por defecto
		this("CeldaUnica", new byte [1][1]);
	}
	
	public Patron(String nombre, byte [][] esquema){ //Constructor normal
		setNombre(nombre);
		setEsquema(esquema);
	}
	
	public Patron(Patron patron) {
		nombre = new String(patron.nombre);
		esquema = patron.esquema.clone(); 
		
		//for(int i=0; i<patron.esquema.length;i++) {
		//	System.arraycopy(patron.esquema[i],0,esquema[i],0,
		//			patron.esquema[i].length); //Solo sirve para una dimension
		//}
	
	}

	public void setEsquema(byte[][] esquema) {
		this.esquema = esquema;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte[][] getEsquema() {
		return esquema;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(esquema);
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patron other = (Patron) obj;
		if (!Arrays.deepEquals(esquema, other.esquema))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	/**
	 * Genera un clon del propio objeto realizando una copia profunda
	 * @return el objeto clonado
	 */
	@Override
	public Patron clone() {
		return new Patron(this);
	}
}//class
