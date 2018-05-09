package autoevaluacion2;

/**
 * Proyecto: Juego de la vida. Implementa el concepto de Usuario segÃºn el
 * modelo1. En esta versiÃ³n no se han aplicado la mayorÃ­a de los estÃ¡ndares
 * de diseÃ±o OO dirigidos a conseguir un "cÃ³digo limpio". La implementaciÃ³n
 * es la mÃ¡s bÃ¡sica posible con el fin ilustrar cÃ³mo se evoluciona desde un
 * "cÃ³digo malo". Se pueden detectar varios defectos y antipatrones de diseÃ±o:
 * - Ausencia de encapsulaciÃ³n. - Clase demasiado grande. - Clase sÃ³lo de
 * datos. - ObsesiÃ³n por los tipos primitivos.
 * 
 * @since: prototipo1.0
 * @source: Usuario.java
 * @version: 1.0 - 8/12/2015
 * @author: ajp
 */

public class Usuario {

	// Atributos
	private String nif;
	private String nombre;
	private String apellidos;
	private String domicilio;
	private String correo;
	private String fechaNacimiento;
	private String fechaAlta;
	private String claveAcceso;
	private String rol;
	private String idUsr;

	//Creacion de metodos para validar la clase Usuario
	private boolean nifValido(String nif) {
		// formato y letra control
		return nif.matches("^[0-9]{8}[a-zA-Z]") && letraValida(nif);
	}

	private boolean letraValida(String nif) {
		// algoritmo de obtencion letra
		return true;
	}

	private boolean nombreValido(String nombre) {
		return nombre.matches("^[A-Z][Ã¡Ã©Ã­Ã³Ãºa-z]+[ A-Z][Ã¡Ã©Ã­Ã³Ãºa-z]+[\\w]*");
	}

	private boolean apellidosValidos(String apellidos) {
		return apellidos.matches("^[A-Z][Ã¡Ã©Ã­Ã³Ãºa-z]+ [ A-ZÃ¡Ã©Ã­Ã³Ãº\\w]*");
	}

