import java.util.Arrays;
import java.util.Scanner;

public class Sale {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		int m = scan.nextInt();
		int a[] = new int[b];
		for (int i = 0; i < b; i++) {
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);
		System.out.println(Math.abs(Arrays.stream(Arrays.copyOfRange(a, 0,m)).filter(d->d<0).sum()));

	}
}
