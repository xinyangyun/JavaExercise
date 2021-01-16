package bylance;

import java.util.ArrayList;
import java.util.List;

public class o5螺旋矩阵 {
	public static void main(String[] args) {
		
	}
	
	
	public List<Integer> spiralOrder(int[][] matrix) {
		
		//特判
		if (matrix.length == 0) {
			return new ArrayList<>();
		}
		
		//初始化
		int l = 0;  //行左
		int r = matrix[0].length - 1; //行右
		int t = 0;  //列上
		int b = matrix.length - 1; //列下
		
		//结果集
		ArrayList<Integer> list = new ArrayList<>();
		
		while (true) {
			
			//左到右
			for (int i = l;i <= r;i++) {
				list.add(matrix[t][i]);
			}
			
			//++t:先给t加1，然后用t的新值
			//t++:先用t的原值，然后t加1
			//现在往下走，考虑的问题
			if (++t > b) break;
			
			//从上到下
			for (int i = t;i <= b;i++) {
				list.add(matrix[i][r]);
			}
			//现在往左走
			if (l> --r) break;
			
			//右向左走
			for (int i = r;i >= l;i--) {
				list.add(matrix[b][i]);
			}
			//现在往上走
			if (t > --b) break;
			
			//下向上走
			for (int i = b;i >= t;i--) {
				list.add(matrix[i][l]);
			}
			//现在往右走
			if (++l > r) break;
			
		}
		
		return list;
    }
}
