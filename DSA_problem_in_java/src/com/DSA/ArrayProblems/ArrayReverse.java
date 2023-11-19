package com.DSA.ArrayProblems;

import java.util.Scanner;

public class ArrayReverse {
     public static void main(String[] args) {
		//input
    	 //1
    	 //5 2
    	 //1 2 3 4 5
    	 
    	 Scanner sc = new Scanner(System.in);
    	 int tc = sc.nextInt();
    	 for(int i=0;i<tc;i++) {
    		 int N = sc.nextInt();
    		 int K = sc.nextInt();
    		 sc.nextLine();
    		 
    		 int[] arr = new int[N];
    		 for(int j=0;j<N;j++) {
    			 arr[j]=sc.nextInt();
    		 }
    		revereseArray(arr,N,K);
    		 System.out.println(arr);
    		 for(int k=0;k<5;k++) {
    			 System.out.println(arr[k] + " ");
    		 }
    	 }
    	 
	}

	 static void revereseArray(int[] arr, int n, int k) {
		int i=k , j=n-1;
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j]= temp;
			i++;
			j--;
		}
		 
		
	}
}
