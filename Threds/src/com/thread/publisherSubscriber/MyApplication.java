package com.thread.publisherSubscriber;

public class MyApplication {
	public static void main(String[] args) {
		SharedData data = new SharedData();
		Publisher publisher = new Publisher(data);
		Subscriber subscriber = new Subscriber(data);
		publisher.start();
		subscriber.start();
	}
}
