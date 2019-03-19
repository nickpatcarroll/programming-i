/*
 * Nicholas Carroll
 * 22 December 2018
 * COMP171-800RL
 * Professor Pinzon
 * 
 * Must contain:
 *  ■ A private int data field named id for the account (default 0). 
 *  ■ A private double data field named balance for the account (default 0). 
 *  ■ A private double data field named annualInterestRate that stores the current interest rate (default 0). 
 *  ■ Assume all accounts have the same interest rate. 
 *  ■ A private Date data field named dateCreated that stores the date when the account was created. 
 *  ■ A no-arg constructor that creates a default account. 
 *  ■ A constructor that creates an account with the specified id and initial balance. 
 *  ■ The accessor and mutator methods for id,balance, and annualInterestRate. 
 *  ■ The accessor method for dateCreated. 
 *  ■ A method named getMonthlyInterestRate() that returns the monthly interest rate. 
 *  ■ A method named getMonthlyInterest() that returns the monthly interest. 
 *  ■ A method named withdraw that withdraws a specified amount from the account. 
 *  ■ A method named deposit that deposits a specified amount to the account.
 */
package lab10;
import java.util.Date;
public class AccountConstructor {
	
		// Data fields as per required by the textbook project
		private int id;
		
		private double balance;
		
		private static double annualInterestRate;
		
		private Date dateCreated;

		// Constructors
		AccountConstructor() {
			
			id = 0;
			
			balance = 0;
			
			annualInterestRate = 0;
			
			dateCreated = new Date(); 
		}

		// This will make an account with the specified id and initial balance
		AccountConstructor(int newId, double newBalance) {
			id = newId;
			balance = newBalance;
			dateCreated = new Date();
		}

		// mutator methods
		public void setId(int newId) {
			id = newId;
		}

		public void setBalance(double newBalance) {
			balance = newBalance;
		}

		public void setAnnualInterestRate(double newAnnualInterestRate) {
			annualInterestRate = newAnnualInterestRate;
		}

		// accessor methods
		public int getId() {
			return id;
		}

		public double getBalance() {
			return balance;
		}

		public double getAnnualInterestRate() {
			return annualInterestRate;
		}

		public String getDateCreated() {
			return dateCreated.toString();
		}

		public double getMonthlyInterestRate() {
			return annualInterestRate / 12;
		}

		// methods used in main program
		public double getMonthlyInterest() {
			return balance * (getMonthlyInterestRate() / 100);
		}

		public void withdraw(double amount) {
			balance -= amount;
		}


		public void deposit(double amount) {
			balance += amount;
		}
}
