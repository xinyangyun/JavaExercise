package com.lianxi4;

import java.util.ArrayList;
import java.util.List;

public class lc1447×î¼ò·ÖÊý {
	public static void main(String[] args) {
		
	}
	
	 public List<String> simplifiedFractions(int n) {
		 
		 ArrayList<String> list = new ArrayList<>();
		 
		 for (int i = 1;i <= n;i++) {
			 for (int j = 1;j < i;j++) {
				 if (j == 1 || getGcd(i, j) == 1) {
					 list.add(j + "/" + i);
				 }
			 }
		 }
		 
		return list;
	 }
	 
	 public int getGcd(int m,int n) {
		 int max = Math.max(m, n);
		 int min = Math.min(m, n);
		 if (max % min != 0) {
			 return getGcd(min, max % min);
		 }else {
			 return min;
		 }
	 }
}
