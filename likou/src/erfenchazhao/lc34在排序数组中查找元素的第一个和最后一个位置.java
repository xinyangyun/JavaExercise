package erfenchazhao;

import java.lang.Thread.State;

public class lc34在排序数组中查找元素的第一个和最后一个位置 {
	public static void main(String[] args) {
		
	}
	
	public int[] searchRange(int[] nums, int target) {
		
		int[] res = new int[] {-1,-1};
		int n;
		if (nums == null|| (n=nums.length)==0) {
			return res;
		}
		
		int low = 0;
		int high = nums.length-1;
		
		while (low < high) {
			int mid =low + (low+high)/2;
			if (nums[mid] == target) {
				high = mid;
			}else if (nums[mid] < target) {
				low = mid;
			}else {
				high = mid;
			}
		}
		
		int start = -1;
		
		if (nums[low] == target) {
			start = low;
		}else if (nums[high] ==  target) {
			start = high;
		}
		
		int end = start;
		
		while (end+1 < n && nums[end+1] == target) {
			end++;
		}
		
		res[0] = start;
		res[1] = end;
		
		return res;
    }
}
