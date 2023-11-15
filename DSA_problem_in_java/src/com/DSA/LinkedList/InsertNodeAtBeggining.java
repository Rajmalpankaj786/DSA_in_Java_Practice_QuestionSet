package com.DSA.LinkedList;


public class InsertNodeAtBeggining {
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
	public void insertNode(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;

	}
   public static void main(String[] args) {
	   InsertNodeAtBeggining inb = new InsertNodeAtBeggining();
	   
	   inb.insertNode(10);
	   inb.insertNode(11);
	   inb.insertNode(13);
	   inb.insertNode(15);
	   inb.printData();
	   
}


}
