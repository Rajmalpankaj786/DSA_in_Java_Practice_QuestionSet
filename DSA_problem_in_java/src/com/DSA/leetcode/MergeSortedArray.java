package com.DSA.leetcode;

public class MergeSortedArray {
     public static void main(String[] args) {
		  int[] arr1 = {1,2,3,0,0,0};
		  int n = 3;
		  int[] arr2 = {2,5,7};
		 
		  int m = arr2.length;
		  
		  mergeSortedArray(arr1,n,arr2,m);
		  
		  for(int i=0;i<n+m;i++) {
			  System.out.print(arr1[i]+" ");
		  }
	}

     static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
         int i = m-1;
         int j = n-1;
         int k = m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else{
                 nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
     }
 }
