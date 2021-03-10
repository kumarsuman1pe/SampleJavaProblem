package com.threadConcepts;

public class MythreadByRunnnbaleInterface implements Runnable {

	@Override
	public void run() {
		int i = 1;
		while (true) {
			System.out.println("From Thread run method  " + i + " ");
			i++;
		}
	}

	public static void main(String args[]) {
		MythreadByRunnnbaleInterface mythread = new MythreadByRunnnbaleInterface();
		Thread thread = new Thread(mythread);
		thread.start();
		int j = 1;
		while (true) {
			System.out.println("From Main method() " + j + " ");
			j++;
		}
	}

}
