import java.util.Scanner;

public class ExampleQuiz01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("단을 입력하세요: ");
		int dan = scanner.nextInt();
		int sum = 0;
		
		System.out.println("----"+dan+"단"+"----");
		
		for (int i = 1; i < 10; i++) {
			sum = dan*i;
			System.out.println(dan+" * "+i+" = "+sum);
		}
		scanner.close();
		
	}
}
