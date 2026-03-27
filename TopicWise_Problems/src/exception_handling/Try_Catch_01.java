package exception_handling;

import java.util.Scanner;

public class Try_Catch_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		int a = sc.nextInt();
		System.out.print("Enter another integer number: ");
		int b = sc.nextInt();
		int c;

		/*
		 * if we want to divide first number by 2nd and the user enter 0 as 2nd num then
		 * the code will show an error and program will not run. also all the lines
		 * below the error line won't run
		 */
		// let's handle it with try-catch block
		try {
			c = a / b;
			System.out.println("The ans is: " + c);
		} catch (Exception ex) { // if we don't know what exception will occur we can enter "Exception" in the
									// parenthesis
			System.out.println("Please enter second number > 0");
		}

		// another example
		try {
			int[] i = new int[4];
			i[4] = 10; // not showing error but runtime error occurs;
		} catch (Exception e) {
			System.out.println(e);
		}

		// finally block
		/*as we know, if an exception occurs and program can't catch it
		 * then the rest lines of the code will not  work. 
		 * that's why we use "finally" block so the desire line make work. 
		 */
		finally {
			System.out.println("this is the end of the code");
		}
	}

}
