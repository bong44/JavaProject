package lecture08;

public class Bank {
	private Customer[] customers = new Customer[100];
	private int numberOfCustomers = 0;
	
	public Bank() {
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	public void addCustomer(Customer customer) {
		customers[numberOfCustomers] = customer;
		numberOfCustomers++;
	}
	
	public Customer getCustomer(int index) {
		return customers[index];
	}
	
	
}
