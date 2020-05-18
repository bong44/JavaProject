import java.util.Random;
import java.util.Scanner;

public class Task0405 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNum = random.nextInt(100)+1; //1~100 까지의 랜덤숫자를 생성
		int saveVal = 0;
		do {
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
			int firstVal = scanner.nextInt();
			if (randomNum > firstVal) {
				System.out.println("정답은 더 큰 수 입니다.");
			} else if (randomNum < firstVal) {
				System.out.println("정답은 더 작은 수 입니다.");				
			}
			saveVal = firstVal;//scanner로 받아오기 전이라 코딩에서는 값이 있다고 인식을 못하는 듯
		} while (randomNum!=saveVal); // 반대로 생각했었음 유의!
		System.out.println("정답입니다.");
		System.out.println("게임을 종료합니다.");
	}
}
