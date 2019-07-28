package SegmentTree;

import java.util.*;
import java.lang.*;

public class Minimum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];

			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			GfG gfg = new GfG();
			int Q = sc.nextInt();

			int st[] = gfg.constructST(arr, n);
			int l, r;
			for (int i = 0; i < Q; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				l = Math.min(a, b);
				r = Math.max(a, b);

				System.out.print(gfg.RMQ(st, n, l, r) + " ");

			}
			System.out.println();
		}
	}

}
/*
 * This is a function problem.You only need to complete the function given below
 */

/*
 * The functions which builds the segment tree
 */
class GfG {
	static int st[];

	public static int[] constructST(int arr[], int n) {
		// Add your code here
		int r = (int) Math.ceil(Math.log(arr.length) / Math.log(2));
		if (arr.length % 2 == 0) {

		}
		r = (int) Math.pow(2, r);
		st = new int[(r << 1) - 1];
		constructSTUtill(arr,0,arr.length - 1, 0);
		return st;
	}

	public static void constructSTUtill(int arr[], int s, int h, int p) {
		if (s == h) {
			st[p] = arr[s];
			return;
		}
	
		int mid = (s + h) / 2;
		constructSTUtill(arr, s, mid, (p << 1) + 1);
		constructSTUtill(arr, mid + 1, h, (p << 1) + 2);
		st[p] = Math.min(st[(p << 1) + 1], st[(p << 1) + 2]);
	
	}

	/*
	 * The functions returns the min element in the range from l and r
	 */
	public static int RMQ(int st[], int n, int l, int r) {
		return minn(0, n - 1, l, r, 0);
	}

	public static int minn(int l, int h, int ql, int qh, int p) {
		if (ql <= l && qh >= h) {
			return st[p];
		}
		if (ql > h || l > qh) {
			return Integer.MAX_VALUE;
		}
		int mid = (l + h) / 2;
		return Math.min(minn(l, mid, ql, qh, (p << 1) + 1), minn(mid + 1, h, ql, qh, (p << 1) + 2));
	}

}