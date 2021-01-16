package com.lianxi2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class o38 {
	
	static List<String> res = new LinkedList<>();
	static char[] c;
	
	public static void main(String[] args) {
		
		
		String str = "abc";
		
		permutation(str);
		
	}
	
	public static String[] permutation(String s) {

		c = s.toCharArray();
		
		dfs(0);
		
		return res.toArray(new String[res.size()]);
    }
	
	static void dfs(int x) {
		if (x == c.length - 1 ) {  //添加新的排序方案
			res.add(String.valueOf(c));
			return;
		}
		HashSet<Character> set = new HashSet<>();
		for (int i = x; i < c.length; i++) {
			if (set.contains(c[i])) continue;//重复了，因此需要剪枝
			set.add(c[i]);
			swap(i, x);//交换，将c[i] 固定在第x位
			dfs(x+1);	//开启固定第x+1位字符
			swap(i, x);//交换恢复
		}
		
	}
	
	static void swap(int a,int b) {
		char temp = c[a];
		c[a] = c[b];
		c[b] = temp;
	}
}
