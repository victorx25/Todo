package prototipo1;
/** 
 * JVPrincipal.java
 * 
 * @author dam17-06 2017.12.11
 */

import java.util.Scanner;


public class JVPrincipal {
	// Apartado 6:
	static final int MAX_USUARIOS = 10;
	static final int MAX_SESIONES = 10;
	static final int MAX_INTENTOS_FALLIDOS = 3;
	static final int TAMAÑO_MUNDO = 50;
	static final int CICLOS_SIMULACION = 8;
	
	static int fil, col;
	static byte[][] m = new byte[100][100];
	static byte[][] mt = new byte[100][100];
	
	static Usuario[] datosUsuarios = new Usuario[MAX_USUARIOS];
	static SesionUsuario[] datosSesiones = new SesionUsuario[MAX_SESIONES];
	static int sesionesRegistradas = 0;				// Control de sesiones registradas.
	
	public static void main(String[] args) {	
		// Apartados 4 y 5: Pruebas previas
		//probarUsuario();
		//probarSesionUsuario();

		// Apartado 7: 
		cargarUsuariosPrueba();		
		mostrarTodosUsuarios();
		
		
		// Apartado 8:
		if (inicioSesionCorrecto()) {
			cargarDemoMundo();
			arrancarSimulacion();
			
		}
		else {
			System.out.println("\nDemasiados intentos fallidos...");
		}
			
		System.out.println("Fin del programa.");
	}

	/**
	 * Apartado 8:
	 * Controla el acceso de usuario 
	 * y registro de la sesion correspondiente. 
	 * @return true si la sesion se inicia correctamente.
	 */
	
	static void cargarDemoMundo() {
		fil = 35;
	    col = 50;
	    m[3][2] = m[3][3] = m[3][4] = m[3][5] = m[3][6] = m[3][7] = m[3][8] = m[3][9] = m[3][11] = m[3][12] = m[3][17] = m[3][18] = m[3][20] = m[3][21] = m[3][22] = m[3][23] = m[3][24] = m[3][25] = m[3][26] = m[3][27] = m[3][35] = m[3][37] = m[3][38] = m[3][39] = m[3][40] = m[3][45] = 1;
	    m[4][2] = m[4][3] = m[4][4] = m[4][5] = m[4][6] = m[4][7] = m[4][8] = m[4][9] = m[4][11] = m[4][12] = m[4][17] = m[4][18] = m[4][20] = m[4][21] = m[4][22] = m[4][23] = m[4][24] = m[4][25] = m[4][26] = m[4][27] = m[4][34] = m[4][35] = m[4][37] = m[4][40] = m[4][44] = m[4][45] = 1;
	    m[5][5] = m[5][6] = m[5][11]= m[5][12] = m[5][13] = m[5][17]=m[5][18]=m[5][20]=m[5][21]=m[5][33]=m[5][35]=m[5][37]=m[5][43]=m[5][45]=1;
	    m[6][5]=m[6][6]=m[6][11]=m[6][12]=m[6][13]=m[6][14]=m[6][17]=m[6][18]=m[6][20]=m[6][21]=m[6][22]=m[6][23]=m[6][32]=m[6][35]=m[6][37]=m[6][38]=m[6][39]=m[6][40]=m[6][42]=m[6][43]=m[6][44]=m[6][45]=1;
	    m[7][5]=m[7][6]=m[7][11]=m[7][12]=m[7][14]=m[7][15]=m[7][17]=m[7][18]=m[7][20]=m[7][21]=m[7][22]=m[7][23]=m[7][27]=m[7][28]=m[7][29]=m[7][30]=m[7][35]=m[7][40]=m[7][45]=1;
	    m[8][5]=m[8][6]=m[8][11]=m[8][12]=m[8][15]=m[8][16]=m[8][17]=m[8][18]=m[8][20]=m[8][21]=m[8][27]=m[8][28]=m[8][29]=m[8][30]=m[8][35]=m[8][40]=m[8][45]=1;
	    m[9][2]=m[9][3]=m[9][4]=m[9][5]=m[9][6]=m[9][7]=m[9][8]=m[9][9]=m[9][11]=m[9][12]=m[9][16]=m[9][17]=m[9][18]=m[9][20]=m[9][21]=m[9][35]=m[9][37]=m[9][40]=m[9][45]=1;
	    m[10][2]=m[10][3]=m[10][4]=m[10][5]=m[10][6]=m[10][7]=m[10][8]=m[10][9]=m[10][11]=m[10][12]=m[10][17]=m[10][18]=m[10][20]=m[10][21]=m[10][35]=m[10][37]=m[10][38]=m[10][39]=m[10][40]=m[10][45]=1;
	    m[20][2]=m[20][3]=m[21][2]=m[21][3]=1;
	    m[20][7]=m[21][7]=m[22][7]=m[19][8]=m[18][9]=m[18][10]=m[23][8]=m[24][9]=m[24][10]=1;
	    m[21][11]=m[19][12]=m[20][13]=m[21][13]=m[22][13]=m[21][14]=m[23][12]=1;
	}
	
