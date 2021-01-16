package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * @author CXTX1112
 *  Lambda ���ʽ�Ļ����﷨��Java8��������һ���µĲ����� "->" �ò�������Ϊ��ͷ����������lambda������
 *  					��ͷ��������Lambda���ʽ���Ϊ�������֣�
 *  ��ࣺlambda ���ʽ�Ĳ����б�
 *  �Ҳࣺlambda ���ʽ������Ҫִ�еĹ��ܣ���lambda��
 *  
 *  
 *  �﷨��ʽһ���޲������޷���ֵ
 *  		() -> System.out.println("hello lambda")
 *  
 *  
 *  �﷨��ʽ������һ�������������޷���ֵ
 *  	    (x) -> System.out.println(x);
 *   
 *  �﷨��ʽ������ֻ��һ��������С���ſ���ʡ�Բ�д
 *          x -> System.out.println(x);
 *  
 *  �﷨��ʽ�ģ����������ϵĲ������з���ֵ������lambda�����ж������
 *  		Comparator<Integer> com = (x,y) -> {
				System.out.println("����ʽ�ӿ�");
				return Integer.compare(x, y);
			};
 *  
 *  �﷨��ʽ�壺��lambda����ֻ��һ����䣬return�ʹ����Ŷ�����ʡ�Բ�д
 *  		Comparator<Integer> com = (x,y) -> Integer.compare(x, y);
 *  
 *  �﷨��ʽ����lambda���ʽ�Ĳ����б���������Ϳ���ʡ�Բ�д����ΪJVM������ͨ���������ƶϳ����������ͣ��������ƶ�
 *  
 *  
 *  ������ ������һ����ʡ
 *  ������ ����ƶ�����ʡ
 *  ������ ��ʡ��ʡ
 *  
 *  ����lambda���ʽ��Ҫ������ʽ�ӿڡ���֧��
 *  ����ʽ�ӿڣ��ӿ���ֻ��һ�����󷽷��Ľӿڣ���Ϊ����ʽ�ӿڡ�����ʹ��ע��@FunctionalInterface ����
 *  		      ���Լ���Ƿ��Ǻ���ʽ�ӿڣ�
 *  
 */
public class TestLambda2 {
	
	public static void main(String[] args) {
//		test1();
		
//		test2();
		
		test6();
		
	}

	public static void test1() {
		int num = 0;//jdk1.7ǰ��������final
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("hello world   "+num);
			}
		};
		
		r.run();
		
		System.out.println("---------------------------");
		
		Runnable r1 = () -> System.out.println("hello lambda!");
		r1.run();
		
	}
	
	public static void test2() {
//		Consumer<String> con = (x) -> System.out.println(x);
		Consumer<String> con = x -> System.out.println(x);
		
		con.accept("hello lambda");
		
	}
	
	
	public void test3() {
		Comparator<Integer> com = (x,y) -> {
			System.out.println("����ʽ�ӿ�");
			return Integer.compare(x, y);
		};
	}
	
	public void test4() {
		Comparator<Integer> com = (x,y) -> Integer.compare(x, y);
	}
	
	public void test5() {
//		String[] = strs;
//		strs = {"aaaa","ddd","cccc"};
		
		ArrayList<String> list = new ArrayList<>();  //�Ƶ�����
		
		show(new HashMap<>());
	}
	
	public static void show(Map<String,Integer> map) {
			
	}
	
	
	//����
	public static void test6() {
		Integer num = operation(100, (x) -> x * x  );
		System.out.println(num); 
		
		System.out.println(operation(200, (y) -> y+200));
	}
	
	public static Integer operation(Integer num,MyFun fun) {
		return fun.getValue(num);
	}
}
