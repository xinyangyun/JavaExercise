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
		
		//获取Class对象的三种方法
		Person person = new Person();
		Class m2 = person.getClass();	
		
		Class  clazz2 = Person.class;
		
		Class<?> clazz3 = Class.forName("reflex.Person");
		
		
		//Declared可以获取包括私有的方法和属性，如果不加则不能获取
		//获取所有的方法
		Method[] methods = m2.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("--------------------------");
		//获取所有成员属性信息
		Field[] fields = m2.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.toString()); 
		}
		System.out.println("--------------------------");
		//获取类的所有构造方法
		Constructor[] constructors = m2.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		System.out.println("--------------------------");
		//创建对象两种方法
		Object per = m2.newInstance();
		Class<?> clazz = Class.forName("reflex.Person");
		//调用对象的方法
		Method method = clazz.getMethod("test2");
		Method method2 = clazz.getMethod("test",String.class);
		method.invoke(clazz.newInstance());
		method2.invoke(clazz.newInstance(),"dddd");  
		
	}
	
}
