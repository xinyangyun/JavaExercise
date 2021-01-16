package string;

import java.util.LinkedList;

public class lc1585����ַ����Ƿ����ͨ���������ַ����õ���һ���ַ��� {
	public static void main(String[] args) {

	}

	public boolean isTransformable(String s, String t) {
		//��ʵ ֻҪ t �Ӻ���ǰ�� ÿ�� ���� number�� ֻҪ (number , 9] ���е�ÿ������ s �е� ���λ�� �� number �� s �е�λ��С ���С�
		int n = s.length();
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        LinkedList<Integer>[] record = new LinkedList[10];
        for (int i = 0; i < 10; i++) {
            record[i] = new LinkedList<>();
        }
        for (int i = 0; i < n; i++) {
            record[arrS[i] - '0'].add(i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int v = arrT[i] - '0';
            if (record[v].size() == 0) return false;
            int index = record[v].removeLast();
            for (int j = v + 1; j < 10; j++) {
                if (record[j].size() > 0 && record[j].getLast() > index) {
                    return false;
                }
            }
        }
        return true;
	}
}
