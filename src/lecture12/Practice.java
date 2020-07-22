package lecture12;

import java.util.Objects;

public class Practice{
	
	private int val = Integer.parseInt("10");
	private String str = String.valueOf(10);
	
	public Practice() {
		
	}
	
	public Practice(int val, String str) {
		this.val = val;
		this.str = str;
	}
	
	public int getVal() {
		return val;
	}
	
	public void setVal(int val) {
		this.val = val;
	}
	
	public String getStr() {
		return str;
	}
	
	public void setStr() {
		this.str = str;
	}

	@Override
	public int hashCode() {
		return Objects.hash(str, val);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}else if(!(obj instanceof Practice)) {
			return false;
		}
	  //Object랑 햇갈
		Practice other = (Practice) obj;  
		return Objects.equals(str, other.str) && other.val == val;
			 //Object랑 햇갈
	}
	
	
	
	
	
	
	
	
	
	
	
}