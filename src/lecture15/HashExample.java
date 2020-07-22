package lecture15;

import java.util.HashSet;
import java.util.Set;

public class HashExample {
	
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동", 15));
		set.add(new Member("홍길동", 15));
		
		System.out.println(set.size());
		
	}
}
