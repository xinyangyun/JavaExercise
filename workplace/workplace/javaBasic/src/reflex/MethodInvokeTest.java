package reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

public class MethodInvokeTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, ClassNotFoundException {
		String  str = "hello";
		Method m = str.getClass().getMethod("toUpperCase");
//		System.out.println(m.invoke(str));
		
		//��ȡClass��������ַ���
		Person person = new Person();
		Class m2 = person.getClass();	
		
		Class  clazz2 = Person.class;
		
		Class<?> clazz3 = Class.forName("reflex.Person");
		
		
		//Declared���Ի�ȡ����˽�еķ��������ԣ�����������ܻ�ȡ
		//��ȡ���еķ���
		Method[] methods = m2.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("--------------------------");
		//��ȡ���г�Ա������Ϣ
		Field[] fields = m2.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.toString()); 
		}
		System.out.println("--------------------------");
		//��ȡ������й��췽��
		Constructor[] constructors = m2.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		System.out.println("--------------------------");
		//�����������ַ���
		Object per = m2.newInstance();
		Class<?> clazz = Class.forName("reflex.Person");
		//���ö���ķ���
		Method method = clazz.getMethod("test2");
		Method method2 = clazz.getMethod("test",String.class);
		method.invoke(clazz.newInstance());
		method2.invoke(clazz.newInstance(),"dddd");  
		
	}
	
}
