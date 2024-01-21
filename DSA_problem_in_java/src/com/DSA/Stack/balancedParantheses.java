package com.DSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class balancedParantheses {
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		var n = sc.nextInt();
		var str = sc.next();
		//if this time I am using var then it is working file in the main block but this is not set in the outside off main block
		 
		balanceparn(str);
		
	}

	public static void balanceparn(String str) {
		
		boolean flag = true;
		Stack<String> st = new Stack<>();
		
		for(String s : str.split("")) {
		if(!st.isEmpty() && st.peek().equals(s)) {	
			st.pop();
		}
		else{
			if(s.equals("(")) {
		
				st.push(")");
			}
			else if(s.equals("{")) {
				st.push("}");
			}
			else if(s.equals("[")) {
				st.push("]");
			}
			else if(s.equals(")") || s.equals("}") || s.equals("]") ){
				flag = false;
			}
		}
		}
		if(st.isEmpty() && flag == true) {
			System.out.print("Balanced");
		}
		else {
			System.out.println("Unbalanced");
		}
		
	}
}
