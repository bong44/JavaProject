import java.util.Scanner;

public class Task0403 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요.");
		System.out.print("프로그래밍 기초: ");
		int firstVal = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int secondVal = scanner.nextInt();
		System.out.print("화면 구현: ");
		int thirdVal = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int forthVal = scanner.nextInt();
		System.out.print("머신러닝: ");
		int fifthVal = scanner.nextInt();
		
		int sum = (firstVal+secondVal+thirdVal+forthVal+fifthVal);
		System.out.println("총점:"+sum);
		double avg = (firstVal+secondVal+thirdVal+forthVal+fifthVal)/5.0;
		System.out.println("평균:"+avg);
		
		
		
		
		
		
		
		System.out.print("학점: ");
		
		switch (1) {
		
		case 1:
			if(avg>=90) {
				System.out.println("A");
				break;
				}
		case 2:
			if(avg>=80) {
				System.out.println("B");
				break;
				}
		case 3:
			if(avg>=70) {
				System.out.println("C");
				break;
				}
		case 4:
			if(avg>=60) {
				System.out.println("D");
				break;
				}
		default:
				System.out.println("F");
				break;
		}
	scanner.close();
	
	}
}
