package com.lianxi3;

public class o64 {
	public static void main(String[] args) {
		System.out.println(sumNums(2));
	}
	
	static int res = 0;
	
	public static int sumNums(int n) {
		boolean x = n > 1 && sumNums(n-1) > 0;  
		res += n;
		return res;
    }
}
