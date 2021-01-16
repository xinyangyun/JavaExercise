package com.lianxi4;

import java.util.HashMap;

public class lc454四数相加 {
	public static void main(String[] args) {
		
	}
	
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int count = 0;
		
		for (int i : A) {
			for (int j : B) {
				map.put((i+j), map.getOrDefault(i+j,0) +1);
			}
		}
		
		for (int i : C) {
			for (int j : D) {
				if (map.containsKey(0-(i+j))) {  //x = 0 - (i+j) -> x + (i+j)  = 0
					count += map.get(0-(i+j));
				}
			}
		}
		
		return count;
    }
}
