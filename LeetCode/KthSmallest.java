package LeetCode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallest {
	public static void main(String[] args) {
		PriorityQueue<t> a = new PriorityQueue<t>(new Comparator<t>() {

			@Override
			public int compare(t o1, t o2) {
				// TODO Auto-generated method stub
				return o1.val - o2.val;
			}
		});
		int b[][] = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 14, 15 } };
		for (int i = 0; i < b.length; i++) {
			a.offer(new t(i, 0, b[i][0]));
		}
		int k = 9;
		for (int i = 0; i < k - 1;) {
			if (a.isEmpty())
				return;

			t g = a.poll();
			i++;
			while (g.j == b[g.i].length - 1) {
				i++;
				g = a.poll();
				if (k - 1 < i) {
					System.out.println(g.val);
					return;
				}

			}

			a.offer(new t(g.i, g.j + 1, b[g.i][g.j + 1]));
		}
		System.out.println(a.peek().val);

	}

	public static class t {
		int i;

		@Override
		public String toString() {
			return "t [i=" + i + ", j=" + j + ", val=" + val + "]";
		}

		int j;
		int val;

		public t(int i, int j, int val) {
			this.val = val;
			this.j = j;
			this.i = i;
		}

	}
}
