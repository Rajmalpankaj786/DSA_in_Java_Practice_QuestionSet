package com.DSA.leetcode;

//https://leetcode.com/problems/merge-intervals/submissions/1152708289/

 

import java.util.*;

public class mergeIntervals_usingList {
	//Definition of Interval:
	private static class Interval {
		int start, end;

		Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}
	
	
	/**
	 * @param intervals: interval list.
	 * @return: A new interval list.
	 */
	public List<Interval> merge(List<Interval> intervals) {

		if (intervals == null || intervals.size() <= 1) {
			return intervals;
		}

		Collections.sort(intervals, Comparator.comparingInt(i -> i.start));

		List<Interval> mergeInterval = new ArrayList<>();
		Interval current = intervals.get(0);

		for (int i = 1; i < intervals.size(); i++) {
			Interval next = intervals.get(i);

			if (current.end >= next.start) {
				current.end = Math.max(current.end, next.end);
			} else {
				mergeInterval.add(current);
				current = next;
			}

		}

		mergeInterval.add(current);
		return mergeInterval;

	}
}
