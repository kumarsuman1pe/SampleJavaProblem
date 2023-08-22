package com.structural.singleton;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		LoggerSingleton obj = LoggerSingleton.getSoleInstance();
		LoggerSingleton obj1 = LoggerSingleton.getSoleInstance();
		LoggerSingleton obj11 =LoggerSingleton.getSoleInstance();;

		obj11.writeHi("Hi Suman,,,,");
		obj.writeHello("hello Suman..");
		obj1.writeHi("Hi Ashish,,,,");
		obj1.writeHello("hello Ashish..");
		obj11.writeHello("Hi Anjali,,,,");
		obj.writeHi("hello Anjali..");
	}

}
