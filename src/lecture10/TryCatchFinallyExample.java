package lecture10;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값 부족");
			System.out.println("실행방법");
			System.out.println("못해");
			return ;
		}
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 + value2 ;
		System.out.println(data1 + " + " + data2 + " = " + result);
		
	}
}
