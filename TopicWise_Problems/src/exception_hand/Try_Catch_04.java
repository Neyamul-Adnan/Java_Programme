package exception_hand;
import java.util.Scanner;

public class Try_Catch_04 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	try {
	String st = input.nextLine();
	
	int num = Integer.parseInt(st);
	
	int result = 100/num;
	System.out.println("Result: " + result);
	
	}catch(NumberFormatException e) {
		
	}
	}
}
