import java.util.Scanner;

public class task2_3 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.print("첫번째 수를 입력하세요: ");
	int a = sc.nextInt();
	System.out.print("두번째 수를 입력하세요: ");
	int b = sc.nextInt();
	String re = (a > b) ? "true" : "false";
	System.out.print("첫번째 수가 두번째 수보다 큰가? "+re);
	
}
}
