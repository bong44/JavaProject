package lecture15;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<Phone> set = new HashSet<>();//여기 꺽세괄호 안에는 타입??
		set.add(new Phone("V", 87, "sam"));
		set.add(new Phone("V", 8, "sam"));
		set.add(new Phone("G", 57, "app"));
		set.add(new Phone("G", 57, "app"));
		set.add(new Phone("P", 67, "pra"));
		set.add(new Phone("P", 67, "pra"));
		System.out.println(set.size());
		
		
		
	}
}
