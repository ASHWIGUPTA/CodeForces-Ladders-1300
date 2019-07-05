import java.util.Scanner;

public class EvenOdds {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long j = scan.nextLong();
		if (((n + 1) >> 1) >= j) {
			// System.out.println(" "+j);

			System.out.println((j << 1) - 1);
		} else {
			System.out.println((j - ((n + 1) >> 1)) << 1);

		}
	}
}
