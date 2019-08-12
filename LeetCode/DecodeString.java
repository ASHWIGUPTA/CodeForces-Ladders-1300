package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DecodeString {
	//static
	public static void main(String[] args) {
		String str ="100[leetcode]";  //"2[abc]3[cd]ef";// "3[a2[c]]";//.."//"3[a]2[bc]"; // // 
		Stack<Character> s = new Stack<Character>();
		Stack<Integer> no=new Stack<Integer>();
		boolean flag = false;
		 StringBuilder b = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			if (Character.isDigit(c)) {
			//int
				int f=c-'0';
				int j=str.indexOf('[',i);
				//System.out.println(str.substring(i));
				//System.out.println(j+"- j os");
				System.out.println(f+" f is " +j);	
				for (int j2 = i+1; j2 < j; j2++) {
					f=	f*10+(int)str.charAt(++i)-'0';
				}
				flag = true;
				System.out.println(f+" ----");
				s.add((char)(0+'0'));
				no.add(f);
				i++;
			}
			else if (flag  && c != ']') {
				s.add(c);
			}
			else if (!s.isEmpty() && c == ']') {
				remove(s,b,no);
			}
			else {
				b.append(c);
			System.out.println("in");
			}
			 if(s.isEmpty())
			{	flag=false;
			}
System.out.println(s+" "+i);
		}
		System.out.println(b.toString());
	}

	private static void remove(Stack<Character> s,StringBuilder b,Stack<Integer> no) {
		StringBuilder temp = new StringBuilder();
		while (!s.isEmpty() && !Character.isDigit(s.peek())) {
			temp = temp.append(s.pop());
		}
		int r =no.pop();
		s.pop();
		temp = temp.reverse();
		
		List<Character> d = new ArrayList<Character>();

		boolean flag = s.isEmpty();
		if (!flag) {
			char[] arr = temp.toString().toCharArray();
			for (int i = 0; i < arr.length; i++) {
				d.add(arr[i]);
			}
		}
		for (int i = 0; i < r; i++) {
			if (flag)
				b.append(temp);
			else
				s.addAll(d);
		}
}
}
