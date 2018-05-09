package ejercicios6;

import ejercicios6.listaLinkRemove;

public class listaEnlazadaRemove {
	public static void main(String[] args) {
	listaLinkRemove listaCompra = new listaLinkRemove();
	listaLinkRemove DatosAborrar = new listaLinkRemove();
	listaCompra.add(0,"Leche");
	listaCompra.add(0,"yogures");
	listaCompra.add(0,"Aceite");
	listaCompra.add(0,"Cereales");
	listaCompra.add(0,"Cafelito");
	
	DatosAborrar.add(0,"Leche");
	DatosAborrar.add(0,"yogures");
	
	System.out.println("Lista de la compra:");
	for (int i = 0; i < listaCompra.size(); i++) {
	System.out.println(listaCompra.get(i));
	}
	
	listaCompra.removeAll(DatosAborrar);
	
	System.out.println("\nLista de la compra:");
	for (int i = 0; i < listaCompra.size(); i++) {
	System.out.println(listaCompra.get(i));
	}
	}
}