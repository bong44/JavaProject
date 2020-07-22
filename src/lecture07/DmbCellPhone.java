package lecture07;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class DmbCellPhone extends CellPhone{  
	//부모와 완전히 연결되는게 아니고 부모를 객체로서 받아와서
	//부모의 필드값과 자식이 참조하는 부모의 필드값은 다름 자식은 객체로서 가지고 있음
	//super로 받아오면 부모의 값이 변경됨
	int channel;
	
	
	public DmbCellPhone(String model, String color, int channel) {
	this.model = model;
	this.color = color;
	this.channel = channel;
	
	}
	
	void turnOnDmb() {
		System.out.println("채널"+channel);
//		this.hangUp(); 되는듯?
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널변경"+channel);
	}
	void turnOffDmb() {
		System.out.println("SHUT DOWN");
	}
	@Override //컴파일할 때 재정의 하는 메소드라고 알려줌  
	void hangUp() {//부모의 리턴형태 파라미터 형태가 일치해야댐.
		System.out.println("ㅇ  DisConnect!");//메소드 재정의
	}
}
