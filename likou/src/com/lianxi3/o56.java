package com.lianxi3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class o56 {
	public static void main(String[] args) {

	}

	//��������ͳ��ÿ�������ֵĴ���
	//����ɢ�б����keyΪ1��return
	public int singleNumber(int[] nums) {

		HashMap<Integer, Integer> result = new HashMap<>();

		for (int e : nums) {
			int count = result.getOrDefault(e, 0) + 1; // getOrDefault���e�����ھ�ʹ��Ĭ��ֵ0
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
