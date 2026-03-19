import java.util.Date;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	Account() {
		dateCreated = new Date();
	}

	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	int getId() {
		return id;
	}

	void setID(int id) {
		this.id = id;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	double getAnnualInterestRate() {
		return annualInterestRate;
	}

	void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	Date getDateCreated() {
		return dateCreated;
	}

	double getMonthlyInterestRate() {
		return annualInterestRate / 12 / 100;
	}

	double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	void withdraw(double amount) {
		balance -= amount;
	}

	void deposit(double amount) {
		balance += amount;
	}
}
