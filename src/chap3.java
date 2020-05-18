import java.util.Random;
import java.util.Scanner;

public class chap3 {
	public static void main(String[] args) {
	
			Scanner scanner = new Scanner(System.in);
			Random random = new Random();//여기서 랜덤 값 설명해주면 안댐
			System.out.print("사람: ");
			String inputUser = scanner.next();
			System.out.print("컴퓨터: ");
			int comInput = random.nextInt(3);  //랜덤값 선언할 때는 여기서 넣어줘야 함!!
			String inputRandom = "";    //3이면 0,1,2 중에
			String resultPrint = "";
			
			switch (comInput) {
			case 0: 
				inputRandom = "가위";
				break;
			case 1:
				inputRandom = "바위";
				break;
			case 2:
				inputRandom = "보";
				break;
			}
			System.out.println(inputRandom);
			
			if (inputRandom.equals(inputUser)) {
				resultPrint = "무승부!";
			} else if (
					inputRandom.equals("가위")&&inputUser.equals("보")||
					inputRandom.equals("바위")&&inputUser.equals("가위")||
					inputRandom.equals("보")&&inputUser.equals("바위")
					) {
					resultPrint = "사람 승!";
			}else {
				resultPrint = "컴퓨터 승!";
			}
			System.out.println("결과: " + resultPrint);
		
	}
		
}

// 이처럼 0으로 시작하는 구조는 배열을 사용 할 수 있기에 간단하게 코딩할 수 있
//String[] inputRandom = {"가위"+"바위"+"보"};
//String playerPc = inputRandom[comInput];
