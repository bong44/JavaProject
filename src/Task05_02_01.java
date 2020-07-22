import java.util.Scanner;

public class Task05_02_01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] studentArrary = null;
		int sum = 0;
		double avg = 0.0;
		
		System.out.print("몇 명의 성적을 입력하시겠습니까? ");
		
		studentArrary = new int[scanner.nextInt()]; 
		
		for (int i = 0; i < studentArrary.length; i++) {
				
			System.out.print("성적을 입력하시오: ");
			studentArrary[i] = scanner.nextInt();
		
		}
		
		for (int i = 0; i < studentArrary.length; i++) {
			
			sum += studentArrary[i];
			
		}
		
		avg = (double)sum / studentArrary.length;
		
		System.out.println("총점은 "+sum+"이고, 평균 성적은 "+avg+"점 입니다.");
	}
}
