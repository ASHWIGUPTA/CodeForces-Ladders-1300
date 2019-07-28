package a;

import java.util.Stack;

public class ValidPerameter {
public static void main(String[] args) {
System.out.println(pal());
}
static boolean  pal() {
	Stack<Character> a=new Stack();
	String p="{{{)}}";
	for(int i=0;i<p.length();i++) {
		char b=p.charAt(i);
		switch(b) {
		case '}':
			if(!a.isEmpty() && a.peek()=='{') { 
			a.pop();
		}else
		{
			return false;
		}break;
		case ']':
			if(!a.isEmpty() && a.peek()=='[') { 
			a.pop();
		}else
		{
			return false;
		}break;
			case ')':
			if(!a.isEmpty() && a.peek()=='(') { 
			a.pop();
		}else
		{
			return false;
		}break;
		
		default:
			a.push(b);
		
	
	}}
if(!a.isEmpty())
	return false;
return true;
}

}
