package leetcode;

public class InsertionSortList {	

	/**
	 * @param args
	 */
	public ListNode solution(ListNode head)
	{
		if(head==null || head.next==null){  
            return head;  
        }  
           
        ListNode p = head;      // 前后两个指针  
        ListNode q = head.next;  
           
        while(p!=null && q!=null){  
            if(p.val <= q.val){  // 递增顺序，无需交换，继续往前寻找  
                p = q;  
                q = q.next;  
            }else{          // out of order！  
                ListNode h = head;  
                if(head.val >= q.val){       // q元素比head元素还小的情况  
                    ListNode qnext = q.next;  
                    p.next = qnext;  
                    q.next = head;  
                    head = q;       // 更新链表头  
                    q = qnext;      // 更新q的位置，让q继续往前寻找  
                }
                else{  
                    while(h.val<=q.val && h.next.val<=q.val){ // 从head开始找，查找哪里适合放置q元素，注意元素相等的情况！  
                        h = h.next;  
                    }  
                    if(h.val<=q.val && q.val<=h.next.val){        // 把q元素插入适当的地方  
                        ListNode qnext = q.next;  
                        p.next = qnext;  
                        q.next = h.next;  
                        h.next = q;  
                        q = qnext;      // 更新q的位置，让q继续往前寻找  
                    }  
                }  
            }  
        }  
           
        return head;  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(7);
		ListNode node4 = new ListNode(1);
		ListNode node5 = new ListNode(6);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		InsertionSortList instance = new InsertionSortList();
		ListNode head = instance.solution(node1);
		
		while(head != null){
			System.out.println(head.val);
			head = head.next;
		}
	}

}
