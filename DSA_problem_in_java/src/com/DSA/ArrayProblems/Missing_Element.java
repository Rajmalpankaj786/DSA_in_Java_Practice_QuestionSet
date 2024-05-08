package com.DSA.ArrayProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// arr = [1,9,6,7,3] missing element: 2 3 5 8
public class Missing_Element {
public static void main(String[] args) {
	int[] arr = {1,4,6,7,9};
	
	Arrays.sort(arr);
	
	Set<Integer> set = new HashSet<>();
	for(Integer i : arr) {
		set.add(i);
	}
	int max = arr[arr.length-1];
	int min = arr[0];
	for(int i = min; i <max;i++) {
		if(!set.contains(i)) {
			System.out.println(i);
		}
		
	}
	//System.out.println(arr);
}
	
}
