import java.util.Scanner;

public class Domino {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		int ar[] = new int[n];
		int x = 0;
		int y = 0;
		for (int i = 0; i < ar.length; i++) {
			x += arr[i] = scan.nextInt();
			y += ar[i] = scan.nextInt();
		}

		if (x % 2 == 0 && y % 2 == 0) {
			System.out.println(0);
			return;
		} else if (x % 2 == 0 || y % 2 == 0) {
			System.out.println(-1);
			return;
		}

		for (int i = 0; i < ar.length; i++) {
			int t = arr[i];
			int z = ar[i];
			x = x + z - t;
			y = y + t - z;
			if (x % 2 == 0 && y % 2 == 0) {
				System.out.println(1);

				return;
			}
		}
		System.out.println(-1);

	}
}
