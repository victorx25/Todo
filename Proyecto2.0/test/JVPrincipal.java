/** 
 * Proyecto: Juego de la vida.
 * Pruebas iniciales de las clases Usuario y SesionUsuario del modelo1.
 * Implementación del control de inicio de sesión y ejecución de la simulación por defecto.  
 * @since: prototipo 2
 * @source: JVPrincipal.java 
 * @version: 2 - 2018/03/08
 * @author: alexmote
 */

import accesoDatos.Datos;
import accesoUsr.Presentacion;
import modelo.SesionUsuario;
import modelo.SesionUsuario.EstadoSesion;
import util.Fecha;

public class JVPrincipal {
	
	/**
	 * Secuencia principal del programa.
	 */
	public static void main(String[] args) {		
		Datos datos = new Datos();
		Presentacion interfazUsr = new Presentacion(datos);	
		
		System.out.println(datos.textoDatosUsuarios());
		if (interfazUsr.inicioSesionCorrecto()) {
			datos.registrarSesion(new SesionUsuario(interfazUsr.getUsrEnSesion(), 
					new Fecha(), EstadoSesion.ACTIVA));	
			System.out.println("Sesión: " + datos.getSesionesRegistradas() + '\n' 
					+ "Iniciada por: " 
					+ 	interfazUsr.getUsrEnSesion().getNombre() 
					+ " " + interfazUsr.getUsrEnSesion().getApellidos());	
			interfazUsr.cargarMundoDemo();
			interfazUsr.arrancarSimulacion();
	}
		else {
			System.out.println("\nDemasiados intentos fallidos...");
		}		
		System.out.println("Fin del programa.");
	}

} //class
