package java8.lx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import java8.Employee;

public class TestLambdaLx {
	
	public static void main(String[] args) {
//		test1();
		
//		test2();
		
		test3();
	}
	
	static List<Employee> emps = Arrays.asList(new Employee("����", 18, 99.9), new Employee("����", 15, 90.7),
			new Employee("����", 16, 92.7), new Employee("����", 12, 91.7), new Employee("����", 11, 94.7));
	
	public static void test1() {
	  	
  		Collections.sort(emps, (e1 , e2) -> {
			if (e1.getAge() == e2.getAge()) {
				return e1.getName().compareTo(e2.getName());
			}else {
				return Integer.compare(e1.getAge(), e2.getAge());
			}
		});
		
		
		for (Employee employee : emps) {
			System.out.println(employee);
		}
		
	}
	
	public static void test2() {
		//ȥ���ո�
		String trimStr = strHandler("\t\t���ε�", (str) -> str.trim());
		System.out.println(trimStr); 
		
		//תΪ��д
		String upStr = strHandler("adddfdfs", (str) -> str.toUpperCase());
		System.out.println(upStr);
		
		String subStr = strHandler("JAVA��׿�������ʦ", (str) -> str.substring(2, 5));
		System.out.println(subStr);
		
	}
	
	//�������ڴ����ַ����ķ���
	public static String strHandler(String str,MyFunction mf) {
		return mf.getValue(str);
	}
	
	public static void test3() {
		op(100L, 200L, (x,y) -> x+y);
		
		op(100L, 200L, (x,y) -> x*y);
	}
	
	
	//���󣺶�������long�����ݽ��д���
	public static void op(Long l1,Long l2,MyFunction2<Long,Long> mf) {
		System.out.println(mf.getValue(l2, l2));
	}
	
	
	
}
