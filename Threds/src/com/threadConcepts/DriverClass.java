package com.threadConcepts;

public class DriverClass {

	public static void main(String[] args) {

		ThreadByExtendingClass thread1=new ThreadByExtendingClass();
		
		
		Thread thread=new Thread(thread1);
		
		thread.start();
		
	}

}
