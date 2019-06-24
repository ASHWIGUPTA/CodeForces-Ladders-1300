import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BusinessTrip {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		int j[] = new int[12];

		for (int i = 0; i < j.length; i++) {
			j[i] = scan.nextInt();
		}
		Arrays.sort(j);
		;
		int r = 11;
		int c = 0;
		while (b > 0 && r >= 0) {
			b = b - j[r];
			r--;
			c++;
		}
	//	System.out.println(b);
		if (b > 0) {
			System.out.println(-1);
		} else {
			System.out.println(c);
		}
	}
}
