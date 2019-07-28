package SegmentTree;

import java.util.Scanner;

public class XeniaBitOperations {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int w = scan.nextInt();

		int[] r = new int[(int) Math.pow(2, n)];
		for (int i = 0; i < Math.pow(2, n); i++) {
			r[i] = scan.nextInt();
		}
		int j[] = new int[2 * r.length - 1];
		boolean flag = n % 2 == 0 ? false : true;
		createHeap(r, j, 0, r.length - 1, 0, flag);

		for (int i = 0; i < w; i++) {
			int p = scan.nextInt() - 1;
			int d = scan.nextInt();
		//	r[p]=d;
			printre(0, r.length - 1, p, d, 0, j, flag);

			System.out.println(j[0]);
		}

	}

	private static void printre(int i, int j, int p, int d, int k, int[] j2, boolean flag) {
		if (j < i)
			return;
		if (j == i) {
			j2[k] = d;
			return;
		} else {
			int mid = i + (j - i) / 2;
			if (i <= p && mid >= p) {
				printre(i, mid, p, d, 2 * k + 1, j2, !flag);
			} else {
				printre(mid + 1, j, p, d, 2 * k + 2, j2, !flag);
			}

			j2[k] = flag ? j2[2 * k + 1] | j2[2 * k + 2] : j2[2 * k + 1] ^ j2[2 * k + 2];
		}
	}

	private static void createHeap(int[] r, int[] j, int i, int length, int k, boolean flag) {

		if (i == length) {
			j[k] = r[i];
			return;
		}
		int mid = (i + length) / 2;
		createHeap(r, j, i, mid, 2 * k + 1, !flag);
		createHeap(r, j, mid + 1, length, 2 * k + 2, !flag);
		if (flag) {
			j[k] = j[2 * k + 1] | j[2 * k + 2];
		} else {
			j[k] = j[2 * k + 1] ^ j[2 * k + 2];
		}

	}
}
