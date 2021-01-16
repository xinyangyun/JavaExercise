package LC2;

import java.util.ArrayList;
import java.util.Arrays;

public class LC58ii {

	ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();

	// �ݹ飬��subseti�Ͷ��� һ���ж϶��ѣ���������һ������� ������
	public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
		if (num == null || num.length <= 0) {
			return listAll;
		}
		ArrayList<Integer> list = new ArrayList<>();
		Arrays.sort(num);
		Findsubset(num, 0, list);
		return listAll;
	}

	public void Findsubset(int[] set, int start, ArrayList<Integer> list) {
		listAll.add(new ArrayList<>(list));
		for (int i = start; i < set.length; i++) {
			if (i > start && set[i] == set[i - 1]) {
				continue;
			}
			list.add(set[i]);
			Findsubset(set, i + 1, list);
			list.remove(list.size() - 1);
		}
	}

}
