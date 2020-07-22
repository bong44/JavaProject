package lecture06;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //적용범위  @Target({ElementType.METHOD}) 배열로도 값을 줄 수 있음 
@Retention(RetentionPolicy.RUNTIME) //런타임 시 까지 어노테이션을 유지
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
