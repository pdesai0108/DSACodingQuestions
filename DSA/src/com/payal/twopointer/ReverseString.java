package com.payal.twopointer;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Payal";
		
		String result = reverseString(str);
		
		System.out.println("Result : " + result);
	}

	private static String reverseString(String str) {
		char[] arr = str.toCharArray();
		int left = 0;
		int right = str.length() - 1;
		
		while(left < right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
			
		}
		return new String(arr);
	}

}
