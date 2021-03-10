package com.thread.sharedResources;

public class MyPrinter {
	public void printDocuments(String msg) {
		//System.out.print("Trying to get it printed..");
		synchronized (MyPrinter.class) {
			for (int i = 0; i < msg.length(); i++) {
				System.out.print(msg.charAt(i));
			}
		}
	}
}
