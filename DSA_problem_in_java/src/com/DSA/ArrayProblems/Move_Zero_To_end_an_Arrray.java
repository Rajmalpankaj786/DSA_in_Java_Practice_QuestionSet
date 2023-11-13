package com.DSA.ArrayProblems;

public class Move_Zero_To_end_an_Arrray {
	
	public static void moveZeroToendAnArray(int[] arr) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] !=0 && arr[j]==0) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]= temp;
			}
			if(arr[j] !=0) {
				j++;
			}
		}
		
	
	}
        public static void main(String[] args) {
			int[] arr = {0,1,0,2,1,0,3};
			moveZeroToendAnArray(arr);
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i] +" ");
			}
			
		}
}
