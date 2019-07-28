package LeetCode;

import java.util.Scanner;
import java.util.Stack;

public class LongestValidParentheses {
	public static void main(String[] args) {
		String s= ")()())";
		int m=0;
		int c=0;
	    Stack<Character> a = new Stack<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			// if()
			char b = s.charAt(i);

			if (b == ')' && !a.isEmpty() && a.peek() == '(') {
				a.pop();
				c++;
		if(c>m){m=c;}
            } else{
				a.push(b);
		c=0;} }
		System.out.println(2 * m);
	}
}
