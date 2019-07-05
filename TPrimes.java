import java.math.BigInteger;
import java.util.Scanner;

public class TPrimes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int j = scan.nextInt();
		for (int i = 0; i < j; i++) {
			BigInteger m =new BigInteger( scan.next());
			int c = 0;
			for (BigInteger k = BigInteger.valueOf(2); k.compareTo( m.divide(BigInteger.valueOf(2)))<1; ) {
				//System.out.println("hi"+k.toString());
				if (m.mod(k).compareTo(BigInteger.ZERO) == 0) {
					c++;
				}
				k=k.add(BigInteger.ONE);
	//			System.out.println(c+" "+m);
			}
			if (c == 1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
