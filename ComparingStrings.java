import java.util.LinkedHashMap;
import java.util.Scanner;

public class ComparingStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		char[] aa = a.toCharArray();
		char[] ab = b.toCharArray();
		if (aa.length != ab.length) {
			System.out.println("NO");
		} else {
			int ac[] = new int[3];
			int bc[] = new int[3];
			int c = 0;
			for (int i = 0; i < aa.length; i++) {
				if (aa[i] != ab[i]) {
				//	System.out.println(" "+aa[i]+" "+ab[i]);
					ac[c] = aa[i];
					bc[c] = ab[i];
			//		System.out.println(" "+bc[c]+" "+ac[c]);
					c++;
				}
				if(c>2) {
				//	System.out.println("c");
						System.out.println("NO");
						return;
					}

			}
			if(ac[0]==bc[1]&&ac[1]==bc[0]) {
				System.out.println("YES");
			
			}else
			{
				System.out.println("NO");
			}
			
		}
	}
}
