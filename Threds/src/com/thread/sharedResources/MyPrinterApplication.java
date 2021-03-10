package com.thread.sharedResources;

import com.thread.clients.ClientA;
import com.thread.clients.ClientB;

public class MyPrinterApplication {

	public static void main(String[] args) {
		MyPrinter printer = new MyPrinter();

		ClientA suman = new ClientA(printer);
		ClientB deepak = new ClientB(printer);
		suman.start();
		deepak.start();
	}

}
