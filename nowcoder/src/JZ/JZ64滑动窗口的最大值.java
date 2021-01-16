package JZ;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class JZ64滑动窗口的最大值 {

	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		
		ArrayList<Integer> res = new ArrayList<>();
		
		if (size > num.length) {
            return res;
        }
		
		if (num.length == 0 || size == 0) {
			return res;
		}
		
		Deque<Integer> deque = new LinkedList<>();
		
		for (int i = 0;i < size;i++) { //未形成窗口
			while (!deque.isEmpty() && num[i] > deque.peekLast()) {//如果当前小于队列的最后一个就删除最后一个
				deque.removeLast();
			}
			deque.addLast(num[i]);
		}
		
		res.add(deque.peekFirst()); //队列的第一个值也是最大的值
		
		for (int i = size;i < num.length;i++) {
			if (deque.peekFirst() == num[i-size]) { //如果首位等于当前值，说明首位已经不再当前内了，需要删除
				deque.removeFirst();
			}
			while (!deque.isEmpty() && num[i] > deque.peekLast()) {  //删除比当前值小的值
				deque.removeLast();
			}
			//把当前值添加到队列中
			deque.addLast(num[i]);
			//把队列的首位添加到res中
			res.add(deque.peekFirst());
		}
		
		return res;
	}

}
