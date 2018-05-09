package prototipo1;

import java.util.Scanner;

public class JVPrincipal {
	
	static final int MAX_USUARIOS = 10;
	static final int MAX_SESIONES = 10;
	
	static Usuario[] datosUsuarios = new Usuario[MAX_USUARIOS];
	static SesionUsuario[] datosSesiones = new SesionUsuario[MAX_SESIONES];
	static int sesionesRegistradas = 0;		//control de sesiones iniciadas

	public static void main(String[] args) {
		//Apartados 4 y 5: pruebas previas
		//probarSesionUsuario();
		//probarUsuario();
		
		cargarUsuarioPrueba();
		
		
		Usuario usuarioActual;
		
		//control de acceso
		
		//pedir credencial usuario y contraseña
		System.out.println("Escribe el nif...");
		String identificadorUsrIntroducido = new Scanner(System.in).next();
		
		//comprobar que existe usuario
			//buscar usuario por identificador
			usuarioActual = buscarUsuario(identificadorUsrIntroducido);
		
		//comprobar contraseña
			//comparar que la contraseña escrita y almacenada coinciden
			if (iniciarSesionCorrecta(usuarioActual, identificadorUsrIntroducido)) {
		//mensaje bienvenida
				System.out.println("Buenas muchachote");
			}
			
	}
	
	public static void cargarUsuarioPrueba() {

		Usuario usr = new Usuario();
		usr.nif = "123";
		usr.nombre = "vic";
		usr.apellidos = "tor";
		usr.domicilio = "calle jose Nº26";
		usr.correoE = "victorx@hotmail.com";
		usr.fechaNacimiento = "02/04/98";
		usr.fechaAlta = "02/07/16";
		usr.claveAcceso = "guau";
		usr.rol = "normal";
	
		datosUsuarios[0] = usr;
		
		usr = null; //sirve para borrar los datos que se han guardado en usr 
					//(si se van a escribir despues otros datos no es necesario borrarlo con null),
					//antes de esto se han guardado en la posicion 0 de datosUsuarios; 
					//de aqui luego se podra usar el teclado para rellenar usr he ir guardandolo en diferentes posiciones de datosUsuarios;
					//o poder usar un bucle para rellenar alguno de los datos.
		
		usr.nif = "123";
		usr.nombre = "vic";
		usr.apellidos = "tor";
		usr.domicilio = "calle jose Nº26";
		usr.correoE = "victorx@hotmail.com";
		usr.fechaNacimiento = "02/04/98";
		usr.fechaAlta = "02/07/16";
		usr.claveAcceso = "guau";
		usr.rol = "normal";
		
		datosUsuarios[1] = usr;
		
		usr.nif = "123";
		usr.nombre = "vic";
		usr.apellidos = "tor";
		usr.domicilio = "calle jose Nº26";
		usr.correoE = "victorx@hotmail.com";
		usr.fechaNacimiento = "02/04/98";
		usr.fechaAlta = "02/07/16";
		usr.claveAcceso = "guau";
		usr.rol = "normal";
		
		datosUsuarios[2] = usr;
		
		usr.nif = "123";
		usr.nombre = "vic";
		usr.apellidos = "tor";
		usr.domicilio = "calle jose Nº26";
		usr.correoE = "victorx@hotmail.com";
		usr.fechaNacimiento = "02/04/98";
		usr.fechaAlta = "02/07/16";
		usr.claveAcceso = "guau";
		usr.rol = "normal";
		
		datosUsuarios[3] = usr;
		
		usr.nif = "123";
		usr.nombre = "vic";
		usr.apellidos = "tor";
		usr.domicilio = "calle jose Nº26";
		usr.correoE = "victorx@hotmail.com";
		usr.fechaNacimiento = "02/04/98";
		usr.fechaAlta = "02/07/16";
		usr.claveAcceso = "guau";
		usr.rol = "normal";
		
		datosUsuarios[4] = usr;
	}
	
