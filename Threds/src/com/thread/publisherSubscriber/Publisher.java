package com.thread.publisherSubscriber;

public class Publisher extends Thread {
	Publisher(SharedData data) {
		this.data = data;
	}

	SharedData data;

	public void run() {
		for (int i = 0; i <= 5; i++) {
			data.writeData(i);
		}

	}
}
