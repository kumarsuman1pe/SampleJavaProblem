package com.thread.sharedResources;

import com.thread.sharedResources.MyPrinter;

public class ClientA extends Thread {
	public ClientA(MyPrinter printer) {
		this.printer = printer;
	}

	String myMessage = "This belongs to Suman!! ";
	MyPrinter printer;

	public void run() {
		printDocuments();
	}

	private void printDocuments() {
		printer.printDocuments(myMessage);
	}

}
