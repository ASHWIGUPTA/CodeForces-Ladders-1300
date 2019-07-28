import java.util.Scanner;

public class FixingTypos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String r=scan.next();
		
		StringBuilder b=new StringBuilder("");
		int l=0;
		boolean t=false;
		while(l<r.length()) {
			int c=0;
			while(r.length()-1>l &&r.charAt(l)==r.charAt(l+1))
				{c++;
				l++;}
		//	System.out.println(c);
			if(c>=1) {
				if(t) {
					b=b.append(r.charAt(l-1));
				t=false;
				}else
				{
					t=true;
					b=b.append(r.charAt(l-1)).append(r.charAt(l-1));
				}
			}
			else {
				t=false;
				b=b.append(r.charAt(l));
			}
			l++;
			
			
		}
		System.out.println(b.toString());
	}
}
