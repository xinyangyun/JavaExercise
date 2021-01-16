package concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Concureent {
	public static void main(String[] args) {
		ConcurrentMap<String, Integer> test = new ConcurrentHashMap<>();
		test.put("ddd",1111);
		System.out.println(test.get("ddd"));
		
	}
}
