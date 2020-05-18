import java.util.Scanner;

public class GradeEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오 : ");
		int i =sc.nextInt();
		System.out.print("등급은 : ");
		//
		switch(1) {
		case 1:
			if (90<=i & i<=100) {
				System.out.print("A");
				break;
			}
		case 2:
			if (80<=i & i<=89) {
				System.out.print("B");
				break;
				}
			
		case 3:
			if (70<=i & i<=79) {
				System.out.print("C");
				break;
				}
			
		case 4:
			if (60<=i & i<=69) {
				System.out.print("D");
				break;
				}
			
		case 5:
			if (60>i) {
				System.out.print("F");
				break;
				}
			sc.close();
		}System.out.println(" 입니다.");
	}
}
