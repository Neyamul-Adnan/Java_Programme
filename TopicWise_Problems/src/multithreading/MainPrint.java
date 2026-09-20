package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainPrint {

	public static void main(String[] args) {
	
		PrintLetter task1 = new PrintLetter('A');
		PrintNum task2 = new PrintNum(11);
		PrintLetter task3 = new PrintLetter('B');
		PrintLetter task4 = new PrintLetter('C');
		
		ExecutorService  pool = Executors.newFixedThreadPool(100);
		
		pool.execute(task1);
		pool.execute(task2);
		pool.execute(task3);
		
		pool.shutdown();
		
		//Thread t1 = new Thread(task1);
		//Thread t2 = new Thread(task2);
		//Thread t3 = new Thread(task3);
		
		/*
		t1.start();
		t2.start();
		t3.start();
		*/
	}

}
