package autoevaluacion4;



class Usuario {

    //Atributos
    public String nif;
    public String nombre;
    public String apellidos;
    public String correoE;
    public String domicilio;
    public String fechaNacimiento;
    public String fechaAlta;
    public String claveAcceso;
    public String rol;
    
    @Override
    public String toString() {
    	return  "\n nif: \t\t" + nif 
    			+ "\n nombre: \t" + nombre 
    			+ "\n apellidos: \t" + apellidos 
    			+ "\n domicilio: \t" + domicilio 
    			+ "\n correoE: \t" + correoE
    			+ "\n fechaNacim:\t" + fechaNacimiento
    			+ "\n fechaAlta: \t" + fechaAlta 
    			+ "\n claveAcceso: \t" + claveAcceso
    			+ "\n rol: \t\t" + rol + "\n" ;
    
    }

}

public class Principal {

    final static int MAX_USUARIOS = 45;
    public static Usuario[] datosUsuarios = new Usuario[MAX_USUARIOS];
   
    public static void cargarDatosUsuariosPatron(int[] patron) {

    	// Variables
		int tamanio = patron.length-1;
		int iPtr = 0;
		int iUsr = 0;
		for (int i = 0; i < datosUsuarios.length; i++) {	// Usuarios u: datosUsuarios
			Usuario u = new Usuario();	 // Crea un usuario
			
			
			if(patron[iPtr] == 1) {	// Si la posicion es 1
				u.nif = "12345A" + iUsr;
				u.nombre = "Pepe" + iUsr;
				u.apellidos = "Lopez Perez" + iUsr;
				u.domicilio = "C/Luna, 27 30132 Murcia";
				u.correoE = "pepe"+ iUsr + "@gmail.com";
				u.fechaNacimiento = "1999.11.12";
				u.fechaAlta = "2017.12.3";
				u.claveAcceso = "Miau" + iUsr;
				u.rol = "usuario normal";
				datosUsuarios[iUsr] = u;
			}
		else {
			datosUsuarios[iUsr] = null;
			}
			iPtr++;
			iUsr++;
			if(iPtr > tamanio) {
				iPtr = 0;
			}
		}
			
		mostrarTodosUsuarios();
			}
    
     static void mostrarTodosUsuarios() {
		for (Usuario u: datosUsuarios) {
			System.out.println( u);
		}
	}
				

    
    public static void main(String arguments[]) {
    	int[] patron = {1,0,1,0,0,1};	// Crea el array
    	cargarDatosUsuariosPatron(patron);	// Llama al metodo
    }
    
}
