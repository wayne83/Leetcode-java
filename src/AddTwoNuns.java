import java.util.ArrayList;
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class AddTwoNuns {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
		ListNode head = new ListNode(0);
		ListNode prev = head;
		int carry = 0 , sum= 0;
		while( l1 != null || l2 != null || carry != 0 ){
			sum = ((l1==null)? 0 : l1.val ) + ((l2==null)? 0 : l2.val ) + carry ;
			carry = sum / 10;
			sum = sum % 10;
			ListNode node = new ListNode(sum);
			prev.next = node ;
			prev = node;
			if(l1 != null)l1 = l1.next;
			if(l2 != null)l2 = l2.next;
		}
		return head.next;
	
	}
	
	
	public static void main(String[] args){
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(5);
		Scanner input = new Scanner(System.in);
		int n ;
		n = input.nextInt();
		ListNode r1 = l1;
		ListNode r2 = l2;
		for(int i=0;i<1;i++){
			ListNode l = new ListNode(input.nextInt());
			r1.next = l ;
			r1 = l ;
		}
		for(int i=0;i<n;i++){
			ListNode l = new ListNode(input.nextInt());
			r2.next = l ;
			r2 = l ;
		}
		l1 = l1.next;
		l2 = l2.next;
		ListNode ans = addTwoNumbers(l1,l2);
		while(ans != null){
			System.out.println(ans.val);
			ans = ans.next;
		}
	}
}

