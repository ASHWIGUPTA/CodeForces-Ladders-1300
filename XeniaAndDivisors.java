import java.util.Scanner;

public class XeniaAndDivisors {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[8];
		for (int i = 1; i <= n; i++) {
			a[in.nextInt()]++;
		}

		// for (int i = 0; i < a.length; i++) { System.out.println(a[i] + " " + i); }

		int z = n / 3;
		// System.out.println(a[1] % z != 0);
		if (a[1] == 0) {
			System.out.println(-1);
			return;
		}
		if (a[1] % z != 0 || (a[2] + a[3]) % z != 0 || (a[4] + a[6]) % z != 0 || a[3] > a[6]) {
			System.out.println(-1);
		} else {

			for (int i = 0; i < z; i++) {

				if (a[4] != 0

						&& a[2] != 0) {
					System.out.println(1 + " " + 2 + " " + 4);
					a[4]--;
					a[2]--;
				} else if (a[3] != 0 && a[6] != 0) {
					System.out.println(1 + " " + 3 + " " + 6);
					a[3]--;
					a[6]--;
				} else if (a[6] != 0 && a[2] != 0) {
					System.out.println(1 + " " + 2 + " " + 6);
					a[6]--;
					a[2]--;
				} else {
					System.out.println(-1);
					return;
				}
			}

		}
		// System.out.println(-1);
	}
}
