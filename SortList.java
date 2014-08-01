package leetcode;

public class SortList {

	/**
	 * @param args
	 */					//¹é²¢
	public ListNode solution(ListNode head)
	{
		if(head == null || head.next == null)
			return head;
		
		ListNode mid = GetMiddle(head);
		ListNode next = mid.next;
		mid.next = null;
		
		return MergeList(solution(head), solution(next));
	}
	ListNode GetMiddle(ListNode head)
	{
		ListNode fast = head;
		ListNode slow = head;
		while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	ListNode MergeList(ListNode a, ListNode b)
	{
		ListNode dummyhead = new ListNode(-1);
		ListNode cur = dummyhead;
		while(a != null && b != null){
			if(a.val < b.val){
				cur.next = a;
				a = a.next;
			}
			else{
				cur.next = b;
				b = b.next;
			}
			cur = cur.next;
		}
		cur.next = a!=null?a:b;  
		return dummyhead.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(4);
		ListNode node4 = new ListNode(1);
		ListNode node5 = new ListNode(6);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		SortList instance = new SortList();
		ListNode head = instance.solution(node1);
		
		while(head != null){
			System.out.println(head.val);
			head = head.next;
		}
	}

}
