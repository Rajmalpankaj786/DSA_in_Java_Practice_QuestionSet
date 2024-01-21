package com.DSA.LinkedList;

public class DemoLinkedList {
    private LinkedList head;
    
	private static class LinkedList{
		private int data;
		private LinkedList next;
		
		public LinkedList(int data) {
			this.data = data;
			this.next = null;
		}
		public LinkedList() {
			
		}
		
	}
	
	public void printLinkedList() {
		
		
		LinkedList current = head;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		
		}
	   System.out.println("null");
	}
	
	public static void main(String[] args) {
		
		DemoLinkedList demo = new DemoLinkedList();
		demo.head = new LinkedList(10);
		demo.insetNode(11);
	    demo.printLinkedList();
		
	}
	
	public void insetNode(int val) {
		LinkedList current = new LinkedList(val);
		current.next = head;
		head = current;
	}
	
	
}
