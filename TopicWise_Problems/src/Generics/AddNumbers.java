/*
A Generic Class for Adding Two Numbers
Create a generic class called AddNumbers that can add two numbers of any data type. 
Create instances of the class and use them to add two integers and two doubles. 
Use wrapper classes (Number, Integer, Double etc.) to create instances.
*/

package Generics;

public class AddNumbers<T extends Number> {
	public T n1;
	public T n2;

	AddNumbers(T n1, T n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public double add() {
		return n1.doubleValue() + n2.doubleValue();
	}

	public static void main(String[] args) {

		AddNumbers<Integer> in = new AddNumbers<>(15, 25);
		System.out.println("Integer Sum = " + in.add());

		AddNumbers<Double> d = new AddNumbers<>(5.6, 4.9);
		System.out.println("Double Sum = " + d.add());

	}
}
