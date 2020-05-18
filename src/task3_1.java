import java.util.Scanner;

public class task3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int a = sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		int b = sc.nextInt();
		int big = ((a+b) + Math.abs(a-b))/2;
		int small = ((a+b) - Math.abs(a-b))/2;
		int re = big/small;
		int re1 = big%small;
		System.out.print("큰 수를 작은 수로 나눈 몫은 "+re+"이고, 나머지는 "+re1+"이다.");
	}
}
