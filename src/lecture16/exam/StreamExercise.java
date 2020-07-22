package lecture16.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class StreamExercise {
	public static void main(String[] args) {
		String names = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		
		// 1. Do Not Use Stream
		List<String> nameList = Arrays.asList(names.split(",")); //배열 형태의 값을 list형태로 저장
		
		int countOfKim = 0;
		int countOfLee = 0;
		int countOfLeeJaeYoung = 0;
		
		ArrayList<String> nameSet = new ArrayList<String>(); // HashSet을 못 사용할때

		for (String name : nameList) {
			if (name.startsWith("김")) { //그냥 '김'이 포함되있는지 검색하면 위험함
				countOfKim++;
			}if (name.startsWith("이")) {
				countOfLee++;
			}if (name.equals("이재영")) {
				countOfLeeJaeYoung++;
			}if (!nameSet.contains(name)) {
				nameSet.add(name);
			}
		}
		
		System.out.println(nameSet);
		Collections.sort(nameSet); // 정렬 (list 아닌 그냥 String배열은 Arrays.sort()로 정렬가능)
		
		System.out.println(new HashSet<String>(nameList)); // HashSet의 중복제거 기능을 이용 (set은 집합이어서 정렬이 안됨)
		
		
		// 2. Use Java Stream
		
		List<String> nameList2 = Arrays.asList(names.split(","));
		
		long count = nameList2.stream().filter(t->t.startsWith("김")).count();
		long count1 = nameList2.stream().filter(t->t.startsWith("이")).count(); //contains는 위험. startWith 암기!
		long count2 = nameList2.stream().filter(t->t.equals("이재영")).count();
		
		String distinctedName = nameList2.stream().distinct().reduce((t, u) -> t + ", " + u).get();
		String sortedName = nameList2.stream().distinct().sorted().reduce((t, u) -> t + ", " + u).get(); //
		
	}
}
