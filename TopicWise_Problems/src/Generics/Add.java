package Generics;

public class Add <T extends Number>{

	public T n1;
	public T n2;
	
	
	public Add(T n1, T n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	public double add() {
		return n1.doubleValue() + n2.doubleValue();
	}


	public static void main(String[] args) {
		
		Add<Double> d = new Add<>(10.5, 20.5);
		Add<Integer> in = new Add<>(10, 20);
		
		System.out.println("Double : " + d.add());
		System.out.println("Integer: " + in.add());

	}

}
