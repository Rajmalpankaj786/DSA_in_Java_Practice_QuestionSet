package com.DSA.LinkedList;

// https://leetcode.com/problems/rotate-list/

/* Given the head of a linked list, rotate the list to the right by k places.

Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

Example 2:
Input: head = [0,1,2], k = 4
Output: [2,0,1]
  */ 

public class Rotate_ListNode {
	
	private ListNode head;
    private static class ListNode{
 	   private int data;
 	   private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
 	     
    }
	 public ListNode rotateRight(ListNode head, int k) {

	        if(head ==null || k==0){
	            return head;
	        }
	        
	        int length = 1;
	        ListNode tail = head;
	        while(tail.next != null){
	            length++;
	            tail = tail.next;
	        }

	        k = k%length;
	        
	         // If k is 0 after adjusting, no rotation is needed
	        if (k == 0) {
	            return head;
	        }

	        int index = length-k-1;
	        ListNode current = head;

	        for(int i=0;i<index;i++){
	            current = current.next;
	        }

	        ListNode newHead = current.next;
	        current.next = null;
	        tail.next = head;

	        return newHead;

	    }
	}

