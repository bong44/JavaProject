import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a =new int[2];
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("값을 입력하시오");
			a[0] = sc.nextInt();
			System.out.println(a[0]+" %");
			System.out.println();
			a[1] = sc.nextInt();
			int sum = a[0] % a[1];
			System.out.println(a[0]+" % "+a[1]+" = "+sum);
		}while(true);
	}


}
