package com.DSA.ArrayProblems;

public class MissingElement_In_an_Array {
     
	public static int missingElement(int[] arr ) {
		int n = arr.length+1;
	    int sum = n*(n+1)/2;
	    for(int num : arr) {
	    	sum = sum-num;
	    }
	    return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,4,3,5,6};
		System.out.println(missingElement(arr));
		
	}
}
