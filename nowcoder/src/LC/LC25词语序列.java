package LC;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LC25词语序列 {

	//使用bfs（广度优先搜索），其中res用作记录结果，size用于记录每一层的元素个数
	//遍历每一层
	//注意遍历过的要从字典中删除
	public int ladderLength(String start, String end, HashSet<String> dict) {
		int res = 1;
		LinkedList<String> queue = new LinkedList<>();
		queue.offer(start);
		
		while (!queue.isEmpty()) {
			int size = queue.size();
			while (size > 0) {
				String s = queue.poll();
				size--;
				if (isDiffOne(s, end)) {//如果与end相差一个就结束了
					return res+1;
				}
				//遍历，把s当成最后一个，
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
	//判断是否差一个
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
