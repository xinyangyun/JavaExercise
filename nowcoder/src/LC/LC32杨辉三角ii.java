package LC;

import java.util.ArrayList;

public class LC32�������ii {
	
	public ArrayList<Integer> getRow (int rowIndex) {
		
		ArrayList<Integer> row = new ArrayList<>();
		rowIndex++;
		if (rowIndex == 0) {
			return row;
		}
		row.add(1);
		for (int i = 1;i < rowIndex;i++)   {
			for (int j = i -1;j > 0;j--) { //��һ�������һ����1
				row.set(j, row.get(j-1)+row.get(j));
			}
			row.add(1);
		}
		return row;
    }
	

}
