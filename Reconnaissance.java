import java.util.Scanner;

public class Reconnaissance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int pre = scan.nextInt();
		int arr[] = new int[x + 1];
		arr[1] = pre;
		int min = Integer.MAX_VALUE;

		int i = 1;
		int f = 0;
		for (int j = 2; j < x + 1; j++) {
			arr[j] = scan.nextInt();

			if (Math.abs(arr[j - 1] - arr[j]) < min) {
				min = Math.abs(arr[j - 1] - arr[j]);
				i = j - 1;
				f = j;
			}
			// System.out.println(i+" "+j+" "+min);
		}
		if (Math.abs(arr[1] - arr[x]) < min) {
			min = Math.abs(arr[x] - arr[1]);
			i = x;
			f = 1;
		}
		System.out.println(i + " " + (f));
	}
}
