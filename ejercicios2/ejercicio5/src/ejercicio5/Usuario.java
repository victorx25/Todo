package ejercicio5;



/** Proyecto: Juego de la vida.
 *  Implementa el concepto de Usuario según el modelo1.
 *  En esta versión no se han aplicado la mayoría de los estándares 
 *  de diseño OO dirigidos a conseguir un "código limpio". 
 *  La implementación es la más básica posible con el fin ilustrar 
 *  cómo se evoluciona desde una versión con mal diseño.
 *  Se pueden detectar varios defectos y antipatrones de diseño:
 *  	- Ausencia de encapsulación.
 *  	- Clase sólo de datos.
 *  	- Obsesión por los tipos primitivos.  
 *  @since: prototipo1.0
 *  @source: Usuario.java 
 *  @version: 1.0 - 2018/01/27 
 *  @author: vmm
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

	/**
	 * Redefine el método heredado de la clase Objecto.
	 * @return el texto formateado del estado -valores de atributos- de objeto de la clase Usuario.  
	 */
	
	public void generarIdUsr() { 
		
		StringBuilder textold = new StringBuilder();
		
		char[] n = nombre.toCharArray();
		textold.append(n[0]);
		String[] a = apellidos.split(" ");
		
		textold.append(a[0].charAt(0));
		textold.append(a[1].charAt(0));
		
		char[] ni = nif.toCharArray();
		
		textold.append(ni[6]);
		textold.append(ni[7]);
		
		setIdUsr(textold.toString());
	}
	
	public void generarVarianteIdUsr() {
		-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
	}
	
	public String encriptarCesar(String claveAcceso) {
		StringBuilder encriptada = new StringBuilder();
		String ab = "0123456789abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		for (char i = 0; i < claveAcceso.length(); i++) {
			int posicion = ab.indexOf(claveAcceso.charAt(i));
			encriptada.append(ab.charAt(posicion + 3));
		}
		return encriptada.toString();
	}
	
	public  boolean NifValido(String nif) {
		String nifValido = ("[0-9]{8}[A-Z]");
		return nif.matches(nifValido);
	}
	public boolean NombreValido(String nombre) {
		String nombreValido = ("^[A-Z][a-záéíóú]+");
		return nombre.matches(nombreValido);
	}
	public  boolean ApellidosValidos(String apellidos) {
		String apellidosValido = ("^[A-Z][a-záéíóú]+\\s[A-Z][a-záéíóú]+");
		return apellidos.matches(apellidosValido);
	}
	public  boolean DomicilioValido(String domicilio) {
		String domicilioValido = ("^[C][/][A-Z][a-záéíóú]+[,]\\s\\d{2}\\s\\d{5}\\s[A-Z][a-záéíóú]+");
		return domicilio.matches(domicilioValido);
	}
	public static boolean CorreoValido(String correo) {
		String correoValido = ("^[\\w-\\+]+(\\.[\\w-\\+]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		return correo.matches (correoValido);
	}
	public static boolean ClaveAccesoValida(String claveAcceso) {
		String claveAccesoValido = ("\\w");
		return claveAcceso.matches(claveAccesoValido);
	}
	
	@Override
	public String toString() {
		
		return String.format(" nif:\t\t\t%s \n nombre:\t\t%s \n apellidos:\t\t%s \n domicilio:\t\t%s \n correo:\t\t%s \n "
				+ "fechaNacimiento:\t%s \n fechaAlta:\t\t%s \n claveAcceso:\t\t%s \n rol:\t\t\t%s \n idUsr:\t\t\t%s", nif, nombre, apellidos, domicilio,
				correo, fechaNacimiento, fechaAlta, claveAcceso, rol, idUsr);
	}

	public Usuario(String nif,String nombre, String apellidos, 
			String domicilio,String correo, String fechaNacimiento, String fechaAlta, String claveAcceso, String rol) {
				
	}
	
	public Usuario() {
		
	}
	
	public Usuario(Usuario usuario) {
		this.setNif(usuario.getNif());
		this.setNombre(usuario.getNombre());
		this.setApellidos(usuario.getApellidos());
		this.setDomicilio(usuario.getDomicilio());
		this.setCorreo(usuario.getCorreo());
		this.setFechaNacimiento(usuario.getFechaNacimiento());
		this.setFechaAlta(usuario.getFechaAlta());
		this.setClaveAcceso(usuario.getClaveAcceso());
		this.setRol(usuario.getRol());
		this.setIdUsr(usuario.getIdUsr());
	}
	
	public String getApellidos() {
		
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		assert ApellidosValidos(apellidos);
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		assert NombreValido(nombre);
		this.nombre = nombre;
	}

	public String getClaveAcceso() {
		return claveAcceso;
	}

	public void setClaveAcceso(String claveAcceso) {
		assert ClaveAccesoValida(claveAcceso);
		this.claveAcceso = encriptarCesar(claveAcceso);
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		assert NifValido(nif);
		this.nif = nif;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		assert CorreoValido(correo);
		this.correo = correo;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		assert DomicilioValido(domicilio);
		this.domicilio = domicilio;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
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
	

} // class
