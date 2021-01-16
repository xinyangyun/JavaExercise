package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

public class TestStreamAPI2 {

	static List<Employee> employyes = Arrays.asList(new Employee("张三", 18, 99.9), new Employee("李四", 15, 90.7),
			new Employee("王五", 16, 92.7), new Employee("李四", 12, 91.7), new Employee("李四", 11, 94.7),new Employee("张三", 18, 99.9), new Employee("李四", 15, 90.7),
			new Employee("王五", 16, 92.7), new Employee("李四", 12, 91.7), new Employee("李四", 11, 94.7));
	
	// 中间操作
	/*
	 * 映射
	 * map-接收 lambda ， 将元素转换成其他形式或提取信息。接收一个函数作为参数，该函数会被应用到每个元素上，
	 * 并将其映射成一个新的元素。
	 * flatMap-接收一个函数作为参数，将流中的每个值都换成另外一个流，然后把所有流连接成一个流。
	 * 
	 * 
	 * 筛选与切片 
	 * filter-接收lambda，从流中排除一些元素 
	 * limit-截断流，使其元素不超过给定数量
	 * skip（n）-跳过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空流。与limit（n）互补
	 * distinct-筛选，通过流所生成的hashcode()和equals()去除重复元素
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
		    .flatMap(TestStreamAPI2::filterCharacter);//{a,a,a,b,b,b}  参考集合中的add和addall
		
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
				 .filter((e) -> e.getSalary() > 94) //跳过前两个
				 .skip(2)
				 .distinct()
				 .forEach(System.out::println);
	}
	
	@Test
	public void test3() {
		employyes.stream()
		         .filter((e) -> {
		        	 System.out.println("短路！"); //&& || 后面的不会取
		        	 return e.getSalary() > 9;
		         }) 
		         .limit(2)
		         .forEach(System.out::println);	 
		         
	}

	//内部迭代：迭代操作由Stream API 完成
	@Test
	public void test1() {
		
		//中间操作：不会执行任何操作
		Stream<Employee> stream = employyes.stream()
									  .filter((e) -> {
										  System.out.println("Stream API 的中间操作");
										  return e.getAge() > 15;
									  });  
		
		//终止操作：一次性执行全部内容，即“惰性求值”
		stream.forEach(System.out::println);
		
	}
	
	//外部迭代：
	@Test
	public void test2() {
		Iterator<Employee> it = employyes.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
}
