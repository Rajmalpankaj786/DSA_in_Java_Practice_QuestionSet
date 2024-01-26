package com.DSA.LinkedList;



public class AddTwoNumber {

	private ListNode head;
    private static class ListNode{
 	   private int data;
 	   private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
 	     
    }
    
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

       while(head1 != null || head2 != null){

          int val1 = (head1 != null) ? head1.data : 0;

          int val2 = (head2 != null) ? head2.data : 0;

          int sum = carry+ val1 + val2;

          carry = sum/10;

          current.next = new ListNode(sum%10);

          current = current.next;

          if(head1 != null){
            head1 = head1.next;
          }

           if(head2 != null){
             head2 = head2.next;
          }

        }
       
       if(carry >0) {
           current.next = new ListNode(carry);
       }
     

       return dummy.next;
      }
     }

