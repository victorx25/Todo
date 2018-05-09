package accesoDatos.memoria;
/** 
 * Proyecto: Juego de la vida.
 * Clase para la gestión del almacenamiento.
 * de datos del programa.
 * @since: prototipo2
 * @source: UsuariosDAO.java 
 * @version: 2 - 2018/05/02
 * @author: alexmote
 */
import java.util.ArrayList;
import java.util.HashMap;

import accesoDatos.DatosException;
import modelo.SesionUsuario;
import modelo.Usuario;

public class UsuariosDAO {

	private static ArrayList <Usuario> datosUsuarios;
	private static HashMap<String, String> equivalenciasId;

	public UsuariosDAO() {
		datosUsuarios = new ArrayList <Usuario>();
		equivalenciasId = new HashMap<String, String>();
	}
	
	/**
	 * Búsqueda binaria de usuario dado su id.
	 * @param id - el id de Usuario a buscar.
	 * @return - el Usuario encontrado o null si no existe.
	 */
	public Usuario obtener(String id) {
		String idUsr = equivalenciasId.get(id);
		if (idUsr != null) {
			int posicion = obtenerPosicion(idUsr);
			if (posicion >= 0) {
				return datosUsuarios.get(posicion - 1);
			}
		}
		return null;				
	}

	/**
	 *  Obtiene por búsqueda binaria, la posición que ocupa, o ocuparía,  un usuario en 
	 *  la estructura.
	 *	@param IdUsr - id de Usuario a buscar.
	 *	@return - la posición, en base 1, que ocupa un objeto o la que ocuparía (negativo).
	 */
	private int obtenerPosicion(String idUsr) {
		int comparacion;
		int inicio = 0;
		int fin = datosUsuarios.size()-1;
		int medio = 0;
		while (inicio <= fin) {
			medio = (inicio + fin) / 2;			    // Calcula posición central.
			// Obtiene > 0 si idUsr va después que medio.
			comparacion = idUsr.compareTo(datosUsuarios.get(medio).getIdUsr());
			if (comparacion == 0) {			
				return medio + 1;   				// Posción ocupada, base 1	  
			}		
			if (comparacion > 0) {
				inicio = medio + 1;
			}			
			else {
				fin = medio - 1;
			}
		}	
		return -(inicio + 1);						// Posición que ocuparía, negativo, base 1
	}

	/**
	 *  Alta de un nuevo usuario en orden y sin repeticiones según el campo idUsr. 
	 *  Localiza previamente la posición que le corresponde por búsqueda binaria.
	 *	@param usr - Objeto a almacenar.
	 * @throws Exception 
	 */
	public void alta (Usuario usr) throws DatosException  {
		assert usr != null : "Usuario null...";
		int posicionInsercion = obtenerPosicion(usr.getIdUsr()); 
		if (posicionInsercion < 0) {
			datosUsuarios.add(-posicionInsercion-1, usr); 	// Inserta el usuario en orden.
			registrarEquivalenciaId(usr);
		}
		else {
			// Si usr es diferente del almacenado...
			if (!usr.equals(datosUsuarios.get(posicionInsercion-1))) {
				int intentos = "ABCDEFGHJKLMNPQRSTUVWXYZ".length();
				do {
					usr.generarVarianteIdUsr();
					posicionInsercion = obtenerPosicion(usr.getIdUsr());
					if (posicionInsercion < 0) {
						datosUsuarios.add(-posicionInsercion - 1, usr); // Inserta el usuario en orden.
						registrarEquivalenciaId(usr);
						return;
					}
					intentos--;
				} while (intentos >= 0);
				throw new DatosException("ALTA: imposible generar variante del " + usr.getIdUsr());
			}
			throw new DatosException("ALTA: El Usuario " + usr.getIdUsr() + " ya existe...");
		}
	}


	/**
	 *  Añade nif y correo como equivalencias de idUsr.
	 *	@param usr - Objeto a almacenar.
	 * @throws Exception 
	 */
	private void registrarEquivalenciaId(Usuario usr) {
		//Añade equivalencias para idUsr 
		equivalenciasId.put(usr.getIdUsr(), usr.getIdUsr());
		equivalenciasId.put(usr.getNif().getTexto(), usr.getIdUsr());
		equivalenciasId.put(usr.getCorreo().getTexto(), usr.getIdUsr());
	}


	/**
	 * Borado de usuario dado su id.
	 * @param id - el id de Usuario a borrar.
	 * @return - el Usuario encontrado o DatosException si no existe.
	 * @throws DatosException 
	 */
	public Usuario baja (String id) throws DatosException {
		String idUsr = equivalenciasId.get(id);
		Usuario aBorrar=null;
		if (idUsr != null) {
			int posicion = obtenerPosicion(idUsr);
			if (posicion >= 0) {
				aBorrar = datosUsuarios.get(posicion - 1);
				datosUsuarios.remove(aBorrar);
			}
			else {
				throw new DatosException("Baja Usuario: no existe");
			}
		}
		return aBorrar;				
	}



	/**
	 *  Modifica un usuario en orden ya existente. 
	 *	@param usr - Objeto a almacenar.
	 * @throws DatosException 
	 */
	public void actualizar (Usuario usr) throws DatosException  {
		assert usr != null : "Usuario null...";
		int posicion = obtenerPosicion(usr.getIdUsr()); 
		if (posicion >= 0) {
			baja(usr.getIdUsr());
			datosUsuarios.add(posicion-1, usr); 	// Inserta el usuario en orden.
			registrarEquivalenciaId(usr);
		}
		else {
			throw new DatosException("ALTA: El Usuario " + usr.getIdUsr() + " no existe...");
		}		
	}


	/**
	 * Muestra todos los usuarios almacenados en texto formateado.
	 */
	public String listarDatos() {
		StringBuilder aux = new StringBuilder();
		for (Usuario u: datosUsuarios) {
			aux.append("\n" + u);
		}
		return aux.toString();
	}

	/**
	 * Elimina todos los usuarios almacenados.
	 */
	public void borrarDatos() {
		datosUsuarios.clear();

	}
	public int getUsuariosRegistrados() {
		
		return datosUsuarios.size();
	}
	
	/**
	 * Obtiene el idUsr que equivale a la credencial recibida.
	 * @param credencialUsr, puede ser nif o correo.
	 */
	public String equivalenciaId(String credencialUsr) {	
		return equivalenciasId.get(credencialUsr);
	}



	/**
	 * Volcado de todos los usuarios almacenados.
	 */
	public String volcarDatos() {
		StringBuilder aux = new StringBuilder();
		for (Usuario u: datosUsuarios) {
			aux.append("<usr>"  
					+"<attrib>"+u.getNif()+"</attrib>"
					+"<attrib>"+u.getNombre()+"</attrib>"
					+"<attrib>"+u.getApellidos()+"</attrib>"
					+"<attrib>"+u.getIdUsr()+"</attrib>"
					+"<attrib>"+u.getDomicilio()+"</attrib>"
					+"<attrib>"+u.getCorreo()+"</attrib>"
					+"<attrib>"+u.getFechaNacimiento()+"</attrib>"
					+"<attrib>"+u.getFechaAlta()+"</attrib>"
					+"<attrib>"+u.getClaveAcceso()+"</attrib>"
					+"<attrib>"+u.getRol()+"</attrib>"
					+"</usr>");
		}
		return aux.toString();
	}



} //class
