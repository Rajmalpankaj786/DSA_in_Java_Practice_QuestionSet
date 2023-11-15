package com.DSA.LinkedList;

public class PrintSinghlyLinkedList{
	   private ListNode head;
       private static class ListNode{
    	   private int data;
    	   private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
    	     
       }
       
       public void printData() {
    	    ListNode current = head;
    	    while(current != null) {
    	    	System.out.print(current.data+" -> ");
    	    	current = current.next;
    	    }
    	    	 System.out.println("null");
    	    
    	    
    	   
       }
       
       public static void main(String[] args) {
    	   PrintSinghlyLinkedList sll = new PrintSinghlyLinkedList();
    	   sll.head = new ListNode(10);
    	   ListNode second = new ListNode(11);
    	   ListNode third = new ListNode(12);
    	   ListNode fourth = new ListNode(13);
    	   
    	   //head(10) -> 11 -> 12 -> 13-> null
    	   
    	   sll.head.next = second;
    	   second.next = third;
    	   third.next = fourth;    	   
 	       
    	 sll.printData();
    	   
	}
}
