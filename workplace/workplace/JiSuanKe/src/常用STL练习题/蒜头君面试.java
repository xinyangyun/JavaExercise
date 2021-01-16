package 常用STL练习题;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class 蒜头君面试 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (!tm.containsKey(x)) {
				tm.put(x, 1);
			}else {
				int y = tm.get(x);
				tm.put(x, y+1);
			}
		}
		int max = tm.lastKey();
		int ans = 1;
		for(Entry<Integer,Integer> e:tm.entrySet()) {
			if (e.getValue() >= ans) {
				ans = e.getValue();
				max = e.getKey();
			}
		}
		System.out.print(max + " " +ans);
		
	}
}
