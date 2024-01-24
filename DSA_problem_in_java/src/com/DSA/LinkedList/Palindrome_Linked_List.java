package com.DSA.LinkedList;

public class Palindrome_Linked_List {

	public class ListNode {
		    int val;
		    ListNode next;
		    ListNode() {}
		    ListNode(int val) { this.val = val; }
		    ListNode(int val, ListNode next) { this.val = val; this.next = next; 
		    }
		  }
		 
		 
	 public boolean isPalindrome(ListNode head) {
         if (head == null || head.next == null) {
           // If the list is empty or has only one node, it's a palindrome
           return true;
       }

       // Find the middle of the linked list using slow and fast pointers
       ListNode slow = head;
       ListNode fast = head;

       while (fast != null && fast.next != null) {
           slow = slow.next;
           fast = fast.next.next;
       }

       // Reverse the second half of the linked list
       ListNode secondHalf = reverseLinkedList(slow);

       // Compare the first half with the reversed second half
       while (secondHalf != null) {
           if (head.val != secondHalf.val) {
               return false;
           }
           head = head.next;
           secondHalf = secondHalf.next;
       }

       return true;
   }

   // Helper method to reverse a linked list
   private ListNode reverseLinkedList(ListNode head) {
       ListNode prev = null;
       ListNode current = head;

       while (current != null) {
           ListNode nextNode = current.next;
           current.next = prev;
           prev = current;
           current = nextNode;
       }

       return prev;
   }
}
