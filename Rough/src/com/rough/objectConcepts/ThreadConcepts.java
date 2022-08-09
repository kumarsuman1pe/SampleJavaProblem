package com.rough.objectConcepts;

public class ThreadConcepts extends Thread {

	public static void main(String[] args) {
		
		ThreadConcepts thread=new ThreadConcepts();
		thread.start();
		saySomething();

		int j = 0;
		while (true) {

			System.out.println("Hello,,,, " + j);
			j++;
		}
	}
	
	
	
	public void run()
	{
		int i = 0;
		while (true) {
			System.out.println("Hi,,,, " + i);
			i++;
		}
	}

	private static void saySomething() {		
	}
}
