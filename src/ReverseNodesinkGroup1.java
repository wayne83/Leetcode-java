public class ReverseNodesinkGroup1 {
	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode pre, f, l, temp, ans, r, first, f1;
		pre = new ListNode(0);
		pre.next = head;
		ans = pre;
		while (existLastNode(pre, k)) {
			f = pre.next;
			r = pre;
			for (int i = 0; i < k; i++) {
				r = r.next;
			}
			l = r;
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
			pre = first;
		}
		return ans.next;
	}

	public Boolean existLastNode(ListNode head, int k) {
		Boolean flag = true;
		for (int i = 0; i < k; i++) {
			if (head.next == null) {
				flag = false;
				break;
			}
			head = head.next;
		}
		return flag;
	}
}
