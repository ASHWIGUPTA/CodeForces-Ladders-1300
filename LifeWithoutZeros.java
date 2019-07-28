import java.util.Scanner;

public class LifeWithoutZeros {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int r = scan.nextInt();
		int f = n + r;
		n = Integer.parseInt(("" + n).replaceAll("0", ""));
		r = Integer.parseInt(("" + r).replaceAll("0", ""));
		f = Integer.parseInt(("" + f).replaceAll("0", ""));
		if (n + r == f)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
