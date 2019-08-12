package LeetCode;

import java.util.Stack;

public class Calculater {
public static void main(String[] args) {
	String r="2*3/2";
	Stack<Character> b=new Stack<Character>();
	for (int i = 0; i < r.length(); i++) {
		char x=r.charAt(i);
		if(x=='*' || x=='/') {
			for (int j = i+1; j <r.length(); j++) {
				char w=r.charAt(j);
				if(!Character.isWhitespace(w)) {
				 switch (x) {
				case '*':
					b.push(String.valueOf((b.pop()-47) *(w-47)));
					break;

				default:
					break;
				}
				}
			}
		}
	}
}
}
