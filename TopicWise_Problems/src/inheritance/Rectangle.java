package inheritance;

public class Rectangle extends GeometricObject {
	
	private double width;
	private double length;
	public Rectangle() {
		width = 1;
		length = 1;
	}
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public Rectangle(String color, boolean isFilled, double width, double length) {
		super(color, isFilled);
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return width * length;
	}
	public double getPerimeter() {
		return 2 * (width + length);
	}
	
	

}
