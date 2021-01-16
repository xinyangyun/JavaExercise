package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

public class TestStreamAPI2 {

	static List<Employee> employyes = Arrays.asList(new Employee("����", 18, 99.9), new Employee("����", 15, 90.7),
			new Employee("����", 16, 92.7), new Employee("����", 12, 91.7), new Employee("����", 11, 94.7),new Employee("����", 18, 99.9), new Employee("����", 15, 90.7),
			new Employee("����", 16, 92.7), new Employee("����", 12, 91.7), new Employee("����", 11, 94.7));
	
	// �м����
	/*
	 * ӳ��
	 * map-���� lambda �� ��Ԫ��ת����������ʽ����ȡ��Ϣ������һ��������Ϊ�������ú����ᱻӦ�õ�ÿ��Ԫ���ϣ�
	 * ������ӳ���һ���µ�Ԫ�ء�
	 * flatMap-����һ��������Ϊ�����������е�ÿ��ֵ����������һ������Ȼ������������ӳ�һ������
	 * 
	 * 
	 * ɸѡ����Ƭ 
	 * filter-����lambda���������ų�һЩԪ�� 
	 * limit-�ض�����ʹ��Ԫ�ز�������������
	 * skip��n��-����Ԫ�أ�����һ���ӵ���ǰn��Ԫ�ص�����������Ԫ�ز���n�����򷵻�һ����������limit��n������
	 * distinct-ɸѡ��ͨ���������ɵ�hashcode()��equals()ȥ���ظ�Ԫ��
	 * 
	 */
	
	@Test
	public void test5() {
		List<String> list = Arrays.asList("aaa","bbb","ccc","dddd","eee");
		
		list.stream()
			.map((str) -> str.toUpperCase()) 
			.forEach(System.out::println);
		
		System.out.println("-----------------------------");
		
		employyes.stream()
				 .map(Employee::getName)
				 .forEach(System.out::println);
		
		System.out.println("-----------------------------");
		
//		Stream<Stream<Character>> stream = list.stream()
//			.map(TestStreamAPI2::filterCharacter);//{{a,a,a},{b,b,b}}
//		
//		stream.forEach((sm) -> {
//			sm.forEach(System.out::println);
//		});
		
		System.out.println("-----------------------------");
		
		Stream<Character> sm = list.stream()
		    .flatMap(TestStreamAPI2::filterCharacter);//{a,a,a,b,b,b}  �ο������е�add��addall
		
		sm.forEach(System.out::println);
		
	}
	
	public static Stream<Character> filterCharacter(String str) {
		ArrayList<Character> list = new ArrayList<>();
		
		for (Character ch : str.toCharArray()) {
			list.add(ch);
		}
		
		return list.stream();
		
	}
	
	@Test
	public void test4() {
		employyes.stream()
				 .filter((e) -> e.getSalary() > 94) //����ǰ����
				 .skip(2)
				 .distinct()
				 .forEach(System.out::println);
	}
	
	@Test
	public void test3() {
		employyes.stream()
		         .filter((e) -> {
		        	 System.out.println("��·��"); //&& || ����Ĳ���ȡ
		        	 return e.getSalary() > 9;
		         }) 
		         .limit(2)
		         .forEach(System.out::println);	 
		         
	}

	//�ڲ�����������������Stream API ���
	@Test
	public void test1() {
		
		//�м����������ִ���κβ���
		Stream<Employee> stream = employyes.stream()
									  .filter((e) -> {
										  System.out.println("Stream API ���м����");
										  return e.getAge() > 15;
									  });  
		
		//��ֹ������һ����ִ��ȫ�����ݣ�����������ֵ��
		stream.forEach(System.out::println);
		
	}
	
	//�ⲿ������
	@Test
	public void test2() {
		Iterator<Employee> it = employyes.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
}
