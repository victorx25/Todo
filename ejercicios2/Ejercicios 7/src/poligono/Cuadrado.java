package poligono;

public class Cuadrado extends Poligono {

	private int lado;
	
	public Cuadrado(int lado) {
		super(lado);
		this.lado = lado;
	}
	
	@Override
	public double area() {
		int area = 0;
		area = this.lado * this.lado;
		return area;
	}
	
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

	public static void main(String[] args) {
		double areaa;
		Cuadrado c1 = new Cuadrado(4);
		areaa = c1.area();
		System.out.println(c1);
		System.out.println(areaa);
	}

}