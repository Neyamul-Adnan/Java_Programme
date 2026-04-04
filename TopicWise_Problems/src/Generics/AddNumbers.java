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

		AddNumbers<Integer> in = new AddNumbers<>(5, 10);
		System.out.println("Integer Sum = " + in.add());
		
		AddNumbers<Double> d = new AddNumbers<>(5.5, 4.5);
		System.out.println("Double Sum = " + d.add());
		

	}
}
