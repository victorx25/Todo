package mercado;

public class manzana {
	
	private double peso;
	private double precio;
	
	
	public manzana() {
		peso = 0;
		precio = 0;
	}
	
	
	public manzana(double peso,double precio) {
		this.peso = peso;
		this.precio = precio;
	}
	

	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return "peso: " + peso + "Kg" + " precio: " + precio + "€";
	}
	public static void main(String arguments[]) {
		
		manzana manzana1 = new manzana(1,2);
		manzana manzana2 = new manzana(2,3.4);
	
		System.out.println("manzana1: " + manzana1);
		System.out.println("manzana2: " + manzana2);
		
	}

}