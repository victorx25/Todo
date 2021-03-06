package modelo;

/** Proyecto: Juego de la vida.
 *  Implementa el concepto de Nif según el modelo 2.
 *  Utiliza un string para representar el texto del nif.  
 *  @since: prototipo 2
 *  @source: Nif.java 
 *  @version: 2 - 2018/02/14 
 *  @author: victormm
 */
public class Nif {
	private String texto;

	/**
	 * Constructor convencional. Utiliza método set...()
	 * @param nif
	 * @throws ModeloException
	 */
	public Nif(String texto) throws ModeloException {
		setTexto(texto);
	}

	/**
	 * Constructor defecto. Utiliza método set...()
	 * @throws ModeloException 
	 */
	public Nif() throws ModeloException {
		this("00000000T");
	}

	/**
	 * Constructor copia. 
	 * @param nif
	 */
	public Nif(Nif nif) {
		texto = new String(nif.texto);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto)throws ModeloException {
		assert texto != null;
		if (formatoValido(texto) && letraNIFValida(texto)) {
			this.texto = texto;
		}
		else {
			throw new ModeloException("Nif: formato o letra no valido");
		}
	}

	/**
	 * Comprueba validez del nif.
	 * @param texto.
	 * @return true si cumple.
	 */
	private boolean formatoValido(String texto) {
		return	texto.matches("^[\\d]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$");
	}
	
	private boolean letraNIFValida(String texto) {
		int numeroNIF = Integer.parseInt(texto.substring(0, 8));
		if (texto.charAt(8) == "TRWAGMYFPDXBNJZSQVHLCKE".charAt(numeroNIF % 23)){
			return true;
		}
		return false;
				}
	
	/**
	 * hashCode() complementa al método equals y sirve para comparar objetos de forma 
	 * rápida en estructuras Hash. 
	 * Cuando Java compara dos objetos en estructuras de tipo hash (HashMap, HashSet etc)
	 * primero invoca al método hashcode y luego el equals.
	 * @return un número entero de 32 bit.
	 */
	@Override
	public int hashCode() {
		final int primo = 31;
		int result = 1;
		result = primo * result + ((texto == null) ? 0 : texto.hashCode());
		return result;
	}

	/**
	 * Dos objetos son iguales si: 
	 * Son de la misma clase.
	 * Tienen los mismos valores en los atributos; o son el mismo objeto.
	 * @return falso si no cumple las condiciones.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj != null && getClass() == obj.getClass()) {
			if (this == obj) {
				return true;
			}
			if (texto.equals(((Nif) obj).texto)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Genera un clon del propio objeto realizando una copia profunda.
	 * @return el objeto clonado.
	 */
	@Override
	public Object clone() {
		// Utiliza el constructor copia.
		return new Nif(this);
	}
	@Override
	public String toString() {
		return texto;
	}

}