	private static boolean inicioSesionCorrecto() {
		String nif = "";
		String claveAcceso = "";
		Scanner teclado = new Scanner(System.in);	// Entrada por consola.
		boolean todoCorrecto = false;				// Control de credenciales de usuario.
		Usuario usrSesion = null;					// Usuario en sesion.
		int intentos = MAX_INTENTOS_FALLIDOS;
		int contador = 0;
		
		do{
			
		System.out.println("Introduce el nif");
		nif = teclado.nextLine();
		
		System.out.println("Introduce la clave de acceso");
		claveAcceso = teclado.nextLine();
		
		usrSesion = buscarUsuario(nif);
		contador++;
		
		
		if (usrSesion == null) {
			System.out.println("Usuario no encontrado...");
		}
			else {
				if(usrSesion.claveAcceso.equals(claveAcceso)) {
					System.out.println("Bien_Venido");
					return !todoCorrecto;
				}
				else System.out.println("contraseña incorrecta...");
			}
		}while (contador < intentos);
			
		return todoCorrecto;
	}

	/**
	 * Apartado 8:
	 * Busca usuario dado su nif.
	 * @param idUsr - el nif del Usuario a buscar.
	 * @return - el Usuario encontrado o null si no existe.
	 */
	public static Usuario buscarUsuario(String idUsr) {
		
		for (Usuario usr: datosUsuarios) {
			if (usr.nif.equals(idUsr)) {
				return usr;
			}
		}
		return null;
	}
	
	
	/**
	 * Apartado 8:
	 * Ejecuta una simulacion del juego de la vida en la consola.
	 * Utiliza la configuracion por defecto.
	 */
	static void arrancarSimulacion() {
		int generaciones = CICLOS_SIMULACION;
		do {
		mostrarMundo();
		actualizarMundo();
		generaciones--;
		}while (generaciones > 0);
	}

	/**
	 * Apartado 8:
	 * Despliega en la consola el estado almacenado, corresponde
	 * a una generacion del Juego de la vida.
	 */
	private static void mostrarMundo() {
	
		for(int i = 0; i < TAMAÑO_MUNDO; i++) {
			for (int j = 0; j <TAMAÑO_MUNDO; j++) {
				System.out.print((m[i][j] == 1) ? "|o" : "| ");
				
				/**if (m[i][j] == 1) {
					System.out.print("|o");
				}
				else {
					System.out.print("| ");
				}
				*/
			}
			System.out.println("|");
		}
			
	}
	
	
	/**
	 * Apartado 8:
	 * Actualiza el estado almacenado del Juego de la Vida.
	 * @return nuevoEstado, el array con los cambios de la siguiente generacion.
	 */
	
	static byte[][] actualizarMundo()  {     					
		
		byte[][] mt = new byte[100][100];
			  for (int i = 1; i < fil - 1; i++) {
			    for (int j = 1; j < col - 1; j++) {
			      int sum = m[i - 1][j - 1] + m[i][j - 1] + m[i + 1][j - 1] + m[i + 1][j] + m[i + 1][j + 1] + m[i][j + 1] + m[i - 1][j + 1] + m[i - 1][j];
			      if (sum == 3) {
			        mt[i][j] = 1;
			      } else if (sum != 2) {
			        mt[i][j] = 0;
			      }
			    }
			  }
			  m = mt;
		return mt;
	}

	/**
	 * Apartado 7:
	 * Muestra por consola todos los usuarios almacenados.
	 */
	private static void mostrarTodosUsuarios() {
		for (Usuario u: datosUsuarios) {
			System.out.println("\n" + u);
		}
	}

