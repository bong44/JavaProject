package lecture10;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeCreateExample {
	public static void main(String[] args) {
		
		LocalDate currDate = LocalDate.now();
		System.out.println("현재 날짜" + currDate);
		
		LocalDate targetDate = LocalDate.of(2024, 5, 10);
		System.out.println("목표 날짜" + targetDate + "\n");
		
		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시간" + currTime);
		
		LocalTime targetTime = LocalTime.of(6, 30,0,0);
		System.out.println(targetTime + "\n");
		
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시 " + utcDateTime);
	}
}
