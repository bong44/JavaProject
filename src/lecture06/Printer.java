package lecture06;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Printer {
	public static void println(int value) {
		System.out.println(value);
	}
	public static void println(Boolean value) {
		System.out.println(value);
	}
	public static void println(Double value) {
		System.out.println(value);
	}
	public static void println(String value) {
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년MM월dd일hh:mm:ss")));
	}
}
