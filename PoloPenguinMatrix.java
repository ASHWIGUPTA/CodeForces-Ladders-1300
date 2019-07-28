import java.util.Arrays;
import java.util.Scanner;

public class PoloPenguinMatrix {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int d = scan.nextInt();
		int[] a = new int[n * m];
		int r = 0, g = Integer.MIN_VALUE;
		boolean flag = true;

		for (int i = 0; i < n * m; i++) {
			int q = scan.nextInt();
			a[i] = q;
			int h = q % d;
			if (flag) {
				r = h;
				flag = !flag;
			} else if (h != r) {
				System.out.println(-1);
				return;

			}
		}
		Arrays.parallelSort(a);
		int h = (n * m - 1) / 2;
		int o = a[h];
		int sum = 0;
		/*
		 * for (int i = 0; i < a.length; i++) { System.out.print(a[i]+" "); }
		 */
	//	System.out.println("---"+h);
		for (int i = 0; i < n*m; i++) {
			int l = a[i] > o ? a[i] - o : o - a[i];
			//System.out.println(l+" "+sum);
			sum=sum+l/d;
		}
		System.out.println(sum);
	}
}
