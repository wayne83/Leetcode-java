class ListNodes {
	int val;
	ListNodes next;
	ListNodes(int x) {
		val = x;
	}
}

public class SwapNodesinPairs {
	public ListNodes swapPairs(ListNodes head) {
		ListNodes pre = new ListNodes(0);
		pre.next = head;
		ListNodes s ,temp ,r,f;
		r=pre;
		f=head;
		while(f!=null && f.next!=null ){
			s = f.next;
			temp=s.next;
			s.next=f;
			f.next=temp;
			pre.next = s ;
			pre = f ;
			f=f.next;
		}
		return r.next;
    }
}
