package lecture10;

import java.util.StringTokenizer;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

import sun.util.locale.StringTokenIterator;

public class StringReplaceExample {
	public static void main(String[] args) {
	String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다. ";
	String newStr = oldStr.replace("자바", "JAVA");
	String substr = "가나다라마바사";
	String substrNew = substr.substring(0,4);
	
	System.out.println(oldStr);
	System.out.println(newStr);
	
	System.out.println(substrNew);
	
	String i = 10+"";
	i = String.valueOf(10);
	int g = Integer.parseInt(i);
	System.out.println(g+10); //20이 나옴
	System.out.println(String.valueOf(10)+10+20); // 101020이 나옴 앞에 String형으로 다 곱해져서
	
	//split() 메소드
	String text = "홍길동&김자바,여명환,이명희-최대현";
	
	String[] names = text.split("&|,|-");

	for (String string : names) {
		System.out.println(string);
	}
	
	String text2 = "홍길동/이수홍/박연수";
	
	StringTokenizer st = new StringTokenizer(text2,"/");
	
	int countTokens = st.countTokens();
	
	for (int j = 0; j < countTokens; j++) {
		String token = st.nextToken();
		System.out.println(token);
		
	System.out.println("---------------------------");
	
	}
	//StringBuilder
	
	StringBuilder sb = new StringBuilder();
	
	sb.append("Java ");
	sb.append("Program Study");
	System.out.println(sb);  //print메소드만 toSting 생략해도 댐(대게 그냥 써주는게 좋을 듯)
	
	sb.insert(4, "2");
	
	System.out.println(sb); 
	
	sb.setCharAt(4, '6');
	
	System.out.println(sb); 
	
	sb.replace(6, 13, "Book");
	
	System.out.println(sb); 
	
	sb.delete(4, 5);
	
	System.out.println(sb);
	
	int length = sb.length();
	System.out.println(length);
	
	String result = sb.toString();// 이럴 때는 toString을 무조건 붙여줘야함.

//	결과값
//	Java Program Study
//	Java2 Program Study
//	Java6 Program Study
//	Java6 Book Study
//	Java Book Study
//	15
	
	double[] ar = {7.3,23.63,26.52,14.23,8.93,13.25,97.76,9.18,2.78,11.61,18.11,14.34};
	double sum = 0.0;
	for (double d : ar) {
		sum+=d;
	}
	System.out.println(sum);
	
	
	}
}
