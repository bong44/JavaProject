import java.util.Scanner;

public class Task05_02_03 {
	public static void main(String[] args) {
		
		boolean run = true;
		
		Scanner scanner = new Scanner(System.in);
		
		int[] circulatorDay = {31,28,31,30,31,30,31,31,30,31,30}; 
		String[] dayHangul = {"일","월","화","수","목","금","토"}; 
		
		while (run) {
			String dayFinal = "";
			int totalDays = 0;
		
		System.out.print("년도를 입력하세요: ");
		int year = scanner.nextInt();
		System.out.print("월을 입력하세요: ");
		int month = scanner.nextInt();
		System.out.print("일을 입력하세요: ");
		int day = scanner.nextInt();
		
//		if (year<1900||year>2100) {
//			System.out.println("입력이 잘못되었습니다.");
//			continue;
//		}
		
		totalDays += (year - 1900) * 365;
		
		totalDays += (year - 1900) / 4;
		
		System.out.println(year % 4);
		System.out.println(year % 100);
		System.out.println(year % 400);
		
		if((((year % 4 == 0)&&(year % 100 != 0))||(year % 400 == 0))&&month==2 || month==1) {
			totalDays -= 1;
			
		} 
		
		if(month>1) {
			for (int i = 0; i+1 < month; i++) {
				totalDays += circulatorDay[i];
				System.out.println(totalDays);
				}
			}
			
			totalDays += day;
			
			dayFinal = dayHangul[totalDays % 7];						
			System.out.println(totalDays % 7);
			System.out.println(year+"년 "+month+"월 "+day+"일 은 "+dayFinal+"요일입니다");
		
		
		System.out.print("계속하시겠습니다?(y/n)");
		String answer = scanner.next();
		if (answer.equals("n")) {
			run = false;
			System.out.println("프로그램을 종료합니다.");
		}else {
			continue;
		}
		
		}
		
	}
}
