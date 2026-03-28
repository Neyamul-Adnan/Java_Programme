
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
		FileWriter e = new FileWriter("src/File/Even.txt");
		FileWriter o = new FileWriter("src/File/Odd.txt");

		Scanner sc = new Scanner(in);

		while (sc.hasNextInt()) {
			int num = sc.nextInt();
			if (num % 2 == 0) {
				e.write(num + " ");
			} else {
				o.write(num + " ");
			}

		}
		sc.close();
		o.close();
		e.close();
		System.out.println("Even and Odd numbers separated successfully!");

	}
}
