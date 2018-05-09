package ejercicios6;

import ejercicios6.listaLink;

public class listaEnlazada {
	public static void main(String[] args) {
	listaLink listaCompra = new listaLink();
	listaCompra.add(0,"Leche");
	listaCompra.add(0,"yogures");
	listaCompra.add(0,"Aceite");
	listaCompra.add(0,"Cereales");
	listaCompra.add(0,"Cafelito");
	System.out.println("Lista de la compra:");
	for (int i = 0; i < listaCompra.size(); i++) {
	System.out.println(listaCompra.get(i));
	}
	
	}
}