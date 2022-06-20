package com.rough.objectConcepts;

public class SingletonConcepts {
	public static void main(String[] args) {
		
		//thread 1 t=0
		Logger soleInstace1 = Logger.getSoleInstace();	
		
		//thread 2 t=0
		Logger soleInstace2 = Logger.getSoleInstace();	

		System.out.println(soleInstace1==soleInstace2);
		
		System.out.println(soleInstace1.hashCode());
		
		System.out.println(soleInstace2.hashCode());

		
	}

}
