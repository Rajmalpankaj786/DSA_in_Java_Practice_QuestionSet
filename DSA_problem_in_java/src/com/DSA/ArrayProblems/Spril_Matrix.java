package com.DSA.ArrayProblems;

import java.util.*;
public class Spril_Matrix {
	 public List<Integer> spiralOrder(int[][] matrix) {
	        List<Integer> list = new ArrayList<>();
	        int m = matrix.length;
	        if (m == 0) return list; // Handle empty matrix
	        int n = matrix[0].length;
	        int top = 0;
	        int bottom = m - 1;
	        int left = 0;
	        int right = n - 1;
	        int count = 0;

	        while (count < m * n) {
	            // Traverse top row
	            for (int i = left; i <= right && count < m * n; i++) {
	                list.add(matrix[top][i]);
	                count++;
	            }
	            top++;

	            // Traverse right column
	            for (int i = top; i <= bottom && count < m * n; i++) {
	                list.add(matrix[i][right]);
	                count++;
	            }
	            right--;

	            // Traverse bottom row
	            for (int i = right; i >= left && count < m * n; i--) {
	                list.add(matrix[bottom][i]);
	                count++;
	            }
	            bottom--;

	            // Traverse left column
	            for (int i = bottom; i >= top && count < m * n; i--) {
	                list.add(matrix[i][left]);
	                count++;
	            }
	            left++;
	        }

	        return list;
	    }
}
