package lecture07;

public class CheckingAccount extends BankAccount{
	private SavingsAccount protectedBy;
	
	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}
	
	
	@Override
	public boolean withdraw(int amount) {
		if (super.getBalance() < amount) {
			protectedBy.withdraw(amount - super.getBalance());
			super.deposit(amount - super.getBalance());
			return super.withdraw(amount);
		}else {
			return super.withdraw(amount);
		}
	}

	@Override
	public String toString() {
		return "CheckingAccount [protectedBy=" + protectedBy + "]";
	}
	
	
}
