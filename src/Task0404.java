import java.util.Scanner;

public class Task0404 {
	public static void main(String[] args) {
		System.out.println("가위 바위 보 게임!");
		Scanner scanner = new Scanner(System.in);
		System.out.print("철수: ");
		String firstVal = scanner.next();
		System.out.print("영희: ");
		String secondVal = scanner.next();		
		
		// (중요)String 타입 변수와 문자열 비교는 == 이 아닌 equals() 메소드로 비교하여야 한다.(아니면 주소값을 비교해버림)
		switch (firstVal) {
		case "가위": 
			if(secondVal.equals("바위")) {
			
				System.out.println("철수 승리!");
				break;
			
			} else if (secondVal.equals("보")) {

				System.out.println("영희 승리!");
				break;
			} else if (secondVal.equals("가위")) {
				
				System.out.println("무승부!");
				break;
			}
		case "바위":
			if(secondVal.equals("바위")) {
				
				System.out.println("무승부!");
				break;
			} else if (secondVal.equals("보")) {

				System.out.println("철수 승리!!");
				break;
			} else if (secondVal.equals("가위")) {
				
				System.out.println("영희 승리!!");
				break;
			}
		case "보":
			if(secondVal.equals("바위")) {
				
				System.out.println("영희 승리!");
				break;
			} else if (secondVal.equals("보")) {

				System.out.println("무승부!");
				break;
			} else if (secondVal.equals("가위")) {
				
				System.out.println("철수 승리!");
				break;
			}
		}
		
	}
}

//간단한 풀이
//
//if (firstVal.equals(secondVal)) {
//	System.out.println("비김");
//} else if (
//		(firstVal.equals("가위")&&secondVal.equals("바위"))||
//		(firstVal.equals("바위")&&secondVal.equals("보"))||
//		(firstVal.equals("보")&&secondVal.equals("가위"))
//		) {
//	System.out.println("영희 승");
//	
//} else {
//	System.out.println("철수 승");
//	
//}