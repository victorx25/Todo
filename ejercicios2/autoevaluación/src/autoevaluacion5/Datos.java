package autoevaluacion5;

/**
 * Clase que contiene un array de objetos de la clase Usuario
 * y métodos para las pruebas y manipulación del array.
 * @author ajp
 */
public class Datos {

    // Vector de objetos
    public static Usuario[] datosUsuarios;

    
    public static void importarUsuariosTexto(String texto) {
    	String[] usuario = texto.split(";");
    	datosUsuarios = new Usuario[usuario.length + 20];

    	for (int i = 0; i < usuario.length; i++) {
    		String[] atributos = usuario[i].split(",");
    		
    		Usuario usr1 = new Usuario();
    		new Usuario(usr1.nif = atributos[0], usr1.nombre = atributos[1], usr1.apellidos = atributos[2], 
    				usr1.domicilio = atributos[3], usr1.correo = atributos[4], usr1.fechaNacimiento = atributos[5],
    						usr1.fechaAlta = atributos[6], usr1.claveAcceso = atributos[7], usr1.rol = atributos[8]);
    		
    		datosUsuarios[i] = usr1;
    	}
    	
    	mostrarTodosUsuarios();
    }
    
    static void mostrarTodosUsuarios() {
		for (Usuario u: datosUsuarios) {
			System.out.println("\n" + u);
		}
	}
    
    public static void main(String[] args) {

        	importarUsuariosTexto("0344556K,pepe0,López Pérez0,C/Luna 27 30132 Murcia,pepe0@gmail.com,"
        		+ "1990.11.12,2015.12.3,miau0,usuario normal;0344556K,pepe1,López Pérez1,C/Luna 27 30132 Murcia,pepe0@gmail.com,"
        		+ "1990.11.12,2015.12.3,miau1,usuario normal;0344556K,pepe2,López Pérez2,C/Luna 27 30132 Murcia,pepe0@gmail.com,"
        		+ "1990.11.12,2015.12.3,miau2,usuario normal;");
    }
}

/**
 * Clase que representa el usuario de un sistema.
 * @author ajp
 */
class Usuario {

    //Atributos
    public String nif;
    public String nombre;
    public String apellidos;
    public String domicilio;
    public String correo;
    public String fechaNacimiento;
    public String fechaAlta;
    public String claveAcceso;
	public String rol;
	
	
	   public Usuario(String string, String string2, String string3, String string4, String string5, String string6,
			String string7, String string8, String string9) {
	}


	public Usuario() {
	}


	@Override
		public String toString() {
			return "nif=" + nif + "\n nombre=" + nombre + "\n apellidos=" + apellidos + "\n domicilio=" + domicilio
					+ "\n correo=" + correo + "\n fechaNacimiento=" + fechaNacimiento + "\n fechaAlta=" + fechaAlta
					+ "\n claveAcceso=" + claveAcceso + "\n rol=" + rol;
		}
}

