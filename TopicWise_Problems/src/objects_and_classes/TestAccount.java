package objects_and_classes;

public class TestAccount {

	public static void main(String[] args) {
		
		Account a1 =  new Account(1122, 20000);
		a1.setAnnualInterestRate(4.5);
		System.out.print("Initial Account Balance:" + a1.getBalance());
		
		a1.withdraw(2500);
		System.out.print("\nAfter withdraw $2500, Balance:" + a1.getBalance());
		
		a1.deposit(3000);
		System.out.print("\nAfter deposit $3000, Balance:" + a1.getBalance());
	
		System.out.print("\nAccount balance: " + a1.getBalance());
		System.out.print("\nMonthly Interest: " + a1.getMonthlyInterest());
		System.out.print("\nAccount Created on: " + a1.getDateCreated());

	}

}
