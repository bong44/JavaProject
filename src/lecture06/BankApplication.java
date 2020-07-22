package lecture06;

import java.util.Scanner;

public class BankApplication {
	
	
	private BankAccount[] accounts = new BankAccount[100];
	
	
	private void createAccount(String accountNo, String owner, int balance) {
		for (int i = 0; i <= accounts.length-1; i++) { // 배열의 크기는 100이지만 99로 돌아가야댐 아니면 indexbound애러남?? 맞음? 99에서 멈추긴할탠데
			if (accounts[i] == null) {
				accounts[i] = new BankAccount(accountNo, owner, balance);  //타입을 클레스 형태로 받아와 이 느낌적인 느낌으로 담아줌
				break;
				}else if (accounts[99] != null) {
					System.out.println("더이상 추가할 수 없습니다.");
					break;
				}
			}
		}
	
	private void accountList() {
		for (int i = 0; i <= accounts.length-1; i++) {
			if (accounts[i] != null) {
				System.out.print("계좌번호 : "+accounts[i].getAccountNo()+" | ");
				System.out.print("계좌주 : "+accounts[i].getOwner()+" | ");
				System.out.println("계좌잔액 : "+accounts[i].getBalance()+" | ");				
			}
		}
	}
	
	private void deposit(String owner, int balance) {
		for (int i = 0; i <= accounts.length-1; i++) {
			if (accounts[i].getOwner().equals(owner)) {
				accounts[i].setBalance(balance);
				break;
			}
		}
		System.out.println("값이없습니다.");
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankApplication application = new BankApplication();
		boolean run = true;
		
		while (run) {
			System.out.println("1: 신규등록 || 2: 회원조회 || 3: 잔액변경");
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				System.out.print("계좌번호를 입력하세요 :");
				String accountNo = scanner.next();
				System.out.print("계좌주명을 입력하세요 :");
				String owner = scanner.next();
				System.out.print("초기금액을 입력하세요 :");
				int balance = scanner.nextInt();
				
				application.createAccount(accountNo,owner,balance);
				
				
			}else if (selectNo == 2) {
				application.accountList();
			}else if (selectNo == 3) {
				System.out.print("변경할 계좌주명: ");
				String owner = scanner.next();
				System.out.print("변경할 금액수을 입력하세요: ");
				int balance = scanner.nextInt();
				
				application.deposit(owner, balance);
			}
			
		}
		
		scanner.close();
	}
	
	
	
	
	
}
