package polymorphism;

public class Test {

	public static void main(String[] args) {
		GeometricObject c = new Circle(10, "Blue");
		System.out.println("-----Circle-----");
		System.out.println("Area: " +c.getArea());
		System.out.println("Perimeter: " +c.getPerimeter());
		
		System.out.println();
		
		GeometricObject r = new Rectangle(5, 6, "Yellow");
		System.out.println("-----Rectangle-----");
		System.out.println("Area: " +r.getArea());
		System.out.println("Perimeter: " +r.getPerimeter());

	}

}
