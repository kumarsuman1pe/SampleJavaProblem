package com.practice.linkedList;

public class Driver {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(5);
		ll.insert(11);
		// ll.display(ll);

		// LinkedList ll2 = new LinkedList();
		// ll2.insert(111);
		// ll2.insert(22);
		// ll2.display(ll2);

		// ll.insertAtHead(99);
		ll.insertAtHead(99);
		ll.insert(100);
		ll.display();

		int numberOfNode = ll.countNodes();

		System.out.println("Number of nodes is: " + numberOfNode);

		int sumOfAllNodes = ll.sumOfNodes();

		System.out.println("Sum of all nodes: " + sumOfAllNodes);

		int maxElement = ll.findMax();

		System.out.println("Max element of LinkedList is: " + maxElement);

		boolean isPresent = ll.checkifPresent(5);
		if (isPresent) {
			System.out.println("Element found in LinkedList: ");
		} else {
			System.out.println("Element not found in LinkedList: ");

		}
		ll.insertAtPosition(2, 1111);
		ll.display();
		int elementToBeDeleted = 100;
		ll.deleteFromLinkedList(elementToBeDeleted);
		System.out.println("After deleting the " + elementToBeDeleted);
		ll.display();
		/*
		 * creating sorted linkedlist
		 */
		LinkedList ll2 = new LinkedList();
		ll2.insert(2);
		ll2.insert(5);
		ll2.insert(5);
		ll2.insert(6);
		ll2.insert(7);
		ll2.insert(8);
		/*
		 * check if LinkedList is sorted or not
		 */
		boolean isSorted = ll2.checkIfLinkedListIsSorted();
		if (isSorted) {
			System.out.println("Linked is in sorted order : ");
		} else {
			System.out.println("Linked is not in sorted order : ");

		}
		/*
		 * remove duplicate from sorted linkedlist
		 */
		System.out.println("LinkedList with duplicate element..");
		ll2.insert(6);

		ll2.display();
		ll2.removeDuplicate();
		System.out.println("LinkedList after deleting the duplicate element..");
		ll2.display();

		/*
		 * 
		 * 
		 * reverse the LinkedList
		 * 
		 */

		ll2.reverseLinkedList();
		System.out.println("Reversed LinkedList elements..");

		ll2.display();

		ll2.head.getNext().getNext().setNext(ll2.head);
		boolean isLoopFound = ll2.isLoopFound();
		if (isLoopFound) {
			System.out.println("LinkedList have loop..");
		} else {
			System.out.println("LinkedList doesn't have loop..");

		}

	}

}
