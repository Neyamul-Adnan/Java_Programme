package File;

import java.io.*;
import java.util.*;

public class lab06 {

	public static void main(String[] args) throws Exception {
		File in = new File("src/File/Input.txt");
		FileWriter e = new FileWriter("src/File/Even.txt");
		FileWriter o = new FileWriter("src/File/Odd.txt");

		if (!in.exists()) {
			System.out.println("File not found. Creating and adding 1-100...");
			FileWriter wr = new FileWriter(in);

			for (int i = 1; i <= 100; i++) {
				wr.write(i + " ");
			}
			wr.close();
		} else {
			FileWriter wr = new FileWriter(in);
			
			for (int i = 1; i <= 100; i++) {
				wr.write(i + " ");
			}
			wr.close();
			System.out.println("File already exists. Skipping creation...");
		}

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
