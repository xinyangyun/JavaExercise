package com.lianxi3;

public class o65 {
	public static void main(String[] args) {
		String s = "d";
	}
	
	public int add(int a, int b) {
		
		while ( b != 0) { //����λ����0ʱ����
			int c = (a&b) << 1; //c = ��λ
			a ^=b;		 //a = �ǽ�λ
			b = c;		//b = ��λ
		}
		
		return a;
    }
}
