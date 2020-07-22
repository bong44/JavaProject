package lecture10;

public class TryCatchExample {
	public static void main(String[] args) {
		
		try {
			Class.forName("java.lang.String"); //여기서 멈춰버림 애러나면, 리터해주는 것과 같음
			System.out.println("문자열 객체");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("애러잼");
			//return; //을 하면 밖에 있는애 실행 안 되고 종료 finally는 리턴이 있어도 무조건 실행
		} finally {	//무조건 실행		
			System.out.println("프로그램 종료");
		}
		//위에 아무데도 리턴이 없을 때 실행되는 구간[밑으로 다]
	}
}
