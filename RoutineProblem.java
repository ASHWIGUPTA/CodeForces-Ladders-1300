import java.util.Scanner;

public class RoutineProblem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		// b=b<a?b=b^(a=a^(b^a)) :b;
		if (b < a) {
			int r = a;
			a = b;
			b = r;
		}
		if (d < c) {
			int r = c;
			c = d;
			d = r;
		}
		//System.out.println(b + "---" + d);
		int g = gcd(Math.max(b, d), Math.min(b, d));
		;
		int div = b * d / g;
		// System.out.println(div+" "+g);
		//System.out.println(a * d / g);
		a = ((b - a));
		c = d - c;
		int f = a + c;
		if (a + c == 0)
			System.out.println(1);
		else
			System.out.println(f + "/" + div);
	}

	private static int gcd(int b, int d) {

		if (b % d == 0)
			return d;
		return gcd(d, b / d);
	}
}
