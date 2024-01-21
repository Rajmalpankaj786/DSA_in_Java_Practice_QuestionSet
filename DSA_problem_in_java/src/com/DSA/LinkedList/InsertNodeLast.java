package com.DSA.LinkedList;

public class InsertNodeLast {
 private ListNode head;
     
     private static class ListNode{
   	  private int data;
   	  private ListNode next ;
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
     
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;

	}
	
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if(head == null) {
			head = newNode;
			return ;
		}
		
		ListNode current = head;
		while(current.next != null) {
			current = current.next ;
		}
		
		current.next = newNode;
		
	}
   public static void main(String[] args) {
	   InsertNodeLast inb = new InsertNodeLast();
	   
	   inb.insertLast(10);
	   inb.insertLast(11);
	   inb.insertLast(13);
	   inb.insertLast(15);
	   
	   inb.printData();
	   
}

}
