package com.rough.objectConcepts;

public class StringConcepts {

	public static void main(String[] args) {
		String str1 = new String("I Love Java");
		String str2 = new String("I Love Java");
		String str3 = "I Love Java";
		String str4 = "I Love Java";

//		System.out.println(str1==str2);
//		System.out.println(str1.equals(str2));//true

		StringBuffer buffer = new StringBuffer("I Love Java");
		StringBuffer buffer1 = new StringBuffer("I Love Java");
//System.out.println(buffer instanceof StringBuffer );

		System.out.println(str2.equals(buffer1.toString()));

//		System.out.println(buffer==buffer1);//false
//		
//		System.out.println(buffer.equals(buffer1));//flase
//
//		

//		System.out.println(str3==str4);
//
//		System.out.println(str1==str4);
//		System.out.println(str2==str3);
//		System.out.println(str2==str4);
//		
//		
//		Integer a=new Integer(12);
//		Integer b=new Integer(12);
//
//		System.out.println(a.equals(b));

	}

}
