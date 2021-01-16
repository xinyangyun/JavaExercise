package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * @author CXTX1112
 *  Lambda 表达式的基础语法：Java8中引入了一个新的操作符 "->" 该操作符称为箭头操作符或则lambda操作符
 *  					箭头操作符将Lambda表达式拆分为了两部分：
 *  左侧：lambda 表达式的参数列表
 *  右侧：lambda 表达式中所需要执行的功能，即lambda体
 *  
 *  
 *  语法格式一：无参数，无返回值
 *  		() -> System.out.println("hello lambda")
 *  
 *  
 *  语法格式二：有一个参数，并且无返回值
 *  	    (x) -> System.out.println(x);
 *   
 *  语法格式三：若只有一个参数，小括号可以省略不写
 *          x -> System.out.println(x);
 *  
 *  语法格式四：有两个以上的参数，有返回值，并且lambda体中有多条语句
 *  		Comparator<Integer> com = (x,y) -> {
				System.out.println("函数式接口");
				return Integer.compare(x, y);
			};
 *  
 *  语法格式五：若lambda体中只有一条语句，return和大括号都可以省略不写
 *  		Comparator<Integer> com = (x,y) -> Integer.compare(x, y);
 *  
 *  语法格式六：lambda表达式的参数列表的数据类型可以省略不写，因为JVM编译器通过上下文推断出，数据类型，即类型推断
 *  
 *  
 *  上联： 左右遇一括号省
 *  下联： 左侧推断类型省
 *  横批： 能省则省
 *  
 *  二、lambda表达式需要“函数式接口”的支持
 *  函数式接口：接口中只有一个抽象方法的接口，成为函数式接口。可以使用注解@FunctionalInterface 修饰
 *  		      可以检查是否是函数式接口，
 *  
 */
public class TestLambda2 {
	
	public static void main(String[] args) {
//		test1();
		
//		test2();
		
		test6();
		
	}

	public static void test1() {
		int num = 0;//jdk1.7前，必须是final
		
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
			System.out.println("函数式接口");
			return Integer.compare(x, y);
		};
	}
	
	public void test4() {
		Comparator<Integer> com = (x,y) -> Integer.compare(x, y);
	}
	
	public void test5() {
//		String[] = strs;
//		strs = {"aaaa","ddd","cccc"};
		
		ArrayList<String> list = new ArrayList<>();  //推导类型
		
		show(new HashMap<>());
	}
	
	public static void show(Map<String,Integer> map) {
			
	}
	
	
	//需求
	public static void test6() {
		Integer num = operation(100, (x) -> x * x  );
		System.out.println(num); 
		
		System.out.println(operation(200, (y) -> y+200));
	}
	
	public static Integer operation(Integer num,MyFun fun) {
		return fun.getValue(num);
	}
}
