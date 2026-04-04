package Generics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddNumbers<Integer> intNum = new AddNumbers<>(10, 20);
		System.out.println("Integer Sum: " + intNum.add());
		
		AddNumbers<Double> doubleNum = new AddNumbers<>(10.5, 20.4);
		System.out.println("Double Sum: " + doubleNum.add());
		
	}

}
