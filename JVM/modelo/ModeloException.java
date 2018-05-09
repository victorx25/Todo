package modelo;

public class ModeloException extends Exception {

	/**
	 * Excepción por defecto sin mensaje.
	 * @param mensaje -el mensaje de error asociado.
	 */
	public ModeloException(String mensaje) {
		super(mensaje);
	}
/**
 * Excepción por defecto sin mensaje
 */
	public ModeloException() {
		super();
	}
	
}
