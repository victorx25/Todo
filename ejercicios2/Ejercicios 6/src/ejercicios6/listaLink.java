package ejercicios6;

public class listaLink {
	// Atributos
	private Nodo primero;
	private int numElementos;

	// Métodos
	/**
	 * Constructor que inicializa los atributos al valor por defecto.
	 */
	public listaLink() {
	primero = null;
	numElementos = 0;
	}

	/** 
	 * Representa la estructura de un nodo para una lista dinámica con enlace simple.
	 */
	class Nodo {
	// Atributos
	Object dato;
	Nodo siguiente;    
	/**
	 * Constructor que inicializa atributos por defecto.
	 * @param elem - el elemento de información útil a almacenar.
	*/
	public Nodo(Object dato) {
	this.dato = dato;
	siguiente = null;
	}
	}
	
	public void add(int indice, Object dato) {     
	       //variables auxiliares
	        Nodo nuevo = null;
	        Nodo actual = null;
	        Nodo anterior = null;
	        
	if (indice > numElementos + 1 || indice < 0 || dato == null) {
	
		throw new IndexOutOfBoundsException("indice incorrecto:  " + indice);
	 }
	

	// Nuevo nodo al principio
	    if (indice == 0) {                         
	// si la lista está vacía el nuevo nodo es primero y último
	if (numElementos == 0) {
	        primero = new Nodo(dato);
	    } 
	    else {
	        // enlaza el nuevo nodo al principio 
	        nuevo = new Nodo(dato);
	        nuevo.siguiente = primero;
	        primero = nuevo;
	    }
	    numElementos++;     // actualiza el número de elementos
	  
	}        
	    
		if (indice > 0 && indice <= numElementos + 1) {        
		    nuevo = new Nodo(dato);                 

		        // Busca el nodo del elemento correspondiente al índice
		        anterior = obtenerNodo(indice-1);   // Guarda el anterior
		        actual = anterior.siguiente;       // Guarda donde inserta    
		        anterior.siguiente = nuevo;       // Enlaza el nuevo nodo
		        nuevo.siguiente = actual;            
		        numElementos++;             
		}
		    }
	
	private Nodo obtenerNodo(int indice) {
		// Lanza excepción si el índice no es válido.
		if (indice >= numElementos || indice < 0) {
		throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
		}
		// Recorre la lista hasta llegar al nodo  de posición buscada.
		Nodo actual = primero;
		for (int i = 0; i < indice; i++)
		actual = actual.siguiente;
		return actual;
		}


	
	public Object get(int indice) {
	// lanza excepción si el índice no es válido
	        if (indice >= numElementos || indice < 0) {
	            throw new IndexOutOfBoundsException("índice incorrecto: " + indice);
	        }
	Nodo aux = obtenerNodo(indice);
	       return aux.dato;
	} 

	
	public int size() {
	return numElementos;
	}

	}