package com.DSA.LinkedList;

public class FindLengthOFSinghlyLinkedList {
      private ListNode head;
      
      private static class ListNode{
    	  private int data;
    	  private ListNode next ;
		public ListNode(int data) {
			
			this.data = data;
			this.next = null;
		}
    	  
      }
      
      public int printLength() {
    	  if(head == null) {
    		 return 0;
    	  }
    	  int length = 0;
    	  ListNode current = head;
    	  while(current != null) {
    		  //System.out.println(current.data +"->");
    		  current = current.next;
    		  length++;
    	  }
    	   
    	  return length;
    	  
      }
      
      public static void main(String[] args) {
    	  FindLengthOFSinghlyLinkedList sll = new FindLengthOFSinghlyLinkedList();
    	  
    	  sll.head = new ListNode(10);
    	  ListNode second = new ListNode(11);
    	  ListNode third = new ListNode(12);
    	  ListNode forth = new ListNode(13);
    	  
    	  // set connection to the nodes
    	  
    	  sll.head.next = second;
    	  second.next = third;
    	  third.next = forth;
    	  
    	System.out.println("length : "+sll.printLength());
    	  
	}
}
