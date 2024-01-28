package com.DSA.LinkedList;

public class Generics <T>{
      private T content;

	public Generics(T content) {
		this.content = content;
	}
	
	public T getContent() {
		return content;
	}
	
	public static void main(String[] args) {
		Generics<String> str = new Generics<String>("hello I am here");
		Generics<Integer> num = new Generics<Integer>(555);
		
		System.out.println("string : "+str.getContent());
		System.out.println("number : "+num.getContent());
	}
      
      
}

// Example 1. :


