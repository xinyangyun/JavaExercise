package com.lianxi3;

public class o65 {
	public static void main(String[] args) {
		String s = "d";
	}
	
	public int add(int a, int b) {
		
		while ( b != 0) { //当进位等于0时跳出
			int c = (a&b) << 1; //c = 进位
			a ^=b;		 //a = 非进位
			b = c;		//b = 进位
		}
		
		return a;
    }
}
