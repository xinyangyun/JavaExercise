package string;

import java.util.LinkedList;

public class lc1585检查字符串是否可以通过排序子字符串得到另一个字符串 {
	public static void main(String[] args) {

	}

	public boolean isTransformable(String s, String t) {
		//其实 只要 t 从后往前的 每个 数字 number， 只要 (number , 9] 的中的每个数在 s 中的 最后位置 比 number 在 s 中的位置小 就行。
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
