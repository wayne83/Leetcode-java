class ListNodes {
	int val;
	ListNodes next;
	ListNodes(int x) {
		val = x;
	}
}
public class MergeTwoSortedLists {
	public ListNodes mergeTwoLists(ListNodes l1, ListNodes l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		ListNodes head = l1.val < l2.val ? l1 : l2;
		ListNodes nonhead = l1.val < l2.val ? l2 : l1;
		head.next = mergeTwoLists(head.next, nonhead);
		return head;
	}
}
