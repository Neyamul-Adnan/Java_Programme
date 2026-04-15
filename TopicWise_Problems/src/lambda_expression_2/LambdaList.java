package lambda_expression_2;

import java.util.ArrayList;
import java.util.List;

public class LambdaList {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		
		
		//Printing all the elements
		list.forEach(n -> {
			System.out.print(n + " ");
		});
		
		//Sum of square of elements
		int sum = list.stream().map(n -> n * n).reduce(0, Integer::sum);
		System.out.println("\nSum of Squares = " + sum);
		
		// Odd and Even number separation
		System.out.print("Even numbers:");
        List<Integer> even = list.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(even);

        System.out.print("Odd numbers:");
        List<Integer> odd = list.stream().filter(n -> n % 2 != 0).toList();
        System.out.println(odd);
        
        //Sum of square of Odd and Even numbers
        int evenSum = list.stream().filter(n -> n % 2 == 0).map(n -> n * n).reduce(0, Integer::sum);
        System.out.println("Sum of even squares = " + evenSum);
        int oddSum = list.stream().filter(n -> n % 2 != 0).map(n -> n * n).reduce(0, Integer::sum);
        System.out.println("Sum of odd squares = " + oddSum);
	}
}