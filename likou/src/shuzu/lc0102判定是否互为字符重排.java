package shuzu;

import java.util.HashMap;

public class lc0102判定是否互为字符重排 {
	public static void main(String[] args) {
		
	}
	
	public boolean CheckPermutation(String s1, String s2) {
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		for (char c : s1.toCharArray()) {
			map1.put(c, map1.getOrDefault(c, 0)+1);
		}
		
		for (char c : s2.toCharArray()) {
			map2.put(c, map2.getOrDefault(c, 0)+1);
		}
		
		if (map1.size()!=map2.size()) return false;
		for (char ch : map1.keySet()) {
			if (map1.get(ch) != map2.get(ch)) {
				return false;
			}
		}
		
		return true;
    }
}
