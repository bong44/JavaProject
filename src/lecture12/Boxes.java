package lecture12;

public class Boxes {
	
	private Object[] objects;
	private int index;
	
	public Boxes(int size) {
		objects = new Object[size];
	}
	
	public void addObject(Object object) {
		objects[index++] = object; 
	}
	
	public Object[] getObjects() {
		return objects;
	}

	public void setObjects(Object[] objects) {
		this.objects = objects;
	}

	public static void main(String[] args) {
		Boxes boxes = new Boxes(5);
		boxes.addObject("홍길동");
		boxes.addObject(100);
		boxes.addObject(3.14);
		boxes.addObject(true);
		boxes.addObject(new Box());
		for (Object obj : boxes.getObjects()) {
			if (obj instanceof String) { // String 타입의 인스턴스인지 체크
				String name1 = (String) obj + "님";
			}
		}
	}
	
}
