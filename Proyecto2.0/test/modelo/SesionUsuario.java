package modelo;

/** 
 * Proyecto: Juego de la vida.
 *  Implementa el concepto de SesionUsuario según el modelo1
 *  En esta versión no se han aplicado la mayoría de los estándares 
 *  de diseño OO dirigidos a conseguir un "código limpio". 
 *  La implementación es básica con el fin ilustrar 
 *  cómo se evoluciona desde un "código malo".
 *  Se pueden detectar varios defectos y antipatrones de diseño:
 *  	- Clase sólo de datos.
 *  @since: prototipo2.0
 *  @source: SesionUsuario.java 
 *  @version: 2.0 - 2018/03/06 
 *  @author: ajp
 */

import util.Fecha;

public class SesionUsuario {	
	
	public enum EstadoSesion {
		PREPARACION, 
		ACTIVA, 
		FINALIZADA
	}
	
	private Usuario usr;
	private Fecha fecha; 
	private EstadoSesion estado;
	/**
	 * Constructor convencional. Utiliza métodos set...()
	 * @param usr
	 * @param fecha
	 */
	public SesionUsuario(Usuario usr, Fecha fecha, EstadoSesion estado) {
		setUsr(usr);
		setFecha(fecha);
		setEstado(estado);
	}

	/**
	 * Constructor por defecto. Utiliza constructor convencional.
	 * @throws ModeloException 
	 */
	public SesionUsuario() throws ModeloException {
		this(new Usuario(), new Fecha(), EstadoSesion.PREPARACION);
	}

	/**
	 * Constructor copia.
	 * @param sesion
	 */
	public SesionUsuario(SesionUsuario sesion) {
		usr = new Usuario(sesion.usr);
		fecha = new Fecha(sesion.fecha);
		estado = sesion.estado;
	}

	/**
	 * Comprueba validez de una fecha de alta.
	 * @param fecha.
	 * @return true si cumple.
	 */
	private boolean fechaSesionValida(Fecha fecha) {
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
		if (fechaSesionValida(fecha)) {
			this.fecha = fecha;	
		}	
	}

	public EstadoSesion getEstado() {
		return estado;
	}
	
	
	private void setEstado(EstadoSesion estado) {
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
			if (usr.equals(((SesionUsuario)obj).usr) 
					&& fecha.equals(((SesionUsuario)obj).fecha)
					&& estado.equals(((SesionUsuario)obj).estado)
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
	public SesionUsuario clone() {
		// Utiliza el constructor copia.
		return new SesionUsuario(this);
	}
	
	/**
	 * Redefine el método heredado de la clase Objecto.
	 * @return el texto formateado del estado (valores de atributos) 
	 * de objeto de la clase SesionUsuario  
	 */
	@Override
	public String toString() {
		return usr.toString() 
				+ String.format("%-16s %s\n", "fecha:", fecha, "estado", fecha);
	}

} // class
