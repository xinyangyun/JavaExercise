package shuangzhizhen;

public class lc80刪除排序数组中的重复项II {
	public static void main(String[] args) {
		
	}
	
	public int removeDuplicates(int[] nums) {
		
// 		if (nums == null || nums.length == 0) return 0;
// 		
// 		//1.指针定义[0,index]是修改后无重复的排序元素 ，注意 这里已经把0纳入进去了
// 		int index = 0;
// 		//2.另一个循环指针，从1开始，终止为nums.length，为什么从1开始，因为我们要比较重复nums[0]肯定是不重复的
// 		for (int i = 1;i < nums.length;i++) {
// 			//3.指针运动的条件
// 			if (nums[index]!= nums[i]) {
// 				index++;
// 				nums[index] = nums[i];
// 			}
// 		}
//		//4.根据定义确定返回值
//		return index+1;
		
		int i = 0;
		for (int n : nums) {
			if (i < 2 || n > nums[i-2]) {
				nums[i++] = n;
			}
		}
		return i;
    }
}
