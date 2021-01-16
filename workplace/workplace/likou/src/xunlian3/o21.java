package xunlian3;

public class o21 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(exchange(arr));
		int[] exchange = exchange(arr);
		for (int i = 0; i < exchange.length; i++) {
			System.out.println(exchange[i]);
		}
	}

	public static int[] exchange(int[] nums) {
		int[] arr = new int[nums.length];
		int[] arr1 = new int[nums.length];
		int[] arr2 = new int[nums.length];
		
		int k1 = 0;
		int k2 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]%2==1) {
//				System.out.println(nums[i]);
				arr1[k1++] = nums[i];
			}else {
//				System.out.println(nums[i]);
				arr2[k2++] = nums[i];
			}
		}
		
		for (int i = 0; i < k1; i++) {
			arr[i] = arr1[i];
		}
		for (int i = k1; i < arr.length; i++) {
			arr[i] = arr2[i-k1];
		}
		
		return arr;
	}
}
