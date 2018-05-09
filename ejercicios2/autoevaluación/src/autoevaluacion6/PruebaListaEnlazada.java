package autoevaluacion6;

	public class PruebaListaEnlazada {
		public static void main(String[] args) {
		ListaLink listaCompra = new ListaLink();
		listaCompra.add(0,"Leche");
		listaCompra.add(0,"yogures");
		listaCompra.add(0,"Aceite");
		listaCompra.add(0,"Cereales");
		listaCompra.add(0,"Cafelito");
		//listaCompra.add(0,null);
		System.out.println("Lista de la compra:");
		for (int i = 0; i < listaCompra.size(); i++) {
		System.out.println(listaCompra.get(i));
		}
		
		}
	}
