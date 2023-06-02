package com.rough.objectConcepts;

public class FindNumberOfRotation {

	public static void main(String[] args) {
		int []input= {5,6,8,11,12,15,18,2};
		
	System.out.println(printRotationCount(input));
	}

	private static int printRotationCount(int[] input) {
		int count=0;
		for(int i=0;i<input.length-1;i++) {
			if(input[i]<input[i+1])
			{
				count++;
			}
			else {
				break;
			}
		}
		return input.length-1-count;
	}

}
