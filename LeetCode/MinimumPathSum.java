package LeetCode;

public class MinimumPathSum {
	public static void main(String[] args) {

		int b[][] = { { 1, 2 }, { 5,6 }, { 1, 1 } };

		String word = "ABCB";
		int[][] c = new int[b.length][b[0].length];
		int s = b[0][0];
		for (int i = 1; i < b.length; i++) {
			s = s + b[i][0];
			c[i][0] = s;
		}

		s = b[0][0];
		c[0][0]=b[0][0];
		for (int i = 1; i < b[0].length; i++) {
			s = s + b[0][i];
			c[0][i] = s;
		}
		for (int ij = 1; ij < c.length; ij++) {
			for (int i = ij; i <=ij; i++) {
				for (int j = ij; j < c[0].length; j++) {
					c[ij][j]=Math.min(c[i][j-1], c[i-1][j])+b[i][j];
				}
			}
			for (int i = ij; i <=ij && i<b[0].length ; i++) {
				for (int j = ij; j < c.length; j++) {
					c[j][ij]=Math.min(c[j-1][i], c[j][i-1])+b[j][i];
				}
			}
		}
		System.out.println(c[b.length-1][b[0].length-1]);

	}

	private static int searchBoard(int[][] b) {
		// TODO Auto-generated method stub
		return find(b, 0, 0, 0);
	}

	private static int find(int[][] b, int i, int j, int k) {
		// System.out.println(k);
		if (i == b.length && j == b[0].length)
			return k;
		if (i < 0 || j < 0 || i >= b.length || j >= b[0].length)
			return 0;
		return Math.max(find(b, i + 1, j, k + b[i][j]), find(b, i, j + 1, k + b[i][j]));

	}
}