	public static void probarSesionUsuario() {
		
		SesionUsuario sesion1 = new SesionUsuario();
		sesion1.usr = new Usuario();
		sesion1.fecha = "2017.05.12";
		System.out.println(sesion1.toString());
		
		
	}
	public static void probarUsuario() {
		
		Scanner teclado = new Scanner(System.in);
		
		
		Usuario usr0 = new Usuario();
		
		Usuario usr1 = new Usuario();
		Usuario usr2 = new Usuario();
		Usuario usr3 = new Usuario();
		Usuario usr4 = new Usuario();
		Usuario usr5 = new Usuario();
		Usuario usr6 = new Usuario();
		Usuario usr7 = new Usuario();
		Usuario usr8 = new Usuario();
		Usuario usr9 = new Usuario();
		Usuario usr10 = new Usuario();
		
		//asignacion entre referencias -no duplica objeto-
		
		usr1.nif = "123";
		usr1.nombre = "vic";
		usr1.apellidos = "tor";
		usr1.domicilio = "calle jose Nº26";
		usr1.correoE = "victorx@hotmail.com";
		usr1.fechaNacimiento = "02/04/98";
		usr1.fechaAlta = "02/07/16";
		usr1.claveAcceso = "guau";
		usr1.rol = "normal";
		
		usr0.nif = usr1.nif;
		usr0.nombre = usr1.nombre;
		usr0.apellidos = usr1.apellidos;
		usr0.domicilio = usr1.domicilio;
		usr0.correoE = usr1.correoE;
		usr0.fechaNacimiento = usr1.fechaNacimiento;
		usr0.fechaAlta = usr1.fechaAlta;
		usr0.claveAcceso = usr1.claveAcceso;
		usr0.rol = usr1.rol;
			
		System.out.println(usr0.toString());
		
		usr2.nif = "1234";
		usr2.nombre = "victor";
		usr2.apellidos = "martinez martinez";
		usr2.domicilio = "calle josé luján";
		usr2.correoE = "victorx_estudiante10@hotmail.com";
		usr2.fechaNacimiento = "02/04/97";
		usr2.fechaAlta = "02/07/17";
		usr2.claveAcceso = "·····";
		usr2.rol = "normal";
		
		usr3.nif = "123";
		usr3.nombre = "vic";
		usr3.apellidos = "tor";
		usr3.domicilio = "calle jose";
		usr3.correoE = "victorx@hotmail.com";
		usr3.fechaNacimiento = "02/04/98";
		usr3.fechaAlta = "02/07/16";
		usr3.claveAcceso = "····";
		usr3.rol = "normal";
		
		usr4.nif = "123";
		usr4.nombre = "vic";
		usr4.apellidos = "tor";
		usr4.domicilio = "calle jose";
		usr4.correoE = "victorx@hotmail.com";
		usr4.fechaNacimiento = "02/04/98";
		usr4.fechaAlta = "02/07/16";
		usr4.claveAcceso = "····";
		usr4.rol = "normal";
		
		usr5.nif = "123";
		usr5.nombre = "vic";
		usr5.apellidos = "tor";
		usr5.domicilio = "calle jose";
		usr5.correoE = "victorx@hotmail.com";
		usr5.fechaNacimiento = "02/04/98";
		usr5.fechaAlta = "02/07/16";
		usr5.claveAcceso = "····";
		usr5.rol = "normal";

		usr6.nif = "123";
		usr6.nombre = "vic";
		usr6.apellidos = "tor";
		usr6.domicilio = "calle jose";
		usr6.correoE = "victorx@hotmail.com";
		usr6.fechaNacimiento = "02/04/98";
		usr6.fechaAlta = "02/07/16";
		usr6.claveAcceso = "····";
		usr6.rol = "normal";
		
		usr7.nif = "123";
		usr7.nombre = "vic";
		usr7.apellidos = "tor";
		
		usr7.domicilio = "calle jose";
		usr7.correoE = "victorx@hotmail.com";
		usr7.fechaNacimiento = "02/04/98";
		usr7.fechaAlta = "02/07/16";
		usr7.claveAcceso = "····";
		usr7.rol = "normal";
	
		usr8.nif = "123";
		usr8.nombre = "vic";
		usr8.apellidos = "tor";
		usr8.domicilio = "calle jose";
		usr8.correoE = "victorx@hotmail.com";
		usr8.fechaNacimiento = "02/04/98";
		usr8.fechaAlta = "02/07/16";
		usr8.claveAcceso = "····";
		usr8.rol = "normal";
		
		usr9.nif = "123";
		usr9.nombre = "vic";
		usr9.apellidos = "tor";
		usr9.domicilio = "calle jose";
		usr9.correoE = "victorx@hotmail.com";
		usr9.fechaNacimiento = "02/04/98";
		usr9.fechaAlta = "02/07/16";
		usr9.claveAcceso = "·······";
		usr9.rol = "normal";
		
		usr10.nif = "123";
		usr10.nombre = "vic";
		usr10.apellidos = "tor";
		usr10.domicilio = "calle jose";
		usr10.correoE = "victorx@hotmail.com";
		usr10.fechaNacimiento = "02/04/98";
		usr10.fechaAlta = "02/07/16";
		usr10.claveAcceso = "····";
		usr10.rol = "normal";

	}
	

	public static void mostrarTodosUsuarios() {
	
	}
	public static void iniciarSesionCorrecta() {
	
	}
	public static void buscarUsuario() {
	
	}
	public static void arrancarSimulacion() {
	
	}
	public static void mostrarMundo() {
	
	}
	public static void actualizarMundo() {
	
	}
	
	static boolean iniciarSesionCorrecta(Usuario usuarioActual, String identificadorUsr) {
		return usuarioActual.nif.equals(identificadorUsr);
	}
	
	private static Usuario buscarUsuario(String identificadorUsrIntroducido) {
		//buscar usuario
		return null;
	}

}
