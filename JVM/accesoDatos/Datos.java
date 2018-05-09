package accesoDatos;

/** 
 * Proyecto: Juego de la vida.
 * Clase para la gestión del almacenamiento.
 * de datos del programa.
 * @since: prototipo2
 * @source: Datos.java 
 * @version: 2 - 2018/05/02
 * @author: alexmote
 */
import java.util.ArrayList;
import java.util.HashMap;

import modelo.*;
import modelo.Usuario.RolUsuario;
import util.Fecha;
import accesoDatos.DatosException;
import accesoDatos.memoria.UsuariosDAO;

public class Datos {	
	UsuariosDAO usuariosDAO;	
	private static ArrayList <SesionUsuario> datosSesiones;	

	
	/**
	 * Constructor por defecto.
	 */
	public Datos() {
		usuariosDAO = new UsuariosDAO();
		datosSesiones = new ArrayList <SesionUsuario>();
		cargarDatosUsuariosPrueba();
	}


	public int getUsuariosRegistrados() {
		return usuariosDAO.getUsuariosRegistrados();
	}

	public int getSesionesRegistradas() {
		return datosSesiones.size();
	}
	
	/**
	 * Genera datos de prueba válidos dentro 
	 * del almacén de datos.
	 */
	public void cargarDatosUsuariosPrueba() {
		String[] NifValidos = { "00000000T", "00000001R", "00000002W", "00000003A", "00000004G",
				"00000005M", "00000006Y", "00000007F", "00000008P", "00000009D" };
		for (int i = 0; i < NifValidos.length ; i++) {
			Usuario usr = null;
			try {
				usr = new Usuario(new Nif(NifValidos[i]), "Pepe",
						"López Pérez", new DireccionPostal("Alta", "10", "30012", "Murcia"), 
						new Correo("pepe" + i + "@gmail.com"), new Fecha(2000, 11, 30), 
						new Fecha(), new ClaveAcceso(), RolUsuario.NORMAL);
				
				usuariosDAO.alta(usr);
			}
			 catch (ModeloException e) {
				e.printStackTrace();
			}		
			 catch (Exception e) {		
				e.printStackTrace();
			}
		}
	}
	/**
	 * Obtiene el idUsr que equivale a la credencial recibida.
	 * @param credencialUsr, puede ser nif o correo.
	 */
	public String equivalenciaIdUsuario(String credencialUsr) {	
		return usuariosDAO.equivalenciaId(credencialUsr);
	}
	
	/**
	 * Método fachada que obtiene todos los usuarios en forma de texto.
	 * @return
	 */
	public String textoDatosUsuarios() {
		return usuariosDAO.listarDatos();
	}

	/**
	 * Método fachada que obtiene el usuarios dado su nif.
	 * @return
	 */
	public Usuario buscarUsuario(String nif) {

		return usuariosDAO.obtener(nif);
	}
	
	/**
	 * Añade una nueva sesión en el almacén de datos.
	 * @param sesionUsuario a guardar.
	 */
	public void registrarSesion(SesionUsuario sesionUsuario) {
		datosSesiones.add(sesionUsuario);	
	}

	/**
	 * Volcado de todos las sesiones almacenadas.
	 */
	public String volcarDatosSesiones() {
		StringBuilder aux = new StringBuilder();
		for (SesionUsuario s: datosSesiones) {
			aux.append("<sesion>"
					+"<usr>"  
						+"<attrib>"+s.getUsr().getNif()+"</attrib>"
						+"<attrib>"+s.getUsr().getNombre()+"</attrib>"
						+"<attrib>"+s.getUsr().getApellidos()+"</attrib>"
						+"<attrib>"+s.getUsr().getIdUsr()+"</attrib>"
						+"<attrib>"+s.getUsr().getDomicilio()+"</attrib>"
						+"<attrib>"+s.getUsr().getCorreo()+"</attrib>"
						+"<attrib>"+s.getUsr().getFechaNacimiento()+"</attrib>"
						+"<attrib>"+s.getUsr().getFechaAlta()+"</attrib>"
						+"<attrib>"+s.getUsr().getClaveAcceso()+"</attrib>"
						+"<attrib>"+s.getUsr().getRol()+"</attrib>"
					+"</usr>"
					+"<attrib>"+s.getFecha()+"</attrib>"
					+"<sesion>");
		}
		return aux.toString();
	}




} //class
