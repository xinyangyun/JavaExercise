package com.lianxi4;

import java.util.ArrayList;
import java.util.List;

public class lc166分数到小数 {
	public static void main(String[] args) {
		
	}
	
	public String fractionToDecimal(int numerator, int denominator) {
		
		if (numerator == 0) {
			return "0";
		}
		
		StringBuilder fraction = new StringBuilder();
		
		if (numerator < 0 ^ denominator < 0) {
			fraction.append("-");
		}
		
		long dividend = Math.abs(Long.valueOf(numerator));
		long divisor = Math.abs(denominator);
		fraction.append(String.valueOf(dividend / divisor));
		long remainder = dividend % divisor;
		
		if (remainder == 0) {
			return fraction.toString();
		}
		
		fraction.append(".");
		List<Long> list = new ArrayList<>();
		while (remainder != 0) {
			if (list.contains(remainder)) {
				fraction.append(")");
				break;
			}
			list.add(remainder);
			remainder *= 10;
			fraction.append(String.valueOf(remainder/divisor));
			remainder %= divisor;
		}
		return fraction.toString();
    }
	
	
}
