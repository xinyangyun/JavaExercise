package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListTest3 {
	public static void main(String[] args) {
//		List<Integer> asList = Arrays.asList(12,23,23,25);
//		System.out.println(asList);
//		asList.forEach(System.out::println);
//		for (Integer integer : asList) {
//			System.out.println(integer);
//		}
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("1111");
		list.add("1111");
		list.add("1111");
		list.add("1111");  
		System.out.println(list.get(0));
		
		list.add(4, "666");
		list.remove(2);
		list.remove("1111");
//		for (int i = 0; i < 20000; i++) {
//			list.add("100"+i);
//		}
//		
//		long start = System.currentTimeMillis();
//		list.forEach(System.out::println);
//		long end = System.currentTimeMillis();
//		
//		long start2 = System.currentTimeMillis();
//		for (String string : list) {
//			System.out.println(string);
//		}
//		long end2 = System.currentTimeMillis();
//		
//		long start3 = System.currentTimeMillis();
//		Iterator<String> ite = list.iterator();
//		while (ite.hasNext()) {
//			System.out.println(ite.next());
//		}
//		long end3 = System.currentTimeMillis();
//		
//		System.out.println(end-start);
//		System.out.println(end2-start2);
//		System.out.println(end3-start3);
		
//		System.out.println(list.size());
		
//		LinkedList<String> linkedList = new LinkedList<String>();
//		linkedList.add("1");
//		linkedList.add("2");
//		linkedList.add("3");
//		linkedList.add("4");
//		linkedList.remove(3);
//		linkedList.remove("3");
//		
//		linkedList.get(2);
		
//		for (int i = 0; i < 100000; i++) {
//			linkedList.add("1000"+i);
//		}
//		
//		long start = System.currentTimeMillis();
//		linkedList.forEach(System.out::println);
//		long end = System.currentTimeMillis();
//		
//		long start2 = System.currentTimeMillis();
//		for (String string : linkedList) {
//			System.out.println(string);
//		}
//		long end2 = System.currentTimeMillis();
//		
//		long start3 = System.currentTimeMillis();
//		Iterator<String> ite = linkedList.iterator();
//		while (ite.hasNext()) {
//			System.out.println(ite.next());
//		}
//		long end3 = System.currentTimeMillis();
//		
//		System.out.println(end-start);
//		System.out.println(end2-start2);
//		System.out.println(end3-start3);
		
		
		
//		linkedList.forEach(System.out::println);
		
		
//		ArrayList<String> list2 = new ArrayList<String>();
		
//		list.remove(0);
//		list.forEach(System.out::println);
//		
//		System.out.println(list.size());
//		
//		System.out.println(list.isEmpty());
//		
//		list.clear();
//		
//		System.out.println(list.size());
//		
//		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		
//		list2.add(22);
//		list2.add(22);
//		list2.add(22);
//		list2.add(22);
//		list2.add(4, 66);
//		
//		list2.forEach(System.out::println);
//		
//		list2.clear();
//		
//		System.out.println(list2.size());
		
//		LinkedList<Integer> linkedList = new LinkedList<Integer>();
//		for (int i = 0; i < 200000; i++) {
//			linkedList.add(i);
//		}
//		linkedList.forEach(System.out::println);
		
		
//		long startTime = System.nanoTime();
//		System.out.println(linkedList.get(3333));
//		long endTime = System.nanoTime();
		
		
//		ArrayList<Integer> arrayList = new ArrayList<Integer>();
//		for (int i = 0; i < 200000; i++) {
//			arrayList.add(i);
//		}
		
//		long startTime2 = System.nanoTime();
//		System.out.println(arrayList.get(3333));
//		long endTime2 = System.nanoTime();
		
//		System.out.println("linkedList：查询所需要的时间"+getTest(linkedList));
//		System.out.println("arrayList：查询所需要的时间"+getTest(arrayList));
//		
//		
//		System.out.println("linkedList插入所需要的时间："+addTest(linkedList));
//		System.out.println("arrayList插入所需要的时间："+addTest(arrayList));
		
//		System.out.println("linkedList删除所需要的时间："+removeTest(linkedList));
//		System.out.println("arrayList删除所需要的时间："+removeTest(arrayList));
		
		
//	    List<String> list1 = new ArrayList<>();
//	    Random random=new Random();
//	    long start = System.currentTimeMillis();
//	    for (int i = 1; i < 50000; i++) {
//	        int x=random.nextInt(i);
//	        list1.add(x,"a");
//	    }
//	    long end = System.currentTimeMillis();
//	    System.out.println("arrayList insert time "+(end-start));
//
//
//	    List<String> list11 = new LinkedList<>();
//	    start = System.currentTimeMillis();
//	    for (int i = 1; i < 50000; i++) {
//	        int x=random.nextInt(i);
//	        list11.add(x,"a");
//	    }
//	    end = System.currentTimeMillis();
//	    System.out.println("arrayList insert time "+(end-start));
	    
	    
//	    List<Integer> list = new ArrayList<>();
//	    Integer n = new Integer(1);
//	    long start = System.currentTimeMillis();
//	    for (int i = 0; i < 50000; i++) {
//	        list.add(0, n);
//	    }
//	    long end = System.currentTimeMillis();
//	    System.out.println("arraylist time:" + (end - start));
//
//
//	    List<Integer> list1 = new LinkedList<>();
//	    start = System.currentTimeMillis();
//	    for (int i = 0; i < 50000; i++) {
//	        list1.add(0, n);
//	    }
//	    end = System.currentTimeMillis();
//	    System.out.println("linkedlist time:" + (end - start));

		
	}
	
	//测试查询的时间
	public static long getTest(List<Integer> list) {
		for (int i = 0; i < 1000000; i++) {
			list.add(i);
		}
		long startTime = System.nanoTime();
		for (int i = 0; i < 100; i++) {
			list.get(i+1000);
		}
		long endTime = System.nanoTime();
		return endTime-startTime;
	}
	
	//测试插入的时间
	public static long addTest(List<Integer> list) {
		long startTime = System.currentTimeMillis();
//		for (int i = 1; i < 50000; i++) {
//			list.add(new Random().nextInt(i),i);
//		}
//		for (int i = 1; i < 200; i++) {
//			list.add(i);
//		}
		for (int i = 1; i < 200; i++) {
			list.add(1000,i);
		}
		long endTime = System.currentTimeMillis();
		return endTime-startTime;
	}
	
	//测试删除的时间
	public static long removeTest(List<Integer> list) {
		long startTime = System.nanoTime();
		for (int i = 0; i < 20; i++) {
//			list.remove(new Random().nextInt(200000));
			list.remove(1000);
		}
		long endTime = System.nanoTime();
		return endTime-startTime;
	}
	
}
