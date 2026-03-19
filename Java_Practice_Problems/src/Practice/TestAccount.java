
public class TestAccount {

	public static void main(String[] args) {

		Account a1 = new Account(1122, 20000);
		a1.setAnnualInterestRate(4.5);

		a1.withdraw(2500);
		a1.deposit(3000);

		System.out.println("The account balance is: " + a1.getBalance());
		System.out.println("The monthly interest rate is: " + a1.getMonthlyInterest());
		System.out.println("The date when this account was created: " + a1.getDateCreated());

	}

}
