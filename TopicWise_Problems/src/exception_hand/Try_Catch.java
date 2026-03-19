package exception_hand;

import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		int a = sc.nextInt();
		System.out.print("Enter another integer number: ");
		int b = sc.nextInt();
		int c;
		
		/*if we wanna devide first number by 2nd and the user enter 0 as 
		 * 2nd num then the code will show an error and programme will not run.
		 * also all the lines below the error line won't run
		 */
		//let's handle it with try-catch block
		try {
			c = a/b;
			System.out.println("The ans is: " + c);
		}
		catch(Exception ex) { //if we don't know what exception will occur we can enter "Exception" in the parenthesis
			System.out.println("Please enter second number > 0");
		}
		

	}

}
