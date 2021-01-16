package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
//			arrayList.add(i);
			arrayList.add(0, i);
		}
//		for (Integer integer : arrayList) {
//			System.out.print(integer);
//		}
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		for (int i = 0; i <200000; i++) {
			arrayList.add(i);
		}
		for (int i = 0; i <20; i++) {
			linkedList.add(i);
		}
		
//		System.out.println("arrayList插入所需要的时间:"+addTest(arrayList));
//		System.out.println("linkedList插入所需要的时间:"+addTest(linkedList));
		
//		System.out.println("arrayList查询所需要的时间:"+getTest(arrayList));
//		System.out.println("linkedList查询所需要的时间:"+getTest(linkedList));
		
		linkedList.forEach(System.out::print);
		
		
	}
	
	public static long addTest(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i <200000; i++) {
//			list.add(i);
			list.add(0, i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long getTest(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i = 1000; i < 30000; i++) {
			list.get(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	
}
