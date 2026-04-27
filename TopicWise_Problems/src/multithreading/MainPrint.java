package multithreading;

public class MainPrint {

	public static void main(String[] args) {
	
		PrintLetter task1 = new PrintLetter('A');
		PrintNum task2 = new PrintNum(10);
		PrintLetter task3 = new PrintLetter('B');
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		Thread t3 = new Thread(task3);
		
		t1.start();
		
		t2.start();
		
		t3.start();
	}

}
