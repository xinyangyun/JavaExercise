package mianshiti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.jws.Oneway;

public class ms0808有重复字符串的排列组合 {
	public static void main(String[] args) {

	}

	private List<String> res = new ArrayList<>(); //动态数组存储排列结果
	StringBuilder path = new StringBuilder();  //构建每次排列的字符串
	
	//回溯算法
	public String[] permutation(String S) {
		
		char[] c = S.toCharArray();
		Arrays.sort(c);  //面对有重复元素的排列问题，核心步骤是排序
		
		int len = c.length;
		boolean[] used = new boolean[len];   //避免重复访问
		backtracking(c, used);  
		String[] ans = new String[res.size()];
		for (int i = 0;i < res.size();i++) {
			ans[i] = res.get(i);
		}
		
		return ans;
	}
	
	public void backtracking(char[] c,boolean[] used) {      //回溯算法
		if (path.length() == c.length) {                  //递归返回条件
			res.add(path.toString());
			return;
		}
		for (int i = 0;i < c.length;i++) {
			if (used[i]) {
				continue;
			}
			if (i > 0 && c[i] == c[i-1] && !used[i-1]) { //剪枝，排除重复元素带来的重复排列比如 q(1)q(2)e,q(2)q(1)e这种
				continue;
			}
			path.append(c[i]);
			used[i] = true;
			backtracking(c, used);
			used[i]= false;             //重置状态
			path.deleteCharAt(path.length()-1);
 		}
	}
}
