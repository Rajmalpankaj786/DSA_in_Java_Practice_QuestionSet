package com.DSA.ArrayProblems;

public class Resize_an_Array {
	public static int[] resizeArray(int[] arr ,int capacity) {
		int[] temp = new int[capacity];
		for(int i=0;i<arr.length;i++) {
			temp[i] = arr[i];
		}
		arr= temp;
		//return arr;
		return temp;
	}
    public static void main(String[] args) {
        
		int[] arr = new int[] {1,2,3,4,5};
		System.out.println("size of an original Array : "+arr.length);
		arr = resizeArray(arr, 10);
		System.out.println("size of an updated original Array : "+arr.length);

		
		
	}
}
