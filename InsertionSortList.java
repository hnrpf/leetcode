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
           
        ListNode p = head;      // ǰ������ָ��  
        ListNode q = head.next;  
           
        while(p!=null && q!=null){  
            if(p.val <= q.val){  // ����˳�����轻����������ǰѰ��  
                p = q;  
                q = q.next;  
            }else{          // out of order��  
                ListNode h = head;  
                if(head.val >= q.val){       // qԪ�ر�headԪ�ػ�С�����  
                    ListNode qnext = q.next;  
                    p.next = qnext;  
                    q.next = head;  
                    head = q;       // ��������ͷ  
                    q = qnext;      // ����q��λ�ã���q������ǰѰ��  
                }
                else{  
                    while(h.val<=q.val && h.next.val<=q.val){ // ��head��ʼ�ң����������ʺϷ���qԪ�أ�ע��Ԫ����ȵ������  
                        h = h.next;  
                    }  
                    if(h.val<=q.val && q.val<=h.next.val){        // ��qԪ�ز����ʵ��ĵط�  
                        ListNode qnext = q.next;  
                        p.next = qnext;  
                        q.next = h.next;  
                        h.next = q;  
                        q = qnext;      // ����q��λ�ã���q������ǰѰ��  
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
