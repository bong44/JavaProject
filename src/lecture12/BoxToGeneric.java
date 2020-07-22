package lecture12;



public class BoxToGeneric<T> { //<T, M> 처럼 여러개의 제네릭 사용 가능
	
//	private M model; 요로콩
	private T object;
	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
	
	public static void main(String[] args) {
		BoxToGeneric<Integer> box = new BoxToGeneric<Integer>();
		box.setObject(100); 
		int num = box.getObject(); // 선언해준 타입만 들어올 수 있음
	}
	
	public static <T>BoxToGeneric<T> boxing(T t) { //위에서의 T제네릭은 위쪽에서 필드에서의 제네릭이라 여기서는 쓸 수 없어서 타입 앞에 <T>로 다시 선언해줌
		BoxToGeneric<T> box = new BoxToGeneric<T>();
		box.setObject(t);
		return box;
	}
	
}
