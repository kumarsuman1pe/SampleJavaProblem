package com.thread.clients;

import com.thread.sharedResources.MyPrinter;

public class ClientB extends Thread {
	public ClientB(MyPrinter printer) {
		this.printer = printer;
	}

	String myMessage = "This belongs to Deepak!! ";
	MyPrinter printer;

	public void run() {
		printDocuments();
	}

	private void printDocuments() {
		printer.printDocuments(myMessage);
	}

}
