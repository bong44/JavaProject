package jsp;

public class JspTest {
	public static void main(String[] args) {
		
		
		int index = 6;
		for (int i = 0; i <= index; i++) {
			for (int j = 0; j <= index-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i ; j++) {
				System.out.print("*");
			}
			for (int j = 0; j <= i ; j++) {
				if (j != 0) {
					System.out.print("*");
				}
			}
			System.out.println("");
			
		}
		
		
		
	}
}

