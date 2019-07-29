import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class RankList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		Integer ar[] = new Integer[n];
		for (int i = 0; i < n; i++) {
			ar[i] = 100 * scan.nextInt() - scan.nextInt();
		}
		Arrays.sort(ar, Collections.reverseOrder());
		int z = ar[k - 1];
		int t = 0;
		for (int i = 0; i < n; i++) {
			if (z == ar[i])
				t++;
		}
		System.out.println(t);

	}
}
