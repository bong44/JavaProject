package lecture15;

public class Wdd extends VectorExample{
	
	private int val = 10;

	public int getVal() {
		return val;
	}
	
	@Override
	public String method(String b) {
		return b;
	}
	///////////////////////////////////////
	public static void main(String[] args) {
		VectorExample exam = new Wdd();
		
//		exam.name();
		((Wdd) exam).getVal();
		
		System.out.println(exam.method("출력"));
		////////////////////////////////////
	}
}
