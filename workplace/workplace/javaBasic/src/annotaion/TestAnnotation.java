package annotaion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//����һ��ע��TestAnnotation
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
	//����id��msg��������
	//����Ĭ��ֵ��default�ؼ���ָ��,����id����Ĭ��ֵΪ-1.msg����Ĭ��ֵΪHi annotation
	int id() default -1;
	String msg() default "Hi annotation";
}
