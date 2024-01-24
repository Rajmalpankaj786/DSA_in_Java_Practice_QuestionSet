package com.DSA.LinkedList;



public class Insert_node_in_sorted_linkedList {
	 private ListNode head;
     private static class ListNode{
  	   private int data;
  	   private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

     }
     
     public ListNode inserNode(int data) {
    	 ListNode newNode = new ListNode(data);
    	 
    	 ListNode current = head;
    	 ListNode temp = null;
    	 
    	 while(current != null && current.data < newNode.data) {
    		 temp = current;
    		 current = current.next;
    	 }
    	  
    	newNode.next = current.next ;
    	temp.next = newNode;
    	
    	 
    	 
    	 return head;
     }
}
