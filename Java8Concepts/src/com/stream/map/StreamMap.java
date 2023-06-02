package com.stream.map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class StreamMap {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
//print duplicate
		//NOt
		//intList.stream().distinct().forEach(x -> System.out.print(" " + x));
		
		String str = "anonmonkar";
		//print the index of non repeated first char
		char[] array= str.toCharArray();
		Map<Character,Integer> hm= new LinkedHashMap<>();
		for(int i=0;i<array.length;i++)
		{
			if(hm.get(array[i])==null) {
			hm.put(array[i], 0);
			}else {
				hm.put(array[i], hm.get(array[i])+1);
			}
		}
		hm.entrySet().stream().forEach(entry->{
			if(entry.getValue()==1)
			{
				System.out.print(hm.get(entry.getKey()));
			}
		});
		
		
	}

}
