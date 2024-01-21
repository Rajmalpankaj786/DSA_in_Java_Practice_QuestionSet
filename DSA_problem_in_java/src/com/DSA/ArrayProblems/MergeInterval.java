package com.DSA.ArrayProblems;
//https://leetcode.com/problems/merge-intervals/
import java.util.*;
public class MergeInterval {

	 public int[][] merge(int[][] intervals) {
	       
	       if(intervals ==null || intervals.length <= 1){
	           return intervals;
	       }
	       
	       Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

	       List<int[] > mergeInterval = new ArrayList<>();

	       int[] current = intervals[0];

	       for(int i=0;i<intervals.length;i++){
	           int[] next = intervals[i];

	           if(current[1] >= next[0]){
	               current[1] = Math.max(current[1] , next[1]);
	           }
	           else{
	               mergeInterval.add(current);
	               current = next;
	           }
	       }

	       mergeInterval.add(current);

	       return mergeInterval.toArray(new int[mergeInterval.size()][]);
	    }
	 
}
