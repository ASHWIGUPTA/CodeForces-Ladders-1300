package LeetCode;

import java.util.StringTokenizer;

public class GoodString {
public static void main(String[] args) {
	String s="the sky is blue";
	  String r="";  
      String [] str=s.trim().split(" ");
  StringTokenizer st=new StringTokenizer(s);
  while(st.hasMoreElements())
	  r=st.nextToken()+" "+r;
  
  System.out.println(r.trim()+"------");
  
  System.out.println(r);
}
}
