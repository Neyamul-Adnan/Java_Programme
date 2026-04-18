package Generics;

public class Print {
	
	public static <T> void print(T[] array) {
		for(T element : array ) {
			System.out.println(element + " ");
		}
	}


	public static void main(String[] args) {
		

		Integer[] in = {1, 2, 50};
		String[] st = {"hello", "this is java"};
		
		print(in);
		print(st);
	}

}
