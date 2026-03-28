/*
 * 7. Write a complete Java program to count the number of characters, 
 * number of words, and number of lines from a text file.
 */

package File;
import java.io.*;
import java.util.Scanner;
public class lab07 {

	public static void main(String[] args) throws Exception{
		File in = new File("src/File/File.txt");
		//PrintWriter F = new PrintWriter(in); 
		
		Scanner sc = new Scanner(in);
		
		int lineCount = 0;
		int charCount = 0;
		int wordCount = 0;
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			lineCount++;
			
			charCount += line.length();
			
			if(! line.trim().isEmpty()) {
				String word[] = line.trim().split("\\s+");
				wordCount += word.length;
			}
		}
		sc.close();
		
		System.out.println("Number of characters: " +charCount);
		System.out.println("Number of Words: " +wordCount);
		System.out.println("Number of Lines: " +lineCount);

	}

}
