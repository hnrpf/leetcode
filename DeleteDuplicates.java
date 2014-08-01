package leetcode;

public class DeleteDuplicates {	

	/**
	 * @param args
	 */
	public ListNode solution(ListNode head){
		if(head == null)
			return head;
		ListNode temp = head;
		while(temp != null && temp.next != null ){
			if(temp.next.val == temp.val){
				temp.next = temp.next.next;
			}
			else if(temp != null)
				temp = temp.next;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode nodeA = new ListNode(2);
		ListNode nodeB = new ListNode(2);
		ListNode nodeC = new ListNode(3);
		
		head.next = nodeA;
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		
		DeleteDuplicates instance = new DeleteDuplicates();
		head = instance.solution(head);
		while(head != null)
		{
			System.out.println(head.val);
			head = head.next;
		}
	}

}
