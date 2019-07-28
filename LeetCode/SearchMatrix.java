package LeetCode;

public class SearchMatrix {
	public static void main(String[] args) {
		System.out.println("hi");
		int m[][] = { { -5 } };
		int t = -5;
		int l = 0;
		int r = 0;
		while (l < m.length - 1 && r < m[0].length - 1) {
			if (m[l][r + 1] == t || m[l + 1][r] == t) {
				System.out.println("yes");
				return;
			}
		//	System.out.println("yed");
			int xm = t - m[l + 1][r];
			int ym = t - m[l][r + 1];
			System.out.println("ym " + xm + " " + ym);
			if (xm < 0 && ym < 0) {
				System.out.println("no");
				return;
			}
			if (ym < 0) {
				l = l + 1;
			} else if (xm < 0) {
				r = r + 1;
			} else if (ym < xm) {
				r = r + 1;
			} else {
				l = l + 1;
			}
			System.out.println(l + " " + r);
		}
		System.out.println("yes");
		while (l < m.length - 1) {
			if (m[l + 1][r] == t) {
				System.out.println("yes");
				return;
			}
			l++;
		}
		
		while (r < m[0].length - 1) {
			if (m[l][r+1] == t) {
				System.out.println("yes");
				return;
			}
			r++;
		}
		if(m[0][0]==t)
		{
			System.out.println("yes");
			return;
		
		}
		System.out.println("no");

	}
}
