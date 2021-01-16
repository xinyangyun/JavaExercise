package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
//		for (int i = 0; i < 100000; i++) {
//			arrayList.add(i);
//		}
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
//		for (int i = 0; i < 100000; i++) {
//			linkedList.add(i);
//		}
		
		//1.new一个固定数组
		//2.判断非空
		//3.最后插入
		
		for (int i = 0; i < 10; i++) {
//			arrayList.add(i);
			arrayList.add(0, i);
		}
		for (Integer integer : arrayList) {
			System.out.print(integer); 
		}
		System.out.println();
		arrayList.forEach(System.out::print);
		
//		System.out.println("arraylist插入所需要的时间："+addTest(arrayList));
//		System.out.println("linkedList插入所需要的时间："+addTest(linkedList));
//		
//		System.out.println("arraylist查询所需要的时间："+getTest(arrayList));
//		System.out.println("linkedList查询所需要的时间："+getTest(linkedList));
		
		
//	    List<Integer> list = new ArrayList<>();
//	    Integer n = new Integer(1);
//	    long start = System.currentTimeMillis();
//	    for (int i = 0; i < 50000; i++) {
//	        list.add(0, 1);
//	    }
//	    long end = System.currentTimeMillis();
//	    System.out.println("arraylist time:" + (end - start));
//
//
//	    List<Integer> list1 = new LinkedList<>();
//	    start = System.currentTimeMillis();
//	    for (int i = 0; i < 50000; i++) {
//	        list1.add(0, 1);
//	    }
//	    end = System.currentTimeMillis();
//	    System.out.println("linkedlist time:" + (end - start));
		
		
		//不支持基本数据类型
		//不支持add和remove方法
//		List<Integer> asList = Arrays.asList(1,2,3,4);
//		asList.forEach(System.out::println);

	}
	
	//插入测试
	public static long addTest(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 200000; i++) {
			list.add(0,i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	//查询测试
	public static long getTest(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i = 1000; i < 20000; i++) {
			list.get(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
}
