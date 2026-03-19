import java.util.Scanner;

public class LargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.print("Enter array elements : ");
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int largest = arr[0];
		int smallest = arr[0];
		

		for (int i = 0; i < n; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			} if(arr[i] < smallest){
				smallest = arr[i];
			}
		}
		System.out.println("Largest number : " + largest);
		System.out.println("Smallest number : " + smallest);
	}

}
