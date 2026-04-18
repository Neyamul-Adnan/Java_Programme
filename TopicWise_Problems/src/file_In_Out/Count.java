package file_In_Out;

import java.io.*;
import java.util.Scanner;

public class Count {
	public static void main(String[] args) throws IOException {
		File m = new File("text.txt");
		Scanner sc = new Scanner(m);
		
		int lineCount = 0;
		int charCount = 0;
		int wordCount = 0;
		
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			lineCount++;
			
			charCount += line.length();
			
			if(! line.trim().isEmpty()) {
				String[] word = line.trim().split("\\s+");
				wordCount += word.length;
			}
		}
		sc.close();
		System.out.println("Number of lines: " + lineCount);
		System.out.println("Number of char: " + charCount);
		System.out.println("Number of word: " + wordCount);
	}


}
