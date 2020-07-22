package lecture12;

public class Box {
	
	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
	public static void main(String[] args) {
		Box box = new Box();
		box.setObject(100); //자동 박싱 //Wrapper클래스 박싱과 언박싱
		System.out.println(box.getObject());
		box.setObject("홍길동");
		box.getObject();// 지금 들어갈땐 String이었지만 나올땐 Object타입으로 나옴
		String name = (String) box.getObject();//프린트에선 문제없지만, 값을 넣어주고자 하면 강제 캐스팅을 해줘야함//이런 것들을 제거하게 해주는게 제네릭
		
	}
	
}
