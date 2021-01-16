package LC;

import java.util.ArrayList;

public class LC33杨辉三角 {

	public ArrayList<ArrayList<Integer>> generate(int numRows) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for (int i = 0;i < numRows;i++) {
			ArrayList<Integer> temp = new ArrayList<>();
			for (int j = 0;j <= i;j++) {
				if ( j == 0  ||  j == i) temp.add(1);
				else temp.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));  //i-1是上一层，上一层的j-1和j相加
			}
			list.add(temp);
		}
		return list;
	}

}
