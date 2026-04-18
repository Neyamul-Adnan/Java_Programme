package file_In_Out;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) throws IOException {
		File m = new File("MainFile.txt");
		File o = new File("ODDFile.txt");
		File e = new File("EVENFile.txt");
		
		Scanner sc = new Scanner(m);
		
		PrintWriter odd = new PrintWriter(o);
		PrintWriter even = new PrintWriter(e);
		
		while (sc.hasNextInt()){
			int n = sc.nextInt();
			
			if(n % 2 == 0) {
				even.print(n);
			}
			else
				odd.print(n);
		}
		System.out.println("Successful");
		

	}

	private static void While(boolean hasNextInt) {
		// TODO Auto-generated method stub
		
	}

}
