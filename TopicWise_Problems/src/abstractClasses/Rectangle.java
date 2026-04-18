package abstractClasses;

public class Rectangle extends GeometricObject {

	private double width;
	private double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double getArea() {
		return width * length;
	}

	@Override
	public void printArea() {
		System.out.println("\nRectangle Constractor Called");
		System.out.println("Rectangle Area: " + getArea());

	}

}
