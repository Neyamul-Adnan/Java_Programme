package objects_and_classes;

import java.util.Date;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account(int id, double balance) {
		
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	public Account() {
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	public double withdraw(double amount) {
		return balance -= amount;
	}
public double deposit(double amount) {
	return balance += amount;
	}
}
