package com.creational.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LoggerSingleton {
	PrintWriter pr;
	private final String fileName = "/Users/sumankumar/workspace/SampleJavaProblem/DesignPatterns/src/com/structural/singleton/file.txt";
	private static LoggerSingleton soleInstance = null;

	private LoggerSingleton() {
		try {
			FileWriter fw = new FileWriter(fileName);
			pr = new PrintWriter(fw, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static LoggerSingleton getSoleInstance() {
		if (soleInstance == null) {
			synchronized (LoggerSingleton.class) {
				if (soleInstance == null) {
					soleInstance = new LoggerSingleton();
				}
			}
		}
		return soleInstance;
	}

	public void writeHi(String message) {
		pr.println(message);

	}

	public void writeHello(String message) {
		pr.println(message);

	}
}
