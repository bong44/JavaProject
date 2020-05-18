import java.util.Scanner;

public class task3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수도입니까?(수도: 1, 수도아님: 0)");
		int a =sc.nextInt();
		System.out.print("총 인구는?(단위: 만)");
		int b =sc.nextInt();
		System.out.print("연소득이 1억 이상인 인구는?(단위: 만)");
		int c =sc.nextInt();
		String prinYE = "이 도시는 메트로폴리스입니다.";
		String prinNO = "이 도시는 메트로폴리스가 아닙니다.";
		String re = (c>50)?prinYE:((a==1&b>=100)?prinYE:prinNO);
		System.out.println(re);
	}
}
