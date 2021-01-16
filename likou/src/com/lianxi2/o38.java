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
		if (x == c.length - 1 ) {  //����µ����򷽰�
			res.add(String.valueOf(c));
			return;
		}
		HashSet<Character> set = new HashSet<>();
		for (int i = x; i < c.length; i++) {
			if (set.contains(c[i])) continue;//�ظ��ˣ������Ҫ��֦
			set.add(c[i]);
			swap(i, x);//��������c[i] �̶��ڵ�xλ
			dfs(x+1);	//�����̶���x+1λ�ַ�
			swap(i, x);//�����ָ�
		}
		
	}
	
	static void swap(int a,int b) {
		char temp = c[a];
		c[a] = c[b];
		c[b] = temp;
	}
}
