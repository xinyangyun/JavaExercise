package lianbiao;

import java.util.HashSet;

public class �ж������Ƿ��л� {
	public static void main(String[] args) {

	}

	public boolean hasCycle(ListNode head) {
		HashSet<ListNode> set = new HashSet<>();

		ListNode p = head;

		while (p != null) {
			if (set.contains(p)) {
				return true;
			} else {
				set.add(p);
			}
			p = p.next;
		}

		return false;
	}
}
