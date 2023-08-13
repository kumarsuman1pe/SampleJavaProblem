package com.practice.strings;

public class LongestPrefix {

	public static void main(String[] args) {
		String str[] = { "aa","aa","aadd" };
		System.out.println(longestCommonPrefix(str));
	}

	public static String longestCommonPrefix(String[] arr) {
		StringBuffer sb = new StringBuffer();
		if(arr.length==1){
			return	sb.append(arr[0]).toString();

		}
		for (int i = 0; i <= arr[0].length()-1; i++) {
			int j=1;
			for (j =1; j <= arr.length-1; j++) 
			{
				if (i<=arr[j].length()-1 && arr[0].charAt(i)!= arr[j].charAt(i)) {
					return sb.toString();
				} 
			}
			if (i<=arr[j-1].length()-1) 
			{
			sb.append(arr[j-1].charAt(i));
			}

		}

		return sb.toString();
	}
}
