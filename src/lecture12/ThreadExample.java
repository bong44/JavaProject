package lecture12;

public class ThreadExample {
	public static void main(String[] args) {
//		쓰래드 사용
//		1.Runnable 인터페이스 구현 <<선생선호방식
		
		Runnable runnable = new Runnable() { //런어블 선언 후
			
			@Override
			public void run() {//runnable에 있는 메소드?(Thread에 있는 메소드로 start로 메소드 실행가능)
				for (int i = 1; i <= 10; i++) {
					try {
						Thread.sleep(1000); //왜 꼭 예외처리를 해줘야하는 (그냥;)
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("졸려");
				}
			}
		}; //익명의 인터페이스 구현
		Thread th = new Thread(runnable); //스레드에 런어블 넣어
		th.start();
		
		//2.Thread 상속(Thread는 일반적인 클래스가 아님 특수한 클래스임 동작방식 이상할 수 있음)
		
		new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					try {
						Thread.sleep(1000); //왜 꼭 예외처리를 해줘야하는 (그냥;)
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("졸려");
				}
			};
		}.start();
		
		//메인 쓰레드에서 실행
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//밀리세컨드 == 1초
			System.out.println(i);
		}
	}
}
