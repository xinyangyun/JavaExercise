package LC;

import java.util.Arrays;

public class LC23最长的连续元素序列长度 {
	
	
	public int longestConsecutive (int[] num) {
		//1.排序
		Arrays.sort(num);
		int maxLength = 1;
		int max = 1;
		//遍历
		for (int i = 0; i < num.length-1;i++) {
			if (num[i] == num[i+1]) { //如果第i项等于第i+1项，继续循环
				continue;
			}else if (num[i]==num[i+1]-1) { //递增1，maxLength++
				maxLength++;
				if (max < maxLength) {
					max = maxLength;
				}
			}else { //否则maxlength归1，继续遍历
				maxLength = 1;
			}
		}
		return max;
    }
	
}