	private boolean correoValido(String correo){
		return correo.matches("^[\\w-\\+]+(\\.[\\w-\\+]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	}
	
	private boolean claveAccesoValida(String claveAcceso){
		return claveAcceso.matches("((?=.+[A-ZÑ])(?=.+[a-zñ])(?=.+\\d)(?=.+[$*-+&!?%])).{8,16}");
	}
	
	/**
	 * Redefine el mÃ©todo heredado de la clase Objecto.
	 * 
	 * @return el texto formateado del estado (valores de atributos) del objeto
	 *         de la clase Usuario
	 */
	@Override
	public String toString() {
		return super.toString()
				+ "\n" // Incluye identificador de objeto
				+ "\n nif: \t\t" + nif + "\n nombre: \t" + nombre
				+ "\n apellidos: \t" + apellidos + "\n domicilio: \t"
				+ domicilio + "\n correo: \t" + correo + "\n fechaNacimiento:"
				+ fechaNacimiento + "\n fechaAlta: \t" + fechaAlta
				+ "\n claveAcceso: \t" + claveAcceso + "\n rol: \t\t" + rol;
	}

	//Metodos de acceso a los atributos privados
	public void setNif(String nif) {
		assert nifValido(nif);
		this.nif = nif;
		// Detecta que no esta en el cosntructor
		if (this.idUsr != null) {
			generarIdUsr();
		}
	}

	public void setNombre(String nombre) {
		assert nombreValido(nombre);
		this.nombre = nombre;
		// Detecta si esta en el constructor
		if (this.idUsr != null) {
			generarIdUsr();
		}
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		assert correoValido(correo);
		this.correo = correo;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getClaveAcceso() {
		assert claveAccesoValida(claveAcceso);
		return claveAcceso;
	}

	public void setClaveAcceso(String claveAcceso) {
		this.claveAcceso = claveAcceso;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getIdUsr() {
		return idUsr;
	}

	public void setIdUsr(String idUsr) {
		this.idUsr = idUsr;
	}

	public String getNif() {
		return nif;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setApellidos(String apellidos) {
		assert apellidosValidos(apellidos);
		this.apellidos = apellidos;
		// Detecta si esta en el constructor
		// Comprueba que nif y apellidos no sean null
		if (this.idUsr != null && nif != null && nombre != null) {
			generarIdUsr();
		}

	}

	public Usuario(String nif, String nombre, String apellidos,
			String domicilio, String correo, String fechaNacimiento,
			String fechaAlta, String claveAcceso, String rol) {
		setNif(nif);
		setNombre(nombre);
		setApellidos(apellidos);
		generarIdUsr();
		setDomicilio(domicilio);
		setCorreo(correo);
		setFechaNacimiento(fechaNacimiento);
		setFechaAlta(fechaAlta);
		setClaveAcceso(claveAcceso);
		setRol(rol);
	}
	

	/**
	 * Constructor convencional
	 */
	
	public Usuario(){
		this("75663245G", "Juan7", "Lopez Ruiz", "C/Las moscas, 22 - 30120 Lorca",
				"jlr@gmail.com7", "13.12.89", "13.12.89", "rata7", "USUARIO_NORMAL"); // Constructor optimizado
		/**
		 * Constructor por defecto. Establece el valor inicial, por defecto, de cada
		 * uno de los atributos Llama al constructor convencional de la propia clase
		 * 
			nif = "75663245G";
			nombre = "Juan7";
			apellidos = "Lopez Ruiz";
			domicilio = "C/Las moscas, 22 - 30120 Lorca";
			correo = "jlr@gmail.com7";
			fechaNacimiento = "13.12.89";
			fechaAlta = "13.12.89";
			claveAcceso = "rata7";
			rol = "USUARIO_NORMAL";
		
			}
	
	 */
	}
		
	public Usuario(Usuario usr){
		this(usr.nif, usr.nombre, usr.apellidos, usr.domicilio, usr.correo, 
				usr.fechaNacimiento, usr.fechaAlta, usr.claveAcceso, usr.rol);
		/**Constructor copia sin optimizar
		this.nif = usr.nif;
		this.nombre = usr.nombre;
		this.apellidos = usr.apellidos;
		this.domicilio = usr.domicilio;
		this.correo = usr.correo;
		this.fechaNacimiento = usr.fechaNacimiento;
		this.fechaAlta = usr.fechaAlta;
		this.claveAcceso = usr.claveAcceso;
		this.rol = usr.rol;
		*/
	}
	
	//Cifrado César para la clave de acceso
	private String encriptarCesar(String claveAcceso) {
		StringBuilder encriptada = new StringBuilder();
		String alfabeto = "0123456789abcdefghijklmnÃ±opqrstuvwxyzABCDEFGHIJKLMNÃOPQRSTUVWXYZ";
		String desplazado = "6789abcdefghijklmnÃ±opqrstuvwxyzABCDEFGHIJKLMNÃOPQRSTUVWXYZ12345";
		for (char i = 0; i < claveAcceso.length(); i++) {
			int posicion = alfabeto.indexOf(claveAcceso.charAt(i));
			encriptada.append(desplazado.charAt(posicion));
		}
		return encriptada.toString();
	}

	//Metodos para generar el identificador de Usuarios
	private void generarIdUsr() {
		StringBuilder idUsr = new StringBuilder();
		// Primera letra nombre
		idUsr.append(nombre.charAt(0));

		// Primera letra primer apellido
		idUsr.append(apellidos.charAt(0));

		// ...

		this.idUsr = idUsr.toString();

	}

	public void reGenerar(String nombre) {
		assert nombreValido(nombre);
		this.nombre = nombre;
		// Detecta si esta en el constructor
		if (this.idUsr != null) {
			generarIdUsr();
		}
	}
	

} // class
