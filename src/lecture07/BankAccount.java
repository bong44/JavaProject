package lecture07;

public class BankAccount {
	protected int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public boolean withdraw(int amount) {
		this.balance -= amount;
		return true;
	}
	
	public boolean transfer(int balance, BankAccount otherAccount) {
		otherAccount.deposit(balance);
		this.withdraw(balance);
		return true;
	}

	@Override
	public String toString() {
		return "잔액: " + balance;
	}
}
