package com.lianxi3;

import java.util.HashMap;

public class o50 {
	public static void main(String[] args) {
		
	}
	
	public char firstUniqChar(String s) {
		
		//用一个hash来统计字符出现的次数，value为true和false
		//
		
		char[] ch = s.toCharArray();
		
		HashMap<Character, Boolean> dic = new HashMap<>();
		
		for (char c : ch) {
			dic.put(c, !dic.containsKey(c));//存入，如果原来存在变为false，不存在就为true
		}
		
		for (char c : ch) {
			if (dic.get(c)) return c;  //返回第一个true
		}
		
		return ' ';
    }
}

