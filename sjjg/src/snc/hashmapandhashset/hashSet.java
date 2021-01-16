package snc.hashmapandhashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class hashSet {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("ddd");
		
		Iterator<String> iterator = hashSet.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		hashSet.stream().forEach(x -> {
			System.out.println(x);
		});
		
		HashMap<Integer, String> mp = new HashMap<>();
		mp.put(1, "123");
		mp.put(2, "256");
		
		for(Map.Entry<Integer, String> entry : mp.entrySet() ) {
			System.out.println(entry.getKey()+"----"+entry.getValue());  
		}
		
		
		ConcurrentHashMap<Integer, String> con = new ConcurrentHashMap<>();
		
		con.put(2, "ff");
		
	}
}
