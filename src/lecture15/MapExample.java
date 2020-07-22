package lecture15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("마동석", 90);
		map.put("이태석", 80);
		map.put("강구승", 95);
		System.out.println("총 Entry 수: " + map.size());
		
		System.out.println("\t마동석 : " + map.get("마동석"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> ketIterator = keySet.iterator();
		while (ketIterator.hasNext()) {
			String key = ketIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.remove("마동석");
		System.out.println("총 Entry 수: " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 Entry 수: " + map.size());

	}
}
