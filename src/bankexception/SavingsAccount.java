package bankexception;

public class SavingsAccount extends BankAccount{
		private double interestRate;

		public SavingsAccount(int balance, double interestRate) {
			super(balance);
			this.interestRate = interestRate;
			//잔액과 이자율 필드 초기화
		}
		
		@Override
		public String getAccountType() {
		// TODO Auto-generated method stub
		return "저축예금";
		}

		public void updateBalance(int period) {
			
			super.deposit((int)(super.getBalance()*period*interestRate));
			//저축기간을 받아 이자를 계산하여 잔액에 추가
			//(저축기간 월 단위. 이자는 단리법[단리원리금 = 원금*이율*기간+원금])
		}
	}

