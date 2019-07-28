package Test;

public class AmericanExpress {
public static void main(String[] args) {
	String r=Integer.toBinaryString(1);
int t=0;
System.out.println(2^1);
StringBuilder b= new StringBuilder("");
	for (int i = 0; i < r.length(); i++) {
	
	if(r.charAt(i)=='0')
	{
		t++;
		b.append(1);
	}else 
		b.append(0);
	
		
}if(t==0) {
	System.out.println(Integer.parseInt(1+b.toString(),2));
}else
	System.out.println(Integer.parseInt(b.toString(),2));
}
}
