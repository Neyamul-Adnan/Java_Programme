package abstractClasses;

public class Triangle extends GeometricObject {

	private double width;
	private double length;
	
	

	public Triangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double getArea() {
		return 1.0 / 2.0 * (width * length);
	}

	@Override
	public void printArea() {
		System.out.println("\nTriangle Constractor Called");
		System.out.println("Triangle Area: " + getArea());

	}

}
