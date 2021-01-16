package annotaion;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//@TestAnnotation
//@TestAnnotation(id = 3, msg = "hello anntation")  //��ע�⸳ֵ
@TestAnnotation() // ���ע����Ĭ��ֵ���Բ��ý��и�ֵ
public class Test {

	// ���ע����ֻ��һ�����������Բ���дvalue
//	@Check("hi")
	@Check(value = "hi")
	int a;

	// ���ע����û���κε����ԣ���Ӧ��ע���ʱ�����Ŷ�����ʡ��
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
		// �ж�ע���Ƿ����
		boolean annotationPresent = Test.class.isAnnotationPresent(TestAnnotation.class);
		if (annotationPresent) {
			// ͨ�������ȡע��
			TestAnnotation annotation = Test.class.getAnnotation(TestAnnotation.class);
			System.out.println("id:" + annotation.id());
			System.out.println("msg:" + annotation.msg());
		}
		try {
			Field a = Test.class.getDeclaredField("a");
			a.setAccessible(true);
			// ��ȡһ����Ա�����ϵ�ע��
			Check check = a.getAnnotation(Check.class);
			if (check != null) {
				System.out.println("check value:" + check.value());
			}
			Method testMethod = Test.class.getDeclaredMethod("testMethod");
			if (testMethod != null) {
				// ��ȡ�����е�ע��
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
