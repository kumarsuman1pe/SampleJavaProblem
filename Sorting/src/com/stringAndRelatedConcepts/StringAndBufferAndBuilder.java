package com.stringAndRelatedConcepts;
/***
 * 
 * @author sumankumar
 *
 */
public class StringAndBufferAndBuilder {
	/***
	 * illustrate the performance of String,StringBuffer and StringBuilder
	 * 
	 * speed: StringBuilder>String>StringBuffer
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String s = new String("Suman");

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000000; i++) {
			s.concat("Kumar");
		}

		System.out.println(System.currentTimeMillis() - startTime);

		StringBuffer buffer = new StringBuffer("Suman");
		long bufferStartTime = System.currentTimeMillis();

		for (int i = 0; i < 10000000; i++) {
			buffer.append("Kumar");
		}
		System.out.println(System.currentTimeMillis() - bufferStartTime);

		StringBuilder builder = new StringBuilder("Suman");
		long builderStartTime = System.currentTimeMillis();

		for (int i = 0; i < 10000000; i++) {
			builder.append("Kumar");
		}
		System.out.println(System.currentTimeMillis() - builderStartTime);

	}
}
