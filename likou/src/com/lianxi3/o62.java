package com.lianxi3;

import java.util.ArrayList;

public class o62 {
	public static void main(String[] args) {
		
	}
	
	public int lastRemaining(int n, int m) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		
		int idx = 0;
		while (n > 1) {
			idx = (idx + m -1)% n;//����ĩβ����ͷ������������Ҫȡģ
			list.remove(idx);
			n--;
		}
		
		return list.get(0);
	}
}
