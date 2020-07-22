package lecture18.editor;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class InfoModel {
	private IntegerProperty infoNo; //jsp에선 그냥int선언 해도 대지만 fx는 관찰을 해줘야 함
	private StringProperty pcNo;
	private StringProperty nm;
	private StringProperty email;
	private StringProperty hobby;
	
	public InfoModel(int infoNo, String pcNo, String nm, String email,
			String hobby) {
		this.infoNo = new SimpleIntegerProperty(infoNo); //테이블 뷰 생성자에선 파라미터를 넣어줘서 초기화 해야대니까 안에 들어감
		this.pcNo = new SimpleStringProperty(pcNo);
		this.nm = new SimpleStringProperty(nm);
		this.email = new SimpleStringProperty(email);
		this.hobby = new SimpleStringProperty(hobby); //프라퍼티 그냥 쓸 때도 Property는 추상클래스여서 SimpleProperty로 초기화를 해줌
	}

	public InfoModel(String pcNo, String nm, String email,
			String hobby) {
		this.pcNo = new SimpleStringProperty(pcNo);
		this.nm = new SimpleStringProperty(nm);
		this.email = new SimpleStringProperty(email);
		this.hobby = new SimpleStringProperty(hobby); //프라퍼티 그냥 쓸 때도 Property는 추상클래스여서 SimpleProperty로 초기화를 해줌
	}

	//fx갯터 셋터는 클래스 파일 우클릭 하고 source에서 fx 겟셋하면댐
	public final IntegerProperty infoNoProperty() {
		return this.infoNo;
	}
	

	public final int getInfoNo() {
		return this.infoNoProperty().get();
	}
	

	public final void setInfoNo(final int infoNo) {
		this.infoNoProperty().set(infoNo);
	}
	

	public final StringProperty pcNoProperty() {
		return this.pcNo;
	}
	

	public final String getPcNo() {
		return this.pcNoProperty().get();
	}
	

	public final void setPcNo(final String pcNo) {
		this.pcNoProperty().set(pcNo);
	}
	

	public final StringProperty nmProperty() {
		return this.nm;
	}
	

	public final String getNm() {
		return this.nmProperty().get();
	}
	

	public final void setNm(final String nm) {
		this.nmProperty().set(nm);
	}
	

	public final StringProperty emailProperty() {
		return this.email;
	}
	

	public final String getEmail() {
		return this.emailProperty().get();
	}
	

	public final void setEmail(final String email) {
		this.emailProperty().set(email);
	}
	

	public final StringProperty hobbyProperty() {
		return this.hobby;
	}
	

	public final String getHobby() {
		return this.hobbyProperty().get();
	}
	

	public final void setHobby(final String hobby) {
		this.hobbyProperty().set(hobby);
	}

	@Override
	public String toString() {
		return "InfoModel [infoNo=" + getInfoNo() + ", pcNo=" + getPcNo() + ", nm=" + getNm() + ", email=" + getEmail() + ", hobby=" + getHobby()
				+ "]";
	}
	
	
	
}
