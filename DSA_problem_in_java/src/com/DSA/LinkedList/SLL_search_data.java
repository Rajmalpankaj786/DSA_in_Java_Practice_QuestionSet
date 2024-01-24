package com.DSA.LinkedList;



public class SLL_search_data {
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
     
     public boolean searchElement(int searchKey) {
    	 ListNode current = head;
    	 while(current != null) {
    		 if(current.data == searchKey) {
    			 return true;
    		 }
    		 
    		 current = current.next;
    	 }
    	 return false;
     }
     
     public static void main(String[] args) {
    	 SLL_search_data sll = new SLL_search_data();
    	   sll.head = new ListNode(1);
    	   ListNode second = new ListNode(11);
    	   ListNode third = new ListNode(12);
    	   ListNode fourth = new ListNode(13);
    	   
    	   //head(10) -> 11 -> 12 -> 13-> null
    	   
    	   sll.head.next = second;
    	   second.next = third;
    	   third.next = fourth; 
    	   
    	   sll.printData();
    	   
    	   System.out.println(sll.searchElement(12));;
	}
}
