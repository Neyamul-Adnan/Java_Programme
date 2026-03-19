package exception_hand;

import java.util.Scanner;

public class Try_Catch_02 {

	public static void main(String[] args) {

		
		int count = 1;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter first number: ");
				int a = sc.nextInt();
				System.out.print("Enter second number: ");
				int b = sc.nextInt();
				int c = a / b;
				System.out.println("The result is (" + a + "/" + b + "): " + c);
				System.out.println("Program executed successfully");
				count++;
			} catch (Exception e) {
				System.out.println("Error:" + e);
				System.out.println("Please enter integer numbers");
				System.out.println();
			}
		} while (count == 1);

	}

}