	/**
	 * Apartado 7:
	 * Genera datos de prueba validos dentro 
	 * del almacen de datos.Miau
	 */
	private static void cargarUsuariosPrueba() {
		Usuario usuarioAux = new Usuario();
		usuarioAux.nif = "2344556K";
		usuarioAux.nombre = "Pepe"; 
		usuarioAux.apellidos = "Lopez Perez";
		usuarioAux.domicilio = "C/Luna, 27 30132 Murcia";
		usuarioAux.correo = "pepe@gmail.com";
		usuarioAux.fechaNacimiento = "1999.11.12";
		usuarioAux.fechaAlta = "2017.12.3";
		usuarioAux.claveAcceso = "Miau#0";
		usuarioAux.rol = "usuario normal";
		datosUsuarios[0] = usuarioAux;

		for (int i = 1; i < MAX_USUARIOS; i++) {
			usuarioAux = new Usuario();
			usuarioAux.nif = i + "344556K";
			usuarioAux.nombre = "Pepe" + i; 
			usuarioAux.apellidos = "Lopez" + " Perez" +i ;
			usuarioAux.domicilio = "C/Luna, 27 30132 Murcia";
			usuarioAux.correo = "pepe" + i + "@gmail.com";
			usuarioAux.fechaNacimiento = "1999.11.12";
			usuarioAux.fechaAlta = "2017.12.3";
			usuarioAux.claveAcceso = "Miau#" + i;
			usuarioAux.rol = "usuario normal";
			datosUsuarios[i] = usuarioAux;
		}
	}

	/**
	 * Apartado 5: 
	 * Pruebas de la clase SesionUsuario
	 */
	private static void probarSesionUsuario() {

		// Datos para la prueba...
		Usuario usr = new Usuario();
		usr.nif = "23456790K";
		usr.nombre = "Pepe";
		usr.apellidos = "Lopez Perez";
		usr.domicilio = "C/Luna, 27 30132 Murcia";
		usr.correo = "pepe@gmail.com";
		usr.fechaNacimiento = "1999.11.12";
		usr.fechaAlta = "2017.12.3";
		usr.claveAcceso = "Miau#0";
		usr.rol = "usuario normal";
		
		// Prueba de la clase SesionUsuario
		SesionUsuario sesion1 = new SesionUsuario();
		sesion1.usr = usr;
		sesion1.fecha = "2017.12.3";
		System.out.println(sesion1);	
	}
	
	/**
	 * Apartado 4: 
	 * Pruebas de la clase Usuario
	 */
	private static void probarUsuario() {
		Scanner teclado = new Scanner(System.in);

		// Prueba de la clase Usuario

		Usuario usr1;
		//Equivalencia
		//usr1.nombre = "Luis";
		//null.nombre = "Luis";	

		// Asignacion entre referencias -no duplica objeto-
		Usuario usr2 = new Usuario();
		usr1 = usr2;

		usr2.nif = "23456790K";
		usr2.nombre = "Pepe";
		usr2.apellidos = "Lopez Perez";
		usr2.domicilio = "C/Luna, 27 30132 Murcia";
		usr2.correo = "pepe@gmail.com";
		usr2.fechaNacimiento = "1999.11.12";
		usr2.fechaAlta = "2017.12.3";
		usr2.claveAcceso = "miau";
		usr2.rol = "usuario normal";

		// Modifica tambien usr2, son el mismo objeto
		usr1.nombre = "Luis";
		System.out.println("usr1: " + usr1.nombre);
		System.out.println("usr2: " + usr2.nombre);

		//Aqui si duplica
		Usuario usr4 = new Usuario();
		usr4 .nif = usr2.nif;
		usr4.nombre = usr2.nombre;
		usr4.apellidos = usr2.apellidos;
		usr4.domicilio =  usr2.domicilio;
		usr4.correo = usr2.correo;
		usr4.fechaNacimiento = usr2.fechaNacimiento;
		usr4.fechaAlta = usr2.fechaAlta;
		usr4.fechaAlta = usr2.fechaAlta;
		usr4.rol = usr2.rol;

		// Son diferentes objetos.
		usr4.nombre = "Pedro";
		System.out.println(usr2.nombre);

		// Desde teclado...
		Usuario usr3 = new Usuario();
		System.out.println("Entrada de datos de usuario... ");
		System.out.print("nif: ");	
		usr3.nif = teclado.next();
		System.out.print("nombre: ");	
		usr3.nombre = teclado.next();
		System.out.print("apellidos: ");
		usr3.apellidos = teclado.next();
		System.out.print("domicilio: ");
		usr3.domicilio =  teclado.next();
		System.out.print("correo: ");
		usr3.correo = teclado.next();
		System.out.print("fechaNacimiento: ");
		usr3.fechaNacimiento = teclado.next();
		System.out.print("fechaAlta: ");
		usr3.fechaAlta = teclado.next();
		System.out.print("claveAcceso: ");
		usr3.claveAcceso = teclado.next();
		System.out.print("rol: ");
		usr3.rol = "NORMAL";

		// Si toString() de Usuario no esta redefinido...
		System.out.println(usr1); 		// Muestra identificador inico de objeto
		System.out.println(usr2);
		System.out.println(usr3);
		System.out.println(usr4);
	}

} //class