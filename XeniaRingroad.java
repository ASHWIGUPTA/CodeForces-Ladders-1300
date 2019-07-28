import java.math.BigInteger;
import java.util.Scanner;

public class XeniaRingroad {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		BigInteger b = new BigInteger("0");
		int loc = 1;
		for (int i = 0; i < m; i++) {
			int r = scan.nextInt();

			if (r >= loc)
				b = b.add(BigInteger.valueOf(r - loc));
			else
				b = b.add(BigInteger.valueOf(n + r - loc));
loc = r;
		}
		System.out.println(b.toString());
	}
}
