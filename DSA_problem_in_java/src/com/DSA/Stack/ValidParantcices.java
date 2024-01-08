package com.DSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParantcices {
	
	public static void validParn(String str ,Integer n) {
		Stack<String> st = new Stack<>();
		
		for(String s : str.split("")) {
			if(st.isEmpty()) {
				st.push(s);
			}
			else {
				String a = st.peek()+s;
				if(a.equals("()") || a.equals("[]") ||a.equals("{}")) {
					st.pop();
				}
				else {
					st.push(s);
				}
			}
		}
		
		if(st.isEmpty()) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-- >0) {
			int n = sc.nextInt();
			String str = sc.next();
			validParn( str , n);
		}
	}
}
