package com.rough.objectConcepts;

public class MyThread implements Runnable {

	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		
		Thread thread= new Thread(myThread);
		thread.setPriority(1);

		thread.start();
		
		int i = 0;
		while (true) {
			System.out.println("Hi " +i);
			i++;
		}
		
		
	}

	@Override
	public void run() {

		int j = 0;
		while (true) {
			System.out.println("Hello " + j);
			j++;
		}

	}

}
