package modelo;

/** Proyecto: Juego de la vida.
 *  Implementa el concepto de Usuario según el modelo2.
 *  @since: prototipo1.2
 *  @source: Persona.java 
 *  @version: 2 - 2018/03/14 
 *  @author: alexmote
 */

import util.Fecha;

public class Persona {


	protected Nif nif;
	protected String nombre;
	protected String apellidos;
	protected DireccionPostal domicilio;
	protected Correo correo;
	protected Fecha fechaNacimiento;


	/**
	 * Constructor convencional. Utiliza métodos set...()
	 * @param nif
	 * @param nombre
	 * @param apellidos
	 * @param domicilio
	 * @param correo
	 * @param fechaNacimiento
	 * @throws ModeloException 
	 */
	public Persona(Nif nif, String nombre, String apellidos,
			DireccionPostal domicilio, Correo correo, Fecha fechaNacimiento) 
					throws ModeloException {
		setNif(nif);
		setNombre(nombre);
		setApellidos(apellidos);
		setDomicilio(domicilio);
		setCorreo(correo);
		setFechaNacimiento(fechaNacimiento);
	}

	/**
	 * Constructor por defecto. Reenvía al constructor convencional.
	 * @throws ModeloException 
	 */
	public Persona() throws ModeloException {
		this(new Nif(), "Nombre", "Apellido Apellido", 
				new DireccionPostal(), 
				new Correo(), 
				new Fecha(2000, 01, 12));
	}

	/**
	 * Constructor copia.
	 * @param usr
	 */
	public Persona(Persona usr) {
		nif = new Nif(usr.nif);
		nombre = new String(usr.nombre);
		apellidos = new String(usr.apellidos);
		domicilio = new DireccionPostal(usr.domicilio);
		correo = new Correo(usr.correo);
		fechaNacimiento = new Fecha(usr.fechaNacimiento);
	}

	/**
	 * Comprueba validez del nombre.
	 * @param nombre.
	 * @return true si cumple.
	 */
	private boolean nombreValido(String nombre) {
		return	nombre != null && nombre.matches("[A-ZÑÁÉÍÓÚ][a-zñáéíóú]+");
	}

	/**
	 * Comprueba validez de los apellidos.
	 * @param apellidos.
	 * @return true si cumple.
	 */
	private boolean apellidosValidos(String apellidos) {
		assert apellidos != null;
		return apellidos.matches("[A-ZÑÁÉÍÓÚ][a-zñáéíóú]+ [A-ZÑÁÉÍÓÚ][a-zñáéíóú]+");
	}

	/**
	 * Comprueba validez de una dirección.
	 * @param direccion.
	 * @return true si cumplenull.
	 */
	private boolean direccionValida(String direccion) {
		assert direccion != null;
		return	direccion.matches("[A-ZÑÁÉÍÓÚa-zñáéíóú\\.,/ \\d]+");
	}

	/**
	 * Comprueba validez de una fecha de nacimiento.
	 * @param fechaNacimiento.
	 * @return true si cumple.
	 */
	private boolean fechaNacimientoValida(Fecha fechaNacimiento) {
		// Que sea fecha del pasado.
		return true;
	}

	public Nif getNif() {
		return nif;
	}

	public void setNif(Nif nif) {
		assert nif != null;
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre)throws ModeloException {	
		assert nombre != null;
		if (nombreValido(nombre)) {
			this.nombre = nombre;
		}
		else {
			throw new ModeloException("Persona: formato nombre incorrecto");
		}
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		if (apellidosValidos(apellidos)) {
			this.apellidos = apellidos;
		}
	}

	public DireccionPostal getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(DireccionPostal domicilio) {
		assert domicilio != null;
		this.domicilio = domicilio;
	}

	public Correo getCorreo() {
		return correo;
	}

	public void setCorreo(Correo correo) {
		assert correo != null;
		this.correo = correo;
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		assert fechaNacimiento != null;
		if (fechaNacimientoValida(fechaNacimiento)) {
			this.fechaNacimiento = fechaNacimiento;
		}
	}

	
	@Override
	public Persona clone() {
		return new Persona(this);	
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + ((domicilio == null) ? 0 : domicilio.hashCode());
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());	
		result = prime * result + ((nif == null) ? 0 : nif.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
			if (nif.equals(((Persona)obj).nif) 
					&& nombre.equals(((Persona)obj).nombre) 
					&& apellidos.equals(((Persona)obj).apellidos) 
					&& domicilio.equals(((Persona)obj).domicilio) 
					&& correo.equals(((Persona)obj).correo) 
					&& fechaNacimiento.equals(((Persona)obj).fechaNacimiento) 
				) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Redefine el método heredado de la clase Objecto.
	 * @return el texto formateado del estado -valores de atributos- de objeto de la clase Usuario.  
	 */
	@Override
	public String toString() {
		return String.format(
				"%-16s %s\n"
						+ "%-16s %s\n"
						+ "%-16s %s\n"
						+ "%-16s %s\n"
						+ "%-16s %s\n"
						+ "%-16s %s\n"
						+ "%-16s %s\n"
						+ "%-16s %s\n"
						+ "%-16s %s\n"
						+ "%-16s %s\n", 
						"nif:", nif, "nombre:", nombre, "apellidos:", apellidos, "idUsr:", 
						"domicilio:", domicilio, "correo:", correo, "fechaNacimiento:", fechaNacimiento);		
	}

} // class

