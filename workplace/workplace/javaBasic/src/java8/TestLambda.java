package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TestLambda {

	public static void main(String[] args) {
//		test3();
//		test4();
//		test5();
		
//		test6();
		test7();
		
	}

	// 原来的匿名内部类
	public void test1() {
		Comparator<Integer> com = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}

		};

		TreeSet<Integer> ts = new TreeSet<>(com);
	}

	// Lambada表达式
	public void test2() {
		Comparator<Integer> com = (x, y) -> +Integer.compare(x, y);
		TreeSet<Integer> ts = new TreeSet<>(com);

	}

	static List<Employee> employyes = Arrays.asList(new Employee("张三", 18, 99.9), new Employee("李四", 15, 90.7),
			new Employee("王五", 16, 92.7), new Employee("李四", 12, 91.7), new Employee("李四", 11, 94.7));

	// 获取当前公司中员工年龄大于35的员工信息
	public static void test3() {

		List<Employee> list = filterEmployees(employyes);

		for (Employee emp : list) {
			System.out.println(emp);
		}

	}

	public static List<Employee> filterEmployees(List<Employee> list) {
		List<Employee> emps = new ArrayList<>();

		for (Employee emp : list) {
			if (emp.getAge() >= 15) {
				emps.add(emp);
			}
		}

		return emps;
	}

	// 需求：获取当前公司中员工工资大于5000的员工信息
	public List<Employee> filterEmployees2(List<Employee> list) {
		List<Employee> emps = new ArrayList<>();

		for (Employee emp : list) {
			if (emp.getSalary() >= 5000) {
				emps.add(emp);
			}
		}
		return emps;
	}

	//优化方式一:策略设计模式
	public static void test4() {
		
		List<Employee> list = filterEmployee(employyes,new FilterEmployeeByAge());
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		System.out.println("----------------------");
		
		List<Employee> list2 = filterEmployee(employyes, new FilterEmployeeBySalary());
		
		for (Employee employee : list2) {
			System.out.println(employee);
		}
		
	}
	
	public static List<Employee> filterEmployee(List<Employee> list,MyPredicate<Employee> mp) {
		
		ArrayList<Employee> emps = new ArrayList<>();
		
		for (Employee employee : list) {
			if (mp.test(employee)) {
				emps.add(employee);
			}
		}
		return emps;
	}
	
	
	//优化方式二：匿名内部类
	public static void test5() {
		List<Employee> list = filterEmployee(employyes, new MyPredicate<Employee>() {
			
			@Override
			public boolean test(Employee t) {
				return t.getSalary() <= 5000;
			}
		});
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
	}
	
	//优化方式三：Lambda表达式
	public static void test6() {
		List<Employee> list = filterEmployee(employyes, (e) -> e.getSalary() <= 5000);
		list.forEach(System.out::println);  
	}
	
	
	//优化方式四：Stream API
	public static void test7() {
		employyes.stream()
				 .filter((e) -> e.getSalary() >= 50) 
				 .limit(2)
				 .forEach(System.out::println);
		
		System.out.println("-----------------------");
		
		employyes.stream()
				 .map(Employee::getName)
				 .forEach(System.out::println);
		
	}
	
}
