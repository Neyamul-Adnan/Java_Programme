package abstractClasses;

public class Circle extends GeometricObject {

	private double radius;

	public Circle(double radius) {

		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public void printArea() {
		System.out.println("\nCircle Constractor Called");
		System.out.println("Circle Area: " + getArea());
	}

}
