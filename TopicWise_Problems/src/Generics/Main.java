package Generics;

public class Main {

	public static void main(String[] args) {
		class AddNumbers<T extends Number> {

			public T n1;
			public T n2;

			public AddNumbers(T n1, T n2) {
				this.n1 = n1;
				this.n2 = n2;
			}

			public double add() {
				return n1.doubleValue() + n2.doubleValue();
			}
		}
		// TODO Auto-generated method stub
		AddNumbers<Integer> intNum = new AddNumbers<>(10, 20);
		System.out.println("Integer Sum: " + intNum.add());
		
		AddNumbers<Double> doubleNum = new AddNumbers<>(10.5, 20.4);
		System.out.println("Double Sum: " + doubleNum.add());
		
	}
	
}
