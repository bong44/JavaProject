package lecture16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class IteraterVsStreamExample {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("이태영","최승주","서나리","임이랑","배동환","소리엘","임구현");
		
		list.stream().filter(t -> t.contains("이")).map(t -> t+"(하뚜)").forEach(System.out::println); //실행문은 종단처리자인 consumer
		//맵으로 해서 데이터를 변형해줄수 있음 //맵은 중간처리자이기에 실행문 중간에 들어가도 댐 
		//filler 또한 중간처리자이기에 실행문 중간에 나올 수 있다.
		//중간 처리자는 순서는 상관없지만 변경사항이 적용되는 큰 개념에서 설계하여 처리자들을 배치해줘야 성능개선에 도움이된다.
		long count = list.stream().filter(t->t.contains("최")).count(); //처리 결과에 대해 집계(종단처리자) 또한 가능
		System.out.println(count);
	}
}
