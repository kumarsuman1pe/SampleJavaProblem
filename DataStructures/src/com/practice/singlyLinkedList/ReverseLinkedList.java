package com.practice.singlyLinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode l=new ListNode(1);
		ListNode l1=new ListNode(2);
		ListNode l2=new ListNode(3);

		ListNode head=l;
		l.next=l1;
		l1.next=l2;
		//printList(head);

		ListNode ll=reverseList(head);
		
		printList(ll);
	}
// 1,2,3
	public static ListNode reverseList(ListNode head) {
		ListNode current = head;
		ListNode fwd = head;
		ListNode prev = null;
		while (current != null) {
			System.out.println(current.val);

			fwd = current.next;// 2
			current.next = prev;// null
			prev = current;// 1
			current=fwd;

		}
		return prev;
	}


public static void printList(ListNode head) {
	ListNode temp=head;
	while(temp!=null) {
		System.out.println(temp.val);
		temp=temp.next;
	}
}
}
class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

}
