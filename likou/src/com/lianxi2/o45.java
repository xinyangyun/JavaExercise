package com.lianxi2;

import java.util.Arrays;

public class o45 {
	public static void main(String[] args) {
		
		String[] strs = {"45","32"};
		Arrays.sort(strs,(x,y)->(x+y).compareTo(y+x));
		for (String s : strs) {
			System.out.println(s);
		}
		
	}
	
	//实际就是排序。
	//
	public String minNumber(int[] nums) {
		
		String[] strs = new String[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			strs[i] = String.valueOf(nums[i]);
		}
		
		Arrays.sort(strs,(x,y)->(x+y).compareTo(y+x));
		
		StringBuilder res = new StringBuilder();
		
		for (String s : strs) {
			res.append(s);
		}
		
		return res.toString();
    }
	
	void fastsort(String[] strs,int l,int r) {
		if (l >= r) return;
		
		int i = l,j = r;
		
		String tmp= strs[i];
		
		while (i < j ) {
			while ((strs[j]+strs[l]).compareTo(strs[l]+strs[j]) >= 0 && i < j) j--;
			while ((strs[i]+strs[l]).compareTo(strs[l] +strs[i]) <= 0 && i<j) i++;
			tmp = strs[i];
			strs[i] = strs[j];
			strs[j] = tmp;
		}
		
		strs[i] = strs[l];
		strs[l] = tmp;
		
		fastsort(strs, l, i-1);
		fastsort(strs, i+1, r);
		
	}
	
}
