package com.lianxi3;

import java.util.HashMap;

public class o50 {
	public static void main(String[] args) {
		
	}
	
	public char firstUniqChar(String s) {
		
		//��һ��hash��ͳ���ַ����ֵĴ�����valueΪtrue��false
		//
		
		char[] ch = s.toCharArray();
		
		HashMap<Character, Boolean> dic = new HashMap<>();
		
		for (char c : ch) {
			dic.put(c, !dic.containsKey(c));//���룬���ԭ�����ڱ�Ϊfalse�������ھ�Ϊtrue
		}
		
		for (char c : ch) {
			if (dic.get(c)) return c;  //���ص�һ��true
		}
		
		return ' ';
    }
}

