//package com.lianxi1;
//
//import java.util.Scanner;
//
///*请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。例如，把 9 表示成二进制是 1001，
//有 2 位是 1。因此，如果输入 9，则该函数输出 2。*/
///*
//输入：00000000000000000000000000001011
//输出：3
//解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。*/
//
///*若 n \& 1 = 0n&1=0 ，则 nn 二进制 最右一位 为 00 ；
//若 n \& 1 = 1n&1=1 ，则 nn 二进制 最右一位 为 11 。*/
//
//public class o15 {
//	@SuppressWarnings("resource")
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println(hammingWeight(sc.nextInt()));
//	}
//
//	public static int hammingWeight(int n) {
//		int res = 0;
//		while (n != 0) {
//			res += n & 1;
//			n >>>= 1; //无符号右移一位
//		}
//		return res;
//	}
//}
