package com.rough.objectConcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ocforge {

	public static void main(String[] args) {



		ExecutorService threadPool = Executors.newFixedThreadPool(5);

		threadPool.submit(() -> {
			return 0;
		});
	}

}
