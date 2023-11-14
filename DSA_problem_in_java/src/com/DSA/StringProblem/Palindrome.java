package com.DSA.StringProblem;

public class Palindrome {
      public static boolean palindrome(String str) {
    	  int i=0,j=str.length()-1;
    	  char[] charArray = str.toCharArray();
    	 while(i<j){
    		  if(charArray[i]!=charArray[j]) {
    			  return false;
    		  }
    		  i++;
    		  j--;
    	  }
    	 return true;
      }
      
      public static void main(String[] args) {
		String str = "maam";
		System.out.println(palindrome(str));
	}
}
