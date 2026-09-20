package nestedClass;

// Java allows one class to define inside another class.
// this is know as nested class.
// nested classes are of two types: 
// 1. inner class and 
// 2. nested static class.
public class OuterClass {
	int outVariable;
	int x =10;
	public OuterClass(int outVariable) {
		this.outVariable = outVariable;
	}
	public void print() {
		System.out.println(outVariable);
	}
	// non-static nested class also called inner class
	class InnerClass{
		int x = 5;
		int inVariable;
		public InnerClass(int inVariable) {
			this.inVariable = inVariable;
		}
		public void print(int x) {
			System.out.println(x); // print local variable
			System.out.println(this.x); // print inner class variable
			System.out.println(OuterClass.this.x); // outer class x
		}
	}
	// static nested class
	static class StaticNestedClass{
		static int stVariable = 12;
		public StaticNestedClass() {
			
		}
		public static void print() {
			System.out.println(stVariable);
		}
	}
	// why nested class? 
	//Ans: 
	// 1. It is a way of logically grouping classes that are used in one places.
	// 2. It increases encapsulation.
	// 3. It can lead to more readable and maintainable code
	
}