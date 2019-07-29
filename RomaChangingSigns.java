import java.util.Arrays;
import java.util.Scanner;

public class RomaChangingSigns {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		Integer[] t = new Integer[n];
		for (int i = 0; i < n; i++) {
			t[i] = scan.nextInt();
			if (t[i] < 0 && k>0)
			{t[i]=-t[i];
				k--;
		}}
		Arrays.sort(t);
		if (k % 2 != 0)
			t[0] = -t[0];
		long sum = 0;
		for (int i = 0; i < t.length; i++) {
			sum += t[i];

		}

		System.out.println(sum);
scan.close();
	}
}
