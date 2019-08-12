package LeetCode;

import java.util.Stack;

public class Temp {
	public static void main(String[] args) {
		int t[] = { 73, 74, 75, 71, 69, 72, 76, 73 };
		int a[] = temp(t);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
// 
	private static int[] temp(int[] t) {

		Stack<t> s = new Stack<t>();
		for (int i = 0; i < t.length; i++) {
			if (s.isEmpty())
				s.add(new t(i, t[i]));
			else {

				t f = s.peek();
				while (f.v < t[i]) {
					t[f.i] = i - f.i;
					s.pop();
					if(s.isEmpty())
						break;
					f = s.peek();
				}
				s.add(new t(i, t[i]));
			}
		}
		while (!s.isEmpty()) {
			t f = s.pop();
			t[f.i] = 0;
		}

		return t;
	}

	static class t {
		int i;
		int v;

		public t(int i, int v) {
			this.i = i;
			this.v = v;
		}
	}
}
