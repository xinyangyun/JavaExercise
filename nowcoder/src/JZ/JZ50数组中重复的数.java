package JZ;

import java.util.HashSet;

public class JZ50�������ظ����� {
	
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		System.out.println(set1.add(1));
	}
	
	
	
	public boolean duplicate(int numbers[], int length, int[] duplication) {
		
		
		HashSet<Integer> set = new HashSet<>();
		
		boolean res = false;
		
		if (length == 0) {
			duplication[0] = -1;
			return res;
		}
		
		for (int num : numbers) {
			if (!set.add(num)) { //����ڶ������Ϊfalse
				res = true;
				duplication[0] = num;
				break;
			}
		}
		
		return res;
	}
}
