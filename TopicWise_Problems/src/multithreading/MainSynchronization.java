package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainSynchronization {

	private static Account acc = new Account();

	public static void main(String[] args) {

		ExecutorService tp = Executors.newFixedThreadPool(100);

		for (int i = 1; i <= 1000; i++) {
			tp.execute(new AddPenny());
		}
		tp.shutdown();
		while (!tp.isTerminated()) {
			// wait until all threads finish
		}
		System.out.println(acc.getBalance());

	}

	private static class Account {
		
		private int balance;
		
		//Method 03: for lock and unlock the deposit method
		Lock lockDep = new ReentrantLock();
		
		public Account() {
			this.balance = 0;
		}

		public int getBalance() {
			return balance;
		}

		/*
		 * Method 01: use "synchronized" keyword before return type. it will
		 * automatically lock the method for a single task and unlock after it finished
		  
		  public synchronized void deposit(int amount) { 
		  int newBalance = balance +
		  amount; balance = newBalance;
		  }
		  
		 */
		public void deposit(int amount) {
			lockDep.lock(); //lock the task(Method 03)
			int newBalance = balance + amount;
			balance = newBalance;
			lockDep.unlock(); //unlock the task after complete the task(Method 03)
		}
	}

	private static class AddPenny implements Runnable {

		@Override
		public void run() {
			/*
			 * Method 02:
			 	synchronized(acc){
			 	acc.deposit(1);
			 	}
			 */
			acc.deposit(1);
		}

	}

}
