package modelo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/** Proyecto: Juego de la vida.
 *  Implementa el concepto de Mundo de una
 *  simulación según el modelo 2. 
 *  @since: prototipo 2
 *  @source: Mundo.java 
 *  @version: 2 - 2018/03/21 
 *  @author: victormm
 */
public class Mundo {	
	private String nombre;
	private List constantes;
	private Map <Patron,Posicion> distribucion;
	private byte[][] espacio;
	
	
	//Constructores:
	
	//1-Convencional
	public Mundo(String nombre,List constantes,  
			Map <Patron,Posicion> distribucion
			) {
		setNombre(nombre);
		setConstantes(constantes);
		setDistribucion(distribucion);
		desplegarDistribucionEspacio();
	}
	
	//2-Por defecto
	public Mundo() {
		this("Demo", new LinkedList(), new HashMap());
	}
	
	//3-Copia
	public Mundo(Mundo mundo) {
		nombre = new String(mundo.nombre);
		constantes = new LinkedList(mundo.constantes);
		distribucion = new HashMap(mundo.distribucion);
		espacio = mundo.espacio.clone();
	}

	
	
	//Getter and Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List getConstantes() {
		return constantes;
	}

	public void setConstantes(List constantes) {
		this.constantes = constantes;
	}

	public Map<Patron, Posicion> getDistribucion() {
		return distribucion;
	}

	public void setDistribucion(Map<Patron, Posicion> distribucion) {
		this.distribucion = distribucion;
	}

	public byte[][] getEspacio() {
		return espacio;
	}

	private void desplegarDistribucionEspacio() {
		Iterator<Entry<Patron,Posicion>> it = distribucion.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Patron, Posicion> pareja=(Map.Entry<Patron, Posicion>)it.next();
			procesarPatron((Patron)pareja.getKey(),(Posicion) pareja.getValue());
		}
	}
	
	private void procesarPatron(Patron partronActual, Posicion posicionActual) {
		
	}
	

	@Override
	public String toString() {
		return "Mundo [nombre=" + nombre + ", constantes=" + constantes + ", distribucion=" + distribucion
				+ ", espacio=" + Arrays.toString(espacio) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((constantes == null) ? 0 : constantes.hashCode());
		result = prime * result + ((distribucion == null) ? 0 : distribucion.hashCode());
		result = prime * result + Arrays.deepHashCode(espacio);
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
		Mundo other = (Mundo) obj;
		if (constantes == null) {
			if (other.constantes != null)
				return false;
		} else if (!constantes.equals(other.constantes))
			return false;
		if (distribucion == null) {
			if (other.distribucion != null)
				return false;
		} else if (!distribucion.equals(other.distribucion))
			return false;
		if (!Arrays.deepEquals(espacio, other.espacio))
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
	public Mundo clone() {
		return new Mundo(this);
	}
	
}//class
