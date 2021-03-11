package com.thread.publisherSubscriber;

public class SharedData {
	int data;
	boolean flag = true;

	public synchronized void writeData(int theData) {
		while (flag != true) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Publisher thread intrupted!!");
			}
		}
		data = theData;
		System.out.println("Publisher publishing :->" + data);
		flag = false;
		notify();
	}

	public synchronized int readData() {
		int value;
		while (flag != false) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Subscriber Thraed intrupted!");
			}
		}
		value = data;
		System.out.println("Subscriber consuming :->" + value);
		flag = true;
		notify();
		return value;
	}

}
