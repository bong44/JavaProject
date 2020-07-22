package lecture06;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		
		Method[] methods = Service.class.getDeclaredMethods();//리플랙션 기법에 의한 소스
	
		for (Method method : methods) {
			if (method.isAnnotationPresent(PrintAnnotation.class)) {//methods들의 method중에 저기 안에 매개변수가 붙어있으면 true
				PrintAnnotation annotation = method.getAnnotation(PrintAnnotation.class);
				System.out.println(method.getName());

				for (int i = 0; i < ; i++) {
					System.out.println();
				}
			}
			 
		}
	}
}
