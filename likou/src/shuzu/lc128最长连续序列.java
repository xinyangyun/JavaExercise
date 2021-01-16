package shuzu;

import java.util.HashSet;

public class lc128最长连续序列 {
	public static void main(String[] args) {
		int[] arr = {2,6,3,2,9};
		longestConsecutive(arr);
	}
	
	public static int longestConsecutive(int[] nums) {
		
		HashSet<Integer> num_set = new HashSet<>();
		
		for (Integer num : nums) {
			num_set.add(num);
		}
		
		int longestStreak = 0;
		
		for (Integer num : num_set) {
			if (!num_set.contains(num-1)) { //前一个不存在，从现在开始连续
				int currentNum = num;
				int currentStreak = 1;
				
				while (num_set.contains(currentNum+1)) {
					currentNum+=1;
					currentStreak+=1;
				}
				longestStreak = Math.max(longestStreak, currentStreak);
			}
		}
		
		return longestStreak;
    }
}
