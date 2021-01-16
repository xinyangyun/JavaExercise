package annotaion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//定义一个注解TestAnnotation
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
	//定义id和msg两个属性
	//设置默认值用default关键字指定,这里id属性默认值为-1.msg属性默认值为Hi annotation
	int id() default -1;
	String msg() default "Hi annotation";
}
