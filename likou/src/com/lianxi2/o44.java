package com.lianxi2;

import java.util.Scanner;

public class o44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(findNthDigit(sc.nextInt()));
	}
	
	public static int findNthDigit(int n) {
		if (n < 0) return 0;
		else if (n >= 0 && n <= 9) return n;
		else {
//			long m = n;  
//			long temp = 0; 
//			long base = 1; 
//			long num = 9;//ռ����λ�ж��ٸ�����
//			char res = '0';
//			while ((temp+base*num) < m) {
//				temp = base*num;
//				base += 1;
//				num *= 10;
//			}
			
			long m = n;  //n=14
		   	long temp = 0; //һ��ռ�˶���λ
		   	long base = 1; //����λ��
	  	    long num = 9; 
		    char res = '0';
		    while((temp+base*num) < m) {
			   temp += base*num;
			   base += 1;
			   num *= 10;
		    }
			   
			long a = (m-temp)/base; //����ռλ�ĺ�λ�����磺 14-9=5 5/2=2
			long b = (m-temp)%base;//�����ڵڼ���   5%2=1
			if (b!=0) {
				long c = (long) ( Math.pow(10, base-1)+a);//������������   12
				res = String.valueOf(c).charAt((int)b-1);//ȡ����λ  12��ȡ��һ��1-1Ϊ1
			}else {
				long c= (long) (Math.pow(10, base-1)+a-1);//������15 bΪ0  
				res = String.valueOf(c).charAt((int)base-1);//13 ��ȡ�ڶ���  2-1=1���Ϊ2
			}
			return Integer.parseInt(String.valueOf(res));
		}
    }
}
