package leetcode;

public class SwapPairs {

	/**
	 * @param args
	 */
	public ListNode solution(ListNode head){
		if(head == null){  
            return null;  
        }  
        // 当只有一个元素的情况  
        if(head.next == null){  
            return head;  
        }  
        ListNode i = head;  // i指向第1个  
        ListNode j = i.next;    // j指向第2个  
        ListNode k = j.next;    // k指向第3个  
           
        head = head.next;     
        while(j != null){  
            j.next = i;  
            if(k!=null && k.next!=null){    // 当有偶数个节点   
                i.next = k.next;  
            }else{      // 当有奇数个节点  
                i.next = k;  
            }  
               
            // 更新i，j，k的值，前进两格  
            i = k;  
            if(k != null){  
                j = k.next;  
            }else{  
                j = null;  
            }  
            if(k!=null && k.next!=null){  
                k = k.next.next;  
            }else{  
                k = null;  
            }  
        }  
        return head;  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(7);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		
		SwapPairs instance = new SwapPairs();
		ListNode newhead = instance.solution(node1);
		
		while(newhead != null){
			System.out.println(newhead.val);
			newhead = newhead.next;
		}
	}
	
}
