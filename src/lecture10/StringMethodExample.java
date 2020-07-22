package lecture10;

import java.util.Scanner;

public class StringMethodExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.next();
		
		if (inputString.length() > 7) {
			System.out.println(inputString);
			System.out.println("7번째 글자: "+inputString.charAt(6));
			char charAt = inputString.charAt(6);
		}else {
			System.err.print("7글자 이상 입력하세요.");
		}
		
		
		scanner.close();
	}
}
