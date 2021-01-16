package annotaion;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//@TestAnnotation
//@TestAnnotation(id = 3, msg = "hello anntation")  //给注解赋值
@TestAnnotation() // 如果注解有默认值可以不用进行赋值
public class Test {

	// 如果注解中只有一个参数，可以不用写value
//	@Check("hi")
	@Check(value = "hi")
	int a;

	// 如果注解中没有任何的属性，在应用注解的时候括号都可以省略
	@Perform
	public void testMethod() {
	}

	@SuppressWarnings("deprecation")
	public void test1() {
		Hero hero = new Hero();
		hero.say();
		hero.speak();
	}

	public static void main(String[] args) {
		// 判断注解是否存在
		boolean annotationPresent = Test.class.isAnnotationPresent(TestAnnotation.class);
		if (annotationPresent) {
			// 通过反射获取注解
			TestAnnotation annotation = Test.class.getAnnotation(TestAnnotation.class);
			System.out.println("id:" + annotation.id());
			System.out.println("msg:" + annotation.msg());
		}
		try {
			Field a = Test.class.getDeclaredField("a");
			a.setAccessible(true);
			// 获取一个成员变量上的注解
			Check check = a.getAnnotation(Check.class);
			if (check != null) {
				System.out.println("check value:" + check.value());
			}
			Method testMethod = Test.class.getDeclaredMethod("testMethod");
			if (testMethod != null) {
				// 获取方法中的注解
				Annotation[] ans = testMethod.getAnnotations();
				for (int i = 0; i < ans.length; i++) {
					System.out.println("method testMethod annotation:" + ans[i].annotationType().getSimpleName());
				}
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (SecurityException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
