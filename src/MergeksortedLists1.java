import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListNodes {
	int val;
	ListNodes next;
	ListNodes(int x) {
		val = x;
	}
}

public class MergeksortedLists1 {
	public ListNodes mergeKLists(ListNodes[] lists) {
        int len = lists.length;
        if(len == 1){
        	return lists[1];
        }else{
        	ListNodes l = lists[1];
        	for(int i=1;i<len;i++){
        		l = MergeTwoLists(l,lists[i]);
        	}
        	return l;
        }
    }
	
	public ListNodes MergeTwoLists(ListNodes l1, ListNodes l2){
		if(l1==null)return l2;
		if(l2==null)return l1;
		
		ListNodes head = l1.val<l2.val?l1:l2;
		ListNodes nonhead = l1.val<l2.val?l2:l1;
		head.next = MergeTwoLists(head.next,nonhead);
		return head;
	}
}