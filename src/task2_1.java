import java.util.Scanner;

public class task2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //스캐너 선언
		System.out.print("가로의 길이는?(단위 m): ");
		double Wid = sc.nextDouble(); //스캐너로 데이터 받기
		System.out.print("세로의 길이는?(단위 m): ");  //ln을 쓰면 줄바꿈 그냥 print를 쓰면 줄바꿈 안하고 다음문장 출력  //
		double Hei = sc.nextDouble();//스캐너로 데이터 받기
		double area = Wid*Hei; //계산식 
		double perimeter = (Wid*2)+(Hei*2);  //계산식
		System.out.println("직사각형의 넓이: "+area);////화면에 문자열과 변수 합친 값 출력
		System.out.println("직사각형의 둘레: "+perimeter);//화면에 문자열과 변수 합친 값 출력
	}
}
