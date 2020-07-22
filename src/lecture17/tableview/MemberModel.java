package lecture17.tableview;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

//property, observable 은 관찰에 관련된 용어다

public class MemberModel {
	//observable 클래스와 같은 기능을 하게 커스터마이징
	private StringProperty name; //관찰할 수 있는 String형의 객체로 만들어줌
	private StringProperty mobileNumber; //wrapper클래스 같은 개념
	public MemberModel(String name, String mobileNumber) { 
		this.name = new SimpleStringProperty(name); //간편하게 만들어진 (왜냐하면 StringProperty는 추상클래스여서 new를 하면 동시에 추상메소드도 구현해줘야대서 간단한 모형의 StringProperty를 )
		this.mobileNumber = new SimpleStringProperty(mobileNumber);
	}
	//fx의 getter setter
	public String getName() {
		return name.get();
	}

	public void setName(String name) {
		this.name.set(name);
	}

	public StringProperty nameProperty() {
		return name;   //프라퍼티 자체를 리턴
	}
	
	public String getMobileNumber() {
		return mobileNumber.get();
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber.set(mobileNumber);
	}
	
	public StringProperty mobileNumberProperty() {
		return mobileNumber;   //프라퍼티 자체를 리턴
	}
	
}
