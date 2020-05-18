import java.util.Scanner;

public class Exercis08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = 0;
//		System.out.print("5월 부터 11월 중의 날짜를 입력하시오 :");
		int plus=11;
		for(int m=5;m<11;m++) {		
			for(int mp=plus;mp<=31;mp+=7) {
				System.out.println(mp+" 일 청소");
				d=mp;
				plus =0;
				
			} 
			if(m==5) {d-=7;}
			d+=6;
			if(m==6 | m==9) {d+=1;}
			System.out.println(d);
			plus = d-23;
			System.out.println(plus);
			if(m==7 | m==8) {plus-=1;}
			System.out.println(plus);
		}
	}
}
