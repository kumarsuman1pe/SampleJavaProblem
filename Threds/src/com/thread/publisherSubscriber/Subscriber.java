package com.thread.publisherSubscriber;

public class Subscriber extends Thread {
	SharedData data;

	Subscriber(SharedData data) {
			this.data = data;
		}


		public void run() {
			for (int i = 0; i <= 5; i++) {
				data.readData();
			}

		
	}
	
}
