package com.rough.objectConcepts;

public class Test1 {
	LinkedList head;
	public static void main(String[] args) {
		
		Test1 test=new Test1();
		test.createLinkedList();
		test.printList();
		test.printMiddleAndSortRest();
		System.out.println("After sorting the 2nd Half..");
		test.printList();
	}
	
	private void printMiddleAndSortRest() {

		LinkedList slow=head;
		LinkedList fast=head;
		LinkedList temp=head;
		
		while(fast!=null && fast.next!=null) {
			temp=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println("Middle Node: "+slow.data);
		LinkedList temp1=slow;
		
		while(temp1.next!=null) {
			if(temp.data>temp1.next.data) {
				temp.next=temp1.next;
				temp1.next=temp;
				temp1=temp1.next;
				temp=temp.next;
			}
			else{
				temp1=temp1.next;
			}
		}
		
		
	
		
	}

	public void printList() {
		LinkedList temp=head;
		
		while(temp!=null) {
			System.out.println(" "+temp.data);
			temp=temp.next;
		}
		
		
	}
	
	public void createLinkedList() {
		
		LinkedList node1=new LinkedList(1);
		LinkedList node2=new LinkedList(22);
		LinkedList node3=new LinkedList(5);
		LinkedList node4=new LinkedList(4);
		LinkedList node5=new LinkedList(110);
		LinkedList node6=new LinkedList(21);
		head=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		
		
	}
	
	class LinkedList{
		int data;
		LinkedList next;
		public LinkedList(int data) {
			this.data=data;
		}
	}

}

class Singleton
{
	private Singleton() {}
	
	private static Singleton soleInstance=null;
	private static int MAX_COUNT=5;
	private static volatile int CURRENT_COUNT=0;
	
	public static Singleton getSoleInstance() {
		
		if(soleInstance==null && CURRENT_COUNT<= MAX_COUNT) {
			
			synchronized (Singleton.class) {
				if(soleInstance==null) {
				soleInstance=new Singleton();
				CURRENT_COUNT++;
				}
			}
			
		}
		return soleInstance;
		
	}
	

}







Employee{
	
	@maytoMany(mappedby=address"")
	List<EmployeeAdres> addList;
}




EmployeeAddress{
	
	@maytoMany(mappedby=address"")
	List<EmployeeAdres> addList;
}

Select s.name,c.name from 
Student s,
INNER JOIN
Course c
on s.id=c.c














