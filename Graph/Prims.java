package Graph;

public class Prims {
	public static void main(String[] args) {
		int graph[][] = new int[][] { { 0, 2, 0, 6, 0 }, { 2, 0, 3, 8, 5 }, { 0, 3, 0, 0, 7 }, { 6, 8, 0, 0, 9 },
				{ 0, 5, 7, 9, 0 } };
		MST a = new MST();
		a.find(graph);
	}

}

class MST {
	private int v;

	public int min(int[] key, boolean[] str) {
		int i = Integer.MAX_VALUE;
		int n = -1;
		for (int j = 0; j < str.length; j++) {
			if (str[j] == false && key[j] < i) {
				i = key[j];
				n = j;
			}
		}
		System.out.println(n);
		return n;
	}

	public void find(int[][] g) {
		int[] p = new int[g.length];
		int[] s = new int[g.length];
		boolean[] w = new boolean[g.length];

		for (int i = 0; i < w.length; i++) {
			w[i] = false;
			s[i] = Integer.MAX_VALUE;
		}
		p[0] = -1;
		s[0] = 0;
		for (int i = 0; i < w.length - 1; i++) {
			int min = min(s, w);
			w[min] = true;
			for (int j = 0; j < w.length; j++) {
				if (g[min][j] != 0 && w[j] != true && g[min][j] < s[j]) {
					p[j] = min;
					s[j] = g[min][j];

				}
			}
		}
		prtint(p, g);
	}

	private void prtint(int[] p, int[][] g) {
		for (int i = 1; i < p.length; i++) {
			System.out.println(p[i] + " " + g[i][p[i]]);
		}
	}
}