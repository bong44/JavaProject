import java.util.Scanner;

public class Task0401 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
		int firstVal = scanner.nextInt();
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요: ");
		int secondVal = scanner.nextInt();
		System.out.print("삼각형의 세번째 변의 길이를 입력하세요: ");
		int thirdVal = scanner.nextInt();

		
		int low1 = 0;
		int low2 = 0;
		int high = 0;
		
		if (firstVal >= secondVal) {
			low1 = secondVal;
			if(firstVal >= thirdVal) {
				high = firstVal;
				low2 = thirdVal;
			} else {
				low1 = firstVal;
				if (thirdVal >= secondVal) {
					low2 = secondVal;
					high = thirdVal;
				}
			} 
		} else {
			low1 = firstVal;
			if (secondVal >= thirdVal) {
				low2 = thirdVal;
				high = secondVal;
			} 
		}
		
		if(high < low1+low2) {
			System.out.println("삼각형을 만들 수 있습니다!");
		} else {
			System.out.println("삼각형을 만들 수 없습니다.");
		}
		scanner.close();
	}
}


//간단한 표현방식 
//if(
//		(firstVal < secondVal + thirdVal)&&
//		(secondVal<firstVal+thirdVal)&&
//		(thirdVal<firstVal+secondVal)
//			) {
//		System.out.println("삼각형을 만들 수 있습니다! ");
//	} else {
//		System.out.println("삼각형을 만들 수 없습니");
//	}

