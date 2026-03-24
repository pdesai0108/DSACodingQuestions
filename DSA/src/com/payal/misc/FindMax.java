package com.payal.misc;

public class FindMax {

	public static void main(String[] args) {
		int[] arr = {1,4,6,2,8,9};
		
		int result = findMax(arr);
		
		System.out.println("Input : {1,4,6,2,8,9}");
		
		System.out.println("Largest Element in given array is : " + result);
	}

	private static int findMax(int[] arr) {
		int num = arr[0];
		
		for(int a : arr) {
			if(a > num) {
				num = a;
			}
		}
		return num;
	}

}
