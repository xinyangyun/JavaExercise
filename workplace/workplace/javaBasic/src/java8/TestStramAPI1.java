package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

/**
 * @author CXTX1112
 *һ��Stream�������������裺
 *
 *1.����stream
 *
 *2.�м����
 *
 *3.��ֹ�������ն˲�����
 *
 */
public class TestStramAPI1 {

	
	//����stream
	@Test
	public void test1() {
		//1.����ͨ��Collectionϵ�м����ṩ��Stream() �� parallelStream()
		List<String> list= new ArrayList<>();
		Stream<String> stream1 = list.stream();
		
		//2.ͨ��Arrays�еľ�̬����stream()��ȡ������
		Employee[] emps = new Employee[10];
		Stream<Employee> stream2 = Arrays.stream(emps);
		
		//3.ͨ��Stream���еľ�̬����of()
		Stream<String> stream3 = Stream.of("aa","bb","cc");
		
		//4.����������
		//����
		Stream<Integer> stream4 = Stream.iterate(0, (x) -> x+2);
		stream4.limit(10).forEach(System.out::println);
		
		//����
		Stream.generate(() -> Math.random())
			  .limit(5)
			  .forEach(System.out::println);
		
	}
	
}
