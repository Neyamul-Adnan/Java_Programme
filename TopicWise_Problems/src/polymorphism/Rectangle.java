package polymorphism;

public class Rectangle extends GeometricObject {
	
	private double width;
	private double length;
	
	public Rectangle(double width, double length, String color) {
		super(color);
		System.out.println("Rectangle Constractor Called");
		this.width = width;
		this.length = length;
	}
	@Override
	public double getArea() {
		return width * length;
	}
	@Override
	public double getPerimeter() {
		return 2 * (width + length);
	}
	
	

}
