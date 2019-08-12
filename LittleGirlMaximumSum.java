import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class LittleGirlMaximumSum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String r[] = br.readLine().split(" ");
		int n = Integer.parseInt(r[0]);
		int q = Integer.parseInt(r[1]);
		r = br.readLine().split(" ");
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = Integer.parseInt(r[i]);
		}
		//long s = (long) Math.ceil(Math.log(n) / Math.log(2));
		// long size = pow(2, s);
		// seg = new long[(int) (2 * size - 1)];
		// lazy = new long[(int) (2 * size - 1)];
		int l = 0;
		int h = 0;
		int p[] = new int[n];
		for (int i = 0; i < q; i++) {
			r = br.readLine().split(" ");
			l = Integer.parseInt(r[0]) - 1;
			h = Integer.parseInt(r[1]);
			// update(0, n - 1, l, h, 0);
			p[l]++;
			if(h<ar.length)
			p[h]--;
		}
		
		/*
		 * for (int i = 0; i < ar.length; i++) { // arr[i] = get(0, n - 1, i, i, 0);
		 * System.out.print(p[i]+" "); }
		 */
		//System.out.println();
	//	int arr[] = new int[n];
		for (int i = 1; i < ar.length; i++) {
			p[i] += p[i - 1];
		}
		
		/*
		 * for (int i = 0; i < ar.length; i++) { // arr[i] = get(0, n - 1, i, i, 0);
		 * System.out.print(p[i]+" "); }
		 */
	//	System.out.println();
		Arrays.parallelSort(p);
		
		//Arrays.parallelSort(arr);
		Arrays.parallelSort(ar);
		BigInteger sum = BigInteger.ZERO;
		for (int i = 0; i < ar.length; i++) {
			sum = sum.add(BigInteger.valueOf(ar[i]).multiply(BigInteger.valueOf(p[i])));
		}
		System.out.println(sum.toString());

	}

	/*
	 * private static int get(int l, int h, int ql, int qh, int p) { // TODO
	 * Auto-generated method stub if (l > h) return 0; if (lazy[p] != 0) { seg[p] +=
	 * lazy[p]; if (l != h) { lazy[2 * p + 1] += lazy[p]; lazy[2 * p + 2] +=
	 * lazy[p]; } lazy[p] = (long) 0; } if (l > qh || ql > h) { return 0; } if (ql
	 * <= l && qh >= h) { return (int) seg[p]; } int mid = (l + h) / 2; return
	 * (get(l, mid, ql, qh, 2 * p + 1) + get(mid + 1, h, ql, qh, 2 * p + 2));
	 * 
	 * // return 0; }
	 * 
	 * private static void update(int l, int h, int ql, int qh, int p) { if (l > h)
	 * return; // System.out.println(p + " " + lazy.length); if (lazy[p] != 0) {
	 * seg[p] += lazy[p]; if (l != h) { lazy[2 * p + 1] += lazy[p]; lazy[2 * p + 2]
	 * += lazy[p]; } lazy[p] = (long) 0; } if (l > qh || ql > h) { return; } if (ql
	 * <= l && qh >= h) { seg[p] += 1; if (l != h) { lazy[2 * p + 1] += 1; lazy[2 *
	 * p + 2] += 1; } return; } int mid = (l + h) / 2; update(l, mid, ql, qh, 2 * p
	 * + 1); update(mid + 1, h, ql, qh, 2 * p + 2); seg[p] = seg[2 * p + 1] + seg[2
	 * * p + 2]; }
	 * 
	 * static long pow(int a, long b) { // long r; if (b == 0) return 1; if (b == 1)
	 * return a; long w = pow(a, b / 2); if (b % 2 == 0) return w * w; else return w
	 * * w * a; }
	 */
}
