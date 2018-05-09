package poligono;

public abstract class Poligono {

	private double lados;
	
	
	public Poligono(double lados) {
		this.lados = lados;
	}
	
	public Poligono() {
		
	}

	public double getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}
	
	public abstract double area();
		
	
}