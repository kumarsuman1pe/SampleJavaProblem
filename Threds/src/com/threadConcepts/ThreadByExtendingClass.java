package com.threadConcepts;

public class ThreadByExtendingClass implements Runnable{

	
	@Override
	public void run()
	{
		
		while(true)
		{
			System.out.println("Thread by extending the thread class..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
