package com.DSA.LinkedList;
// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
public class Delete_Middle_node_sLL {
	

	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	 public ListNode deleteMiddle(ListNode head) {
	        if(head == null || head.next  == null){
	            return null;
	        }
	        ListNode fast = head;
	        ListNode slow = head;
	        ListNode pre = null;

	        while(fast != null && fast.next != null){
	            pre = slow;
	            slow = slow.next;
	            fast = fast.next.next;
	           
	        }
	        pre.next = slow.next;

	       return head;
	    }
	 
}
