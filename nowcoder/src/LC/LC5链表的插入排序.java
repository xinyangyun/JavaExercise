package LC;

public class LC5链表的插入排序 {
	
	
	public ListNode insertionSortList (ListNode head) {
		
		//1.判断一下
		if (head == null || head.next == null) {
			return head;
		}
		
		//2.新建一个虚拟节点
		ListNode dummy = new ListNode(0);
		
		//3.curr指向的节点及其后面所有节点都是未排序的，前面都是排好序的
		ListNode curr = head;
		while (curr != null ) {
			//4.每次循环，pre都重新指向dummy,dummy后一个节点到curr前一个节点都是排好序的
			ListNode pre = dummy;
			//5.保存一下当前节点后面一个节点的引用
			ListNode next = curr.next;
			//6.每次都从dummy节点下一个开始找，前面都是排序好的，如果小于当前节点则指针后移，--j
			//或者比当前节点大的时候，停止，表明pre的下一个节点就是当前节点应该放的位置
			while (pre.next != null && pre.next.val < curr.val) {
				pre = pre.next;
			}
			
			//7.找到当前节点应该放的位置后，下面的工作就是移动指针，让curr插到pre和pre.next中
			//然后让curr后移一位，前面都是排序好的
			curr.next = pre.next;
			pre.next = curr;
			curr = next;
		}
		//8.dummy后面就是我们所需要的用插入排序排好序的链表
		return dummy.next;
    }
	
}
