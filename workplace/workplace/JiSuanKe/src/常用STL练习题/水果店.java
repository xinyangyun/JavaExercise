package 常用STL练习题;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class 水果店 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeMap<String, TreeMap<String, Integer>> tm = new TreeMap<String,TreeMap<String,Integer>>();
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			String area = sc.next();
			Integer num = sc.nextInt();
			if (!tm.containsKey(area)) {
				TreeMap<String, Integer> tm2 = new TreeMap<String,Integer>();
				tm2.put(name, num);
				tm.put(area, tm2);
			}else {
				if (!tm.get(area).containsKey(name)) {
					tm.get(area).put(name, num);
				}else {
					int num2 = tm.get(area).get(name);
					tm.get(area).put(name, num+num2);
				}
			}
		}
		
		for(Entry<String,TreeMap<String,Integer>> x:tm.entrySet()) {
			System.out.println(x.getKey());
			for(Entry<String,Integer> y:x.getValue().entrySet()) {
				System.out.println("   |----"+y.getKey()+"("+y.getValue()+")");
			}
		}
	}
}
