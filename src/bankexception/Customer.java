package bankexception;

import java.util.Arrays;

public class Customer{
	private String firstName;
	private String lastName;
	private BankAccount[] accounts = new BankAccount[5];
	private int numberOfAccounts = 0;
	
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public BankAccount getAccounts(int index) {
		return accounts[index];
	}


	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	
	public void addAccount(BankAccount account) {
		accounts[numberOfAccounts] = account;
		numberOfAccounts++;
	}


	@Override
	public String toString() {
		return "이름: " + firstName + " " + lastName
				+ ", 계좌의 수: " + numberOfAccounts;
	}
	
	
	
	

}
