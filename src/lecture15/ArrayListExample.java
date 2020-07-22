package lecture15;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		List<Phone> list = new ArrayList<Phone>(); 
		
		list.add(new Phone("겔럭시", 64, "삼성"));
		list.add(new Phone("XS", 32, "애플"));
		list.add(new Phone("RS", 64, "애플"));
		
		for (Phone phone : list) {
			System.out.println(phone);
		}
		
		System.out.println(" ");
		
		list.add(1, new Phone("홍미", 64, "샤오미"));
		
		for (Phone phone : list) {
			System.out.println(phone);
		}
		
		System.out.println(" ");
		
		list.remove(1);
		
		for (Phone phone : list) {
			System.out.println(phone);
		}
		
		System.out.println("전체 크기: " + list.size());
		
		Phone phone = list.get(0);
		System.out.println("가져와 담은 객체의 내용: " + phone);
		
		list.clear();
		System.out.println("클리어 후 전체 크기: " + list.size());
		
	}
}
