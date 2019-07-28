import java.util.Scanner;

public class EasyNumberChallenge {
	static int[][] b = new int[100][25];
	static int arr[];

	public static void main(String[] args) {
		arr = seive(100);

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int j = in.nextInt();
		int m = in.nextInt();
		int mod = 1073741824;

		for (int i = 1; i <= 100; i++) {
			primeFactor(i);
		}
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= j; k++) {
				for (int l = 1; l <= m; l++) {
					int rh = multii(i, l, k);
					sum = (sum + rh + mod) % mod;
				}
			}
		}
		System.out.println(sum);

	}

	private static int multii(int i, int l, int k) {
		int ul = 1;
		for (int j = 0; j < 25; j++) {
			int su = b[i - 1][j] + b[l - 1][j] + b[k - 1][j];

			if (su > 0) {
				su++;
				ul = ul * su;

			}
		}
		return ul;
	}

	private static int[] seive(int i) {
		int arr[] = new int[i];
		for (int j = 2; j * j <= i; j++) {
			for (int j2 = j * j; j2 < i; j2 = j2 + j) {
				arr[j2] = j;
			}
		}
		return arr;
	}

	private static void primeFactor(int i) {
		// System.out.println();
		int cs = -1;
		int w = i - 1;
		for (int j2 = 2; i > 1; j2++) {
			if (arr[j2] == 0)
				cs++;
			if (arr[j2] == 0 && i % j2 == 0) {
				int c = 0;
				// int h=i;
				while (i % j2 == 0) {
					c++;
					i = i / j2;
				}
				// System.out.print(j2 + "^" + c + " "+i+" "+cs+" ");
				b[w][cs] = c;

			}
		}
	}

	static long div(int n) {
		long c = 0;
		for (int i = 1; i <= n; i++)
			if (n % i == 0)
				c++;

		return c;
	}

}
