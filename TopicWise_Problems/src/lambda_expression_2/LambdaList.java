package lambda_expression_2;

import java.util.ArrayList;

public class LambdaList {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//Printing all the elements
		list.forEach(n -> {
			System.out.print(n + " ");
		});
		int sum = list.stream().map(n -> n * n).reduce(0, Integer::sum);
		System.out.println("\nSum of Squares = " + sum);
	}
}