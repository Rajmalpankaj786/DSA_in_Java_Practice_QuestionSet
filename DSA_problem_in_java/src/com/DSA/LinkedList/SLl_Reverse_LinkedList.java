package com.DSA.LinkedList;
// https://leetcode.com/problems/reverse-linked-list/submissions/1152989398/
public class SLl_Reverse_LinkedList {
	private static ListNode head;

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
	
	
	public ListNode reverseNode(ListNode head) {
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current ;
			current = next;
		}
		return previous;
	}

	public static void main(String[] args) {

		SLl_Reverse_LinkedList sll = new SLl_Reverse_LinkedList();
		sll.head = new ListNode(1);
		ListNode second = new ListNode(11);
		ListNode third = new ListNode(12);
		ListNode fourth = new ListNode(13);

		// head(10) -> 11 -> 12 -> 13-> null

		sll.head.next = second;
		second.next = third;
		third.next = fourth;

		sll.printData();
        
		ListNode newNode = sll.reverseNode(head);
		
		sll.printData();
		
	}

}
