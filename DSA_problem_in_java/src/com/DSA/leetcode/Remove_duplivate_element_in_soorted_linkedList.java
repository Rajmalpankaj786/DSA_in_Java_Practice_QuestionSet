package com.DSA.leetcode;



public class Remove_duplivate_element_in_soorted_linkedList {
	 private ListNode head;
     private static class ListNode{
  	   private int data;
  	   private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
  	     
     }
     
       public ListNode reomove_duplivate_element() {
    	 ListNode current = head;
    	 while(current != null) {
    		 if(current.data == current.next.data) {
    			 current.next = current.next.next;
    		 }
    		 else {
    			 current = current.next;
    		 }
    	 }
    	   
		return head;
    	   
       }
}
