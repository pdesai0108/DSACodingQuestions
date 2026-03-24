package com.payal.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FirstUniqueChar {

	public static void main(String[] args) {
		String str = "swiss";
		
		char result = firstUniqueChar(str);
		
		System.out.println(result);
		
		Optional<Character> streamResult = firstUniqueCharUsingStream(str);
		
		System.out.println(streamResult);
		
	}

	private static Optional<Character> firstUniqueCharUsingStream(String str) {
		Optional<Character> firstUniqueChar = str.chars().mapToObj(c -> (char) c).filter(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst();
		return firstUniqueChar;
	}

	private static char firstUniqueChar(String str) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		
		return '-';
	}

}
