package Test1187;

import java.util.Scanner;

public class StickersToys {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int o = scan.nextInt();
			int s = scan.nextInt();
			int j = scan.nextInt();
			int diff = Math.min(s , j );
			/*
			 * if (diff > 0 & s!=o && j!=o) { System.out.println(Math.min(s, j) + 1); } else
			 * if(diff ==0 &&(s==o || j==o)) { System.out.println(o-Math.min(s,j)+1); }else
			 * if(diff==0) { System.out.println( s+1); }
			 */
		System.out.println(o-Math.min(s, j)+1);
		}
	}
}
