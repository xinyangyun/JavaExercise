//package com.lianxi1;
//
//import java.util.Scanner;
//
///*
//  给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
//每段绳子的长度记为 k[0],k[1]...k[m - 1] 。请问 k[0]*k[1]*...*k[m - 1] 可能的最大乘积是多少？
//例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
//答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
//*/
//
///*
//输入: 2
//输出: 1
//解释: 2 = 1 + 1, 1 × 1 = 1
//*/
//
///*思路：选取最优的方案为3的次方。
//然后考虑小于等于3的情况以及余数为2和1的情况。
//小于等于3的时候直接返回值减1
//余数为2的时候为3的（n/3次方）再乘2
//余数为1的时候为3的（n/3减1次方）再乘4
//*/
//
//public class o14II {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println(cuttingRope(sc.nextInt()));
//	}
//
//	public static int cuttingRope(int n) {
//		if (n <= 3)
//			return n - 1;
//		int a = n / 3;
//		int b = n % 3;
//		if (b == 2) {
//			return (int) (quickPow(3, a) * b % 1000000007);
//		} else {
//			return (int) (quickPow(3, a - 1) * (b + 3) % 1000000007);
//		}
//	}
//
//	private static long quickPow(int x, long n) {
//		long res = 1;
//		long tt = x;
//		while (n != 0) {
//			if ((n & 1) == 1) {
//				res *= tt;
//				res %= 1000000007;
//			}
//			tt *= tt;
//			tt %= 1000000007;
//			n /= 2;
//		}
//		return res;
//	}
//}
