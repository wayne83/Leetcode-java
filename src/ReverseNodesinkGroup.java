public class ReverseNodesinkGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode pre, f, l, temp, ans, r, first, f1;
		pre = new ListNode(0);
		pre.next = head;
		ans = pre;
		r = pre;
		int count = 0;
		while (r.next != null && count != k) {
			r = r.next;
			count++;
		}
		if (count == k) {
		    l = r;
			l.next = reverseKGroup(r.next, k);
			f = pre.next;
			temp = l.next;
			pre.next = l;
			first = f;
			f1 = f.next;
			for (int i = 0; i < k - 1; i++) {
				r = f1.next;
				f1.next = f;
				f = f1;
				f1 = r;
			}
			first.next = temp;
		}
		return ans.next;
	}
}
