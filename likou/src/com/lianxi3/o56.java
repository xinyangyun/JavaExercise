package com.lianxi3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class o56 {
	public static void main(String[] args) {

	}

	//遍历数组统计每个数出现的次数
	//遍历散列表，如果key为1则return
	public int singleNumber(int[] nums) {

		HashMap<Integer, Integer> result = new HashMap<>();

		for (int e : nums) {
			int count = result.getOrDefault(e, 0) + 1; // getOrDefault如果e不存在就使用默认值0
			result.put(e, count);
		}

		for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}

		return 0;
	}
}
