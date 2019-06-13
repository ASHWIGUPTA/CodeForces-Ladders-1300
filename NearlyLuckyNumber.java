import java.util.Scanner;

public class NearlyLuckyNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String p = scan.next();
		if(p.length()>0 && p.charAt(0)=='-')
		{	System.out.println("NO");
			return;}
		int i;
		int c=0;
		for ( i = 0; i < p.length(); i++) {
			int e = p.charAt(i) ;
			if (e == '4' || e == '7') {
				c++;
			}
		}
		if(c==4|| c==7) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
