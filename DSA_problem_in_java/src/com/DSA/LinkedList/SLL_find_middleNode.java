package com.DSA.LinkedList;

public class SLL_find_middleNode {
	private ListNode head;
	private static class ListNode{
	
		private int data ;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
  public ListNode findMiddleNode(ListNode head) {
	  if(head == null ) {
		  return null;
	  }
	  ListNode fast = head;
	  ListNode slow = head;
	  
	  while(fast != null && fast.next != null) {
		  slow = slow.next;
		  fast = fast.next.next;
	  }
	  return slow;
  }
  
  public static void main(String[] args) {
	  SLL_find_middleNode sll = new SLL_find_middleNode();
	  ListNode head = new ListNode(1);
	  ListNode second = new ListNode(2);
	  ListNode third = new ListNode(3);
	  ListNode fort = new ListNode(4);
	  
	  sll.head.next = second;
	  second.next = third;
	  third.next = fort;
	  
	 
	  ListNode newNode = sll.findMiddleNode(head);
	  System.out.println(newNode.data);
}
}
