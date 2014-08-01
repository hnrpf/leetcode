package leetcode;
public class ListCycle {

	/**
	 * @param args
	 */
	boolean hasCycle(ListNode head)
	{
		if(head == null || head.next == null)
			return false;
		ListNode fast = head;
		ListNode slow = head;
		while(true)
		{
			if(fast.next != null && fast.next.next != null)
				fast = fast.next.next;
			else
				return false;
			if(slow.next != null){
				slow = slow.next;
			}
			else 
				return false;
			if(fast == slow)
				return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
