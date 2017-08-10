class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
public class RemoveNthNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l = head;
        ListNode last;
        int num = 0 , cut = 0;
        while(l != null){
        	num++;
        	l = l.next;
        }
        cut = num - n - 1;
        if(cut == -1){
        	return null;
        }
        else{
        	l = head;
            for(int i=0;i<cut;i++){
            	l = l.next;
            }
            last = l.next.next;
            l.next = last;
            return head;
        } 
    }
}
