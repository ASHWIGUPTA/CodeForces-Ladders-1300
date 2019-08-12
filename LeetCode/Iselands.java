package LeetCode;

import java.util.Scanner;
import java.util.Stack;

public class Iselands {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int a[][] = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		
		/*
		 * for (int i = 0; i < n; i++) { for (int j = 0; j < m; j++) {
		 * System.out.print(a[i][j]+" "); } System.out.println(); }
		 */
		boolean b[][] = new boolean[n][m];

		int c = 0;
		Stack<t> s = new Stack<t>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!b[i][j]&& a[i][j]==1) {
					c++;
				//	System.out.println(i+" "+j);
					s.add(new t(i, j));
					while (!s.isEmpty()) {
						t f = s.pop();

						int r = f.i;
						int d = f.j;
				//		System.out.println(r+"---- "+d+" "+a[r+1][d]+" "+b[r+1][d]);
						//System.out.println(+);
						b[r][d] = true;
						if (r - 1 >= 0 && a[r - 1][d] == 1 && !b[r - 1][d])
							s.add(new t(r - 1, d));
						if (r + 1 < n && a[r + 1][d] == 1 && !b[r + 1][d])
							{s.add(new t(r + 1, d));
				//			System.out.println(r+"****"+d);
							}
						if (d - 1 >= 0 && a[r][d - 1] == 1 && !b[r][d - 1])
							s.add(new t(r, d - 1));
						if (d + 1 <m && a[r][d + 1] == 1 && !b[r][d + 1])
							s.add(new t(r, d + 1));
//System.out.println(s.size());
					}
				}
				
			}
			

		}
		System.out.println(c);

	}

	public static class t {
		int i;
		int j;

		public t(int i, int j) {
			this.i = i;
			this.j = j;
		}
	}

}
