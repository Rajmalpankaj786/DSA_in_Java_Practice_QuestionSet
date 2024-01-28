package com.DSA.StringProblem;
// https://leetcode.com/problems/rotate-string/description/

/* Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false
  */


public class Rotate_String {

	 public boolean rotateString(String s, String goal) {
	        if (s.length() != goal.length()) {
	            return false;
	        }

	        // Concatenate the first string with itself to create all possible rotations
	        String rotated = s + s;

	        // Check if the second string is a substring of the concatenated string
	        return rotated.contains(goal);
	    }
	}
