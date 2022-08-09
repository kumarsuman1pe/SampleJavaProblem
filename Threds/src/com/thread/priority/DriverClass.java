package com.thread.priority;

public class DriverClass {

	public static void main(String[] args) throws InterruptedException {
		MyThread1 t1 = new MyThread1();
		//t1.setDaemon(true);
		t1.setPriority(10);
		t1.start();
		//t1.interrupt();
		//System.out.println("Hiii from main method");

		
		
		MyThread2 t2 = new MyThread2();
		t2.setPriority(10);
		t2.yield();
		t2.start();
		
		
//		Thread currentThread = Thread.currentThread();
//		currentThread.sleep(1000);
//		
//		System.out.println("Is Daemion "+currentThread.isDaemon());
//		System.out.println("Is Daemion "+t1.isDaemon());

		//System.out.println("2nd Hi from main method");

	}

}

// one thread
class MyThread1 extends Thread {
	public void run() {
		int i = 1;
		while (true) {
			System.out.println("From ******** MyThread1 run method ******* " + i + " ");
			i++;
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				System.out.println("Interrupted while sleep......... ");
//			}
		}
	}
}
//another thread

class MyThread2 extends Thread {
	public void run() {
		int i = 1;
		while (true) {
			System.out.println("From ###     MyThread2 run method  ##### " + i + " ");
			i++;
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}