package ejercicios6;


	public class ListaArray {

		// Atributos 
		private Object[] arrayElementos;
		private int numElementos;
		private static final int TAMAÑO_INICIAL = 4;

		// Métodos  
		/** 
		 * Inicializa el array de elementos de la lista.  
		 */
		public ListaArray() {
		arrayElementos = new Object[TAMAÑO_INICIAL];
		numElementos = 0;
		}
		 
		/**
		 * @return número de elementos actual en la lista.
		 */
		public int size() {
		       return numElementos;
		}

		// ...

	/**
	* Añade un elemento a la lista.
	* @param elem - el elemento a añadir. Admite que el elemento a añadir sea null.
	*/
	public void add(Object elem) {

	// Delega en el método más específico para añadir al final.    
	add(numElementos, elem);
	}
	 
	/**
	 * Inserta un elemento en la posición especificada por el índice.
	 * @param indice - indica la posición de inserción en la lista.
	 * @param elem - elemento a insertar. Admite que el elemento a añadir sea null.
	 * @exception IndexOutOfBoundsException - índice no está entre 0 y numElementos-1.
	 */
	public void  add(int indice, Object elem) {

	// El índice debe ser válido para la lista.
	if (indice > numElementos || indice < 0) {
	throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
	}

	// El array interno está casi lleno, se duplica el espacio.
	if (numElementos + 1 == arrayElementos.length) {
	Object[] arrayAmpliado = new Object[arrayElementos.length * 2];
	System.arraycopy(arrayElementos, 0, arrayAmpliado, 0, numElementos);
	arrayElementos = arrayAmpliado;
	}

	// Inserción, desplaza los elementos una posición a la derecha según el índice.
	if (indice < numElementos) {
	System.arraycopy(arrayElementos, indice, arrayElementos, indice + 1, numElementos - indice);
	}
	arrayElementos[indice] = elem;
	numElementos++;
}
	/**
	* Devuelve el índice de la primera ocurrencia para el objeto especificado.
	* @param elem - el elemento buscado.
	* @return el índice del elemento o -1 si no lo encuentra.
	*/
	public int indexOf(Object elem) {
	if (elem == null) {
	for (int i = 0; i < arrayElementos.length; i++) {
	       if (arrayElementos[i] == null) {
	return i;
	}
	}
	} 
	else {
	for (int i = 0; i < arrayElementos.length; i++) {
	if (elem.equals(arrayElementos[i])) {
	return i;
	}
	}
	}
	return -1;
	}
	 
	/**
	 * Borra todos los elementos de la lista.
	 */
	public void clear() {
	    arrayElementos = new Object[TAMAÑO_INICIAL];
	    numElementos = 0;
	}
	 
	/**
	 * Comprueba si existe un elemento.
	 * @param elem – el elemento a comprobar.
	 * @return true - si existe.
	 */
	public boolean contains(Object elem) {
	   return indexOf(elem) != -1; 
	}
	 
	/**
	 * Obtiene el elemento-dato por índice.
	 * @param indice - posión relativa del nodo que contiene el elemento-dato.
	 * @return el objecto dato indicado por el índice de nodo; null si está indefinido.
	 * @exception IndexOutOfBoundsException - índice no está entre 0 y numElementos-1.
	 */
	public Object get(int indice) {
	// El índice debe ser válido para la lista.
	if (indice >= numElementos || indice < 0) {
	throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
	}  
	    return arrayElementos[indice];
	}
	/**
	 * Elimina el elemento especificado en el índice.
	 * @param indice - del elemento a eliminar.
	 * @return - el elemento eliminado.
	* @exception IndexOutOfBoundsException - índice no está entre 0 y numElementos-1.
	 */
	public Object remove(int indice) {
	// El índice debe ser válido para la lista.
	if (indice >= numElementos || indice < 0) {
	throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
	}
	// Elimina desplazando uno hacia la izquierda, sobre la posición a borrar.
	Object elem = arrayElementos[indice];
	System.arraycopy(arrayElementos, indice+1, arrayElementos, indice, numElementos-indice+1);

	// Ajusta el último elemento.
	arrayElementos[numElementos-1] = null;
	numElementos--;
	return elem;
	}
	 
	/**
	 * Elimina el elemento especificado.
	 * @param elemento - elemento a eliminar.
	 * @return - el índice del elemento eliminado o -1 si no existe.
	 */
	public int remove(Object elem) {
	int indice = indexOf(elem);

	if (indice != -1) {
	 remove(indice);
	        }         
	return indice;
}
	}
	