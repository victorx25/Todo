package ejercicio5;

/** 
 * Proyecto: Juego de la vida.
 *  Implementa el concepto de SesionUsuario según el modelo1.0
 *  En esta versión no se han aplicado la mayoría de los estándares 
 *  de diseño OO dirigidos a conseguir un "código limpio". 
 *  La implementación es la más básica posible con el fin ilustrar 
 *  cómo se evoluciona desde una versión con mal diseño.
 *  Se pueden detectar varios defectos y antipatrones de diseño:
 *  	- Ausencia de encapsulación.
 *  	- Clase sólo de datos.
 *  @since: prototipo1.0
 *  @source: SesionUsuario.java 
 *  @version: 1.0 - 2017/11/29 
 *  @author: ajp
 */

public class SesionUsuario {	
	// Atributos	
	private Usuario usr;   //materializa la relación de composición del modelo UML
	private String fecha; 
	
	/**
	 * Redefine el método heredado de la clase Objecto.
	 * @return el texto formateado del estado (valores de atributos) 
	 * de objeto de la clase SesionUsuario  
	 */
	@Override
	public String toString() {
		return String.format("usr: %s \n fecha: %s \n", usr, fecha);
	}
	
	public SesionUsuario(Usuario usr, String fecha) {
		
	}
	public SesionUsuario() {
	
	}
	
	public SesionUsuario (SesionUsuario sesionusuario) {
		this.usr = sesionusuario.getUsr();
		this.fecha = sesionusuario.getFecha();
	}

	public Usuario getUsr() {
		return usr;
	}

	public void setUsr(Usuario usr) {
		this.usr = usr;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

} // class