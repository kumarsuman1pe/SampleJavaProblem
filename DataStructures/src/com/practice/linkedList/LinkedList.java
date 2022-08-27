package com.practice.linkedList;

public class LinkedList {
	Node head;

	public LinkedList() {

	}

	public void insert(int data) {
		if (head == null) {
			Node node = new Node();
			node.setData(data);
			node.setNext(null);
			head = node;
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			Node newNode = new Node();
			newNode.setData(data);
			newNode.setNext(null);
			current.setNext(newNode);

		}
	}

	public void display() {
		if (head != null) {
			Node current = head;
			while (current != null) {
				System.out.println(current.getData());
				current = current.getNext();
			}
		} else {
			System.out.print("LinkedList is empty...");
		}
	}

	public void insertAtHead(int data) {
		Node firstNode = new Node();
		firstNode.setData(data);
		firstNode.setNext(head);
		head = firstNode;

	}

	public int countNodes() {
		int count = 0;

		Node current = head;
		while (current != null) {
			count++;
			current = current.getNext();
		}

		return count;

	}

	public int sumOfNodes() {
		int sum = 0;
		Node current = head;
		while (current != null) {
			sum += current.getData();
			current = current.getNext();
		}
		return sum;
	}

	public int findMax() {
		int max = 0;
		Node current = head;

		while (current != null) {
			if (max < current.getData()) {
				max = current.getData();

			}
			current = current.getNext();
		}
		return max;
	}

	public boolean checkifPresent(int ele) {
		boolean isFound = false;
		Node cur = head;
		while (cur != null) {
			if (cur.getData() == ele) {
				isFound = true;
				break;
			}
			cur = cur.getNext();
		}
		return isFound;
	}

	public void insertAtPosition(int pos, int ele) {
		Node cur = head;
		for (int i = 0; i < pos - 1; i++)
			cur = cur.getNext();

		Node newNode = new Node();
		newNode.setData(ele);
		newNode.setNext(cur.getNext());
		cur.setNext(newNode);

	}

	public void deleteFromLinkedList(int ele) {

		Node cur = head;
		Node tail = null;
		while (cur != null) {

			if (cur.getData() == ele) {
				break;
			}
			tail = cur;
			cur = cur.getNext();

		}
		if (cur != null)
			tail.setNext(cur.getNext());

	}

	public boolean checkIfLinkedListIsSorted() {
		if (head != null) {
			Node cur = head.getNext();
			int min = head.getData();
			while (cur != null) {
				if (min > cur.getData()) {
					return false;
				} else {
					min = cur.getData();
				}
				cur = cur.getNext();
			}
		}
		return true;
	}

	public void removeDuplicate() {
		if (head.getNext() != null) {
			Node tail = head;
			Node cur = head.getNext();
			while (cur != null) {

				if (cur.getData() == tail.getData()) {
					if (cur != null)
						tail.setNext(cur.getNext());

				}
				tail = cur;
				cur = cur.getNext();
			}
		}
	}

	public void reverseLinkedList() {
		Node tail = null;
		Node cur = head;
		while (cur != null) {
			Node fwd=cur.getNext();
			cur.setNext(tail);
			tail = cur;
			cur = fwd;
		}
		head = tail;
	}

	public boolean isLoopFound() {
		
		Node slow=head;
		Node fast=head.getNext();
		
		
		while(fast!=null && fast.getNext()!=null) {
			if(slow==fast)
			{
				return true;
			}
			slow=slow.getNext();
			fast=fast.getNext().getNext();
		}
		
		return false;
	}

}
