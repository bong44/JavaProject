package lecture10;

import java.util.InputMismatchException;

import java.util.Scanner;

public class ExceptionTask01 {
	
	public static void main(String[] args) throws InputMismatchException,ArithmeticException{
		
		boolean run = false;
		
		int firstVal = 0;
		int secondVal = 0; 
		int result = 0;
		
		Scanner scanner = new Scanner(System.in); 
		
		do {
			try {				
				firstVal = scanner.nextInt();
				secondVal = scanner.nextInt();
				result = firstVal / secondVal;
				System.out.println(firstVal + " / " + secondVal + " = " + result);
				run = false;
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				scanner.next(); //문자를 입력했을 때, 스캐너에 남아있는 역슬래쉬를 빼주는 작업(숫자가 입력되었을 때는 안 해줘도 댐)
				run = true;
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
//				scanner.next();
				run = true;
			}
			
		} while (run);
	
		
		
		scanner.close();
		
	}
	
	
} 
