package lecture06;

import java.util.Scanner;

public class Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1_000_000; //상수는 대문자와 스네이크 표기법 사용
	
	
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		
		if (MIN_BALANCE < balance && MAX_BALANCE >balance) {

			this.balance = balance;
			
		}
	}
}
