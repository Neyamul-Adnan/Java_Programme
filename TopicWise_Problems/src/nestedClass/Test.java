package nestedClass;

public class Test {

	public static void main(String[] args) {
		
		// create an OuterClass Object
		
		
		// To create an inner class object follow the step:
		// 1. Create first an outer class object
		// 2. use outer class name to access inner class name 
		// and use outer class object to access inner class constructor
		OuterClass outOb = new OuterClass(110);
		OuterClass.InnerClass inOb = outOb.new InnerClass(20);
		OuterClass.StaticNestedClass stOb = new OuterClass.StaticNestedClass();
		inOb.print(2);
		stOb.print();
		// Create static Nested class object
		//OuterClass.StaticNestedClass stOb = new OuterClass.StaticNestedClass();
		//stOb.print();
	}

}