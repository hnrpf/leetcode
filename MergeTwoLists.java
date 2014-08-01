package leetcode;

public class MergeTwoLists {//Merge two sorted linked lists and return it as a new list. 
							//The new list should be made by splicing together the nodes of the first two lists.

	/**
	 * @param args
	 */
	public ListNode solution(ListNode l1, ListNode l2)
	{
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		ListNode head = null;
		if(l1.val <= l2.val){
			head = l1;
			head.next = solution(l1.next, l2);
		}
		else{
			head = l2;
			head.next = solution(l1, l2.next);			
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode A1 = new ListNode(1);
		ListNode A2 = new ListNode(3);
		ListNode A3 = new ListNode(5);
		ListNode B1 = new ListNode(2);
		ListNode B2 = new ListNode(4);
		ListNode B3 = new ListNode(6);
		
		A1.next = A2;
		A2.next = A3;
		B1.next = B2;
		B2.next = B3;
		
		MergeTwoLists instance = new MergeTwoLists();
		ListNode newHead = instance.solution(A1, B1);
		while(newHead != null){
			System.out.println(newHead.val);
			newHead = newHead.next;
		}
	}

}
