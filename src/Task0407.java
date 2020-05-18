import java.util.Scanner;

public class Task0407 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("허용 오차: ");
		
		//닐라칸타 공식 
		
		double range = scanner.nextDouble();
		int count = 2;
		double rangePi= 3;
		double subi = 1;
		int i=2;
		int j=4;
	
		do {
			for (; i <= j; i++) {
			
				subi *= i;
				
			}
			
			if (count%2==0) {
				
				rangePi += 4/subi;
			
			} else {
				rangePi -= 4/subi;
				}
			
			i--;
			j=i+2;
			count++;
			subi = 1;
			
		} while (Math.abs(Math.PI - rangePi) > range);
		
		System.out.println("Math.PI = "+Math.PI);
		System.out.println("계산된 파이값 = "+rangePi);
		System.out.println("반복횟수: "+(count-2));
	
	}
}


//double pi = 3;
//double sign = 1;
//for(int index=2;true;index+=2) {//증감식에서도 방법을 찾아보면댐
//	count++;
//	pi += 4.0/(i*(i+1)*(i+2)) * sign; //부호를 곱해주는 방식(ㄹㅇ)   
//	sign*=-1; //부호변경
//	if (Math.abs(Math.PI-pi)< range) {
//		break;
//	}
//}