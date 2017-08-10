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

public class MergekSortedLists {
	public ListNodes mergeKLists(ListNodes[] lists) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<lists.length;i++){
            while(lists[i]!=null){
                list.add(lists[i].val);
                lists[i]=lists[i].next;
            }
        }
        Integer[] array = new Integer[list.size()];
        list.toArray(array);
        Arrays.sort(array);
        ListNodes l = new ListNodes(0);
        ListNodes p = l;
        for(int i=0;i<array.length;i++){
        	ListNodes q = new ListNodes(array[i]);
        	p.next = q ;
        }
        return l.next;
    }
}
