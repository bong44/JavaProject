package lecture06;

public class Practice {
	private int val = 0;

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	
	public static void main(String[] args) {
		
		Practice pr = new Practice();
		
		
		Practice prRef = pr;
		prRef.setVal(3);
		System.out.println(pr.getVal());
		
		Practice prCopy = new Practice();
		prCopy = pr;
		prCopy.setVal(7);
		System.out.println(pr.getVal());
		
	}
}
