package prototipo1;

/**
 *nif 
 *
 *nombre
 *
 *apellidos
 *
 *domicilio
 *
 *correoE
 *
 *fechaNacimiento
 *
 *fechaAlta
 *
 *claveAcceso
 *
 *rol
 */

public class Usuario {
	//variables de clase
	public String nif;
	public String nombre;
	public String apellidos;
	public String domicilio;
	public String correoE;
	public String fechaNacimiento;
	
	public String fechaAlta;
	public String claveAcceso;
	public String rol;
	
	@Override
	public String toString() {
		return "Usuario nif:\t\t" + nif + "\nnombre:\t\t\t" + nombre + "\napellidos:\t\t" + apellidos + "\ndomicilio:\t\t" + domicilio
				+ "\ncorreo:\t\t\t" + correoE + "\nfecha de nacimiento:\t" + fechaNacimiento + "\nfecha de alta:\t\t" + fechaAlta
				+ "\nclave de acceso:\t" + claveAcceso + "\nrol:\t\t\t" + rol;
	}
	
	
	

}
