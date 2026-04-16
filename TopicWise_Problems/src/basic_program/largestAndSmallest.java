package basic_program;

import java.util.Scanner;

public class largestAndSmallest{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		int[] num = new int[n];
		
		System.out.println("Enter the elements of the array:");
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		
		int max = num[0];
		int min = num[0];
		
		for(int i=0; i<n; i++) {
			if(num[i] > max) {
				max = num[i];
			}
			if(num[i]<min) {
				min = num[i];
			}
		}
	System.out.println("Largest int: " +max);
	System.out.println("Smallest int: " +min);
	}
}