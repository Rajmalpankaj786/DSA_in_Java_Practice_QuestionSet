package com.DSA.LinkedList;



public class SLL_deleteNode_at_particular_position {
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
    	  while(current !=null) {
    		  System.out.print(current.data + " -> ");
    		  current = current.next;
    	  }
    	  
    	  System.out.println("null");
       }
       
       public void deleteNodeAtPP(int position) {
    	   if(position == 0) {
    		   head = head.next;
    	   }
    	   
    	   ListNode previous = head;
    	   int count = 0;
    	   while(count <= position-1) {
    		   previous = previous.next;
    		   count++;
    	   }
    	    
    	   ListNode current = previous.next;
    	   previous.next = current.next;
    	   
       }
       
       
       public static void main(String[] args) {
		
    	   SLL_deleteNode_at_particular_position sll = new SLL_deleteNode_at_particular_position();
    	   sll.head = new ListNode(1);
    	   ListNode second = new ListNode(11);
    	   ListNode third = new ListNode(12);
    	   ListNode fourth = new ListNode(13);
    	   
    	   //head(10) -> 11 -> 12 -> 13-> null
    	   
    	   sll.head.next = second;
    	   second.next = third;
    	   third.next = fourth; 
    	   
    	   sll.printData();
    	   sll.deleteNodeAtPP(1);
    	   sll.printData();
	}
}
