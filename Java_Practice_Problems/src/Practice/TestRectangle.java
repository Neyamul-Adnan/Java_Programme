/*
Question:The Rectangle class. 
   Design a class named Rectangle to represent a rectangle. The class contains:
	1. Two double data fields named width and height that specify the width and height of the
   		rectangle. The default values are 1 for both width and height.
	2. A no-arg constructor that creates a default rectangle.
	3. A constructor that creates a rectangle with the specified width and height.
	4. A method named getArea() that returns the area of this rectangle.
	5. A method named getPerimeter() that returns the perimeter.
Write a test program that creates two Rectangle objects—one with width 4 and height 40, and other
with width 3.5 and height 35.9. Display the width, height, area, and perimeter of each rectangle in
this order.
 */

//import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("Enter Rectangle Width: "); double w = sc.nextDouble();
		 * System.out.print("Enter height: "); double h = sc.nextDouble();
		 * 
		 * Rectangle r = new Rectangle(w, h); System.out.println();
		 */
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);

		System.out.println("Rectangle 01");
		System.out.println("Width = " + r1.width);
		System.out.println("Height = " + r1.height);
		System.out.println("Area = " + r1.getArea());
		System.out.println("Perimeter = " + r1.getPerimeter());

		System.out.println();

		System.out.println("Rectangle 02");
		System.out.println("Width = " + r2.width);
		System.out.println("Height = " + r2.height);
		System.out.println("Area = " + r2.getArea());
		System.out.println("Perimeter = " + r2.getPerimeter());

	}

}
