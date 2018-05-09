package modelo;

	public class ModeloException extends Exception {
		private static final long serialVersionUID = 1L;

	/**
	 * Excepcion por defecto sin mensaje.
	 */

	public ModeloException(){
		super();
	}
	
	/**
	 * Excepcion con mensaje.
	 * @param msg - el mensaje de error asociado.
	 */
	
	public ModeloException(String msg) {
		super(msg);
	}
	
}
