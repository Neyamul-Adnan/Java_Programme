package exception_hand;

import java.util.Scanner;

public class Try_Catch_03 {

	public static void main(String[] args) {
		/*
		 * Create an array of 5 integers. Ask the user to input an index and print the
		 * element at that index. 🔹 Requirements: Handle invalid index using
		 * ArrayIndexOutOfBoundsException Always print "Program ended" in finally 🔹
		 * Sample Input: Enter index: 7 🔹 Expected Output: Invalid index! Program ended
		 */

		int[] a = { 10, 20, 30, 50, 90 };

		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter index: ");
			int index = sc.nextInt();
			System.out.println("Element: " + a[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index!");
		} finally {
			System.out.println("Program ended");
		}
	}

}
