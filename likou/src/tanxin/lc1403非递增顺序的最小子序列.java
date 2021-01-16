package tanxin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc1403非递增顺序的最小子序列 {
	public static void main(String[] args) {
		
		int[] arr = {4,3,10,9,8};
		
		List<Integer> minSubsequence = minSubsequence(arr);
		for (Integer integer : minSubsequence) {
			System.out.println(integer);  
		}
	}
	
	public static List<Integer> minSubsequence(int[] nums) {
		int sum2 = getsum(nums);
		Arrays.sort(nums);
		List<Integer> list = new ArrayList<>();
		int sum = 0;  
		for (int i = nums.length-1; i >= 0; i--) {
			sum += nums[i];
			list.add(nums[i]); 
			if (sum>sum2/2) {
				break;
			}
		}
		
		return list;
    }
	
	static int getsum(int[] arr) {
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		
		return sum;
	}
	
}
