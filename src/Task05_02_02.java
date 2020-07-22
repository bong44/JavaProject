import java.util.Random;
import java.util.Scanner;

public class Task05_02_02 {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] frequencyArray = null;
		
		System.out.println("------------");
		System.out.println("면\t빈도");
		System.out.println("------------");
		
		int frequency = 10000;
		int[] dice = new int[6];
		frequencyArray = new int[dice.length];
		
		
//		for (int i = 0; i < frequency; i++) {
//			
//			int randomNum = random.nextInt(dice.length) + 1;
//			
			for (int j = 0; j < frequency; j++) {
				frequencyArray[random.nextInt(dice.length)]++;  //이걸 어캐생각함 ;
			}
			
//			switch (randomNum) {
//			
//			case 1: frequencyArray[0]+=1;
//				break;
//			case 2: frequencyArray[1]+=1;	
//				break;
//			case 3: frequencyArray[2]+=1;	
//				break;
//			case 4: frequencyArray[3]+=1;	
//				break;
//			case 5: frequencyArray[4]+=1;	
//				break;
//			case 6: frequencyArray[5]+=1;	
//				break;
//			
//			}
			
//		}
		for (int i = 0; i < frequencyArray.length; i++) {
			
			System.out.println(i+1+"\t"+frequencyArray[i]);	
			
		}
		
	}
}
