import java.util.Scanner;

public class task3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("윤년인지를 확인할 연도를 입력하세요: ");
		int a = sc.nextInt();
		
		switch (1) {
		case 1: if(a/4==1 & a/100!=0) {
			System.out.print(a+"년은 윤년입니다.");
			break;
		}
		case 2: if(a/400==1) {
			System.out.print(a+"년은 윤년입니다.");			
			break;
		}
		default: 
			System.out.print(a+"년은 윤년이 아닙니다.");			
			break;
			
		}
		sc.close();
	}
}
