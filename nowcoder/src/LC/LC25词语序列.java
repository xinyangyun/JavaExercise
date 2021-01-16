package LC;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LC25�������� {

	//ʹ��bfs���������������������res������¼�����size���ڼ�¼ÿһ���Ԫ�ظ���
	//����ÿһ��
	//ע���������Ҫ���ֵ���ɾ��
	public int ladderLength(String start, String end, HashSet<String> dict) {
		int res = 1;
		LinkedList<String> queue = new LinkedList<>();
		queue.offer(start);
		
		while (!queue.isEmpty()) {
			int size = queue.size();
			while (size > 0) {
				String s = queue.poll();
				size--;
				if (isDiffOne(s, end)) {//�����end���һ���ͽ�����
					return res+1;
				}
				//��������s�������һ����
				for (Iterator<String> it = dict.iterator();it.hasNext();) {
					String str = it.next();
					if (isDiffOne(str, s)) {
						queue.offer(str);
						it.remove();
					}
				}
			}
			res++;
		}
		return 0;
	}
	//�ж��Ƿ��һ��
	public boolean isDiffOne(String w1,String w2) {
		int count = 0;
		for (int i = 0;i < w1.length();i++) {
			if (w1.charAt(i) != w2.charAt(i)) {
				count++;
			}
		}
		return count == 1 ? true:false;
	}

}
