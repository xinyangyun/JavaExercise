package snc.hashsetandTreeSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

public class hashSet {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>();
		
		hashSet.add(5);
		hashSet.add(6);
		hashSet.add(9);
		hashSet.add(5);
		
		for (Integer integer : hashSet) {
			System.out.println(integer);
		}
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		treeSet.add(2);
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(3);
		
		for (Integer integer : treeSet) {
			System.out.println(integer);
		}
		
		HashMap<Integer,String> hashMap = new HashMap<>();
		
		hashMap.put(1, "123");
		hashMap.put(2, "562");
		hashMap.put(3, "2555");
		
		for(Map.Entry<Integer, String> entry: hashMap.entrySet()) {  
			System.out.println(entry.getKey()+entry.getValue());
		}
		
	}
	
}
