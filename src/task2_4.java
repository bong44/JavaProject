import java.util.Scanner;

public class task2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm)");
		double half = sc.nextDouble(); 
		System.out.print("원기둥의 높이 입력하시오.(단위: cm)");
		double height = sc.nextDouble();
		double bot_area = (half*half)*Math.PI;
		double cir_area =height *= bot_area;
		System.out.print("원기둥 밑변의 넓이는 "+bot_area+"㎠이고, 원기둥의 부피는 "+cir_area+"㎠이다.");
	}
}
