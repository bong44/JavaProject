
import java.util.Scanner;

public class ExampleQuiz01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int sum = 0;
		
		int totalDays = 0;
		
		totalDays += (year - 1900) * 365;
		
		totalDays += (year - 1900) / 4;
		
		if(((year % 4 == 0)&&(year % 100 != 0))||(year % 400 == 0)) {
			totalDays -= 1;
			days[1] = 29;
		} 
		
		System.out.println(days[1]);
		
		if(month != 1) {
		for (int i = 0; i < month-1; i++) {
			
			sum += days[i];
			
		}
		sum += day;
		
		System.out.println("현재까지 "+sum+"일");
	}

	}
}
