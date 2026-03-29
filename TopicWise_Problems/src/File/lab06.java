
/*
 * Write a complete Java program that reads a bunch of numbers 
 * from a file (input.txt) and separates the even number and odd numbers 
 * and writes them into two separate files namely even.txt and odd.txt.
 */
package File;

import java.io.*;
import java.util.*;

public class lab06 {

	public static void main(String[] args) throws Exception {
		File in = new File("src/File/Input.txt");
		File e = new File("src/File/Even.txt");
		File o = new File("src/File/Odd.txt");
		
		PrintWriter even = new PrintWriter(e);
		PrintWriter odd = new PrintWriter(o);

		Scanner sc = new Scanner(in);

		while (sc.hasNextInt()) {
			int num = sc.nextInt();
			
			if (num % 2 == 0) {
				even.print(num + " ");
			} else {
				odd.print(num + " ");
			}

		}
		sc.close();
		odd.close();
		even.close();
		System.out.println("Even and Odd numbers separated successfully!");

	}
}
