import java.util.Scanner;

public class RoadConstruction {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < 2 * m; i++) {
			int r = scan.nextInt() - 1;
			a[r] = 1;
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				sum = i + 1;
				break;
			}
		}
		System.out.println(n - 1);
		for (int i = 1; i <= n; i++) {
			if (i != sum)
				System.out.println(sum + " " + i);
		}

	}
}
