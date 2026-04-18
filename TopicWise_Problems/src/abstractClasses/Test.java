package abstractClasses;

public class Test {

	public static void main(String[] args) {
		
		GeometricObject c = new Circle(5);
		GeometricObject t = new Triangle(2, 3);
		GeometricObject r = new Rectangle(5, 6);
		
		c.printArea();
		t.printArea();
		r.printArea();

	}

}
