package Test1187;

import java.util.Arrays;
import java.util.Scanner;

public class LettersShop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String o = scan.next();
		int j = scan.nextInt();
		for (int i = 0; i < j; i++) {
			char[] g = scan.next().toCharArray();
			Arrays.sort(g);
			int h=o.indexOf(g[0]);
		//	System.out.println(h+" ^^^");
			for (int k = 1; k < g.length; k++) {
				int r=h;
				if(g[k-1]!=g[k]) {
					 r=o.indexOf(g[k]);
				System.out.println("h "+h+" r "+r+" "+g[k]);
				
				}
				else {
					r=o.indexOf(g[k],r+1);
					System.out.println(h+"  --"+g[k]);
					
				}
				if(r>h) {
					h=r;
				}
				
			}
			System.out.println(h+1+" ********");
		}
	}
}
