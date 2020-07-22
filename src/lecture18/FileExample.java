package lecture18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileExample {
	public static void main(String[] args) throws Exception {
		//파일읽기
//		FileInputStream inputStream = new FileInputStream(new File("/home/pc42/study1.sql"));
//		
//		byte[] bs = new byte[2048];
//		
//		while (inputStream.read(bs) != -1) {//더 이상 읽을 결과 없을 시 -1
//			System.out.print(new String(bs)); //new String으로 byte형 객체를 문자열로 변환
//		}
//		
//		inputStream.close();
	
		//파일쓰기
		FileOutputStream outputStream = new FileOutputStream(new File("/home/pc42/자바.txt")); //read와 다르게 마지막에 새로운 파일명 기입
	
		
		outputStream.write("자바로 파일을 만들었어요.".getBytes()); //위와 반대로 스트링을 바이트로 변환
		outputStream.close();
		
	}
}
