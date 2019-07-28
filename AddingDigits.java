import java.math.BigInteger;
import java.util.Scanner;

public class AddingDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		BigInteger b = BigInteger.valueOf(scan.nextInt());
		int n = scan.nextInt();

		BigInteger r = BigInteger.valueOf(a);

		StringBuilder z = new StringBuilder(a + "");
		int y = z.length();
		int m = 0;
		for (int i = 0; i < n; i++) {
//System.out.println("in loop "+i+" "+z);
			int j = 0;
			if (m == 0) {
				for (j = 0; j <= 9; j++) {
					z = z.append(j);
					if (new BigInteger(z.toString()).mod(b).equals(BigInteger.ZERO)) {
						m = 1;
						break;
					} else {
						z = z.deleteCharAt(z.length() - 1);
					}
				}
			} else {
				z = z.append(0);

			}
			if (i == n - 1) {
				if (z.length() == y) {
					z = new StringBuilder("-1");
				}
			}
		}
		System.out.println(z);
	}
}
