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
//			long num = 9;//占多少位有多少个数字
//			char res = '0';
//			while ((temp+base*num) < m) {
//				temp = base*num;
//				base += 1;
//				num *= 10;
//			}
			
			long m = n;  //n=14
		   	long temp = 0; //一共占了多少位
		   	long base = 1; //多少位数
	  	    long num = 9; 
		    char res = '0';
		    while((temp+base*num) < m) {
			   temp += base*num;
			   base += 1;
			   num *= 10;
		    }
			   
			long a = (m-temp)/base; //计算占位的后几位数比如： 14-9=5 5/2=2
			long b = (m-temp)%base;//计算在第几个   5%2=1
			if (b!=0) {
				long c = (long) ( Math.pow(10, base-1)+a);//计算具体的数字   12
				res = String.valueOf(c).charAt((int)b-1);//取多少位  12中取第一个1-1为1
			}else {
				long c= (long) (Math.pow(10, base-1)+a-1);//假如是15 b为0  
				res = String.valueOf(c).charAt((int)base-1);//13 中取第二个  2-1=1结果为2
			}
			return Integer.parseInt(String.valueOf(res));
		}
    }
}
