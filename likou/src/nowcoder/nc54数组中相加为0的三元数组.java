package nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class nc54数组中相加为0的三元数组 {

	public ArrayList<ArrayList<Integer>> threeSum(int[] num) {

		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

		if (num == null || num.length <= 2)
			return ans;

		Arrays.sort(num);

		for (int i = 0; i < num.length - 2; i++) {
			if (num[i] > 0)
				break;
			if (i > 0 && num[i] == num[i - 1])
				continue;
			int target = -num[i];
			int left = i + 1, right = num.length - 1;

			while (left < right) {
				if (num[left] + num[right] == target) {
					ans.add(new ArrayList<>(Arrays.asList(num[i],num[left],num[right])));
					
					left++;right--;
					while (left < right && num[left]== num[left-1]) left++;
					while (left < right && num[right] == num[right+1] )right--;
					
				}else if (num[left] + num[right] < target) {
					left++;
				}else {
					right--;
				}
 			}
			
		}

		return ans;

	}

}
