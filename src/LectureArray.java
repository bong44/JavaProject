import java.io.IOException;

public class LectureArray {
	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed = 1;
		int keyCode = 1;

		while (run) {
			
			if (keyCode!=13 && keyCode!=10) {
				System.out.println("선택(1,2,3)");
			}
			
			keyCode = System.in.read();
			
			if (keyCode == 49) {
				speed*=10;
				System.out.println(keyCode);
			}else if (keyCode == 50) {
				speed/=10;
				System.out.println(keyCode);
			}else if (keyCode == 51) {
				System.out.println("프로그램 종료");
				run = false;
			}
			
			
		}
	
	
	}
}
