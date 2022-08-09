package com.thread.sharedResources;

public class MyPrinter {
	 public void printDocuments(String msg) {
		
		//
		//
		
		//critical section code
		synchronized (msg) {
			for (int i = 0; i < msg.length(); i++) {
				System.out.print(msg.charAt(i));
			
		}
		}	
		 
	}
}
