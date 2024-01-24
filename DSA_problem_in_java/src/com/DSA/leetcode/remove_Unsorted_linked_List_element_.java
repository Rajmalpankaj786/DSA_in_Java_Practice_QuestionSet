package com.DSA.leetcode;
// https://leetcode.com/problems/remove-linked-list-elements/

public class remove_Unsorted_linked_List_element_ {
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next;
		      }
		      
		      }
		 
	 public ListNode removeElements(ListNode head, int val) {
		   
		    while(head != null && head.val == val){
		       head = head.next;
		    }
		    
		    // if(head == null || head.next == null){
		    //     return null;

		    // }
		     ListNode current = head;
		      ListNode pre = null;

		      while(current != null){
		          if(current.val == val){
		              pre.next = current.next;
		          }                                           
		          else{
		              pre = current;
		          }

		          current = current.next;
		      }
		      return head;
		    
		    }
		}
