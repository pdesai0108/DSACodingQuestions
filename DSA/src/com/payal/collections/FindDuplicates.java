package com.payal.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] arr = {1,3,4,5,5,6,1};
		
		List<Integer> duplicateNums = findDuplicates(arr);
		
		System.out.println(duplicateNums);
	}

	private static List<Integer> findDuplicates(int[] arr) {
		List<Integer> dups = new ArrayList<>();
		Set<Integer> set = new HashSet<Integer>();
		
		for(int a : arr) {
			if(!set.add(a)) {
				dups.add(a);
			}
		}
		return dups;
	}

}
