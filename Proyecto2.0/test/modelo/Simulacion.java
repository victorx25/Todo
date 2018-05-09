package modelo;

/** 
 * Proyecto: Juego de la vida.
 *  Implementa el concepto de Simulacion según el modelo1
 *  En esta versión no se han aplicado la mayoría de los estándares 
 *  de diseño OO dirigidos a conseguir un "código limpio". 
 *  La implementación es básica con el fin ilustrar 
 *  cómo se evoluciona desde un "código malo".
 *  Se pueden detectar varios defectos y antipatrones de diseño:
 *  	- Clase sólo de datos.
 *  @since: prototipo2.0
 *  @source: simulacionUsuario.java 
 *  @version: 2.0 - 2018/03/06 
 *  @author: ajp
 */

import util.Fecha;

public class Simulacion {	
	
	public enum EstadoSimulacion {
		PREPARADA, 
		INICIADA, 
		COMPLETADA
	}
	
	private Usuario usr;
	private Fecha fecha; 
	private Mundo mundo;
	private EstadoSimulacion estado;
	
	
	/**
	 * Constructor convencional. Utiliza métodos set...()
	 * @param usr
	 * @param fecha
	 */
	public Simulacion(Usuario usr, Fecha fecha, Mundo mundo, EstadoSimulacion estado) {
		setUsr(usr);
		setFecha(fecha);
		setMundo(mundo);
		setEstado(estado);
	}
		
	

	/**
	 * Constructor por defecto. Utiliza constructor convencional.
	 * @throws ModeloException
	 */
	public Simulacion() throws ModeloException {
		this(new Usuario(), new Fecha(), new Mundo(), EstadoSimulacion.PREPARADA);
	}

	/**
	 * Constructor copia.
	 * @param simulacion
	 */
	public Simulacion(Simulacion simulacion) {
		usr = new Usuario(simulacion.usr);
		fecha = new Fecha(simulacion.fecha);
		mundo = new Mundo(simulacion.mundo);
		estado = simulacion.estado;
	}

	/**
	 * Comprueba validez de una fecha de simulacion.
	 * @param fecha.
	 * @return true si cumple.
	 */
	private boolean fechaSimulacionValida(Fecha fecha) {
		assert fecha != null;
		return fecha.toString().matches("^[\\d]{4}[\\.-/\\d]{2}[\\\\.-/\\d]{2}");
	}

	public Usuario getUsr() {
		return usr;
	}

	public void setUsr(Usuario usr) {
		assert usr != null;
		this.usr = usr;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		if (fechaSimulacionValida(fecha)) {
			this.fecha = fecha;	
		}	
	}

	private void setMundo(Mundo mundo) {
		assert mundo != null; {
		this.mundo = mundo;
		}
	}



	public Mundo getMundo() {
		return mundo;
		
	}
	
	
	public EstadoSimulacion getEstado() {
		return estado;
	}
	
	
	private void setEstado(EstadoSimulacion estado) {
		assert estado != null;
		this.estado = estado;
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
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((usr == null) ? 0 : usr.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());

		return result;
	}

	/**
	 * Dos objetos son iguales si: 
	 * Son de la misma clase.
	 * Tienen los mismos valores en los atributos; o son el mismo objeto.
	 * @return falso si no cumple las condiciones.
	*/
	public boolean equals(Object obj) {
		if (obj != null && getClass() == obj.getClass()) {
			if (this == obj) {
				return true;
			}
			if (usr.equals(((Simulacion)obj).usr) 
					&& fecha.equals(((Simulacion)obj).fecha)
					&& estado.equals(((Simulacion)obj).estado)
				) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Genera un clon del propio objeto realizando una copia profunda.
	 * @return el objeto clonado.
	*/
	public Simulacion clone() {
		// Utiliza el constructor copia.
		return new Simulacion(this);
	}
	
	/**
	 * Redefine el método heredado de la clase Objecto.
	 * @return el texto formateado del estado (valores de atributos) 
	 * de objeto de la clase simulacionUsuario  
	 */
	@Override
	public String toString() {
		return usr.toString() 
				+ String.format("%-16s %s\n", "fecha:", fecha, "estado", fecha);
	}

} // class
