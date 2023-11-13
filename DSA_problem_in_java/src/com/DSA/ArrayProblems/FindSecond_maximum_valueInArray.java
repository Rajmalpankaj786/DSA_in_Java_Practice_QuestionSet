package com.DSA.ArrayProblems;

public class FindSecond_maximum_valueInArray {
	
	public static int secondMax(int[] arr) {
		int firstmaxvalue = 0;
		int secondMaxValue = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstmaxvalue) {
				secondMaxValue = firstmaxvalue;
				firstmaxvalue = arr[i];
			}else if(arr[i]>secondMaxValue && arr[i] != firstmaxvalue) {
				secondMaxValue = arr[i];
			}
		}
		return secondMaxValue;
	}
     public static void main(String[] args) {
		int[] arr = {1,3,45,7,87,90,90};
		System.out.println(secondMax(arr));
	}
}
