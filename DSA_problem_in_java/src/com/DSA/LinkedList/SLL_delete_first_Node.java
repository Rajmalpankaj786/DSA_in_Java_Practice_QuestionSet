package com.DSA.LinkedList;



public class SLL_delete_first_Node {
	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public void printData() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");

	}

	public ListNode deleteFirstNode() {

		if (head == null) {
			return null;
		}

		ListNode temp = head;
		head = head.next;
		temp.next = null;

		return temp;
	}
	
	public ListNode deleteLastNode() {
		if(head==null || head.next==null) {
			return null;
		}
		ListNode current = head;
		ListNode previous = null;
		
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		
		previous.next = null;
		
		return current;
	}

	 public void insert(int position , int value) {
	     
    	 ListNode node = new ListNode(value);
    	 if(position == 1) {
    		 node.next = head;
    		 head = node;
    	 }else {
    		ListNode previous = head;
    		int count = 1;
    		while(count<position-1) {
    			previous = previous.next;
    			count++;
    		}
    		
    		ListNode current = previous.next;
    		previous.next = node;
    		node.next = current;
    	 }
     }
     public static void main(String[] args) {
    	 SLL_delete_first_Node sll = new SLL_delete_first_Node();
    	 sll.insert(1,2);
    	 sll.insert(2,4);
    	 sll.insert(1,0);
    	 sll.insert(3,5);
    	 
    	 sll.printData();
    	 
    	 System.out.println(sll.deleteLastNode().data);
    	 System.out.println(sll.deleteLastNode().data);
    	 sll.printData();
	}
}
