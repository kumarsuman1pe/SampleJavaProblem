package com.threadConcepts;

public class MyThreadByClass extends Thread{

	public static void main(String[] args) {
		MyThreadByClass myThread=new MyThreadByClass();
		myThread.start();
		int j = 1;
		while (true) {
			System.out.println("From Main method() "+ j + " ");
			j++;
		}
		
	}

	public void run() {
		int i = 1;
		while (true) {
			System.out.println("From Thread run method  "+i + " ");
			i++;
		}
	}
}
